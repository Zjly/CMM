// CMM语言文法
grammar CMM;

// CMM语言文件
file: includeDeclaration* compilationUnit* EOF;

// include声明
includeDeclaration: '#include' ( '<' ID ('.' ID)* '>'| '"' ID ('.' ID)* '"');

// 编译单元
compilationUnit
			: methodDeclaration
			| method
			;

// 方法声明
methodDeclaration
				: type ID '(' formalParameters ')' ';'
				| 'void' ID '(' formalParameters ')' ';'
				;

// 方法
method
	: type ID '(' formalParameters ')' block
	| 'void' ID '(' formalParameters ')' block
	;

// 形式参数
formalParameters: (type ID (',' type ID)*)?;

// 语句块
block: '{' blockStatement* '}';

// 语句块语句
blockStatement
			: variableDeclarationStatement ';'
			| method
			| statement
			;

// 变量声明语句
variableDeclarationStatement
						: ('static')* type variableDeclarators
						| ('static')* type '*' variableDeclarators
						;

// 多次变量声明
variableDeclarators: variableDeclarator (',' variableDeclarator)*;

// 变量声明
variableDeclarator
				: ID ('=' expression)?
				| ID '[' expression ']' ('=' arrayInitializer)?
				;

// 变量初始化
variableInitializer
				: arrayInitializer
				| expression
				;

// 数组初始化
arrayInitializer: '{' (variableInitializer (',' variableInitializer)* (',')? )? '}';

// 语句
statement
		: block
		| ifStatement
		| forStatement
		| whileStatement
		| 'return' expression? ';'
		| 'break' ';'
		| 'continue' ';'
		| ';'
		| expression ';'
		;

// if语句
ifStatement: 'if' '(' expression ')' statement ('else' statement)?;

// for语句
forStatement: 'for' '(' forControl ')' statement;

// while语句
whileStatement: 'while' '(' expression ')' statement;

// for控制语句
forControl: forInit? ';' expression? ';' expressionList?;

// for变量初始化
forInit
	: variableDeclarationStatement
	| expressionList
	;

// 表达式列表
expressionList
    :   expression (',' expression)*
    ;

// 表达式
expression
		:   '(' expression ')'
		|   literal
		|   ID
		|   expression '.' ID
		|   expression '[' expression ']'
		|   expression '(' expressionList? ')'
		|   expression ('++' | '--')
		|   ('+'|'-'|'++'|'--') expression
		|   ('~'|'!') expression
		|   ('*' | '&') expression
        |   '(' type ')' expression
        |   expression ('*'|'/'|'%') expression
        |   expression ('+'|'-') expression
        |   expression ('<<'| '>>') expression
        |   expression ('<=' | '>=' | '>' | '<') expression
        |   expression ('==' | '!=') expression
        |   expression '&' expression
        |   expression '^' expression
        |   expression '|' expression
        |   expression '&&' expression
        |   expression '||' expression
        |   expression '?' expression ':' expression
        |   expression
	        ('+='<assoc=right>
	        |'-='<assoc=right>
	        |'*='<assoc=right>
	        |'/='<assoc=right>
	        |'&='<assoc=right>
	        |'|='<assoc=right>
	        |'='<assoc=right>
	        )
            expression
		;

// 字面量
literal
	: NUMBER
	| CHARACTER
	| STRING
	| BOOLEAN
	| 'null'
	;


// 类型
type: PRIMITIVE_TYPE ('*')*;

// 基本类型
PRIMITIVE_TYPE
	: 'bool'
	| 'char'
	| 'byte'
	| 'short'
    | 'int'
	| 'long'
	| 'float'
	| 'double'
	;

// 标识符
ID: ID_LETTER (ID_LETTER | DIGIT)*;

// 数
NUMBER: INT | FLOAT;
// 整数
INT: DIGIT+;
// 浮点数
FLOAT: DIGIT+ . DIGIT+;

// 字符串
STRING: '"' (ESC | .)*? '"';
// 字符
CHARACTER: '\'' ( ESC | ~('\''|'\\') ) '\'';
// 表示\b \n \t \r
fragment ESC: '\\' [bntr"\\];

// 行注释
LINE_COMMENT: '//' .*? '\n' -> skip;
// 多行注释
COMMENT: '/*' .*? '*/' -> skip;

// 标识符中字母
ID_LETTER: [a-zA-Z_];
// 数字
DIGIT: [0-9];

// 布尔值
BOOLEAN: 'true' | 'false';

// 空白字符
WS: [ \t\n\r]+ -> skip;