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
functionDeclaration: type ID '(' formalParameters ')' ';';

// 方法
function: type ID '(' formalParameters ')' block;

// 形式参数列表
formalParameters: (formalParameter (',' formalParameter)*)?;

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
				: ID ('=' expression)?                              # VariableDeclarator_Variable
				| ID '[' expression ']' ('=' arrayInitializer)?     # VariableDeclarator_Array
				;

// 变量初始化
variableInitializer
				: arrayInitializer      # VariableInitializer_Array
				| expression            # VariableInitializer_Expression
				;

// 数组初始化
arrayInitializer: '{' (variableInitializer (',' variableInitializer)* (',')? )? '}';

// 语句
statement
		: block                         # Statement_Block
		| ifStatement                   # Statement_If
		| forStatement                  # Statement_For
		| whileStatement                # Statement_While
		| 'return' expression? ';'      # Statement_Return
		| 'break' ';'                   # Statement_Break
		| 'continue' ';'                # Statement_Continue
		| ';'                           # Statement_Semicolon
		| expression ';'                # Statement_Expression
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
	: variableDeclarationStatement      # ForInit_VariableDeclaration
	| expressionList                    # ForInit_ExpressionList
	;

// 表达式列表
expressionList: expression (',' expression)*;

// 表达式
expression
		:   '(' expression ')'                                  # Expression_Brackets
		|   literal                                             # Expression_Literal
		|   ID                                                  # Expression_ID
		|   expression '.' ID                                   # Expression_DotID
		|   expression '[' expression ']'                       # Expression_Array
		|   ID '(' expressionList? ')'                          # Expression_Call
		|   expression ('++' | '--')                            # Expression_PlusPlus_MinerMiner
		|   ('+'|'-'|'++'|'--') expression                      # Expression_Plus_Minus
		|   ('~'|'!') expression                                # Expression_Not
		|   ('*' | '&') expression                              # Expression_Pointer
        |   '(' type ')' expression                             # Expression_TypeChange
        |   expression op=('*'|'/'|'%') expression              # Expression_Mul_Div
        |   expression op=('+'|'-') expression                  # Expression_Add_Min
        |   expression ('<<'| '>>') expression                  # Expression_Shift
        |   expression ('<=' | '>=' | '>' | '<') expression     # Expression_Greater_Less
        |   expression ('==' | '!=') expression                 # Expression_Equal
        |   expression '&' expression                           # Expression_And
        |   expression '^' expression                           # Expression_Xor
        |   expression '|' expression                           # Expression_Or
        |   expression '&&' expression                          # Expression_LogicAnd
        |   expression '||' expression                          # Expression_LogicOr
        |   expression '?' expression ':' expression            # Expression_ConditionalOperator
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
type: primitiveType ('*')?;

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

// 布尔值
BOOLEAN: 'true' | 'false';

// 空白字符
WS: [ \t\n\r]+ -> skip;