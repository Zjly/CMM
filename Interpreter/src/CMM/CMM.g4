// CMM语言文法
grammar CMM;

// CMM语言文件
file: includeDeclaration* compilationUnit* EOF;

// include声明
includeDeclaration: '#include' ( '<' ID ('.' ID)* '>'| '"' ID ('.' ID)* '"');

// 编译单元
compilationUnit
			: functionDeclaration               # CompilationUnit_FunctionDeclaration
			| function                          # CompilationUnit_Function
			| variableDeclarationStatement ';'  # CompilationUnit_variableDeclarationStatement
			;

// 函数声明
functionDeclaration: type ID '(' (formalParameter (',' formalParameter)*)? ')' ';';

// 方法
function: type ID '(' (formalParameter (',' formalParameter)*)? ')' block;

// 形式参数
formalParameter: type ID;

// 语句块
block: '{' blockStatement* '}';

// 语句块语句
blockStatement
			: variableDeclarationStatement ';'      # BlockStatement_VariableDeclaration
			| function                              # BlockStatement_Function
			| statement                             # BlockStatement_Statement
			;

// 变量声明语句
variableDeclarationStatement: ('static')* type variableDeclarators;

// 多次变量声明
variableDeclarators: variableDeclarator (',' variableDeclarator)*;

// 变量声明
variableDeclarator
				: ID ('=' expression)?                               # VariableDeclarator_Variable
				| ID '[' expression ']' ('=' arrayInitializer)?      # VariableDeclarator_Array
				;

// 数组初始化
arrayInitializer: '{' (expression (',' expression)*)? '}';

// 语句
statement
		: block                         # Statement_Block
		| ifStatement                   # Statement_If
		| forStatement                  # Statement_For
		| whileStatement                # Statement_While
		| RETURN expression? ';'        # Statement_Return
		| BREAK ';'                     # Statement_Break
		| CONTINUE ';'                  # Statement_Continue
		| ';'                           # Statement_Semicolon
		| expression ';'                # Statement_Expression
		;

// if语句
ifStatement: IF '(' expression ')' statement ('else' statement)?;

// for语句
forStatement: FOR '(' variableDeclarationStatement? ';' expression? ';' expression? ')' statement;

// while语句
whileStatement: WHILE '(' expression ')' statement;

// 表达式
expression
		:   '(' expression ')'                                  # Expression_Brackets
		|   literal                                             # Expression_Literal
		|   ID                                                  # Expression_ID
		|   expression '.' ID                                   # Expression_DotID
		|   ID '[' expression ']'                               # Expression_Array
		|   ID '(' (expression (',' expression)*)? ')'          # Expression_Call
		|   expression op=('++' | '--')                         # Expression_PlusPlus_MinerMiner
		|   op=('+'|'-'|'++'|'--') expression                   # Expression_Plus_Minus
		|   ('~'|'!') expression                                # Expression_Not
		|   ('*' | '&') expression                              # Expression_Pointer
        |   '(' type ')' expression                             # Expression_TypeChange
        |   expression op=('*'|'/'|'%') expression              # Expression_Mul_Div
        |   expression op=('+'|'-') expression                  # Expression_Add_Min
        |   expression ('<<'| '>>') expression                  # Expression_Shift
        |   expression op=('<=' | '>=' | '>' | '<') expression  # Expression_Greater_Less
        |   expression op=('==' | '!=') expression              # Expression_Equal
        |   expression '&' expression                           # Expression_And
        |   expression '^' expression                           # Expression_Xor
        |   expression '|' expression                           # Expression_Or
        |   expression '&&' expression                          # Expression_LogicAnd
        |   expression '||' expression                          # Expression_LogicOr
        |   expression '?' expression ':' (expression)          # Expression_ConditionalOperator
	    |   expression '+=' expression                          # Expression_AssignAdd
	    |   expression '-=' expression                          # Expression_AssignMin
	    |   expression '*=' expression                          # Expression_AssignMul
	    |   expression '/=' expression                          # Expression_AssignDiv
	    |   expression '&=' expression                          # Expression_AssignAnd
	    |   expression '|=' expression                          # Expression_AssignOr
	    |   expression '=' expression                           # Expression_Assignment
		;

// 字面量
literal
	: INT_NUMBER    # Number_Int
	| FLOAT_NUMBER  # Number_Float
	| CHARACTER     # Literal_Character
	| STRING        # Literal_String
	| BOOLEAN       # Literal_Boolean
	| 'null'        # Literal_Null
	;

// 类型
type: primitiveType pointer?;
pointer : '*';

// 基本类型
primitiveType
	: BOOL
	| CHAR
	| BYTE
	| SHORT
    | INT
	| LONG
	| FLOAT
	| DOUBLE
	| VOID
	| STR
	;

// 类型
BOOL: 'bool';
CHAR: 'char';
BYTE: 'byte';
SHORT: 'short';
INT: 'int';
LONG: 'long';
FLOAT: 'float';
DOUBLE: 'double';
VOID: 'void';
STR: 'string';

// 跳转
BREAK: 'break';
RETURN: 'return';
CONTINUE: 'continue';

// 条件
IF: 'if';

// 循环
WHILE: 'while';
FOR: 'for';

// 布尔值
BOOLEAN: 'true' | 'false';

// 标识符
ID: ID_LETTER (ID_LETTER | DIGIT)*;

// 整数
INT_NUMBER: DIGIT+;
// 浮点数
FLOAT_NUMBER: DIGIT+ . DIGIT+;

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

// 空白字符
WS: [ \t\n\r]+ -> skip;