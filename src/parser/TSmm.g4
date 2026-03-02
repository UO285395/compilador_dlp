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
//program returns [Program ast] locals[List<Definition> defs = new ArrayList<>()]: (definition{$defs.add($definition.ast);})* {$ast = new Program($defs)}
//con un metodo en la clase
//program returns [Program ast]: {$ast = new Program()} (definition{$ast.addDefinition($definition.ast);})*
//program returns [Program ast = new Program()]: (definition{$ast.addDefinition($definition.ast);})*
program returns [Program ast] locals[List<Definition> defs = new ArrayList<>()]:
 (v=varDefinitions {$defs.addAll($v.ast);} | f=funcDefinition {$defs.add($f.ast);})* m=funcDefinition {$defs.add($m.ast);} EOF
      {$ast = new Program($defs);}
      ;

expression returns [Expression ast]:
    INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | REAL_CONSTANT {$ast = new RealNumber($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text);}
    | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
    | '(' expression ')' {$ast = $expression.ast;}
    | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
    | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $ID.text);}
    |'(' expression 'as' type ')'{$ast = new Cast($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $type.ast);}
    | '-' expression {$ast = new UnaryMinus($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
    | '!' expression {$ast = new UnaryNot($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
    | e1=expression OP=('*'|'/'|'%') e2=expression {$ast = new ArithmeticOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('+'|'-') e2=expression {$ast = new ArithmeticOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new CompareOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | e1=expression OP=('&&'|'||') e2=expression {$ast = new LogicOp($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $OP.text, $e2.ast);}
    | ID '(' args ')' {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine() + 1, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $args.ast);}
    | ID '(' ')' {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine() + 1, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text));}
    ;

args returns [List<Expression> ast = new ArrayList<>()]:
    e1=expression { $ast.add($e1.ast);}  (',' e2=expression { $ast.add($e2.ast);} )*
    ;

statement returns [Statement ast]:  'log' args ';' {$ast = new Log($args.ast.getFirst().getLine(), $args.ast.getFirst().getColumn(), $args.ast);}
    | 'input' args ';' {$ast = new Input($args.ast.getFirst().getLine(), $args.ast.getFirst().getColumn(), $args.ast);}
    | e1=expression '=' e2=expression ';' {$ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
    | 'if' '(' expression ')' i1=ifBlock 'else' i2=ifBlock {$ast = new IfStatement($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $i1.ast, $i2.ast);}
    | 'if' '(' expression ')' i1=ifBlock {$ast = new IfStatement($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $i1.ast);}
    | 'while' '(' expression ')' ifBlock {$ast = new WhileStatement($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $ifBlock.ast);}
    | 'return' expression ';' {$ast = new Return($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
    | ID '(' args ')' ';'  {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine() + 1, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $args.ast);}
    | ID '(' ')' ';' {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine() + 1, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text));}
    ;

ifBlock returns [List<Statement> ast = new ArrayList<>()]: statement {$ast.add($statement.ast);}
    | '{' (statement {$ast.add($statement.ast);})* '}'
    ;

type returns [Type ast]:
 t=primitive_type {$ast = $t.ast;}
    | '[' INT_CONSTANT ']' type {$ast = new ArrayType($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast);}
    | '[' r=recordFields  ']' {$ast = new RecordType($r.ast.getFirst().getLine(),$r.ast.getFirst().getColumn(), $r.ast);}
    ;

primitive_type returns [Type ast]: 'char' {$ast = CharType.getInstance();}
        | 'number' {$ast = NumType.getInstance();}
        | 'int' {$ast = IntType.getInstance();}
        ;

recordFields returns [List<RecordField> ast = new ArrayList<>()]
    : (v=varDefinitions {
            for (VarDefinition var : $v.ast) {
                $ast.add(
                    new RecordField(
                        var.getLine(),
                        var.getColumn(),
                        var.getName(),
                        var.getType()
                    )
                );
            }
      })+
    ;

varDefinitions returns [List<VarDefinition> ast = new ArrayList<>()]
    : 'let' ids+=ID (',' ids+=ID)* ':' t=type ';'
    {
        for (int k = 0; k < $ids.size(); k++) {
            $ast.add(
                new VarDefinition(
                    $ids.get(k).getLine(),
                    $ids.get(k).getCharPositionInLine() + 1,
                    $ids.get(k).getText(),
                    $t.ast
                )
            );
        }
    }
;

funcDefinitions returns [List<FuncDefinition> ast = new ArrayList<>()]:
    (f=funcDefinition {$ast.add($f.ast);})*
    ;

funcDefinition returns [FuncDefinition ast]:
    {List<Statement> stmt = new ArrayList<>();}
    {List<VarDefinition> defs = new ArrayList<>();}

    'function ' ID '(' p=paramList ')' ':' rt=returnType '{' (vdef=varDefinitions {defs.addAll($vdef.ast);})* (s=statement {stmt.add($s.ast);})* '}'
    {
        {$ast = new FuncDefinition($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text, new FuncType($p.ast, $rt.ast), defs, stmt);}
    }
    ;

returnType returns [Type ast]:
    pt=primitive_type {$ast = $pt.ast;}
    | 'void' {$ast = VoidType.getInstance();}
    ;

paramList returns [List<VarDefinition> ast = new ArrayList<>()]
     : p=param {$ast.add($p.ast);} (',' p1=param {$ast.add($p1.ast);} )*
     |
    ;

param returns [VarDefinition ast]: ID ':' t=type {$ast = new VarDefinition($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text, $t.ast);}
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



ID : [a-zA-Z_]+ [a-zA-Z_0-9]*
    ;
