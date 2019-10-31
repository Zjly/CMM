// Generated from E:/Coding/GitHub/CMM/Interpreter/src/CMM\CMM.g4 by ANTLR 4.7.2
package CMM;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		BOOL=46, CHAR=47, BYTE=48, SHORT=49, INT=50, LONG=51, FLOAT=52, DOUBLE=53, 
		VOID=54, STR=55, BREAK=56, RETURN=57, CONTINUE=58, IF=59, WHILE=60, FOR=61, 
		BOOLEAN=62, ID=63, INT_NUMBER=64, FLOAT_NUMBER=65, STRING=66, CHARACTER=67, 
		LINE_COMMENT=68, COMMENT=69, ID_LETTER=70, DIGIT=71, WS=72;
	public static final int
		RULE_file = 0, RULE_includeDeclaration = 1, RULE_compilationUnit = 2, 
		RULE_functionDeclaration = 3, RULE_function = 4, RULE_formalParameter = 5, 
		RULE_block = 6, RULE_blockStatement = 7, RULE_variableDeclarationStatement = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_arrayInitializer = 11, 
		RULE_statement = 12, RULE_ifStatement = 13, RULE_forStatement = 14, RULE_whileStatement = 15, 
		RULE_expression = 16, RULE_literal = 17, RULE_type = 18, RULE_pointer = 19, 
		RULE_primitiveType = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "includeDeclaration", "compilationUnit", "functionDeclaration", 
			"function", "formalParameter", "block", "blockStatement", "variableDeclarationStatement", 
			"variableDeclarators", "variableDeclarator", "arrayInitializer", "statement", 
			"ifStatement", "forStatement", "whileStatement", "expression", "literal", 
			"type", "pointer", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'.'", "'>'", "'\"'", "';'", "'('", "','", 
			"')'", "'{'", "'}'", "'static'", "'='", "'['", "']'", "'else'", "'++'", 
			"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'&'", "'/'", "'%'", "'<<'", 
			"'>>'", "'<='", "'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", 
			"'?'", "':'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'null'", 
			"'bool'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", 
			"'double'", "'void'", "'string'", "'break'", "'return'", "'continue'", 
			"'if'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BOOL", "CHAR", 
			"BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "VOID", "STR", "BREAK", 
			"RETURN", "CONTINUE", "IF", "WHILE", "FOR", "BOOLEAN", "ID", "INT_NUMBER", 
			"FLOAT_NUMBER", "STRING", "CHARACTER", "LINE_COMMENT", "COMMENT", "ID_LETTER", 
			"DIGIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CMMParser.EOF, 0); }
		public List<IncludeDeclarationContext> includeDeclaration() {
			return getRuleContexts(IncludeDeclarationContext.class);
		}
		public IncludeDeclarationContext includeDeclaration(int i) {
			return getRuleContext(IncludeDeclarationContext.class,i);
		}
		public List<CompilationUnitContext> compilationUnit() {
			return getRuleContexts(CompilationUnitContext.class);
		}
		public CompilationUnitContext compilationUnit(int i) {
			return getRuleContext(CompilationUnitContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				includeDeclaration();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				{
				setState(48);
				compilationUnit();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public IncludeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIncludeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIncludeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIncludeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeDeclarationContext includeDeclaration() throws RecognitionException {
		IncludeDeclarationContext _localctx = new IncludeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(57);
				match(T__1);
				setState(58);
				match(ID);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(59);
					match(T__2);
					setState(60);
					match(ID);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(67);
				match(T__4);
				setState(68);
				match(ID);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69);
					match(T__2);
					setState(70);
					match(ID);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	 
		public CompilationUnitContext() { }
		public void copyFrom(CompilationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompilationUnit_FunctionContext extends CompilationUnitContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CompilationUnit_FunctionContext(CompilationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCompilationUnit_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCompilationUnit_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitCompilationUnit_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompilationUnit_FunctionDeclarationContext extends CompilationUnitContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public CompilationUnit_FunctionDeclarationContext(CompilationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCompilationUnit_FunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCompilationUnit_FunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitCompilationUnit_FunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompilationUnit_variableDeclarationStatementContext extends CompilationUnitContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public CompilationUnit_variableDeclarationStatementContext(CompilationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCompilationUnit_variableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCompilationUnit_variableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitCompilationUnit_variableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compilationUnit);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CompilationUnit_FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new CompilationUnit_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				function();
				}
				break;
			case 3:
				_localctx = new CompilationUnit_variableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				variableDeclarationStatement();
				setState(82);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
			match(ID);
			setState(88);
			match(T__6);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(89);
				formalParameter();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(90);
					match(T__7);
					setState(91);
					formalParameter();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(T__8);
			setState(100);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			setState(104);
			match(T__6);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(105);
				formalParameter();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(106);
					match(T__7);
					setState(107);
					formalParameter();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(115);
			match(T__8);
			setState(116);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (T__9 - 6)) | (1L << (T__11 - 6)) | (1L << (T__16 - 6)) | (1L << (T__17 - 6)) | (1L << (T__18 - 6)) | (1L << (T__19 - 6)) | (1L << (T__20 - 6)) | (1L << (T__21 - 6)) | (1L << (T__22 - 6)) | (1L << (T__23 - 6)) | (1L << (T__44 - 6)) | (1L << (BOOL - 6)) | (1L << (CHAR - 6)) | (1L << (BYTE - 6)) | (1L << (SHORT - 6)) | (1L << (INT - 6)) | (1L << (LONG - 6)) | (1L << (FLOAT - 6)) | (1L << (DOUBLE - 6)) | (1L << (VOID - 6)) | (1L << (STR - 6)) | (1L << (BREAK - 6)) | (1L << (RETURN - 6)) | (1L << (CONTINUE - 6)) | (1L << (IF - 6)) | (1L << (WHILE - 6)) | (1L << (FOR - 6)) | (1L << (BOOLEAN - 6)) | (1L << (ID - 6)) | (1L << (INT_NUMBER - 6)) | (1L << (FLOAT_NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)))) != 0)) {
				{
				{
				setState(122);
				blockStatement();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatement_FunctionContext extends BlockStatementContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockStatement_FunctionContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlockStatement_Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlockStatement_Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBlockStatement_Function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatement_VariableDeclarationContext extends BlockStatementContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public BlockStatement_VariableDeclarationContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlockStatement_VariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlockStatement_VariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBlockStatement_VariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatement_StatementContext extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatement_StatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlockStatement_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlockStatement_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBlockStatement_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockStatement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BlockStatement_VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				variableDeclarationStatement();
				setState(131);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new BlockStatement_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				function();
				}
				break;
			case 3:
				_localctx = new BlockStatement_StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(137);
				match(T__11);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			type();
			setState(144);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			variableDeclarator();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(147);
				match(T__7);
				setState(148);
				variableDeclarator();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	 
		public VariableDeclaratorContext() { }
		public void copyFrom(VariableDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarator_ArrayContext extends VariableDeclaratorContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableDeclarator_ArrayContext(VariableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableDeclarator_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableDeclarator_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableDeclarator_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarator_VariableContext extends VariableDeclaratorContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarator_VariableContext(VariableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableDeclarator_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableDeclarator_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableDeclarator_Variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarator_VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(155);
					match(T__12);
					setState(156);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new VariableDeclarator_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(ID);
				setState(160);
				match(T__13);
				setState(161);
				expression(0);
				setState(162);
				match(T__14);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(163);
					match(T__12);
					setState(164);
					arrayInitializer();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__9);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__16 - 7)) | (1L << (T__17 - 7)) | (1L << (T__18 - 7)) | (1L << (T__19 - 7)) | (1L << (T__20 - 7)) | (1L << (T__21 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__44 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
				{
				setState(170);
				expression(0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(171);
					match(T__7);
					setState(172);
					expression(0);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement_BlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_BlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Block(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_BreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(CMMParser.BREAK, 0); }
		public Statement_BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Break(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(CMMParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_WhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public Statement_WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_While(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_While(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_While(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ContinueContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(CMMParser.CONTINUE, 0); }
		public Statement_ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Continue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Continue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_ExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_IfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public Statement_IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_If(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_If(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_If(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_SemicolonContext extends StatementContext {
		public Statement_SemicolonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_Semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_Semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_Semicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ForContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Statement_ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement_For(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement_For(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement_For(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new Statement_BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				block();
				}
				break;
			case IF:
				_localctx = new Statement_IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				ifStatement();
				}
				break;
			case FOR:
				_localctx = new Statement_ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				forStatement();
				}
				break;
			case WHILE:
				_localctx = new Statement_WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				whileStatement();
				}
				break;
			case RETURN:
				_localctx = new Statement_ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(RETURN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__16 - 7)) | (1L << (T__17 - 7)) | (1L << (T__18 - 7)) | (1L << (T__19 - 7)) | (1L << (T__20 - 7)) | (1L << (T__21 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__44 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
					{
					setState(187);
					expression(0);
					}
				}

				setState(190);
				match(T__5);
				}
				break;
			case BREAK:
				_localctx = new Statement_BreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(BREAK);
				setState(192);
				match(T__5);
				}
				break;
			case CONTINUE:
				_localctx = new Statement_ContinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(CONTINUE);
				setState(194);
				match(T__5);
				}
				break;
			case T__5:
				_localctx = new Statement_SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(T__5);
				}
				break;
			case T__6:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__44:
			case BOOLEAN:
			case ID:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case STRING:
			case CHARACTER:
				_localctx = new Statement_ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				expression(0);
				setState(197);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
			match(T__6);
			setState(203);
			expression(0);
			setState(204);
			match(T__8);
			setState(205);
			statement();
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(206);
				match(T__15);
				setState(207);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CMMParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FOR);
			setState(211);
			match(T__6);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(212);
				variableDeclarationStatement();
				}
			}

			setState(215);
			match(T__5);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__16 - 7)) | (1L << (T__17 - 7)) | (1L << (T__18 - 7)) | (1L << (T__19 - 7)) | (1L << (T__20 - 7)) | (1L << (T__21 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__44 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
				{
				setState(216);
				expression(0);
				}
			}

			setState(219);
			match(T__5);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__16 - 7)) | (1L << (T__17 - 7)) | (1L << (T__18 - 7)) | (1L << (T__19 - 7)) | (1L << (T__20 - 7)) | (1L << (T__21 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__44 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
				{
				setState(220);
				expression(0);
				}
			}

			setState(223);
			match(T__8);
			setState(224);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMMParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(WHILE);
			setState(227);
			match(T__6);
			setState(228);
			expression(0);
			setState(229);
			match(T__8);
			setState(230);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_PointerContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_PointerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Pointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignMinContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignMinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_OrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_And(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_And(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_And(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_ShiftContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_ShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Shift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_XorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_XorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Xor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Xor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_Mul_DivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_Mul_DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Mul_Div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Mul_Div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Mul_Div(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_BracketsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_BracketsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Brackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_Plus_MinusContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_Plus_MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Plus_Minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Plus_Minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Plus_Minus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_ArrayContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_ArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignMulContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignMulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_EqualContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_CallContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_LiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expression_LiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_LogicAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_LogicAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_LogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_LogicAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_LogicAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_Greater_LessContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_Greater_LessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Greater_Less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Greater_Less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Greater_Less(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_TypeChangeContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_TypeChangeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_TypeChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_TypeChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_TypeChange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_LogicOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_LogicOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_LogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_LogicOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_LogicOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_PlusPlus_MinerMinerContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_PlusPlus_MinerMinerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_PlusPlus_MinerMiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_PlusPlus_MinerMiner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_PlusPlus_MinerMiner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_IDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public Expression_IDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_Add_MinContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_Add_MinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Add_Min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Add_Min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Add_Min(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_DotIDContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public Expression_DotIDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_DotID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_DotID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_DotID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignAddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_Assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_Assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_Assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_ConditionalOperatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_ConditionalOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_ConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_ConditionalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_ConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_AssignAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_AssignAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression_AssignAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression_AssignAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression_AssignAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(T__6);
				setState(234);
				expression(0);
				setState(235);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new Expression_LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new Expression_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new Expression_ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(ID);
				setState(240);
				match(T__13);
				setState(241);
				expression(0);
				setState(242);
				match(T__14);
				}
				break;
			case 5:
				{
				_localctx = new Expression_CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(ID);
				setState(245);
				match(T__6);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__16 - 7)) | (1L << (T__17 - 7)) | (1L << (T__18 - 7)) | (1L << (T__19 - 7)) | (1L << (T__20 - 7)) | (1L << (T__21 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__44 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
					{
					setState(246);
					expression(0);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(247);
						match(T__7);
						setState(248);
						expression(0);
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(256);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new Expression_Plus_MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				((Expression_Plus_MinusContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					((Expression_Plus_MinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				expression(22);
				}
				break;
			case 7:
				{
				_localctx = new Expression_NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				expression(21);
				}
				break;
			case 8:
				{
				_localctx = new Expression_PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				expression(20);
				}
				break;
			case 9:
				{
				_localctx = new Expression_TypeChangeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__6);
				setState(264);
				type();
				setState(265);
				match(T__8);
				setState(266);
				expression(19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_Mul_DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(271);
						((Expression_Mul_DivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((Expression_Mul_DivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new Expression_Add_MinContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(274);
						((Expression_Add_MinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((Expression_Add_MinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new Expression_ShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(277);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new Expression_Greater_LessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(280);
						((Expression_Greater_LessContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((Expression_Greater_LessContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new Expression_EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(283);
						((Expression_EqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((Expression_EqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new Expression_AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(286);
						match(T__23);
						setState(287);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new Expression_XorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(289);
						match(T__32);
						setState(290);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new Expression_OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(292);
						match(T__33);
						setState(293);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new Expression_LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(295);
						match(T__34);
						setState(296);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new Expression_LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						match(T__35);
						setState(299);
						expression(10);
						}
						break;
					case 11:
						{
						_localctx = new Expression_AssignAddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(301);
						match(T__38);
						setState(302);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new Expression_AssignMinContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(304);
						match(T__39);
						setState(305);
						expression(7);
						}
						break;
					case 13:
						{
						_localctx = new Expression_AssignMulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(307);
						match(T__40);
						setState(308);
						expression(6);
						}
						break;
					case 14:
						{
						_localctx = new Expression_AssignDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(310);
						match(T__41);
						setState(311);
						expression(5);
						}
						break;
					case 15:
						{
						_localctx = new Expression_AssignAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(313);
						match(T__42);
						setState(314);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new Expression_AssignOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						match(T__43);
						setState(317);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new Expression_AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(319);
						match(T__12);
						setState(320);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new Expression_DotIDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(322);
						match(T__2);
						setState(323);
						match(ID);
						}
						break;
					case 19:
						{
						_localctx = new Expression_PlusPlus_MinerMinerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(325);
						((Expression_PlusPlus_MinerMinerContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((Expression_PlusPlus_MinerMinerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 20:
						{
						_localctx = new Expression_ConditionalOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(327);
						match(T__36);
						setState(328);
						expression(0);
						setState(329);
						match(T__37);
						{
						setState(330);
						expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Number_FloatContext extends LiteralContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(CMMParser.FLOAT_NUMBER, 0); }
		public Number_FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNumber_Float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNumber_Float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNumber_Float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_BooleanContext extends LiteralContext {
		public TerminalNode BOOLEAN() { return getToken(CMMParser.BOOLEAN, 0); }
		public Literal_BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLiteral_Boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLiteral_Boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLiteral_Boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_CharacterContext extends LiteralContext {
		public TerminalNode CHARACTER() { return getToken(CMMParser.CHARACTER, 0); }
		public Literal_CharacterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLiteral_Character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLiteral_Character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLiteral_Character(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_NullContext extends LiteralContext {
		public Literal_NullContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLiteral_Null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLiteral_Null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLiteral_Null(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_StringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public Literal_StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLiteral_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLiteral_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLiteral_String(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_IntContext extends LiteralContext {
		public TerminalNode INT_NUMBER() { return getToken(CMMParser.INT_NUMBER, 0); }
		public Number_IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNumber_Int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNumber_Int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNumber_Int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				_localctx = new Number_IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(INT_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				_localctx = new Number_FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(FLOAT_NUMBER);
				}
				break;
			case CHARACTER:
				_localctx = new Literal_CharacterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new Literal_StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new Literal_BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(BOOLEAN);
				}
				break;
			case T__44:
				_localctx = new Literal_NullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(T__44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			primitiveType();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(346);
				pointer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CMMParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(CMMParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(CMMParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CMMParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CMMParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(CMMParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(CMMParser.VOID, 0); }
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 23);
		case 19:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\5\3P\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\5\5d\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16"+
		"\6r\13\6\5\6t\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b~\n\b\f\b\16\b\u0081"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\7\n\u008d\n\n\f\n"+
		"\16\n\u0090\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13"+
		"\u009b\13\13\3\f\3\f\3\f\5\f\u00a0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8"+
		"\n\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\5"+
		"\r\u00b5\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\20\5\20\u00d8\n\20\3"+
		"\20\3\20\5\20\u00dc\n\20\3\20\3\20\5\20\u00e0\n\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff"+
		"\13\22\5\22\u0101\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u010f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014f"+
		"\n\22\f\22\16\22\u0152\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015a"+
		"\n\23\3\24\3\24\5\24\u015e\n\24\3\25\3\25\3\26\3\26\3\26\2\3\"\27\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\f\3\2\23\26\3\2\27\30\3\2"+
		"\31\32\4\2\31\31\33\34\3\2\25\26\3\2\35\36\5\2\4\4\6\6\37 \3\2!\"\3\2"+
		"\23\24\3\2\609\2\u0194\2/\3\2\2\2\4:\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\nh"+
		"\3\2\2\2\fx\3\2\2\2\16{\3\2\2\2\20\u0089\3\2\2\2\22\u008e\3\2\2\2\24\u0094"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3"+
		"\2\2\2\36\u00d4\3\2\2\2 \u00e4\3\2\2\2\"\u010e\3\2\2\2$\u0159\3\2\2\2"+
		"&\u015b\3\2\2\2(\u015f\3\2\2\2*\u0161\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2\62\64\5\6\4\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"\65\3\2\2\289\7\2\2\39\3\3\2\2\2:O\7\3\2\2;<\7\4\2\2<A\7A\2\2=>\7\5\2"+
		"\2>@\7A\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2"+
		"\2DP\7\6\2\2EF\7\7\2\2FK\7A\2\2GH\7\5\2\2HJ\7A\2\2IG\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NP\7\7\2\2O;\3\2\2\2OE\3\2\2\2"+
		"P\5\3\2\2\2QW\5\b\5\2RW\5\n\6\2ST\5\22\n\2TU\7\b\2\2UW\3\2\2\2VQ\3\2\2"+
		"\2VR\3\2\2\2VS\3\2\2\2W\7\3\2\2\2XY\5&\24\2YZ\7A\2\2Zc\7\t\2\2[`\5\f\7"+
		"\2\\]\7\n\2\2]_\5\f\7\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\13\2\2fg\7\b\2\2g\t\3"+
		"\2\2\2hi\5&\24\2ij\7A\2\2js\7\t\2\2kp\5\f\7\2lm\7\n\2\2mo\5\f\7\2nl\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sk\3\2\2\2st\3"+
		"\2\2\2tu\3\2\2\2uv\7\13\2\2vw\5\16\b\2w\13\3\2\2\2xy\5&\24\2yz\7A\2\2"+
		"z\r\3\2\2\2{\177\7\f\2\2|~\5\20\t\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7\r\2\2\u0083\17\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\b\2\2\u0086"+
		"\u008a\3\2\2\2\u0087\u008a\5\n\6\2\u0088\u008a\5\32\16\2\u0089\u0084\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21\3\2\2\2\u008b"+
		"\u008d\7\16\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5&\24\2\u0092\u0093\5\24\13\2\u0093\23\3\2\2\2\u0094\u0099\5\26"+
		"\f\2\u0095\u0096\7\n\2\2\u0096\u0098\5\26\f\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\25\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009c\u009f\7A\2\2\u009d\u009e\7\17\2\2\u009e\u00a0"+
		"\5\"\22\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00aa\3\2\2\2"+
		"\u00a1\u00a2\7A\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a7"+
		"\7\21\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a5\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u00a1"+
		"\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00b4\7\f\2\2\u00ac\u00b1\5\"\22\2\u00ad"+
		"\u00ae\7\n\2\2\u00ae\u00b0\5\"\22\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\7\r\2\2\u00b7\31\3\2\2\2\u00b8\u00ca\5\16\b\2\u00b9\u00ca"+
		"\5\34\17\2\u00ba\u00ca\5\36\20\2\u00bb\u00ca\5 \21\2\u00bc\u00be\7;\2"+
		"\2\u00bd\u00bf\5\"\22\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00ca\7\b\2\2\u00c1\u00c2\7:\2\2\u00c2\u00ca\7\b"+
		"\2\2\u00c3\u00c4\7<\2\2\u00c4\u00ca\7\b\2\2\u00c5\u00ca\7\b\2\2\u00c6"+
		"\u00c7\5\"\22\2\u00c7\u00c8\7\b\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b8\3"+
		"\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9"+
		"\u00bc\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc\u00cd"+
		"\7\t\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf\7\13\2\2\u00cf\u00d2\5\32\16"+
		"\2\u00d0\u00d1\7\22\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d7\7\t\2\2"+
		"\u00d6\u00d8\5\22\n\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\7\b\2\2\u00da\u00dc\5\"\22\2\u00db\u00da\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\b\2\2\u00de\u00e0"+
		"\5\"\22\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5\32\16\2\u00e3\37\3\2\2\2\u00e4\u00e5"+
		"\7>\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\7\13\2\2"+
		"\u00e8\u00e9\5\32\16\2\u00e9!\3\2\2\2\u00ea\u00eb\b\22\1\2\u00eb\u00ec"+
		"\7\t\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\7\13\2\2\u00ee\u010f\3\2\2\2"+
		"\u00ef\u010f\5$\23\2\u00f0\u010f\7A\2\2\u00f1\u00f2\7A\2\2\u00f2\u00f3"+
		"\7\20\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\21\2\2\u00f5\u010f\3\2\2"+
		"\2\u00f6\u00f7\7A\2\2\u00f7\u0100\7\t\2\2\u00f8\u00fd\5\"\22\2\u00f9\u00fa"+
		"\7\n\2\2\u00fa\u00fc\5\"\22\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u010f\7\13\2\2\u0103\u0104\t\2\2\2\u0104\u010f\5\"\22\30\u0105\u0106"+
		"\t\3\2\2\u0106\u010f\5\"\22\27\u0107\u0108\t\4\2\2\u0108\u010f\5\"\22"+
		"\26\u0109\u010a\7\t\2\2\u010a\u010b\5&\24\2\u010b\u010c\7\13\2\2\u010c"+
		"\u010d\5\"\22\25\u010d\u010f\3\2\2\2\u010e\u00ea\3\2\2\2\u010e\u00ef\3"+
		"\2\2\2\u010e\u00f0\3\2\2\2\u010e\u00f1\3\2\2\2\u010e\u00f6\3\2\2\2\u010e"+
		"\u0103\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010f\u0150\3\2\2\2\u0110\u0111\f\24\2\2\u0111\u0112\t\5\2\2\u0112"+
		"\u014f\5\"\22\25\u0113\u0114\f\23\2\2\u0114\u0115\t\6\2\2\u0115\u014f"+
		"\5\"\22\24\u0116\u0117\f\22\2\2\u0117\u0118\t\7\2\2\u0118\u014f\5\"\22"+
		"\23\u0119\u011a\f\21\2\2\u011a\u011b\t\b\2\2\u011b\u014f\5\"\22\22\u011c"+
		"\u011d\f\20\2\2\u011d\u011e\t\t\2\2\u011e\u014f\5\"\22\21\u011f\u0120"+
		"\f\17\2\2\u0120\u0121\7\32\2\2\u0121\u014f\5\"\22\20\u0122\u0123\f\16"+
		"\2\2\u0123\u0124\7#\2\2\u0124\u014f\5\"\22\17\u0125\u0126\f\r\2\2\u0126"+
		"\u0127\7$\2\2\u0127\u014f\5\"\22\16\u0128\u0129\f\f\2\2\u0129\u012a\7"+
		"%\2\2\u012a\u014f\5\"\22\r\u012b\u012c\f\13\2\2\u012c\u012d\7&\2\2\u012d"+
		"\u014f\5\"\22\f\u012e\u012f\f\t\2\2\u012f\u0130\7)\2\2\u0130\u014f\5\""+
		"\22\n\u0131\u0132\f\b\2\2\u0132\u0133\7*\2\2\u0133\u014f\5\"\22\t\u0134"+
		"\u0135\f\7\2\2\u0135\u0136\7+\2\2\u0136\u014f\5\"\22\b\u0137\u0138\f\6"+
		"\2\2\u0138\u0139\7,\2\2\u0139\u014f\5\"\22\7\u013a\u013b\f\5\2\2\u013b"+
		"\u013c\7-\2\2\u013c\u014f\5\"\22\6\u013d\u013e\f\4\2\2\u013e\u013f\7."+
		"\2\2\u013f\u014f\5\"\22\5\u0140\u0141\f\3\2\2\u0141\u0142\7\17\2\2\u0142"+
		"\u014f\5\"\22\4\u0143\u0144\f\34\2\2\u0144\u0145\7\5\2\2\u0145\u014f\7"+
		"A\2\2\u0146\u0147\f\31\2\2\u0147\u014f\t\n\2\2\u0148\u0149\f\n\2\2\u0149"+
		"\u014a\7\'\2\2\u014a\u014b\5\"\22\2\u014b\u014c\7(\2\2\u014c\u014d\5\""+
		"\22\2\u014d\u014f\3\2\2\2\u014e\u0110\3\2\2\2\u014e\u0113\3\2\2\2\u014e"+
		"\u0116\3\2\2\2\u014e\u0119\3\2\2\2\u014e\u011c\3\2\2\2\u014e\u011f\3\2"+
		"\2\2\u014e\u0122\3\2\2\2\u014e\u0125\3\2\2\2\u014e\u0128\3\2\2\2\u014e"+
		"\u012b\3\2\2\2\u014e\u012e\3\2\2\2\u014e\u0131\3\2\2\2\u014e\u0134\3\2"+
		"\2\2\u014e\u0137\3\2\2\2\u014e\u013a\3\2\2\2\u014e\u013d\3\2\2\2\u014e"+
		"\u0140\3\2\2\2\u014e\u0143\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u0148\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"#\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u015a\7B\2\2\u0154\u015a\7C\2\2\u0155"+
		"\u015a\7E\2\2\u0156\u015a\7D\2\2\u0157\u015a\7@\2\2\u0158\u015a\7/\2\2"+
		"\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a%\3\2\2\2\u015b"+
		"\u015d\5*\26\2\u015c\u015e\5(\25\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\'\3\2\2\2\u015f\u0160\7\31\2\2\u0160)\3\2\2\2\u0161\u0162\t"+
		"\13\2\2\u0162+\3\2\2\2\"/\65AKOV`cps\177\u0089\u008e\u0099\u009f\u00a7"+
		"\u00a9\u00b1\u00b4\u00be\u00c9\u00d2\u00d7\u00db\u00df\u00fd\u0100\u010e"+
		"\u014e\u0150\u0159\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}