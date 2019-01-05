grammar course_work;

@members{
Emitter emitter;
public course_workParser(CommonTokenStream input, Emitter emitter){
    this(input);
    this.emitter = emitter;
}
}

parse
 : block EOF {emitter.addLine("HALT");}
 ;

block
 : stat*
 ;

stat
 : declaration
 | assignment SCOL
 | if_stat
 | switch_stat
 | while_stat
 ;

declaration
 : (INTEGER_KW|FLOAT_KW|CHAR_KW|BOOLEAN_KW) (ID{emitter.addVariable(_localctx.getText());}|assignment) SCOL
 ;

assignment
 : ID {emitter.addVariable(_localctx.getText());emitter.addLine("LVALUE "+_localctx.ID().getText());} ASSIGN (expr|logic_expr) {emitter.addLine(":=");}
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

if_stat
 : QMARK logic_expr SHARP stat_block (COL stat_block)?
 ;

switch_stat
 : SWITCH expr {emitter.addLine("RVALUE memory");emitter.addLine(":=");} OBRACE option+ CBRACE
 ;

option
 : BY {emitter.addLine("LVALUE memory");} atom {emitter.addLine("=");} COL stat_block
 ;

while_stat
 : WHILE logic_expr DO stat_block
 ;

expr
 : OPAR expr CPAR                                                                                           #parExpr
 | expr op=(MULT | DIV) expr  {emitter.addOp(((MultiplicationExprContext)_localctx).op.getText());}         #multiplicationExpr
 | expr op=(PLUS | MINUS) expr  {emitter.addOp(((AdditiveExprContext)_localctx).op.getText());}             #additiveExpr
 | MINUS expr                                                                                               #unaryMinusExpr
 | atom                                                                                                     #atomExpr
 | ID {emitter.addLine("RVALUE "+((IdContext) _localctx).ID().getText());}                                  #id
 ;

atom
 : (INT | INT4 | FLOAT | CHAR | STRING | NULL) {emitter.addLine("PUSH "+_localctx.getText());}
 ;

logic_expr
 : OPAR logic_expr CPAR                                                                                             #parExprLogic
 | expr op=(LTEQ | GTEQ | LT | GT) expr {emitter.addLine(((RelationalExprLogicContext)_localctx).op.getText());}    #relationalExprLogic
 | expr op=(EQ | NEQ) expr  {emitter.addLine(((EqualityExprLogicContext)_localctx).op.getText());}                  #equalityExprLogic
 | logic_expr AND logic_expr    {emitter.addLine("OR");}                                                            #andExprLogic
 | logic_expr OR logic_expr {emitter.addLine("AND");}                                                               #orExprLogic
 | NOT logic_expr                                                                                                   #notExprLogic
 | logic_atom                                                                                                       #atomExprLogic
 | ID {emitter.addLine("RVALUE "+((IdLogicContext) _localctx).ID().getText());}                                     #idLogic
 ;

logic_atom
 : (TRUE | FALSE) {emitter.addLine("PUSH "+_localctx.getText());}
 ;

INTEGER_KW : 'int'('e'('g'('e'('r')?)?)?)?;
FLOAT_KW : 'float';
CHAR_KW : 'char';
BOOLEAN_KW: 'bool';

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
NOT : '!';

SCOL : ';';
ASSIGN : ':=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NULL : 'null';
QMARK : '?';
SHARP: '#';
COL : ':';
SWITCH : 'switch';
BY: 'by';
WHILE : 'while';
DO: 'do';

ID
 : [a-zA-Z_][0-9]+[a-zA-Z_]
 ;

INT
 : [0-9]+
 ;
INT4
 : '4x'[0-4]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

CHAR
 : '\''~['\r\n]'\''
 ;

STRING
 : '"' (~["\r\n])* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;