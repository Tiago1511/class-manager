// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.eapli.base.examManagement.exam;

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class createExamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXAM=1, CODE=2, TOTAL_MARKS=3, PASSING_MARKS=4, DURATION=5, SECTION=6, 
		MARKS=7, QUESTIONS=8, NUMBER=9, STRING=10, NEWLINE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EXAM", "CODE", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", 
			"MARKS", "QUESTIONS", "NUMBER", "STRING", "NEWLINE", "WS"
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
			null, "EXAM", "CODE", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", 
			"MARKS", "QUESTIONS", "NUMBER", "STRING", "NEWLINE", "WS"
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


	    int totalMarks;
	    int passingMarks;
	    int duration;
	    String examName;
	    HashMap<String, Integer> sectionMarks = new HashMap<>();


	public createExamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "createExam.g4"; }

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
		"\u0004\u0000\f\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000"+
		"%\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u0001"+
		"2\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002"+
		"E\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004"+
		"k\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005x\b\u0005\n\u0005\f\u0005{\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0086\b\u0006\n\u0006\f\u0006\u0089\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0097\b\u0007\n\u0007\f\u0007\u009a\t\u0007\u0001\b\u0004\b\u009d"+
		"\b\b\u000b\b\f\b\u009e\u0001\t\u0004\t\u00a2\b\t\u000b\t\f\t\u00a3\u0001"+
		"\n\u0003\n\u00a7\b\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u00ac\b\u000b"+
		"\u000b\u000b\f\u000b\u00ad\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0003\u0001\u0000"+
		"09\u0005\u0000,.0;??AZaz\u0003\u0000\t\t\r\r  \u00bc\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003&\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007"+
		"F\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000\u0000\u000bl\u0001\u0000"+
		"\u0000\u0000\r|\u0001\u0000\u0000\u0000\u000f\u008a\u0001\u0000\u0000"+
		"\u0000\u0011\u009c\u0001\u0000\u0000\u0000\u0013\u00a1\u0001\u0000\u0000"+
		"\u0000\u0015\u00a6\u0001\u0000\u0000\u0000\u0017\u00ab\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005E\u0000\u0000\u001a\u001b\u0005x\u0000\u0000\u001b"+
		"\u001c\u0005a\u0000\u0000\u001c\u001d\u0005m\u0000\u0000\u001d\u001e\u0005"+
		":\u0000\u0000\u001e\u001f\u0005 \u0000\u0000\u001f#\u0001\u0000\u0000"+
		"\u0000 \"\u0003\u0015\n\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005C\u0000\u0000"+
		"\'(\u0005o\u0000\u0000()\u0005d\u0000\u0000)*\u0005e\u0000\u0000*+\u0005"+
		":\u0000\u0000+,\u0005 \u0000\u0000,0\u0001\u0000\u0000\u0000-/\u0003\u0015"+
		"\n\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\u0004\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005T\u0000\u000045\u0005o\u0000\u00005"+
		"6\u0005t\u0000\u000067\u0005a\u0000\u000078\u0005l\u0000\u000089\u0005"+
		"M\u0000\u00009:\u0005a\u0000\u0000:;\u0005r\u0000\u0000;<\u0005k\u0000"+
		"\u0000<=\u0005s\u0000\u0000=>\u0005:\u0000\u0000>?\u0005 \u0000\u0000"+
		"?C\u0001\u0000\u0000\u0000@B\u0003\u0015\n\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0006\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"+
		"P\u0000\u0000GH\u0005a\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005s\u0000"+
		"\u0000JK\u0005i\u0000\u0000KL\u0005n\u0000\u0000LM\u0005g\u0000\u0000"+
		"MN\u0005M\u0000\u0000NO\u0005a\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005"+
		"k\u0000\u0000QR\u0005s\u0000\u0000RS\u0005:\u0000\u0000ST\u0005 \u0000"+
		"\u0000TX\u0001\u0000\u0000\u0000UW\u0003\u0015\n\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y\b\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"D\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005r\u0000\u0000^_\u0005a\u0000"+
		"\u0000_`\u0005t\u0000\u0000`a\u0005i\u0000\u0000ab\u0005o\u0000\u0000"+
		"bc\u0005n\u0000\u0000cd\u0005:\u0000\u0000de\u0005 \u0000\u0000ei\u0001"+
		"\u0000\u0000\u0000fh\u0003\u0015\n\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"j\n\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005S\u0000\u0000"+
		"mn\u0005e\u0000\u0000no\u0005c\u0000\u0000op\u0005t\u0000\u0000pq\u0005"+
		"i\u0000\u0000qr\u0005o\u0000\u0000rs\u0005n\u0000\u0000st\u0005:\u0000"+
		"\u0000tu\u0005 \u0000\u0000uy\u0001\u0000\u0000\u0000vx\u0003\u0015\n"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\f\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005M\u0000\u0000}~\u0005a\u0000\u0000~\u007f\u0005"+
		"r\u0000\u0000\u007f\u0080\u0005k\u0000\u0000\u0080\u0081\u0005s\u0000"+
		"\u0000\u0081\u0082\u0005:\u0000\u0000\u0082\u0083\u0005 \u0000\u0000\u0083"+
		"\u0087\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0015\n\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u000e"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005Q\u0000\u0000\u008b\u008c\u0005u\u0000\u0000\u008c\u008d\u0005e"+
		"\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u008f\u0005t\u0000\u0000"+
		"\u008f\u0090\u0005i\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0092"+
		"\u0005n\u0000\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094\u0005:"+
		"\u0000\u0000\u0094\u0098\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0015"+
		"\n\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0010\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0007\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0012\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0007\u0001\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0014\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0005\r\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u0016\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0007\u0002\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0006\u000b\u0000\u0000\u00b0\u0018\u0001\u0000\u0000\u0000\r\u0000"+
		"#0CXiy\u0087\u0098\u009e\u00a3\u00a6\u00ad\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}