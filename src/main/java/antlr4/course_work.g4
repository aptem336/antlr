grammar course_work;

@parser::members{
int if_label_counter = 0;
int switch_label_counter = 0;
int repeat_label_counter = 0;
}

programm
 : stat* {Emitter.addLine("HALT");}
 ;

stat
 : declaration
 | assignment
 | if_stat
 | switch_stat
 | repeat_stat
 | SCOL
 ;

assignment
 : ID LTEQ (expr | logic_expr) {Emitter.addLine("LVALUE "+_localctx.ID().getText());Emitter.addLine(":=");} SCOL
 ;

if_stat
  : {String IEL=" IE"+if_label_counter; String IBL = " IB"+if_label_counter; if_label_counter++;} QMARK logic_expr {Emitter.addLine("GOFALSE "+IEL);} SHARP stat_block {Emitter.addLine("GOTO "+IBL);Emitter.addLine("LABEL "+IEL+":");}(COL stat_block)? {Emitter.addLine("LABEL "+IBL+":");}
  ;

QMARK : '?';
SHARP: '#';

stat_block
 : OBRACE stat* CBRACE
 | stat
 ;

switch_stat
 : {int case_label_counter=0;} SWITCH expr {Emitter.addLine("LVALUE memory");Emitter.addLine(":=");} OBRACE (BY atom {Emitter.addLine("RVALUE memory");Emitter.addLine("PUSH "+_localctx.atom().get(0).getText());Emitter.addLine("=");Emitter.addLine("GOFALSE SC"+switch_label_counter+""+case_label_counter);} COL stat_block {Emitter.addLine("GOTO SB"+switch_label_counter);Emitter.addLine("LABEL SC"+switch_label_counter+""+case_label_counter+":");case_label_counter++;})* CBRACE {Emitter.addLine("LABEL SB"+switch_label_counter+":");switch_label_counter++;}
 ;

SWITCH : 'switch';
BY: 'by';

repeat_stat
 : {String RSL="RS"+repeat_label_counter;repeat_label_counter++;} REPEAT {Emitter.addLine("LABEL "+RSL+":");} stat_block WHEN logic_expr {Emitter.addLine("GOTRUE "+RSL);}
 ;

REPEAT : 'repeat';
WHEN: 'when';

declaration
 : {String type="";}(NUMBER_KW{type="DW";}|REAL_KW{type="DD";}|CHAR_KW{type="DB";}|BOOLEAN_KW{type="DW";}) ID {String name=_localctx.ID().getText();Emitter.addVariable(name, type);} (LTEQ (expr | logic_expr) {Emitter.addLine("LVALUE "+_localctx.ID().getText());Emitter.addLine(":=");})? SCOL
 ;

NUMBER_KW : 'number';
REAL_KW : 'real';
CHAR_KW : 'char'('a'('c'('t'('e'('r')?)?)?)?)?;
BOOLEAN_KW: 'bool';

expr
 : OPAR expr CPAR #parExpr
 | expr op=(MULT|DIV) expr {Emitter.addOp(((MultiplicationExprContext) _localctx).op.getText());} #multiplicationExpr
 | expr op=(PLUS|MINUS) expr {Emitter.addOp(((AdditiveExprContext) _localctx).op.getText());} #additiveExpr
 | atom {Emitter.addLine("PUSH "+_localctx.getText());} #atomExpr
 | ID {Emitter.addLine("RVALUE "+_localctx.getText());} #id
 ;

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';

atom
 : (INT|INT5|FLOAT|CHAR|NULL)
 ;

logic_expr
 : OPAR logic_expr CPAR #parExprLogic
 | expr op=(LTEQ | GTEQ | LT | GT) expr {Emitter.addLine(((RelationalExprLogicContext) _localctx).op.getText());} #relationalExprLogic
 | expr op=(EQ | NEQ) expr {Emitter.addLine(((EqualityExprLogicContext) _localctx).op.getText());} #equalityExprLogic
 | logic_expr AND logic_expr {Emitter.addLine("AND");} #andExprLogic
 | logic_expr OR logic_expr {Emitter.addLine("OR");} #orExprLogic
 | logic_atom {Emitter.addLine("PUSH "+_localctx.getText());} #atomExprLogic
 | ID {Emitter.addLine("RVALUE "+_localctx.getText());} #idLogic
 ;

LTEQ : '<=';
GTEQ : '>=';

LT : '<';
GT : '>';

EQ : '=';
NEQ : '<>';

AND : '&&';
OR : '||';

logic_atom
 : (YES|NO)
 ;

ID
 : [a-zA-Z_]INT[a-zA-Z_]
 ;

INT
 : [0-9]+
 ;

FLOAT
 : (INT|'.'INT|INT'.'INT)'f'?
 ;

CHAR
 : '\''~['\r\n]'\''
 ;

INT5
 : '5x'[0-4]+
 ;

YES : 'YES';
NO : 'NO';

NULL : 'null';

COL : ':';
SCOL : ';';

OPAR : '(';
CPAR : ')';

OBRACE : '{';
CBRACE : '}';

SPACE
 : [ \t\r\n] -> skip
 ;