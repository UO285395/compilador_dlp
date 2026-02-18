grammar TSmm;	

program: INT_CONSTANT+
       ;

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

