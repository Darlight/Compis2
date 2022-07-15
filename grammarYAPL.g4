/*
Universidad del Valle de Guatemala
CC3032 - Construccion de Compiladores
Mario Perdomo
Carnet 18029
 */
grammar grammarYAPL;

//Lexer Rules
Type:   [a-zA-Z]+;
True:   'true';
False:  'false';
Int: [0-9]+;
semicolon: ';';
Smallcomment: '--' ~[\r\n]* -> skip;           
Bigcomment:'(*' ~[a-zA-Z0-9\r\n]* '*)' -> skip;

//Parser Rules
program:  ();
Class: [0-3]+;
feature: 'a';
formal: 'c';
expre: 'b';

