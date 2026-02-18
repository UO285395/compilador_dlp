// Generated from C:/Users/34658/Documents/Clase/DLPLab2526/dlp/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MULTILINE_COMMENT=2, ONELINE_COMMENT=3, WHITESPACES=4, REAL_CONSTANT=5, 
		INT_CONSTANT=6, CHAR_CONSTANT=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MULTILINE_COMMENT", "ONELINE_COMMENT", "WHITESPACES", "MANTISA", 
			"EXPONENTE", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MULTILINE_COMMENT", "ONELINE_COMMENT", "WHITESPACES", "REAL_CONSTANT", 
			"INT_CONSTANT", "CHAR_CONSTANT", "ID"
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


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

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
		"\u0004\u0000\b\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001\n"+
		"\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u00032\b\u0003\u000b\u0003\f\u00033\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0004\u0004"+
		"=\b\u0004\u000b\u0004\f\u0004>\u0001\u0005\u0001\u0005\u0003\u0005C\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006H\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006L\b\u0006\n\u0006\f\u0006O\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006W\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007[\b\u0007\n\u0007\f"+
		"\u0007^\t\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\t\u0004"+
		"\tw\b\t\u000b\t\f\tx\u0001\t\u0005\t|\b\t\n\t\f\t\u007f\t\t\u0001\u001d"+
		"\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b"+
		"\u0000\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0001\u0000\b\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000EEee\u0002\u0000"+
		"++--\u0001\u000019\u0003\u0000AZ__az\u0004\u000009AZ__az\u008e\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001"+
		"\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005%\u0001\u0000"+
		"\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000"+
		"\u000b@\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000f`\u0001"+
		"\u0000\u0000\u0000\u0011s\u0001\u0000\u0000\u0000\u0013v\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005+\u0000\u0000\u0016\u0002\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005/\u0000\u0000\u0018\u0019\u0005*\u0000\u0000\u0019\u001d"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\t\u0000\u0000\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005*\u0000\u0000"+
		"!\"\u0005/\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0006\u0001\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005/\u0000\u0000&\'\u0005/\u0000"+
		"\u0000\'+\u0001\u0000\u0000\u0000(*\b\u0000\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"./\u0006\u0002\u0000\u0000/\u0006\u0001\u0000\u0000\u000002\u0007\u0001"+
		"\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0006\u0003\u0000\u00006\b\u0001\u0000\u0000\u000079\u0003\u000f\u0007"+
		"\u00008:\u0005.\u0000\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:<\u0001\u0000\u0000\u0000;=\u0007\u0002\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?\n\u0001\u0000\u0000\u0000@B\u0007\u0003\u0000\u0000"+
		"AC\u0007\u0004\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DE\u0003\u000f\u0007\u0000E\f\u0001\u0000"+
		"\u0000\u0000FH\u0003\u000f\u0007\u0000GF\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IM\u0005.\u0000\u0000JL\u0007"+
		"\u0002\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NW\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0003\t\u0004\u0000QR\u0003\u000b\u0005"+
		"\u0000RW\u0001\u0000\u0000\u0000ST\u0003\u000f\u0007\u0000TU\u0003\u000b"+
		"\u0005\u0000UW\u0001\u0000\u0000\u0000VG\u0001\u0000\u0000\u0000VP\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000W\u000e\u0001\u0000\u0000"+
		"\u0000X\\\u0007\u0005\u0000\u0000Y[\u0007\u0002\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]a\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_a\u00050\u0000\u0000`X\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"a\u0010\u0001\u0000\u0000\u0000bc\u0005\'\u0000\u0000cd\t\u0000\u0000"+
		"\u0000dt\u0005\'\u0000\u0000ef\u0005\'\u0000\u0000fg\u0005\\\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0003\u000f\u0007\u0000ij\u0005\'\u0000\u0000"+
		"jt\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000lm\u0005\\\u0000\u0000"+
		"mn\u0005n\u0000\u0000nt\u0005\'\u0000\u0000op\u0005\'\u0000\u0000pq\u0005"+
		"\\\u0000\u0000qr\u0005t\u0000\u0000rt\u0005\'\u0000\u0000sb\u0001\u0000"+
		"\u0000\u0000se\u0001\u0000\u0000\u0000sk\u0001\u0000\u0000\u0000so\u0001"+
		"\u0000\u0000\u0000t\u0012\u0001\u0000\u0000\u0000uw\u0007\u0006\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y}\u0001\u0000\u0000\u0000z|\u0007"+
		"\u0007\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0014\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u000f\u0000\u001d+3"+
		"9>BGMV\\`sx}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}