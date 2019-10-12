// CMM�����ķ�
grammar CMM;

// CMM�����ļ�
file: includeDeclaration* compilationUnit* EOF;

// include����
includeDeclaration: '#include' ( '<' ID ('.' ID)* '>'| '"' ID ('.' ID)* '"');

// ���뵥Ԫ
compilationUnit
			: methodDeclaration
			| method
			;

// ��������
methodDeclaration
				: type ID '(' formalParameters ')' ';'
				| 'void' ID '(' formalParameters ')' ';'
				;

// ����
method
	: type ID '(' formalParameters ')' block
	| 'void' ID '(' formalParameters ')' block
	;

// ��ʽ����
formalParameters: (type ID (',' type ID)*)?;

// ����
block: '{' blockStatement* '}';

// �������
blockStatement
			: variableDeclarationStatement ';'
			| method
			| statement
			;

// �����������
variableDeclarationStatement
						: ('static')* type variableDeclarators
						| ('static')* type '*' variableDeclarators
						;

// ��α�������
variableDeclarators: variableDeclarator (',' variableDeclarator)*;

// ��������
variableDeclarator
				: ID ('=' expression)?
				| ID '[' expression ']' ('=' arrayInitializer)?
				;

// ������ʼ��
variableInitializer
				: arrayInitializer
				| expression
				;

// �����ʼ��
arrayInitializer: '{' (variableInitializer (',' variableInitializer)* (',')? )? '}';

// ���
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

// if���
ifStatement: 'if' '(' expression ')' statement ('else' statement)?;

// for���
forStatement: 'for' '(' forControl ')' statement;

// while���
whileStatement: 'while' '(' expression ')' statement;

// for�������
forControl: forInit? ';' expression? ';' expressionList?;

// for������ʼ��
forInit
	: variableDeclarationStatement
	| expressionList
	;

// ���ʽ�б�
expressionList
    :   expression (',' expression)*
    ;

// ���ʽ
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

// ������
literal
	: NUMBER
	| CHARACTER
	| STRING
	| BOOLEAN
	| 'null'
	;


// ����
type: PRIMITIVE_TYPE ('*')*;

// ��������
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

// ��ʶ��
ID: ID_LETTER (ID_LETTER | DIGIT)*;

// ��
NUMBER: INT | FLOAT;
// ����
INT: DIGIT+;
// ������
FLOAT: DIGIT+ . DIGIT+;

// �ַ���
STRING: '"' (ESC | .)*? '"';
// �ַ�
CHARACTER: '\'' ( ESC | ~('\''|'\\') ) '\'';
// ��ʾ\b \n \t \r
fragment ESC: '\\' [bntr"\\];

// ��ע��
LINE_COMMENT: '//' .*? '\n' -> skip;
// ����ע��
COMMENT: '/*' .*? '*/' -> skip;

// ��ʶ������ĸ
ID_LETTER: [a-zA-Z_];
// ����
DIGIT: [0-9];

// ����ֵ
BOOLEAN: 'true' | 'false';

// �հ��ַ�
WS: [ \t\n\r]+ -> skip;