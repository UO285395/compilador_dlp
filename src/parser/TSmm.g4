grammar TSmm;	

program: (varDefinition | funcDefinition)* EOF
       ;

expression: INT_CONSTANT
    | REAL_CONSTANT
    | ID
    | CHAR_CONSTANT
    | '(' expression ')'
    | expression '[' expression ']'
    | expression '.' expression
    |'(' expression 'as' PRIMITIVE_TYPE ')'
    | '-' expression
    | '!' expression
    | expression ('*'|'/'|'%') expression
    | expression ('+'|'-') expression
    | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
    | expression ('&&'|'||') expression
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

type : PRIMITIVE_TYPE
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
