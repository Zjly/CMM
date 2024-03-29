// Generated from E:/Coding/GitHub/CMM/Interpreter/src/CMM\CMM.g4 by ANTLR 4.7.2
package CMM;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMLexer extends Lexer {
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
		T__45=46, BOOL=47, CHAR=48, BYTE=49, SHORT=50, INT=51, LONG=52, FLOAT=53, 
		DOUBLE=54, VOID=55, STR=56, BREAK=57, RETURN=58, CONTINUE=59, IF=60, WHILE=61, 
		FOR=62, BOOLEAN=63, ID=64, INT_NUMBER=65, FLOAT_NUMBER=66, STRING=67, 
		CHARACTER=68, LINE_COMMENT=69, COMMENT=70, ID_LETTER=71, DIGIT=72, WS=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "BOOL", "CHAR", "BYTE", 
			"SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "VOID", "STR", "BREAK", "RETURN", 
			"CONTINUE", "IF", "WHILE", "FOR", "BOOLEAN", "ID", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING", "CHARACTER", "ESC", "LINE_COMMENT", "COMMENT", "ID_LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'.'", "'>'", "'\"'", "';'", "'struct'", "'{'", 
			"'}'", "'('", "','", "')'", "'static'", "'='", "'['", "']'", "'else'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<<'", 
			"'>>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", 
			"'||'", "'?'", "':'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'null'", "'bool'", "'char'", "'byte'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'void'", "'string'", "'break'", "'return'", "'continue'", 
			"'if'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
			"CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "VOID", "STR", 
			"BREAK", "RETURN", "CONTINUE", "IF", "WHILE", "FOR", "BOOLEAN", "ID", 
			"INT_NUMBER", "FLOAT_NUMBER", "STRING", "CHARACTER", "LINE_COMMENT", 
			"COMMENT", "ID_LETTER", "DIGIT", "WS"
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


	public CMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u017e\n@\3A\3A\3A\7A\u0183\nA\fA\16A\u0186"+
		"\13A\3B\6B\u0189\nB\rB\16B\u018a\3C\6C\u018e\nC\rC\16C\u018f\3C\3C\6C"+
		"\u0194\nC\rC\16C\u0195\3D\3D\3D\7D\u019b\nD\fD\16D\u019e\13D\3D\3D\3E"+
		"\3E\3E\5E\u01a5\nE\3E\3E\3F\3F\3F\3G\3G\3G\3G\7G\u01b0\nG\fG\16G\u01b3"+
		"\13G\3G\3G\3G\3G\3H\3H\3H\3H\7H\u01bd\nH\fH\16H\u01c0\13H\3H\3H\3H\3H"+
		"\3H\3I\3I\3J\3J\3K\6K\u01cc\nK\rK\16K\u01cd\3K\3K\5\u019c\u01b1\u01be"+
		"\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b\2\u008d"+
		"G\u008fH\u0091I\u0093J\u0095K\3\2\7\4\2))^^\b\2$$^^ddppttvv\5\2C\\aac"+
		"|\3\2\62;\5\2\13\f\17\17\"\"\2\u01db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u00a0\3\2\2\2\7\u00a2\3\2\2\2\t\u00a4"+
		"\3\2\2\2\13\u00a6\3\2\2\2\r\u00a8\3\2\2\2\17\u00aa\3\2\2\2\21\u00b1\3"+
		"\2\2\2\23\u00b3\3\2\2\2\25\u00b5\3\2\2\2\27\u00b7\3\2\2\2\31\u00b9\3\2"+
		"\2\2\33\u00bb\3\2\2\2\35\u00c2\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2\2"+
		"#\u00c8\3\2\2\2%\u00cd\3\2\2\2\'\u00d0\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3"+
		"\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2\2"+
		"\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e4\3\2\2\2;\u00e7\3\2\2\2=\u00ea"+
		"\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G"+
		"\u00f7\3\2\2\2I\u00f9\3\2\2\2K\u00fc\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u0106\3\2\2\2U\u0109\3\2\2\2W\u010c\3\2\2\2Y\u010f"+
		"\3\2\2\2[\u0112\3\2\2\2]\u0115\3\2\2\2_\u011a\3\2\2\2a\u011f\3\2\2\2c"+
		"\u0124\3\2\2\2e\u0129\3\2\2\2g\u012f\3\2\2\2i\u0133\3\2\2\2k\u0138\3\2"+
		"\2\2m\u013e\3\2\2\2o\u0145\3\2\2\2q\u014a\3\2\2\2s\u0151\3\2\2\2u\u0157"+
		"\3\2\2\2w\u015e\3\2\2\2y\u0167\3\2\2\2{\u016a\3\2\2\2}\u0170\3\2\2\2\177"+
		"\u017d\3\2\2\2\u0081\u017f\3\2\2\2\u0083\u0188\3\2\2\2\u0085\u018d\3\2"+
		"\2\2\u0087\u0197\3\2\2\2\u0089\u01a1\3\2\2\2\u008b\u01a8\3\2\2\2\u008d"+
		"\u01ab\3\2\2\2\u008f\u01b8\3\2\2\2\u0091\u01c6\3\2\2\2\u0093\u01c8\3\2"+
		"\2\2\u0095\u01cb\3\2\2\2\u0097\u0098\7%\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7e\2\2\u009b\u009c\7n\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\4\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1"+
		"\6\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\b\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5"+
		"\n\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\f\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9"+
		"\16\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7w\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7v\2\2\u00b0\20\3\2\2\2\u00b1"+
		"\u00b2\7}\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4\24\3\2\2\2"+
		"\u00b5\u00b6\7*\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8\30\3\2\2"+
		"\2\u00b9\u00ba\7+\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7e\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\36\3\2\2\2\u00c4"+
		"\u00c5\7]\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7_\2\2\u00c7\"\3\2\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc$\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf\7-\2\2\u00cf&\3\2\2\2\u00d0"+
		"\u00d1\7/\2\2\u00d1\u00d2\7/\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4"+
		"*\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7\u0080\2\2\u00d8"+
		".\3\2\2\2\u00d9\u00da\7#\2\2\u00da\60\3\2\2\2\u00db\u00dc\7,\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\64\3\2\2\2\u00df\u00e0\7\'\2\2"+
		"\u00e0\66\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7>\2\2\u00e38\3\2\2\2"+
		"\u00e4\u00e5\7@\2\2\u00e5\u00e6\7@\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7>\2"+
		"\2\u00e8\u00e9\7?\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7"+
		"?\2\2\u00ec>\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\u00ef\7?\2\2\u00ef@\3\2"+
		"\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2B\3\2\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7`\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7"+
		"~\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\7(\2\2\u00fbJ\3\2"+
		"\2\2\u00fc\u00fd\7~\2\2\u00fd\u00fe\7~\2\2\u00feL\3\2\2\2\u00ff\u0100"+
		"\7A\2\2\u0100N\3\2\2\2\u0101\u0102\7<\2\2\u0102P\3\2\2\2\u0103\u0104\7"+
		"-\2\2\u0104\u0105\7?\2\2\u0105R\3\2\2\2\u0106\u0107\7/\2\2\u0107\u0108"+
		"\7?\2\2\u0108T\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b\7?\2\2\u010bV\3"+
		"\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7?\2\2\u010eX\3\2\2\2\u010f\u0110"+
		"\7(\2\2\u0110\u0111\7?\2\2\u0111Z\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114"+
		"\7?\2\2\u0114\\\3\2\2\2\u0115\u0116\7p\2\2\u0116\u0117\7w\2\2\u0117\u0118"+
		"\7n\2\2\u0118\u0119\7n\2\2\u0119^\3\2\2\2\u011a\u011b\7d\2\2\u011b\u011c"+
		"\7q\2\2\u011c\u011d\7q\2\2\u011d\u011e\7n\2\2\u011e`\3\2\2\2\u011f\u0120"+
		"\7e\2\2\u0120\u0121\7j\2\2\u0121\u0122\7c\2\2\u0122\u0123\7t\2\2\u0123"+
		"b\3\2\2\2\u0124\u0125\7d\2\2\u0125\u0126\7{\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7g\2\2\u0128d\3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b\7j\2\2\u012b"+
		"\u012c\7q\2\2\u012c\u012d\7t\2\2\u012d\u012e\7v\2\2\u012ef\3\2\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131\u0132\7v\2\2\u0132h\3\2\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7q\2\2\u0135\u0136\7p\2\2\u0136\u0137\7i\2\2"+
		"\u0137j\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a\7n\2\2\u013a\u013b\7q\2"+
		"\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013dl\3\2\2\2\u013e\u013f\7"+
		"f\2\2\u013f\u0140\7q\2\2\u0140\u0141\7w\2\2\u0141\u0142\7d\2\2\u0142\u0143"+
		"\7n\2\2\u0143\u0144\7g\2\2\u0144n\3\2\2\2\u0145\u0146\7x\2\2\u0146\u0147"+
		"\7q\2\2\u0147\u0148\7k\2\2\u0148\u0149\7f\2\2\u0149p\3\2\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7k\2\2\u014e"+
		"\u014f\7p\2\2\u014f\u0150\7i\2\2\u0150r\3\2\2\2\u0151\u0152\7d\2\2\u0152"+
		"\u0153\7t\2\2\u0153\u0154\7g\2\2\u0154\u0155\7c\2\2\u0155\u0156\7m\2\2"+
		"\u0156t\3\2\2\2\u0157\u0158\7t\2\2\u0158\u0159\7g\2\2\u0159\u015a\7v\2"+
		"\2\u015a\u015b\7w\2\2\u015b\u015c\7t\2\2\u015c\u015d\7p\2\2\u015dv\3\2"+
		"\2\2\u015e\u015f\7e\2\2\u015f\u0160\7q\2\2\u0160\u0161\7p\2\2\u0161\u0162"+
		"\7v\2\2\u0162\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7w\2\2\u0165"+
		"\u0166\7g\2\2\u0166x\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7h\2\2\u0169"+
		"z\3\2\2\2\u016a\u016b\7y\2\2\u016b\u016c\7j\2\2\u016c\u016d\7k\2\2\u016d"+
		"\u016e\7n\2\2\u016e\u016f\7g\2\2\u016f|\3\2\2\2\u0170\u0171\7h\2\2\u0171"+
		"\u0172\7q\2\2\u0172\u0173\7t\2\2\u0173~\3\2\2\2\u0174\u0175\7v\2\2\u0175"+
		"\u0176\7t\2\2\u0176\u0177\7w\2\2\u0177\u017e\7g\2\2\u0178\u0179\7h\2\2"+
		"\u0179\u017a\7c\2\2\u017a\u017b\7n\2\2\u017b\u017c\7u\2\2\u017c\u017e"+
		"\7g\2\2\u017d\u0174\3\2\2\2\u017d\u0178\3\2\2\2\u017e\u0080\3\2\2\2\u017f"+
		"\u0184\5\u0091I\2\u0180\u0183\5\u0091I\2\u0181\u0183\5\u0093J\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0082\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0189\5\u0093J\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0084\3\2\2\2\u018c\u018e\5\u0093J"+
		"\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\13\2\2\2\u0192\u0194\5\u0093"+
		"J\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0086\3\2\2\2\u0197\u019c\7$\2\2\u0198\u019b\5\u008b"+
		"F\2\u0199\u019b\13\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7$\2\2\u01a0\u0088\3\2\2\2\u01a1"+
		"\u01a4\7)\2\2\u01a2\u01a5\5\u008bF\2\u01a3\u01a5\n\2\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7)\2\2\u01a7"+
		"\u008a\3\2\2\2\u01a8\u01a9\7^\2\2\u01a9\u01aa\t\3\2\2\u01aa\u008c\3\2"+
		"\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01b1\3\2\2\2\u01ae"+
		"\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7\f\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\bG\2\2\u01b7\u008e\3\2"+
		"\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7,\2\2\u01ba\u01be\3\2\2\2\u01bb"+
		"\u01bd\13\2\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bf\3"+
		"\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c2\7,\2\2\u01c2\u01c3\7\61\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\bH"+
		"\2\2\u01c5\u0090\3\2\2\2\u01c6\u01c7\t\4\2\2\u01c7\u0092\3\2\2\2\u01c8"+
		"\u01c9\t\5\2\2\u01c9\u0094\3\2\2\2\u01ca\u01cc\t\6\2\2\u01cb\u01ca\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\bK\2\2\u01d0\u0096\3\2\2\2\17\2\u017d\u0182"+
		"\u0184\u018a\u018f\u0195\u019a\u019c\u01a4\u01b1\u01be\u01cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}