grammar TSmm;

@header{
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.locatable.*;
    import ast.statements.*;
    import ast.types.*;
}

//(varDefinition | funcDefinition)*
//Con variables locales
//program returns [Program ast] locale[List<Definition> defs = new ArrayList<>()]: (definition{$defs.add($definition.ast);})* {$ast = new Program($defs)}
//con un metodo en la clase
//program returns [Program ast]: {$ast = new Program()} (definition{$ast.addDefinition($definition.ast);})*
//program returns [Program ast = new Program()]: (definition{$ast.addDefinition($definition.ast);})*
program returns [Program ast]: expression EOF
       ;

expression returns [Expression ast]:
    INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | REAL_CONSTANT {$ast = new RealNumber($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text);}
    | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
    | '(' expression ')' {$ast = $expression.ast;}
    | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
    | e1=expression '.' e2=expression {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
    |'(' expression 'as' type ')'{$ast = new Cast($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $type.ast);}
    | '-' expression {$ast = new UnaryMinus($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
    | '!' expression {$ast = new UnaryNot($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
    | e1=expression OP=('*'|'/'|'%') e2=expression {$ast = new ArithmeticOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('+'|'-') e2=expression {$ast = new ArithmeticOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new CompareOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('&&'|'||') e2=expression {$ast = new LogicOp($e1.ast.getLine(), $e1.ast.getColumn, $e1.ast);}
    | ID '(' expression? (',' expression)* ')'
    ;

statement:  'log' expression(',' expression)* ';'
    | 'input' expression (','expression )* ';'
    | expression '=' expression ';'
    | 'if' '(' expression ')' ifBlock 'else' ifBlock
    | 'while' '(' expression ')' ifBlock
    | 'return' expression ';'
    | ID '(' expression? (',' expression)* ')' ';'
    ;

ifBlock: statement
    | '{' statement* '}'
    ;

type returns [Type ast]: PRIMITIVE_TYPE
    | '[' INT_CONSTANT ']' type
    | '[' varDefinition+ ']'
    ;

varDefinition: 'let' ID (',' ID)* ':' type ';';

funcDefinition: 'function' ID '(' param? (',' param)* ')' ':' (type | 'void') '{' varDefinition* statement* '}'
    ;

param : ID ':' type
    ;

//-------LEXER------------

//------------------------ CTRL+SHIFT+G

MULTILINE_COMMENT: '/*' .*? '*/' -> skip
    ;

ONELINE_COMMENT:  '//' ~[\n\r]* -> skip
    ;

WHITESPACES:[\n\t\r ] + -> skip
    ;

fragment MANTISA: INT_CONSTANT '.'? [0-9]+
    ;

fragment EXPONENTE: [eE] [+-]? INT_CONSTANT
    ;

REAL_CONSTANT: INT_CONSTANT? '.' [0-9]*
    | MANTISA EXPONENTE
    | INT_CONSTANT EXPONENTE
    ;
  		 
INT_CONSTANT: [1-9][0-9]*
            | '0'
            ;

CHAR_CONSTANT: '\'' . '\''
    | '\'\\' INT_CONSTANT '\''
    | '\'\\n\''
    | '\'\\t\''
    ;

PRIMITIVE_TYPE: 'char'
        | 'number'
        | 'int'
        ;

ID : [a-zA-Z_]+ [a-zA-Z_0-9]*
    ;
