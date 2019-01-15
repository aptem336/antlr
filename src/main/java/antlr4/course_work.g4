grammar course_work;

@parser::members{
private int if_label_counter = 0;
private int while_label_counter = 0;
private int switch_label_counter = 0;
}

programm
 : stat* EOF {Emitter.addLine("HALT");}
 ;

stat
 : declaration
 | assignment
 | if_stat
 | switch_stat
 | while_stat
 | SCOL
 ;

declaration
 : {String type;}(INTEGER_KW{type="DW";}|FLOAT_KW{type="DD";}|CHAR_KW{type="DB";}|BOOLEAN_KW{type="DW";}) ID {Emitter.addVariable(_localctx.ID().getText(), type);} ({Emitter.addLine("LVALUE "+_localctx.ID().getText());} ASSIGN (expr | logic_expr) {Emitter.addLine(":=");})? SCOL
 ;

assignment
 : ID {Emitter.addLine("LVALUE "+_localctx.ID().getText());} ASSIGN (expr | logic_expr) {Emitter.addLine(":=");} SCOL
 ;

stat_block
 : OBRACE programm CBRACE
 | stat
 ;

if_stat
 : QMARK logic_expr {String if_else_label=" IFE_"+if_label_counter; String if_break_label=" IFB_"+if_label_counter;if_label_counter++;Emitter.addLine("GOFALSE"+if_else_label);} SHARP stat_block {Emitter.addLine("GOTO"+if_break_label);Emitter.addLine("LABEL"+if_else_label+":");}(COL stat_block)? {Emitter.addLine("LABEL"+if_break_label+":");}
 ;

switch_stat
 : SWITCH expr {Emitter.addLine("LVALUE mem");Emitter.addLine(":=");} OBRACE option+ CBRACE
 ;

option
 : BY {String option_label=" OP_"+switch_label_counter;switch_label_counter++;Emitter.addLine("RVALUE mem");} atom {Emitter.addLine("=");Emitter.addLine("GOFALSE"+option_label);} COL stat_block {Emitter.addLine("LABEL"+option_label+":");}
 ;

while_stat
 : WHILE {String while_start_label=" WS_"+while_label_counter;String while_break_label=" WB_"+while_label_counter;while_label_counter++;} OPAR logic_expr CPAR {Emitter.addLine("GOFALSE"+while_break_label);Emitter.addLine("LABEL"+while_start_label+":");} DO stat_block {Emitter.addLine("GOTO"+while_start_label);Emitter.addLine("LABEL"+while_break_label+":");}
 ;

expr
 : OPAR expr CPAR                                                                                           #parExpr
 | expr op=(MULT | DIV) expr  {Emitter.addOp(((MultiplicationExprContext)_localctx).op.getText());}         #multiplicationExpr
 | expr op=(PLUS | MINUS) expr  {Emitter.addOp(((AdditiveExprContext)_localctx).op.getText());}             #additiveExpr
 | atom                                                                                                     #atomExpr
 | MINUS expr                                                                                               #minusExpr
 | ID {Emitter.addLine("RVALUE "+((IdContext) _localctx).ID().getText());}                                  #id
 ;

atom
 : (INT | INT4 | FLOAT | CHAR | NULL) {Emitter.addLine("PUSH "+_localctx.getText());}
 ;

logic_expr
 : OPAR logic_expr CPAR                                                                                             #parExprLogic
 | expr op=(LTEQ | GTEQ | LT | GT) expr {Emitter.addLine(((RelationalExprLogicContext)_localctx).op.getText());}    #relationalExprLogic
 | expr op=(EQ | NEQ) expr  {Emitter.addLine(((EqualityExprLogicContext)_localctx).op.getText());}                  #equalityExprLogic
 | logic_expr AND logic_expr    {Emitter.addLine("OR");}                                                            #andExprLogic
 | logic_expr OR logic_expr {Emitter.addLine("AND");}                                                               #orExprLogic
 | logic_atom                                                                                                       #atomExprLogic
 | NOT logic_expr                                                                                                   #notExprLogic
 | ID {Emitter.addLine("RVALUE "+((IdLogicContext) _localctx).ID().getText());}                                     #idLogic
 ;

logic_atom
 : (TRUE | FALSE) {Emitter.addLine("PUSH "+_localctx.getText());}
 ;

INTEGER_KW : 'int'('e'('g'('e'('r')?)?)?)?;
FLOAT_KW : 'float';
CHAR_KW : 'char';
BOOLEAN_KW: 'bool';

NOT : '!';
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

OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

SCOL : ';';
ASSIGN : ':=';
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
 : [a-zA-Z_]INT[a-zA-Z_]
 ;

INT
 : [0-9]+
 ;
INT4
 : '4x'[0-3]+
 ;

FLOAT
 : INT'.'INT'f'?
 ;

CHAR
 : '\''~['\r\n]'\''
 ;

SPACE
 : [ \t\r\n] -> skip
 ;