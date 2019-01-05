grammar course_work;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : declaration
 | assignment
 | if_stat
 | switch_stat
 | while_stat
 ;

declaration
 : (INTEGER_KW|FLOAT_KW|CHAR_KW) ID (ASSIGN expr)? SCOL
 | BOOLEAN_KW ID (ASSIGN logic_expr)? SCOL
 ;

assignment
 : ID ASSIGN (expr|logic_expr) SCOL
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

if_stat
 : QMARK logic_expr SHARP stat_block (COL stat_block)?
 ;

switch_stat
 : SWITCH expr (OBRACE BY atom COL stat_block)+ CBRACE
 ;

while_stat
 : WHILE logic_expr DO stat_block
 ;

expr
 : OPAR expr CPAR                   #parExpr
 | MINUS expr                       #unaryMinusExpr
 | expr op=(MULT | DIV | MOD) expr  #multiplicationExpr
 | expr op=(PLUS | MINUS) expr      #additiveExpr
 | atom                             #atomExpr
 | ID                               #id
 ;

atom
 : (INT | INT4 | FLOAT)  #numberAtom
 | CHAR                  #charAtom
 | STRING                #stringAtom
 | NULL                  #nullAtom
 ;

logic_expr
 : OPAR logic_expr CPAR                  #parExprLogic
 | expr op=(LTEQ | GTEQ | LT | GT) expr  #relationalExprLogic
 | expr op=(EQ | NEQ) expr               #equalityExprLogic
 | logic_expr AND logic_expr             #andExprLogic
 | logic_expr OR logic_expr              #orExprLogic
 | NOT logic_expr                        #notExprLogic
 | logic_atom                            #atomExprLogic
 | ID                                    #idLogic
 ;

logic_atom
 : (TRUE | FALSE)  #booleanAtom
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
MOD : '%';
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