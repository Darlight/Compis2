/*
Universidad del Valle de Guatemala
CC3032 - Construccion de Compiladores
Mario Perdomo
Carnet 18029
grammarYAPL.g4
 */
grammar grammarYAPL;

// |--- Lexer Rules ---|

// Conditions and Loops
TRUE:   'true';
FALSE:  'false';
FI: 'fi'| 'FI';
IF: 'if'| 'IF';
ELSE: 'else' | 'ELSE';
WHILE: 'while' | 'WHILE';
IN: 'in' | 'IN';
LOOP: 'loop' | 'LOOP';
POOL: 'pool' | 'POOL';
THEN: 'then' | 'THEN';
NEW: 'new' | 'NEW';
NOT: 'not' | 'NOT' ;
ISVOID: 'isvoid' | 'ISVOID';

//Class and variable definitions
INHERITS: 'inherits' | 'INHERITS';
CLASS: 'class' | 'CLASS';
TYPE:   [A-Z_][_A-Za-z0-9]*;
ID:  [a-z_][_A-Za-z0-9]*;
INT: [0-9][0-9]*;
SEMICOLON: ';';
STRING              : '"' (ESC | ~ ["\\])* '"' ;
fragment ESC        : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE    : 'u' HEX HEX HEX HEX ;
fragment HEX        : [0-9a-fA-F] ;


//Comments and WS
SMALLCOMMENT: '--' ~[\r\n]* -> skip;           
BIGCOMMENT:'(*' ~[_a-zA-Z0-9\r\n]* '*)' -> skip;
WHITESPACE: [ \t\f\r\n]+ -> skip;
POINT: '.' ;
ERROR: . -> skip ;

// |--- Parser Rules ---|
program:  (create_class)+ EOF;

create_class: CLASS TYPE (INHERITS TYPE)? '{' (feature SEMICOLON )+ '}' ;

feature: (ID '(' (formal ','?)* ')' ':' TYPE '{' expr '}' )
        | ID ':' TYPE ('<-' expr)?
        ;

formal: ID ':' TYPE;

expr: ID '<-' expr #Assign
    | expr '(' (expr ','?)+ ')' #self
    | expr ('@' TYPE)? '.' ID '(' expr (',' expr)* ')' #dispatch
    | IF expr THEN expr ELSE expr FI #IFs
    | WHILE expr LOOP expr POOL #Loops
    | '{' (expr SEMICOLON)+ '}' #Content
    | 'let' ID ':' TYPE ('<-' expr)? (',' ID ':' TYPE '<-' expr)* IN expr #CreateVar
    | NEW TYPE #NewType
    | ISVOID expr #Void
    | left=expr op=('*'|'/') right=expr #MultandDiv
    | left=expr op=('+'|'-') right=expr #SumandMinus
    | '~' expr #InverseBits
    | expr '<' expr #GreaterThan
    | expr '<=' expr #GreaterThanorEqual
    | expr '=' expr #Equal
    | NOT expr #Not
    | '(' expr ')' #Paranthesis
    | ID #ID
    | INT #INT
    | STRING #STRING
    | TRUE #BoolTru
    | FALSE #BoolFal
    ;