// Generated from C:/Users/34658/Documents/Clase/DLPLab2526/dlp/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, MULTILINE_COMMENT=36, ONELINE_COMMENT=37, 
		WHITESPACES=38, REAL_CONSTANT=39, INT_CONSTANT=40, CHAR_CONSTANT=41, PRIMITIVE_TYPE=42, 
		ID=43;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_ifBlock = 3, 
		RULE_type = 4, RULE_varDefinition = 5, RULE_funcDefinition = 6, RULE_param = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "ifBlock", "type", "varDefinition", 
			"funcDefinition", "param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "','", "'log'", "';'", "'input'", "'='", "'if'", "'else'", "'while'", 
			"'return'", "'{'", "'}'", "'let'", "':'", "'function'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MULTILINE_COMMENT", "ONELINE_COMMENT", "WHITESPACES", "REAL_CONSTANT", 
			"INT_CONSTANT", "CHAR_CONSTANT", "PRIMITIVE_TYPE", "ID"
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
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31 || _la==T__33) {
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(16);
					varDefinition();
					}
					break;
				case T__33:
					{
					setState(17);
					funcDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PRIMITIVE_TYPE() { return getToken(TSmmParser.PRIMITIVE_TYPE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(26);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(27);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(28);
				match(ID);
				}
				break;
			case 4:
				{
				setState(29);
				match(CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(30);
				match(T__0);
				setState(31);
				expression(0);
				setState(32);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(34);
				match(T__0);
				setState(35);
				expression(0);
				setState(36);
				match(T__5);
				setState(37);
				match(PRIMITIVE_TYPE);
				setState(38);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(40);
				match(T__6);
				setState(41);
				expression(7);
				}
				break;
			case 8:
				{
				setState(42);
				match(T__7);
				setState(43);
				expression(6);
				}
				break;
			case 9:
				{
				setState(44);
				match(ID);
				setState(45);
				match(T__0);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12644383719810L) != 0)) {
					{
					setState(46);
					expression(0);
					}
				}

				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(49);
					match(T__20);
					setState(50);
					expression(0);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(60);
						match(T__4);
						setState(61);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(75);
						match(T__2);
						setState(76);
						expression(0);
						setState(77);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__21);
				setState(85);
				expression(0);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(86);
					match(T__20);
					setState(87);
					expression(0);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__23);
				setState(96);
				expression(0);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(97);
					match(T__20);
					setState(98);
					expression(0);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				expression(0);
				setState(107);
				match(T__24);
				setState(108);
				expression(0);
				setState(109);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(T__25);
				setState(112);
				match(T__0);
				setState(113);
				expression(0);
				setState(114);
				match(T__1);
				setState(115);
				ifBlock();
				setState(116);
				match(T__26);
				setState(117);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(T__27);
				setState(120);
				match(T__0);
				setState(121);
				expression(0);
				setState(122);
				match(T__1);
				setState(123);
				ifBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(T__28);
				setState(126);
				expression(0);
				setState(127);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(ID);
				setState(130);
				match(T__0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12644383719810L) != 0)) {
					{
					setState(131);
					expression(0);
					}
				}

				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(134);
					match(T__20);
					setState(135);
					expression(0);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__1);
				setState(142);
				match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBlock);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__6:
			case T__7:
			case T__21:
			case T__23:
			case T__25:
			case T__27:
			case T__28:
			case REAL_CONSTANT:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				statement();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__29);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12645277106562L) != 0)) {
					{
					{
					setState(147);
					statement();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(TSmmParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(PRIMITIVE_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__2);
				setState(158);
				match(INT_CONSTANT);
				setState(159);
				match(T__3);
				setState(160);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__2);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					varDefinition();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__31 );
				setState(167);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__31);
			setState(172);
			match(ID);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(173);
				match(T__20);
				setState(174);
				match(ID);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__32);
			setState(181);
			type();
			setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__33);
			setState(185);
			match(ID);
			setState(186);
			match(T__0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(187);
				param();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(190);
				match(T__20);
				setState(191);
				param();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__1);
			setState(198);
			match(T__32);
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case PRIMITIVE_TYPE:
				{
				setState(199);
				type();
				}
				break;
			case T__34:
				{
				setState(200);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			match(T__29);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(204);
				varDefinition();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12645277106562L) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(219);
			match(T__32);
			setState(220);
			type();
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00010\b\u0001\u0001\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001"+
		"\f\u00017\t\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001P\b\u0001\n\u0001\f\u0001S\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002d\b\u0002\n\u0002\f\u0002g\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0089\b\u0002\n\u0002\f\u0002\u008c\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0090\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0095\b\u0003\n\u0003\f\u0003\u0098\t\u0003\u0001\u0003\u0003\u0003"+
		"\u009b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u00a4\b\u0004\u000b\u0004\f\u0004"+
		"\u00a5\u0001\u0004\u0001\u0004\u0003\u0004\u00aa\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b0\b\u0005\n\u0005\f\u0005"+
		"\u00b3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bd\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00c1\b\u0006\n\u0006\f\u0006\u00c4\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00ce\b\u0006\n\u0006\f\u0006\u00d1\t\u0006"+
		"\u0001\u0006\u0005\u0006\u00d4\b\u0006\n\u0006\f\u0006\u00d7\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0000\u0001\u0002\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0004"+
		"\u0001\u0000\t\u000b\u0002\u0000\u0007\u0007\f\f\u0001\u0000\r\u0012\u0001"+
		"\u0000\u0013\u0014\u00fd\u0000\u0014\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004\u008f\u0001\u0000\u0000\u0000\u0006\u009a\u0001"+
		"\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000\u0000\n\u00ab\u0001\u0000"+
		"\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e\u00da\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0003\n\u0005\u0000\u0011\u0013\u0003\f\u0006\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001"+
		"\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0006\u0001\uffff\uffff"+
		"\u0000\u001a:\u0005(\u0000\u0000\u001b:\u0005\'\u0000\u0000\u001c:\u0005"+
		"+\u0000\u0000\u001d:\u0005)\u0000\u0000\u001e\u001f\u0005\u0001\u0000"+
		"\u0000\u001f \u0003\u0002\u0001\u0000 !\u0005\u0002\u0000\u0000!:\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0003\u0002\u0001\u0000"+
		"$%\u0005\u0006\u0000\u0000%&\u0005*\u0000\u0000&\'\u0005\u0002\u0000\u0000"+
		"\':\u0001\u0000\u0000\u0000()\u0005\u0007\u0000\u0000):\u0003\u0002\u0001"+
		"\u0007*+\u0005\b\u0000\u0000+:\u0003\u0002\u0001\u0006,-\u0005+\u0000"+
		"\u0000-/\u0005\u0001\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000005\u0001\u0000\u0000\u000012\u0005"+
		"\u0015\u0000\u000024\u0003\u0002\u0001\u000031\u0001\u0000\u0000\u0000"+
		"47\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0005\u0002"+
		"\u0000\u00009\u0019\u0001\u0000\u0000\u00009\u001b\u0001\u0000\u0000\u0000"+
		"9\u001c\u0001\u0000\u0000\u00009\u001d\u0001\u0000\u0000\u00009\u001e"+
		"\u0001\u0000\u0000\u00009\"\u0001\u0000\u0000\u00009(\u0001\u0000\u0000"+
		"\u00009*\u0001\u0000\u0000\u00009,\u0001\u0000\u0000\u0000:Q\u0001\u0000"+
		"\u0000\u0000;<\n\t\u0000\u0000<=\u0005\u0005\u0000\u0000=P\u0003\u0002"+
		"\u0001\n>?\n\u0005\u0000\u0000?@\u0007\u0000\u0000\u0000@P\u0003\u0002"+
		"\u0001\u0006AB\n\u0004\u0000\u0000BC\u0007\u0001\u0000\u0000CP\u0003\u0002"+
		"\u0001\u0005DE\n\u0003\u0000\u0000EF\u0007\u0002\u0000\u0000FP\u0003\u0002"+
		"\u0001\u0004GH\n\u0002\u0000\u0000HI\u0007\u0003\u0000\u0000IP\u0003\u0002"+
		"\u0001\u0003JK\n\n\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0003\u0002"+
		"\u0001\u0000MN\u0005\u0004\u0000\u0000NP\u0001\u0000\u0000\u0000O;\u0001"+
		"\u0000\u0000\u0000O>\u0001\u0000\u0000\u0000OA\u0001\u0000\u0000\u0000"+
		"OD\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000R\u0003\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0016\u0000\u0000UZ\u0003\u0002\u0001\u0000VW\u0005\u0015\u0000"+
		"\u0000WY\u0003\u0002\u0001\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0017\u0000\u0000"+
		"^\u0090\u0001\u0000\u0000\u0000_`\u0005\u0018\u0000\u0000`e\u0003\u0002"+
		"\u0001\u0000ab\u0005\u0015\u0000\u0000bd\u0003\u0002\u0001\u0000ca\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0017\u0000\u0000i\u0090\u0001\u0000\u0000\u0000jk\u0003"+
		"\u0002\u0001\u0000kl\u0005\u0019\u0000\u0000lm\u0003\u0002\u0001\u0000"+
		"mn\u0005\u0017\u0000\u0000n\u0090\u0001\u0000\u0000\u0000op\u0005\u001a"+
		"\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0003\u0002\u0001\u0000rs\u0005"+
		"\u0002\u0000\u0000st\u0003\u0006\u0003\u0000tu\u0005\u001b\u0000\u0000"+
		"uv\u0003\u0006\u0003\u0000v\u0090\u0001\u0000\u0000\u0000wx\u0005\u001c"+
		"\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0003\u0002\u0001\u0000z{\u0005"+
		"\u0002\u0000\u0000{|\u0003\u0006\u0003\u0000|\u0090\u0001\u0000\u0000"+
		"\u0000}~\u0005\u001d\u0000\u0000~\u007f\u0003\u0002\u0001\u0000\u007f"+
		"\u0080\u0005\u0017\u0000\u0000\u0080\u0090\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005+\u0000\u0000\u0082\u0084\u0005\u0001\u0000\u0000\u0083\u0085"+
		"\u0003\u0002\u0001\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u008a\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\u0015\u0000\u0000\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0002\u0000\u0000\u008e\u0090\u0005\u0017\u0000\u0000\u008fT\u0001"+
		"\u0000\u0000\u0000\u008f_\u0001\u0000\u0000\u0000\u008fj\u0001\u0000\u0000"+
		"\u0000\u008fo\u0001\u0000\u0000\u0000\u008fw\u0001\u0000\u0000\u0000\u008f"+
		"}\u0001\u0000\u0000\u0000\u008f\u0081\u0001\u0000\u0000\u0000\u0090\u0005"+
		"\u0001\u0000\u0000\u0000\u0091\u009b\u0003\u0004\u0002\u0000\u0092\u0096"+
		"\u0005\u001e\u0000\u0000\u0093\u0095\u0003\u0004\u0002\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0005\u001f\u0000\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0092"+
		"\u0001\u0000\u0000\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c\u00aa"+
		"\u0005*\u0000\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005"+
		"(\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00aa\u0003\b"+
		"\u0004\u0000\u00a1\u00a3\u0005\u0003\u0000\u0000\u00a2\u00a4\u0003\n\u0005"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u009c\u0001\u0000\u0000"+
		"\u0000\u00a9\u009d\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000"+
		"\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005 \u0000\u0000"+
		"\u00ac\u00b1\u0005+\u0000\u0000\u00ad\u00ae\u0005\u0015\u0000\u0000\u00ae"+
		"\u00b0\u0005+\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005!\u0000\u0000\u00b5\u00b6\u0003"+
		"\b\u0004\u0000\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u000b\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\"\u0000\u0000\u00b9\u00ba\u0005+\u0000"+
		"\u0000\u00ba\u00bc\u0005\u0001\u0000\u0000\u00bb\u00bd\u0003\u000e\u0007"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c2\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0015\u0000"+
		"\u0000\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000"+
		"\u0000\u00c6\u00c9\u0005!\u0000\u0000\u00c7\u00ca\u0003\b\u0004\u0000"+
		"\u00c8\u00ca\u0005#\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cf\u0005\u001e\u0000\u0000\u00cc\u00ce\u0003\n\u0005\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0003\u0004\u0002\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9\r\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005+\u0000\u0000\u00db\u00dc\u0005!\u0000"+
		"\u0000\u00dc\u00dd\u0003\b\u0004\u0000\u00dd\u000f\u0001\u0000\u0000\u0000"+
		"\u0016\u0012\u0014/59OQZe\u0084\u008a\u008f\u0096\u009a\u00a5\u00a9\u00b1"+
		"\u00bc\u00c2\u00c9\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}