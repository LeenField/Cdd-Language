/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar cdd;

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    |   K_VOID          // "int main(void) {...}"
    ;
formalParameter
    :   type ID
    ;

//type:   ('float' | 'int' | 'void' | 'char') pointer?; // user-defined types
type:   K_ARRAY | K_STRING | K_VOID | K_INT | K_CHAR | K_FLOAT ; // user-defined types


block:  '{' stat* '}' ;   // possibly empty statement block

stat:   block
    |   varDecl
    |   'if' expr stat ('else' stat)?
    |   'return' expr? ';' 
    |   expr '=' expr ';' //     assignment
    |   expr ';'          // func call
    ;

/* expr below becomes the following non-left recursive rule:
expr[int _p]
    :   ( '-' expr[6]
        | '!' expr[5]
        | ID
        | INT
        | '(' expr ')'
        )
        ( {8 >= $_p}? '*' expr[9]
        | {7 >= $_p}? ('+'|'-') expr[8]
        | {4 >= $_p}? '==' expr[5]
        | {10 >= $_p}? '[' expr ']'
        | {9 >= $_p}? '(' exprList? ')'
        )*
    ;
*/

expr:   ID '(' exprList? ')'           # Call   // 函数调用表达式
    |   expr '[' expr ']'              # Index  // 数组索引表达式
    |   '-' expr                       # Negate // 一元取反
    |   '!' expr                       # Not    // 布尔非表达式
    |   expr '*' expr                  # Mult   // 乘法运算
    |   expr ('+'|'-') expr            # AddSub // 加减法运算
    |   expr ('<'|'>'|'<='|'<=') expr  # Relation
    |   expr '==' expr                 # Equal  // 优先级最低的运算 等于
    |   ID                             # Var    // 变量引用
    |   constant                       # Const
    |   '(' expr ')'                   # Parens
    ;

exprList : expr (',' expr)* ;   // arg list

constant
    :   INT                           // # Int
    |   FLOAT                         // # Float
    |   CHAR_CONST                    // # Char
    |   STRING                        // # String
    ;
//=================== Lexer Tokens ==============
K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
K_CHAR  : 'char';
K_ARRAY : 'int *' | 'int*';
K_STRING : 'char *'| 'char*' ;
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z_] ;
fragment
DIGIT : [0-9]
    ;
INT :   DIGIT+
    ;

FLOAT
     : DIGIT* '.' DIGIT+
     | DIGIT+ '.'
     ;

fragment
EscapeSequence                        // 转义字符
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape                          // 256个八进制转义序列
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// fragment
// STRING_GUTS :	( EscapeSequence | ~('\\'|'"') )* ;

COMMENTS
    :    ('/*' .*? '*/') -> channel(HIDDEN);

CHAR_CONST              // 不能是 单个反斜杠符号 或者 单个'引号
    :    '\'' ( EscapeSequence | ~('\\'|'\'') ) '\'' ;
STRING
    :    '"' ( EscapeSequence | ~('\\'|'"') )*?  '"' ;
// Simgle line comment
SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;

WS  :   [ \t\n\r]+ -> skip ;
