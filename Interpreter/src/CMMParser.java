// Generated from E:/Coding/GitHub/CMM/Interpreter/src\CMM.g4 by ANTLR 4.7.2
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		PRIMITIVE_TYPE=53, ID=54, NUMBER=55, INT=56, FLOAT=57, STRING=58, CHARACTER=59, 
		LINE_COMMENT=60, COMMENT=61, ID_LETTER=62, DIGIT=63, BOOLEAN=64, WS=65;
	public static final int
		RULE_file = 0, RULE_includeDeclaration = 1, RULE_compilationUnit = 2, 
		RULE_methodDeclaration = 3, RULE_method = 4, RULE_formalParameters = 5, 
		RULE_block = 6, RULE_blockStatement = 7, RULE_variableDeclarationStatement = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_variableInitializer = 11, 
		RULE_arrayInitializer = 12, RULE_statement = 13, RULE_ifStatement = 14, 
		RULE_forStatement = 15, RULE_whileStatement = 16, RULE_forControl = 17, 
		RULE_forInit = 18, RULE_expressionList = 19, RULE_expression = 20, RULE_literal = 21, 
		RULE_type = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "includeDeclaration", "compilationUnit", "methodDeclaration", 
			"method", "formalParameters", "block", "blockStatement", "variableDeclarationStatement", 
			"variableDeclarators", "variableDeclarator", "variableInitializer", "arrayInitializer", 
			"statement", "ifStatement", "forStatement", "whileStatement", "forControl", 
			"forInit", "expressionList", "expression", "literal", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'.'", "'>'", "'\"'", "'('", "')'", "';'", 
			"'void'", "','", "'{'", "'}'", "'static'", "'*'", "'='", "'['", "']'", 
			"'return'", "'break'", "'continue'", "'if'", "'else'", "'for'", "'while'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'&'", "'/'", "'%'", "'<<'", 
			"'>>'", "'<='", "'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", 
			"'?'", "':'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "PRIMITIVE_TYPE", "ID", "NUMBER", "INT", 
			"FLOAT", "STRING", "CHARACTER", "LINE_COMMENT", "COMMENT", "ID_LETTER", 
			"DIGIT", "BOOLEAN", "WS"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(46);
				includeDeclaration();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==PRIMITIVE_TYPE) {
				{
				{
				setState(52);
				compilationUnit();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
			setState(60);
			match(T__0);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(61);
				match(T__1);
				setState(62);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(63);
					match(T__2);
					setState(64);
					match(ID);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(71);
				match(T__4);
				setState(72);
				match(ID);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(73);
					match(T__2);
					setState(74);
					match(ID);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compilationUnit);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				method();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(89);
				match(T__5);
				setState(90);
				formalParameters();
				setState(91);
				match(T__6);
				setState(92);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__8);
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				formalParameters();
				setState(98);
				match(T__6);
				setState(99);
				match(T__7);
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				type();
				setState(104);
				match(ID);
				setState(105);
				match(T__5);
				setState(106);
				formalParameters();
				setState(107);
				match(T__6);
				setState(108);
				block();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__8);
				setState(111);
				match(ID);
				setState(112);
				match(T__5);
				setState(113);
				formalParameters();
				setState(114);
				match(T__6);
				setState(115);
				block();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE) {
				{
				setState(119);
				type();
				setState(120);
				match(ID);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(121);
					match(T__9);
					setState(122);
					type();
					setState(123);
					match(ID);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(132);
			match(T__10);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__7 - 6)) | (1L << (T__8 - 6)) | (1L << (T__10 - 6)) | (1L << (T__12 - 6)) | (1L << (T__13 - 6)) | (1L << (T__17 - 6)) | (1L << (T__18 - 6)) | (1L << (T__19 - 6)) | (1L << (T__20 - 6)) | (1L << (T__22 - 6)) | (1L << (T__23 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (PRIMITIVE_TYPE - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
				{
				{
				setState(133);
				blockStatement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__11);
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
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockStatement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				variableDeclarationStatement();
				setState(142);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				method();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(148);
					match(T__12);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				type();
				setState(155);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(157);
					match(T__12);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				type();
				setState(164);
				match(T__13);
				setState(165);
				variableDeclarators();
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
			setState(169);
			variableDeclarator();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(170);
				match(T__9);
				setState(171);
				variableDeclarator();
				}
				}
				setState(176);
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
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ID);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(178);
					match(T__14);
					setState(179);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(ID);
				setState(183);
				match(T__15);
				setState(184);
				expression(0);
				setState(185);
				match(T__16);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(186);
					match(T__14);
					setState(187);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableInitializer);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				arrayInitializer();
				}
				break;
			case T__5:
			case T__13:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__51:
			case ID:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
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
		enterRule(_localctx, 24, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__10);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__10 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
				{
				setState(197);
				variableInitializer();
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(T__9);
						setState(199);
						variableInitializer();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(205);
					match(T__9);
					}
				}

				}
			}

			setState(210);
			match(T__11);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				block();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				ifStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				forStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				whileStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(T__17);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
					{
					setState(217);
					expression(0);
					}
				}

				setState(220);
				match(T__7);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(T__18);
				setState(222);
				match(T__7);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(T__19);
				setState(224);
				match(T__7);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				match(T__7);
				}
				break;
			case T__5:
			case T__13:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__51:
			case ID:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				expression(0);
				setState(227);
				match(T__7);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__20);
			setState(232);
			match(T__5);
			setState(233);
			expression(0);
			setState(234);
			match(T__6);
			setState(235);
			statement();
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(236);
				match(T__21);
				setState(237);
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
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 30, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__22);
			setState(241);
			match(T__5);
			setState(242);
			forControl();
			setState(243);
			match(T__6);
			setState(244);
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
		enterRule(_localctx, 32, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__23);
			setState(247);
			match(T__5);
			setState(248);
			expression(0);
			setState(249);
			match(T__6);
			setState(250);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__12 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (PRIMITIVE_TYPE - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
				{
				setState(252);
				forInit();
				}
			}

			setState(255);
			match(T__7);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
				{
				setState(256);
				expression(0);
				}
			}

			setState(259);
			match(T__7);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
				{
				setState(260);
				expressionList();
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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forInit);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				variableDeclarationStatement();
				}
				break;
			case T__5:
			case T__13:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__51:
			case ID:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				expressionList();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression(0);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(268);
				match(T__9);
				setState(269);
				expression(0);
				}
				}
				setState(274);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(276);
				match(T__5);
				setState(277);
				expression(0);
				setState(278);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(280);
				literal();
				}
				break;
			case 3:
				{
				setState(281);
				match(ID);
				}
				break;
			case 4:
				{
				setState(282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(283);
				expression(16);
				}
				break;
			case 5:
				{
				setState(284);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				expression(15);
				}
				break;
			case 6:
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				expression(14);
				}
				break;
			case 7:
				{
				setState(288);
				match(T__5);
				setState(289);
				type();
				setState(290);
				match(T__6);
				setState(291);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(296);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__31) | (1L << T__32))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(299);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(302);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(303);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(305);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__35) | (1L << T__36))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(306);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(308);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(311);
						match(T__30);
						setState(312);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(314);
						match(T__39);
						setState(315);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(317);
						match(T__40);
						setState(318);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(320);
						match(T__41);
						setState(321);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(323);
						match(T__42);
						setState(324);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(T__43);
						setState(327);
						expression(0);
						setState(328);
						match(T__44);
						setState(329);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(332);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(335);
						match(T__2);
						setState(336);
						match(ID);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(338);
						match(T__15);
						setState(339);
						expression(0);
						setState(340);
						match(T__16);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(343);
						match(T__5);
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__24 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__51 - 6)) | (1L << (ID - 6)) | (1L << (NUMBER - 6)) | (1L << (STRING - 6)) | (1L << (CHARACTER - 6)) | (1L << (BOOLEAN - 6)))) != 0)) {
							{
							setState(344);
							expressionList();
							}
						}

						setState(347);
						match(T__6);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(349);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
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
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode NUMBER() { return getToken(CMMParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(CMMParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(CMMParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (NUMBER - 52)) | (1L << (STRING - 52)) | (1L << (CHARACTER - 52)) | (1L << (BOOLEAN - 52)))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CMMParser.PRIMITIVE_TYPE, 0); }
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
		enterRule(_localctx, 44, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(PRIMITIVE_TYPE);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(T__13);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u016f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3"+
		"Q\13\3\3\3\5\3T\n\3\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7"+
		"\16\7\u0083\13\7\5\7\u0085\n\7\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\7\n\u0098\n\n\f\n\16"+
		"\n\u009b\13\n\3\n\3\n\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\7\13\u00af\n\13\f\13\16\13\u00b2"+
		"\13\13\3\f\3\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f"+
		"\5\f\u00c1\n\f\3\r\3\r\5\r\u00c5\n\r\3\16\3\16\3\16\3\16\7\16\u00cb\n"+
		"\16\f\16\16\16\u00ce\13\16\3\16\5\16\u00d1\n\16\5\16\u00d3\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dd\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\5\23\u0100\n\23\3\23\3\23\5\23\u0104\n\23\3\23\3\23\5"+
		"\23\u0108\n\23\3\24\3\24\5\24\u010c\n\24\3\25\3\25\3\25\7\25\u0111\n\25"+
		"\f\25\16\25\u0114\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0128\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u015c\n\26\3\26\3\26\3\26\7\26\u0161"+
		"\n\26\f\26\16\26\u0164\13\26\3\27\3\27\3\30\3\30\7\30\u016a\n\30\f\30"+
		"\16\30\u016d\13\30\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\r\3\2\33\36\3\2\37 \4\2\20\20!!\4\2\20\20\"#\3\2\35\36\3\2"+
		"$%\5\2\4\4\6\6&\'\3\2()\4\2\21\21\60\65\3\2\33\34\6\2\66\6699<=BB\2\u0196"+
		"\2\63\3\2\2\2\4>\3\2\2\2\6W\3\2\2\2\bg\3\2\2\2\nw\3\2\2\2\f\u0084\3\2"+
		"\2\2\16\u0086\3\2\2\2\20\u0094\3\2\2\2\22\u00a9\3\2\2\2\24\u00ab\3\2\2"+
		"\2\26\u00c0\3\2\2\2\30\u00c4\3\2\2\2\32\u00c6\3\2\2\2\34\u00e7\3\2\2\2"+
		"\36\u00e9\3\2\2\2 \u00f2\3\2\2\2\"\u00f8\3\2\2\2$\u00ff\3\2\2\2&\u010b"+
		"\3\2\2\2(\u010d\3\2\2\2*\u0127\3\2\2\2,\u0165\3\2\2\2.\u0167\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"9\3\2\2\2\65\63\3\2\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\2\2\3=\3\3\2\2\2>S\7\3\2\2?@\7\4"+
		"\2\2@E\78\2\2AB\7\5\2\2BD\78\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2FH\3\2\2\2GE\3\2\2\2HT\7\6\2\2IJ\7\7\2\2JO\78\2\2KL\7\5\2\2LN\78\2\2"+
		"MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RT\7\7\2\2"+
		"S?\3\2\2\2SI\3\2\2\2T\5\3\2\2\2UX\5\b\5\2VX\5\n\6\2WU\3\2\2\2WV\3\2\2"+
		"\2X\7\3\2\2\2YZ\5.\30\2Z[\78\2\2[\\\7\b\2\2\\]\5\f\7\2]^\7\t\2\2^_\7\n"+
		"\2\2_h\3\2\2\2`a\7\13\2\2ab\78\2\2bc\7\b\2\2cd\5\f\7\2de\7\t\2\2ef\7\n"+
		"\2\2fh\3\2\2\2gY\3\2\2\2g`\3\2\2\2h\t\3\2\2\2ij\5.\30\2jk\78\2\2kl\7\b"+
		"\2\2lm\5\f\7\2mn\7\t\2\2no\5\16\b\2ox\3\2\2\2pq\7\13\2\2qr\78\2\2rs\7"+
		"\b\2\2st\5\f\7\2tu\7\t\2\2uv\5\16\b\2vx\3\2\2\2wi\3\2\2\2wp\3\2\2\2x\13"+
		"\3\2\2\2yz\5.\30\2z\u0081\78\2\2{|\7\f\2\2|}\5.\30\2}~\78\2\2~\u0080\3"+
		"\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084y\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u008a\7\r\2\2\u0087\u0089\5\20\t"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\16\2\2"+
		"\u008e\17\3\2\2\2\u008f\u0090\5\22\n\2\u0090\u0091\7\n\2\2\u0091\u0095"+
		"\3\2\2\2\u0092\u0095\5\n\6\2\u0093\u0095\5\34\17\2\u0094\u008f\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\21\3\2\2\2\u0096\u0098"+
		"\7\17\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\5.\30\2\u009d\u009e\5\24\13\2\u009e\u00aa\3\2\2\2\u009f\u00a1\7\17\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5.\30\2\u00a6"+
		"\u00a7\7\20\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00aa\3\2\2\2\u00a9\u0099"+
		"\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00b0\5\26\f\2\u00ac"+
		"\u00ad\7\f\2\2\u00ad\u00af\5\26\f\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\25\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\78\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b7\5*"+
		"\26\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c1\3\2\2\2\u00b8"+
		"\u00b9\78\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5*\26\2\u00bb\u00be\7\23"+
		"\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00bf\5\32\16\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b3\3\2\2\2\u00c0\u00b8\3\2"+
		"\2\2\u00c1\27\3\2\2\2\u00c2\u00c5\5\32\16\2\u00c3\u00c5\5*\26\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00d2\7\r\2"+
		"\2\u00c7\u00cc\5\30\r\2\u00c8\u00c9\7\f\2\2\u00c9\u00cb\5\30\r\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7\f\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c7\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\33\3\2\2\2\u00d6\u00e8\5\16\b\2\u00d7\u00e8\5\36\20\2\u00d8\u00e8\5 "+
		"\21\2\u00d9\u00e8\5\"\22\2\u00da\u00dc\7\24\2\2\u00db\u00dd\5*\26\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e8\7\n"+
		"\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e8\7\n\2\2\u00e1\u00e2\7\26\2\2\u00e2"+
		"\u00e8\7\n\2\2\u00e3\u00e8\7\n\2\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\7\n"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00d6\3\2\2\2\u00e7\u00d7\3\2\2\2\u00e7"+
		"\u00d8\3\2\2\2\u00e7\u00d9\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7\u00df\3\2"+
		"\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"\35\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\5*\26"+
		"\2\u00ec\u00ed\7\t\2\2\u00ed\u00f0\5\34\17\2\u00ee\u00ef\7\30\2\2\u00ef"+
		"\u00f1\5\34\17\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2"+
		"\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\5$\23\2\u00f5"+
		"\u00f6\7\t\2\2\u00f6\u00f7\5\34\17\2\u00f7!\3\2\2\2\u00f8\u00f9\7\32\2"+
		"\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd"+
		"\5\34\17\2\u00fd#\3\2\2\2\u00fe\u0100\5&\24\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\n\2\2\u0102\u0104\5*"+
		"\26\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\7\n\2\2\u0106\u0108\5(\25\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108%\3\2\2\2\u0109\u010c\5\22\n\2\u010a\u010c\5(\25\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\'\3\2\2\2\u010d\u0112\5*\26\2\u010e"+
		"\u010f\7\f\2\2\u010f\u0111\5*\26\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113)\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0116\b\26\1\2\u0116\u0117\7\b\2\2\u0117\u0118\5*\26\2"+
		"\u0118\u0119\7\t\2\2\u0119\u0128\3\2\2\2\u011a\u0128\5,\27\2\u011b\u0128"+
		"\78\2\2\u011c\u011d\t\2\2\2\u011d\u0128\5*\26\22\u011e\u011f\t\3\2\2\u011f"+
		"\u0128\5*\26\21\u0120\u0121\t\4\2\2\u0121\u0128\5*\26\20\u0122\u0123\7"+
		"\b\2\2\u0123\u0124\5.\30\2\u0124\u0125\7\t\2\2\u0125\u0126\5*\26\17\u0126"+
		"\u0128\3\2\2\2\u0127\u0115\3\2\2\2\u0127\u011a\3\2\2\2\u0127\u011b\3\2"+
		"\2\2\u0127\u011c\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0120\3\2\2\2\u0127"+
		"\u0122\3\2\2\2\u0128\u0162\3\2\2\2\u0129\u012a\f\16\2\2\u012a\u012b\t"+
		"\5\2\2\u012b\u0161\5*\26\17\u012c\u012d\f\r\2\2\u012d\u012e\t\6\2\2\u012e"+
		"\u0161\5*\26\16\u012f\u0130\f\f\2\2\u0130\u0131\t\7\2\2\u0131\u0161\5"+
		"*\26\r\u0132\u0133\f\13\2\2\u0133\u0134\t\b\2\2\u0134\u0161\5*\26\f\u0135"+
		"\u0136\f\n\2\2\u0136\u0137\t\t\2\2\u0137\u0161\5*\26\13\u0138\u0139\f"+
		"\t\2\2\u0139\u013a\7!\2\2\u013a\u0161\5*\26\n\u013b\u013c\f\b\2\2\u013c"+
		"\u013d\7*\2\2\u013d\u0161\5*\26\t\u013e\u013f\f\7\2\2\u013f\u0140\7+\2"+
		"\2\u0140\u0161\5*\26\b\u0141\u0142\f\6\2\2\u0142\u0143\7,\2\2\u0143\u0161"+
		"\5*\26\7\u0144\u0145\f\5\2\2\u0145\u0146\7-\2\2\u0146\u0161\5*\26\6\u0147"+
		"\u0148\f\4\2\2\u0148\u0149\7.\2\2\u0149\u014a\5*\26\2\u014a\u014b\7/\2"+
		"\2\u014b\u014c\5*\26\5\u014c\u0161\3\2\2\2\u014d\u014e\f\3\2\2\u014e\u014f"+
		"\t\n\2\2\u014f\u0161\5*\26\4\u0150\u0151\f\26\2\2\u0151\u0152\7\5\2\2"+
		"\u0152\u0161\78\2\2\u0153\u0154\f\25\2\2\u0154\u0155\7\22\2\2\u0155\u0156"+
		"\5*\26\2\u0156\u0157\7\23\2\2\u0157\u0161\3\2\2\2\u0158\u0159\f\24\2\2"+
		"\u0159\u015b\7\b\2\2\u015a\u015c\5(\25\2\u015b\u015a\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\7\t\2\2\u015e\u015f\f\23\2\2"+
		"\u015f\u0161\t\13\2\2\u0160\u0129\3\2\2\2\u0160\u012c\3\2\2\2\u0160\u012f"+
		"\3\2\2\2\u0160\u0132\3\2\2\2\u0160\u0135\3\2\2\2\u0160\u0138\3\2\2\2\u0160"+
		"\u013b\3\2\2\2\u0160\u013e\3\2\2\2\u0160\u0141\3\2\2\2\u0160\u0144\3\2"+
		"\2\2\u0160\u0147\3\2\2\2\u0160\u014d\3\2\2\2\u0160\u0150\3\2\2\2\u0160"+
		"\u0153\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163+\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\t\f\2\2\u0166-\3\2\2\2\u0167\u016b\7\67\2\2\u0168"+
		"\u016a\7\20\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c/\3\2\2\2\u016d\u016b\3\2\2\2&\639EOS"+
		"Wgw\u0081\u0084\u008a\u0094\u0099\u00a2\u00a9\u00b0\u00b6\u00be\u00c0"+
		"\u00c4\u00cc\u00d0\u00d2\u00dc\u00e7\u00f0\u00ff\u0103\u0107\u010b\u0112"+
		"\u0127\u015b\u0160\u0162\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}