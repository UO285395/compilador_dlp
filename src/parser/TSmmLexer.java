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
		MULTILINE_COMMENT=1, ONELINE_COMMENT=2, WHITESPACES=3, REAL_CONSTANT=4, 
		INT_CONSTANT=5, CHAR_CONSTANT=6, ID=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTILINE_COMMENT", "ONELINE_COMMENT", "WHITESPACES", "MANTISA", "EXPONENTE", 
			"REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTILINE_COMMENT", "ONELINE_COMMENT", "WHITESPACES", "REAL_CONSTANT", 
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
		"\u0004\u0000\u0007|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002.\b\u0002\u000b\u0002"+
		"\f\u0002/\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"6\b\u0003\u0001\u0003\u0004\u00039\b\u0003\u000b\u0003\f\u0003:\u0001"+
		"\u0004\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u0005D\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005"+
		"\n\u0005\f\u0005K\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006W\b\u0006\n\u0006\f\u0006Z\t\u0006\u0001\u0006\u0003\u0006"+
		"]\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007p\b\u0007\u0001\b\u0004\bs\b\b\u000b\b\f\bt\u0001\b\u0005"+
		"\bx\b\b\n\b\f\b{\t\b\u0001\u0019\u0000\t\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0000\t\u0000\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007"+
		"\u0001\u0000\b\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0001\u00000"+
		"9\u0002\u0000EEee\u0002\u0000++--\u0001\u000019\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000"+
		"\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u00073\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000bR\u0001"+
		"\u0000\u0000\u0000\r\\\u0001\u0000\u0000\u0000\u000fo\u0001\u0000\u0000"+
		"\u0000\u0011r\u0001\u0000\u0000\u0000\u0013\u0014\u0005/\u0000\u0000\u0014"+
		"\u0015\u0005*\u0000\u0000\u0015\u0019\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\t\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005*\u0000\u0000\u001d\u001e\u0005/\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0006\u0000\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\"\u0005/\u0000\u0000\"#\u0005/\u0000"+
		"\u0000#\'\u0001\u0000\u0000\u0000$&\b\u0000\u0000\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*+\u0006\u0001\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,.\u0007\u0001"+
		"\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0006\u0002\u0000\u00002\u0006\u0001\u0000\u0000\u000035\u0003\r\u0006"+
		"\u000046\u0005.\u0000\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000079\u0007\u0002\u0000\u000087\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;\b\u0001\u0000\u0000\u0000<>\u0007\u0003\u0000\u0000"+
		"=?\u0007\u0004\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0003\r\u0006\u0000A\n\u0001\u0000"+
		"\u0000\u0000BD\u0003\r\u0006\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EI\u0005.\u0000\u0000FH\u0007\u0002"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JS\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000LM\u0003\u0007\u0003\u0000MN\u0003\t\u0004\u0000"+
		"NS\u0001\u0000\u0000\u0000OP\u0003\r\u0006\u0000PQ\u0003\t\u0004\u0000"+
		"QS\u0001\u0000\u0000\u0000RC\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000"+
		"\u0000RO\u0001\u0000\u0000\u0000S\f\u0001\u0000\u0000\u0000TX\u0007\u0005"+
		"\u0000\u0000UW\u0007\u0002\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y]\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u00050\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000e\u0001\u0000"+
		"\u0000\u0000^_\u0005\'\u0000\u0000_`\t\u0000\u0000\u0000`p\u0005\'\u0000"+
		"\u0000ab\u0005\'\u0000\u0000bc\u0005\\\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0003\r\u0006\u0000ef\u0005\'\u0000\u0000fp\u0001\u0000\u0000"+
		"\u0000gh\u0005\'\u0000\u0000hi\u0005\\\u0000\u0000ij\u0005n\u0000\u0000"+
		"jp\u0005\'\u0000\u0000kl\u0005\'\u0000\u0000lm\u0005\\\u0000\u0000mn\u0005"+
		"t\u0000\u0000np\u0005\'\u0000\u0000o^\u0001\u0000\u0000\u0000oa\u0001"+
		"\u0000\u0000\u0000og\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000"+
		"p\u0010\u0001\u0000\u0000\u0000qs\u0007\u0006\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uy\u0001\u0000\u0000\u0000vx\u0007\u0007\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0012\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000\u000f\u0000\u0019\'/5:>CIRX\\oty\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}