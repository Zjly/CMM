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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, BOOL=52, CHAR=53, 
		BYTE=54, SHORT=55, INT=56, LONG=57, FLOAT=58, DOUBLE=59, VOID=60, STR=61, 
		BOOLEAN=62, ID=63, INT_NUMBER=64, FLOAT_NUMBER=65, STRING=66, CHARACTER=67, 
		LINE_COMMENT=68, COMMENT=69, ID_LETTER=70, DIGIT=71, WS=72;
	public static final int
		RULE_file = 0, RULE_includeDeclaration = 1, RULE_compilationUnit = 2, 
		RULE_functionDeclaration = 3, RULE_function = 4, RULE_formalParameter = 5, 
		RULE_block = 6, RULE_blockStatement = 7, RULE_variableDeclarationStatement = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_statement = 11, 
		RULE_ifStatement = 12, RULE_forStatement = 13, RULE_whileStatement = 14, 
		RULE_expression = 15, RULE_literal = 16, RULE_type = 17, RULE_primitiveType = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "includeDeclaration", "compilationUnit", "functionDeclaration", 
			"function", "formalParameter", "block", "blockStatement", "variableDeclarationStatement", 
			"variableDeclarators", "variableDeclarator", "statement", "ifStatement", 
			"forStatement", "whileStatement", "expression", "literal", "type", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'.'", "'>'", "'\"'", "';'", "'('", "','", 
			"')'", "'{'", "'}'", "'static'", "'='", "'['", "']'", "'return'", "'break'", 
			"'continue'", "'if'", "'else'", "'for'", "'while'", "'++'", "'--'", "'+'", 
			"'-'", "'~'", "'!'", "'*'", "'&'", "'/'", "'%'", "'<<'", "'>>'", "'<='", 
			"'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "':'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'null'", "'bool'", "'char'", 
			"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'void'", 
			"'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOL", "CHAR", "BYTE", "SHORT", "INT", "LONG", 
			"FLOAT", "DOUBLE", "VOID", "STR", "BOOLEAN", "ID", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING", "CHARACTER", "LINE_COMMENT", "COMMENT", "ID_LETTER", "DIGIT", 
			"WS"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				includeDeclaration();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				{
				setState(44);
				compilationUnit();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(52);
			match(T__0);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(53);
				match(T__1);
				setState(54);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(55);
					match(T__2);
					setState(56);
					match(ID);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(63);
				match(T__4);
				setState(64);
				match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(65);
					match(T__2);
					setState(66);
					match(ID);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CompilationUnit_FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new CompilationUnit_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				function();
				}
				break;
			case 3:
				_localctx = new CompilationUnit_variableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				variableDeclarationStatement();
				setState(78);
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
			setState(82);
			type();
			setState(83);
			match(ID);
			setState(84);
			match(T__6);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(85);
				formalParameter();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(86);
					match(T__7);
					setState(87);
					formalParameter();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
			match(T__8);
			setState(96);
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
			setState(98);
			type();
			setState(99);
			match(ID);
			setState(100);
			match(T__6);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(101);
				formalParameter();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(102);
					match(T__7);
					setState(103);
					formalParameter();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(111);
			match(T__8);
			setState(112);
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
			setState(114);
			type();
			setState(115);
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
			setState(117);
			match(T__9);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (T__9 - 6)) | (1L << (T__11 - 6)) | (1L << (T__15 - 6)) | (1L << (T__16 - 6)) | (1L << (T__17 - 6)) | (1L << (T__18 - 6)) | (1L << (T__20 - 6)) | (1L << (T__21 - 6)) | (1L << (T__22 - 6)) | (1L << (T__23 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__50 - 6)) | (1L << (BOOL - 6)) | (1L << (CHAR - 6)) | (1L << (BYTE - 6)) | (1L << (SHORT - 6)) | (1L << (INT - 6)) | (1L << (LONG - 6)) | (1L << (FLOAT - 6)) | (1L << (DOUBLE - 6)) | (1L << (VOID - 6)) | (1L << (STR - 6)) | (1L << (BOOLEAN - 6)) | (1L << (ID - 6)) | (1L << (INT_NUMBER - 6)) | (1L << (FLOAT_NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)))) != 0)) {
				{
				{
				setState(118);
				blockStatement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BlockStatement_VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				variableDeclarationStatement();
				setState(127);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new BlockStatement_FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				function();
				}
				break;
			case 3:
				_localctx = new BlockStatement_StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(133);
				match(T__11);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			type();
			setState(140);
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
			setState(142);
			variableDeclarator();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(143);
				match(T__7);
				setState(144);
				variableDeclarator();
				}
				}
				setState(149);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarator_VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(151);
					match(T__12);
					setState(152);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new VariableDeclarator_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__13);
				setState(157);
				expression(0);
				setState(158);
				match(T__14);
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
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new Statement_BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				block();
				}
				break;
			case T__18:
				_localctx = new Statement_IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				ifStatement();
				}
				break;
			case T__20:
				_localctx = new Statement_ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				forStatement();
				}
				break;
			case T__21:
				_localctx = new Statement_WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				whileStatement();
				}
				break;
			case T__15:
				_localctx = new Statement_ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(T__15);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__24 - 7)) | (1L << (T__25 - 7)) | (1L << (T__26 - 7)) | (1L << (T__27 - 7)) | (1L << (T__28 - 7)) | (1L << (T__29 - 7)) | (1L << (T__50 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
					{
					setState(167);
					expression(0);
					}
				}

				setState(170);
				match(T__5);
				}
				break;
			case T__16:
				_localctx = new Statement_BreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(T__16);
				setState(172);
				match(T__5);
				}
				break;
			case T__17:
				_localctx = new Statement_ContinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(T__17);
				setState(174);
				match(T__5);
				}
				break;
			case T__5:
				_localctx = new Statement_SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(T__5);
				}
				break;
			case T__6:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__50:
			case BOOLEAN:
			case ID:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case STRING:
			case CHARACTER:
				_localctx = new Statement_ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				expression(0);
				setState(177);
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
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__18);
			setState(182);
			match(T__6);
			setState(183);
			expression(0);
			setState(184);
			match(T__8);
			setState(185);
			statement();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(186);
				match(T__19);
				setState(187);
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
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__20);
			setState(191);
			match(T__6);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << BOOL) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << STR))) != 0)) {
				{
				setState(192);
				variableDeclarationStatement();
				}
			}

			setState(195);
			match(T__5);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__24 - 7)) | (1L << (T__25 - 7)) | (1L << (T__26 - 7)) | (1L << (T__27 - 7)) | (1L << (T__28 - 7)) | (1L << (T__29 - 7)) | (1L << (T__50 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
				{
				setState(196);
				expression(0);
				}
			}

			setState(199);
			match(T__5);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__24 - 7)) | (1L << (T__25 - 7)) | (1L << (T__26 - 7)) | (1L << (T__27 - 7)) | (1L << (T__28 - 7)) | (1L << (T__29 - 7)) | (1L << (T__50 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
				{
				setState(200);
				expression(0);
				}
			}

			setState(203);
			match(T__8);
			setState(204);
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
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__21);
			setState(207);
			match(T__6);
			setState(208);
			expression(0);
			setState(209);
			match(T__8);
			setState(210);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(T__6);
				setState(214);
				expression(0);
				setState(215);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new Expression_LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new Expression_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new Expression_ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(ID);
				setState(220);
				match(T__13);
				setState(221);
				expression(0);
				setState(222);
				match(T__14);
				}
				break;
			case 5:
				{
				_localctx = new Expression_CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(ID);
				setState(225);
				match(T__6);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__22 - 7)) | (1L << (T__23 - 7)) | (1L << (T__24 - 7)) | (1L << (T__25 - 7)) | (1L << (T__26 - 7)) | (1L << (T__27 - 7)) | (1L << (T__28 - 7)) | (1L << (T__29 - 7)) | (1L << (T__50 - 7)) | (1L << (BOOLEAN - 7)) | (1L << (ID - 7)) | (1L << (INT_NUMBER - 7)) | (1L << (FLOAT_NUMBER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)))) != 0)) {
					{
					setState(226);
					expression(0);
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(227);
						match(T__7);
						setState(228);
						expression(0);
						}
						}
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(236);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new Expression_Plus_MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				((Expression_Plus_MinusContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					((Expression_Plus_MinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				expression(22);
				}
				break;
			case 7:
				{
				_localctx = new Expression_NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				expression(21);
				}
				break;
			case 8:
				{
				_localctx = new Expression_PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				expression(20);
				}
				break;
			case 9:
				{
				_localctx = new Expression_TypeChangeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(T__6);
				setState(244);
				type();
				setState(245);
				match(T__8);
				setState(246);
				expression(19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_Mul_DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(251);
						((Expression_Mul_DivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((Expression_Mul_DivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(252);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new Expression_Add_MinContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(254);
						((Expression_Add_MinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((Expression_Add_MinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new Expression_ShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(257);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new Expression_Greater_LessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(260);
						((Expression_Greater_LessContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((Expression_Greater_LessContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new Expression_EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(263);
						((Expression_EqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((Expression_EqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new Expression_AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(266);
						match(T__29);
						setState(267);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new Expression_XorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(269);
						match(T__38);
						setState(270);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new Expression_OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(272);
						match(T__39);
						setState(273);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new Expression_LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(275);
						match(T__40);
						setState(276);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new Expression_LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(278);
						match(T__41);
						setState(279);
						expression(10);
						}
						break;
					case 11:
						{
						_localctx = new Expression_ConditionalOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(281);
						match(T__42);
						setState(282);
						expression(0);
						setState(283);
						match(T__43);
						setState(284);
						expression(9);
						}
						break;
					case 12:
						{
						_localctx = new Expression_AssignAddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(287);
						match(T__44);
						setState(288);
						expression(8);
						}
						break;
					case 13:
						{
						_localctx = new Expression_AssignMinContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(290);
						match(T__45);
						setState(291);
						expression(7);
						}
						break;
					case 14:
						{
						_localctx = new Expression_AssignMulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(293);
						match(T__46);
						setState(294);
						expression(6);
						}
						break;
					case 15:
						{
						_localctx = new Expression_AssignDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(296);
						match(T__47);
						setState(297);
						expression(5);
						}
						break;
					case 16:
						{
						_localctx = new Expression_AssignAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(299);
						match(T__48);
						setState(300);
						expression(4);
						}
						break;
					case 17:
						{
						_localctx = new Expression_AssignOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(302);
						match(T__49);
						setState(303);
						expression(3);
						}
						break;
					case 18:
						{
						_localctx = new Expression_AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(305);
						match(T__12);
						setState(306);
						expression(2);
						}
						break;
					case 19:
						{
						_localctx = new Expression_DotIDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(308);
						match(T__2);
						setState(309);
						match(ID);
						}
						break;
					case 20:
						{
						_localctx = new Expression_PlusPlus_MinerMinerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(311);
						((Expression_PlusPlus_MinerMinerContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((Expression_PlusPlus_MinerMinerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				_localctx = new Number_IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(INT_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				_localctx = new Number_FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(FLOAT_NUMBER);
				}
				break;
			case CHARACTER:
				_localctx = new Literal_CharacterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new Literal_StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new Literal_BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(BOOLEAN);
				}
				break;
			case T__50:
				_localctx = new Literal_NullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(T__50);
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			primitiveType();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(326);
				match(T__28);
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
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		case 15:
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
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 18:
			return precpred(_ctx, 26);
		case 19:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\5\5`\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\5\6p\n\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0086\n\t\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f"+
		"\5\f\u009c\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\5\17\u00c4"+
		"\n\17\3\17\3\17\5\17\u00c8\n\17\3\17\3\17\5\17\u00cc\n\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e8\n\21\f\21"+
		"\16\21\u00eb\13\21\5\21\u00ed\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00fb\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u013b\n\21\f\21\16\21\u013e\13\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0146\n\22\3\23\3\23\5\23\u014a\n\23\3\24\3\24\3\24\2\3 \25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\f\3\2\31\34\3\2\35\36\3\2\37"+
		" \4\2\37\37!\"\3\2\33\34\3\2#$\5\2\4\4\6\6%&\3\2\'(\3\2\31\32\3\2\66?"+
		"\2\u017d\2+\3\2\2\2\4\66\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nd\3\2\2\2\ft\3"+
		"\2\2\2\16w\3\2\2\2\20\u0085\3\2\2\2\22\u008a\3\2\2\2\24\u0090\3\2\2\2"+
		"\26\u00a2\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00c0\3\2\2\2\36"+
		"\u00d0\3\2\2\2 \u00fa\3\2\2\2\"\u0145\3\2\2\2$\u0147\3\2\2\2&\u014b\3"+
		"\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-"+
		"+\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66K\7\3\2\2"+
		"\678\7\4\2\28=\7A\2\29:\7\5\2\2:<\7A\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@L\7\6\2\2AB\7\7\2\2BG\7A\2\2CD\7\5\2\2"+
		"DF\7A\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JL\7\7\2\2K\67\3\2\2\2KA\3\2\2\2L\5\3\2\2\2MS\5\b\5\2NS\5\n\6\2OP\5\22"+
		"\n\2PQ\7\b\2\2QS\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2S\7\3\2\2\2TU\5"+
		"$\23\2UV\7A\2\2V_\7\t\2\2W\\\5\f\7\2XY\7\n\2\2Y[\5\f\7\2ZX\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2_`\3\2\2\2"+
		"`a\3\2\2\2ab\7\13\2\2bc\7\b\2\2c\t\3\2\2\2de\5$\23\2ef\7A\2\2fo\7\t\2"+
		"\2gl\5\f\7\2hi\7\n\2\2ik\5\f\7\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2og\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\13\2\2rs\5\16"+
		"\b\2s\13\3\2\2\2tu\5$\23\2uv\7A\2\2v\r\3\2\2\2w{\7\f\2\2xz\5\20\t\2yx"+
		"\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\r\2"+
		"\2\177\17\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\b\2\2\u0082\u0086"+
		"\3\2\2\2\u0083\u0086\5\n\6\2\u0084\u0086\5\30\r\2\u0085\u0080\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\21\3\2\2\2\u0087\u0089"+
		"\7\16\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\5$\23\2\u008e\u008f\5\24\13\2\u008f\23\3\2\2\2\u0090\u0095\5\26\f\2\u0091"+
		"\u0092\7\n\2\2\u0092\u0094\5\26\f\2\u0093\u0091\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\7A\2\2\u0099\u009a\7\17\2\2\u009a\u009c\5 "+
		"\21\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d"+
		"\u009e\7A\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\21"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3"+
		"\27\3\2\2\2\u00a4\u00b6\5\16\b\2\u00a5\u00b6\5\32\16\2\u00a6\u00b6\5\34"+
		"\17\2\u00a7\u00b6\5\36\20\2\u00a8\u00aa\7\22\2\2\u00a9\u00ab\5 \21\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b6\7\b"+
		"\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00b6\7\b\2\2\u00af\u00b0\7\24\2\2\u00b0"+
		"\u00b6\7\b\2\2\u00b1\u00b6\7\b\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\b"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00a4\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5"+
		"\u00a6\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ad\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\5 \21"+
		"\2\u00ba\u00bb\7\13\2\2\u00bb\u00be\5\30\r\2\u00bc\u00bd\7\26\2\2\u00bd"+
		"\u00bf\5\30\r\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33\3\2\2"+
		"\2\u00c0\u00c1\7\27\2\2\u00c1\u00c3\7\t\2\2\u00c2\u00c4\5\22\n\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\b"+
		"\2\2\u00c6\u00c8\5 \21\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\7\b\2\2\u00ca\u00cc\5 \21\2\u00cb\u00ca\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce"+
		"\u00cf\5\30\r\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\7\t"+
		"\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\30\r\2\u00d5"+
		"\37\3\2\2\2\u00d6\u00d7\b\21\1\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\5 \21"+
		"\2\u00d9\u00da\7\13\2\2\u00da\u00fb\3\2\2\2\u00db\u00fb\5\"\22\2\u00dc"+
		"\u00fb\7A\2\2\u00dd\u00de\7A\2\2\u00de\u00df\7\20\2\2\u00df\u00e0\5 \21"+
		"\2\u00e0\u00e1\7\21\2\2\u00e1\u00fb\3\2\2\2\u00e2\u00e3\7A\2\2\u00e3\u00ec"+
		"\7\t\2\2\u00e4\u00e9\5 \21\2\u00e5\u00e6\7\n\2\2\u00e6\u00e8\5 \21\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00fb\7\13\2\2\u00ef\u00f0\t"+
		"\2\2\2\u00f0\u00fb\5 \21\30\u00f1\u00f2\t\3\2\2\u00f2\u00fb\5 \21\27\u00f3"+
		"\u00f4\t\4\2\2\u00f4\u00fb\5 \21\26\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5"+
		"$\23\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5 \21\25\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00d6\3\2\2\2\u00fa\u00db\3\2\2\2\u00fa\u00dc\3\2\2\2\u00fa\u00dd\3\2"+
		"\2\2\u00fa\u00e2\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa"+
		"\u00f3\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u013c\3\2\2\2\u00fc\u00fd\f\24"+
		"\2\2\u00fd\u00fe\t\5\2\2\u00fe\u013b\5 \21\25\u00ff\u0100\f\23\2\2\u0100"+
		"\u0101\t\6\2\2\u0101\u013b\5 \21\24\u0102\u0103\f\22\2\2\u0103\u0104\t"+
		"\7\2\2\u0104\u013b\5 \21\23\u0105\u0106\f\21\2\2\u0106\u0107\t\b\2\2\u0107"+
		"\u013b\5 \21\22\u0108\u0109\f\20\2\2\u0109\u010a\t\t\2\2\u010a\u013b\5"+
		" \21\21\u010b\u010c\f\17\2\2\u010c\u010d\7 \2\2\u010d\u013b\5 \21\20\u010e"+
		"\u010f\f\16\2\2\u010f\u0110\7)\2\2\u0110\u013b\5 \21\17\u0111\u0112\f"+
		"\r\2\2\u0112\u0113\7*\2\2\u0113\u013b\5 \21\16\u0114\u0115\f\f\2\2\u0115"+
		"\u0116\7+\2\2\u0116\u013b\5 \21\r\u0117\u0118\f\13\2\2\u0118\u0119\7,"+
		"\2\2\u0119\u013b\5 \21\f\u011a\u011b\f\n\2\2\u011b\u011c\7-\2\2\u011c"+
		"\u011d\5 \21\2\u011d\u011e\7.\2\2\u011e\u011f\5 \21\13\u011f\u013b\3\2"+
		"\2\2\u0120\u0121\f\t\2\2\u0121\u0122\7/\2\2\u0122\u013b\5 \21\n\u0123"+
		"\u0124\f\b\2\2\u0124\u0125\7\60\2\2\u0125\u013b\5 \21\t\u0126\u0127\f"+
		"\7\2\2\u0127\u0128\7\61\2\2\u0128\u013b\5 \21\b\u0129\u012a\f\6\2\2\u012a"+
		"\u012b\7\62\2\2\u012b\u013b\5 \21\7\u012c\u012d\f\5\2\2\u012d\u012e\7"+
		"\63\2\2\u012e\u013b\5 \21\6\u012f\u0130\f\4\2\2\u0130\u0131\7\64\2\2\u0131"+
		"\u013b\5 \21\5\u0132\u0133\f\3\2\2\u0133\u0134\7\17\2\2\u0134\u013b\5"+
		" \21\4\u0135\u0136\f\34\2\2\u0136\u0137\7\5\2\2\u0137\u013b\7A\2\2\u0138"+
		"\u0139\f\31\2\2\u0139\u013b\t\n\2\2\u013a\u00fc\3\2\2\2\u013a\u00ff\3"+
		"\2\2\2\u013a\u0102\3\2\2\2\u013a\u0105\3\2\2\2\u013a\u0108\3\2\2\2\u013a"+
		"\u010b\3\2\2\2\u013a\u010e\3\2\2\2\u013a\u0111\3\2\2\2\u013a\u0114\3\2"+
		"\2\2\u013a\u0117\3\2\2\2\u013a\u011a\3\2\2\2\u013a\u0120\3\2\2\2\u013a"+
		"\u0123\3\2\2\2\u013a\u0126\3\2\2\2\u013a\u0129\3\2\2\2\u013a\u012c\3\2"+
		"\2\2\u013a\u012f\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0135\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d!\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0146\7B\2\2\u0140\u0146"+
		"\7C\2\2\u0141\u0146\7E\2\2\u0142\u0146\7D\2\2\u0143\u0146\7@\2\2\u0144"+
		"\u0146\7\65\2\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0141\3"+
		"\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"#\3\2\2\2\u0147\u0149\5&\24\2\u0148\u014a\7\37\2\2\u0149\u0148\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a%\3\2\2\2\u014b\u014c\t\13\2\2\u014c\'\3\2\2"+
		"\2\37+\61=GKR\\_lo{\u0085\u008a\u0095\u009b\u00a2\u00aa\u00b5\u00be\u00c3"+
		"\u00c7\u00cb\u00e9\u00ec\u00fa\u013a\u013c\u0145\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}