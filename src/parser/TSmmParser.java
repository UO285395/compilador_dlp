// Generated from C:/Users/uo285395/IdeaProjects/compilador_dlp/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.locatable.*;
    import ast.statements.*;
    import ast.types.*;

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
		public Program ast;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			expression(0);
			setState(17);
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
		public Expression ast;
		public ExpressionContext e1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public Token CHAR_CONSTANT;
		public ExpressionContext expression;
		public TypeContext type;
		public ExpressionContext e2;
		public Token OP;
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(20);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(22);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealNumber(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(24);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 4:
				{
				setState(26);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(28);
				match(T__0);
				setState(29);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(30);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 6:
				{
				setState(33);
				match(T__0);
				setState(34);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(35);
				match(T__5);
				setState(36);
				((ExpressionContext)_localctx).type = type();
				setState(37);
				match(T__1);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn(), ((ExpressionContext)_localctx).expression.ast, ((ExpressionContext)_localctx).type.ast);
				}
				break;
			case 7:
				{
				setState(40);
				match(T__6);
				setState(41);
				((ExpressionContext)_localctx).expression = expression(7);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn(), ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 8:
				{
				setState(44);
				match(T__7);
				setState(45);
				((ExpressionContext)_localctx).expression = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn(), ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 9:
				{
				setState(48);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(49);
				match(T__0);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12644383719810L) != 0)) {
					{
					setState(50);
					((ExpressionContext)_localctx).expression = expression(0);
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(53);
					match(T__20);
					setState(54);
					((ExpressionContext)_localctx).expression = expression(0);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(64);
						match(T__4);
						setState(65);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(69);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).ast =  new ArithmeticOp(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(74);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);
						((ExpressionContext)_localctx).ast =  new ArithmeticOp(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(79);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);
						((ExpressionContext)_localctx).ast =  new CompareOp(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((ExpressionContext)_localctx).expression = expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87);
						match(T__2);
						setState(88);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(89);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__21);
				setState(98);
				expression(0);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(99);
					match(T__20);
					setState(100);
					expression(0);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__23);
				setState(109);
				expression(0);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(110);
					match(T__20);
					setState(111);
					expression(0);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				expression(0);
				setState(120);
				match(T__24);
				setState(121);
				expression(0);
				setState(122);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__25);
				setState(125);
				match(T__0);
				setState(126);
				expression(0);
				setState(127);
				match(T__1);
				setState(128);
				ifBlock();
				setState(129);
				match(T__26);
				setState(130);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(T__27);
				setState(133);
				match(T__0);
				setState(134);
				expression(0);
				setState(135);
				match(T__1);
				setState(136);
				ifBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__28);
				setState(139);
				expression(0);
				setState(140);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(ID);
				setState(143);
				match(T__0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12644383719810L) != 0)) {
					{
					setState(144);
					expression(0);
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(147);
					match(T__20);
					setState(148);
					expression(0);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__1);
				setState(155);
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
			setState(167);
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
				setState(158);
				statement();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__29);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12645277106562L) != 0)) {
					{
					{
					setState(160);
					statement();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
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
		public Type ast;
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(PRIMITIVE_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__2);
				setState(171);
				match(INT_CONSTANT);
				setState(172);
				match(T__3);
				setState(173);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__2);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					varDefinition();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__31 );
				setState(180);
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
			setState(184);
			match(T__31);
			setState(185);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(186);
				match(T__20);
				setState(187);
				match(ID);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__32);
			setState(194);
			type();
			setState(195);
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
			setState(197);
			match(T__33);
			setState(198);
			match(ID);
			setState(199);
			match(T__0);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(200);
				param();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(203);
				match(T__20);
				setState(204);
				param();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__1);
			setState(211);
			match(T__32);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case PRIMITIVE_TYPE:
				{
				setState(212);
				type();
				}
				break;
			case T__34:
				{
				setState(213);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			match(T__29);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(217);
				varDefinition();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12645277106562L) != 0)) {
				{
				{
				setState(223);
				statement();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
			setState(231);
			match(ID);
			setState(232);
			match(T__32);
			setState(233);
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
		"\u0004\u0001+\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001\f\u0001;\t"+
		"\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001]\b\u0001\n\u0001\f\u0001`\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002f\b"+
		"\u0002\n\u0002\f\u0002i\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002q\b\u0002\n\u0002\f\u0002t\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0092"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0096\b\u0002\n\u0002\f\u0002"+
		"\u0099\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009d\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a2\b\u0003\n\u0003\f\u0003"+
		"\u00a5\t\u0003\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u00b1\b\u0004\u000b\u0004\f\u0004\u00b2\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00b7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00bd\b\u0005\n\u0005\f\u0005\u00c0\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ca\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ce"+
		"\b\u0006\n\u0006\f\u0006\u00d1\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00d7\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00db\b\u0006\n\u0006\f\u0006\u00de\t\u0006\u0001\u0006\u0005\u0006\u00e1"+
		"\b\u0006\n\u0006\f\u0006\u00e4\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0001\u0002\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0004\u0001\u0000\t\u000b\u0002\u0000"+
		"\u0007\u0007\f\f\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014\u0108\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004\u009c"+
		"\u0001\u0000\u0000\u0000\u0006\u00a7\u0001\u0000\u0000\u0000\b\u00b6\u0001"+
		"\u0000\u0000\u0000\n\u00b8\u0001\u0000\u0000\u0000\f\u00c5\u0001\u0000"+
		"\u0000\u0000\u000e\u00e7\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002"+
		"\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0006\u0001\uffff\uffff\u0000\u0014\u0015\u0005"+
		"(\u0000\u0000\u0015>\u0006\u0001\uffff\uffff\u0000\u0016\u0017\u0005\'"+
		"\u0000\u0000\u0017>\u0006\u0001\uffff\uffff\u0000\u0018\u0019\u0005+\u0000"+
		"\u0000\u0019>\u0006\u0001\uffff\uffff\u0000\u001a\u001b\u0005)\u0000\u0000"+
		"\u001b>\u0006\u0001\uffff\uffff\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u0002\u0000\u0000"+
		"\u001f \u0006\u0001\uffff\uffff\u0000 >\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0001\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0006\u0000\u0000"+
		"$%\u0003\b\u0004\u0000%&\u0005\u0002\u0000\u0000&\'\u0006\u0001\uffff"+
		"\uffff\u0000\'>\u0001\u0000\u0000\u0000()\u0005\u0007\u0000\u0000)*\u0003"+
		"\u0002\u0001\u0007*+\u0006\u0001\uffff\uffff\u0000+>\u0001\u0000\u0000"+
		"\u0000,-\u0005\b\u0000\u0000-.\u0003\u0002\u0001\u0006./\u0006\u0001\uffff"+
		"\uffff\u0000/>\u0001\u0000\u0000\u000001\u0005+\u0000\u000013\u0005\u0001"+
		"\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000049\u0001\u0000\u0000\u000056\u0005\u0015\u0000\u0000"+
		"68\u0003\u0002\u0001\u000075\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0005\u0002\u0000\u0000=\u0013"+
		"\u0001\u0000\u0000\u0000=\u0016\u0001\u0000\u0000\u0000=\u0018\u0001\u0000"+
		"\u0000\u0000=\u001a\u0001\u0000\u0000\u0000=\u001c\u0001\u0000\u0000\u0000"+
		"=!\u0001\u0000\u0000\u0000=(\u0001\u0000\u0000\u0000=,\u0001\u0000\u0000"+
		"\u0000=0\u0001\u0000\u0000\u0000>^\u0001\u0000\u0000\u0000?@\n\t\u0000"+
		"\u0000@A\u0005\u0005\u0000\u0000AB\u0003\u0002\u0001\nBC\u0006\u0001\uffff"+
		"\uffff\u0000C]\u0001\u0000\u0000\u0000DE\n\u0005\u0000\u0000EF\u0007\u0000"+
		"\u0000\u0000FG\u0003\u0002\u0001\u0006GH\u0006\u0001\uffff\uffff\u0000"+
		"H]\u0001\u0000\u0000\u0000IJ\n\u0004\u0000\u0000JK\u0007\u0001\u0000\u0000"+
		"KL\u0003\u0002\u0001\u0005LM\u0006\u0001\uffff\uffff\u0000M]\u0001\u0000"+
		"\u0000\u0000NO\n\u0003\u0000\u0000OP\u0007\u0002\u0000\u0000PQ\u0003\u0002"+
		"\u0001\u0004QR\u0006\u0001\uffff\uffff\u0000R]\u0001\u0000\u0000\u0000"+
		"ST\n\u0002\u0000\u0000TU\u0007\u0003\u0000\u0000U]\u0003\u0002\u0001\u0003"+
		"VW\n\n\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0003\u0002\u0001\u0000"+
		"YZ\u0005\u0004\u0000\u0000Z[\u0006\u0001\uffff\uffff\u0000[]\u0001\u0000"+
		"\u0000\u0000\\?\u0001\u0000\u0000\u0000\\D\u0001\u0000\u0000\u0000\\I"+
		"\u0001\u0000\u0000\u0000\\N\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000"+
		"\u0000\\V\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0005\u0016\u0000\u0000bg\u0003\u0002\u0001"+
		"\u0000cd\u0005\u0015\u0000\u0000df\u0003\u0002\u0001\u0000ec\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jk\u0005\u0017\u0000\u0000k\u009d\u0001\u0000\u0000\u0000lm\u0005\u0018"+
		"\u0000\u0000mr\u0003\u0002\u0001\u0000no\u0005\u0015\u0000\u0000oq\u0003"+
		"\u0002\u0001\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0017\u0000\u0000v\u009d\u0001"+
		"\u0000\u0000\u0000wx\u0003\u0002\u0001\u0000xy\u0005\u0019\u0000\u0000"+
		"yz\u0003\u0002\u0001\u0000z{\u0005\u0017\u0000\u0000{\u009d\u0001\u0000"+
		"\u0000\u0000|}\u0005\u001a\u0000\u0000}~\u0005\u0001\u0000\u0000~\u007f"+
		"\u0003\u0002\u0001\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081"+
		"\u0003\u0006\u0003\u0000\u0081\u0082\u0005\u001b\u0000\u0000\u0082\u0083"+
		"\u0003\u0006\u0003\u0000\u0083\u009d\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u001c\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000\u0086\u0087"+
		"\u0003\u0002\u0001\u0000\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u0089"+
		"\u0003\u0006\u0003\u0000\u0089\u009d\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u001d\u0000\u0000\u008b\u008c\u0003\u0002\u0001\u0000\u008c\u008d"+
		"\u0005\u0017\u0000\u0000\u008d\u009d\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005+\u0000\u0000\u008f\u0091\u0005\u0001\u0000\u0000\u0090\u0092\u0003"+
		"\u0002\u0001\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0097\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0015\u0000\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0002\u0000\u0000\u009b\u009d\u0005\u0017\u0000\u0000\u009ca\u0001\u0000"+
		"\u0000\u0000\u009cl\u0001\u0000\u0000\u0000\u009cw\u0001\u0000\u0000\u0000"+
		"\u009c|\u0001\u0000\u0000\u0000\u009c\u0084\u0001\u0000\u0000\u0000\u009c"+
		"\u008a\u0001\u0000\u0000\u0000\u009c\u008e\u0001\u0000\u0000\u0000\u009d"+
		"\u0005\u0001\u0000\u0000\u0000\u009e\u00a8\u0003\u0004\u0002\u0000\u009f"+
		"\u00a3\u0005\u001e\u0000\u0000\u00a0\u00a2\u0003\u0004\u0002\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0005\u001f\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7"+
		"\u009f\u0001\u0000\u0000\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9"+
		"\u00b7\u0005*\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac"+
		"\u0005(\u0000\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad\u00b7\u0003"+
		"\b\u0004\u0000\u00ae\u00b0\u0005\u0003\u0000\u0000\u00af\u00b1\u0003\n"+
		"\u0005\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0004"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b6\u00aa\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b7\t\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005 \u0000"+
		"\u0000\u00b9\u00be\u0005+\u0000\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000"+
		"\u00bb\u00bd\u0005+\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3"+
		"\u0003\b\u0004\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u000b\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\"\u0000\u0000\u00c6\u00c7\u0005+"+
		"\u0000\u0000\u00c7\u00c9\u0005\u0001\u0000\u0000\u00c8\u00ca\u0003\u000e"+
		"\u0007\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cf\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0015"+
		"\u0000\u0000\u00cc\u00ce\u0003\u000e\u0007\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0002"+
		"\u0000\u0000\u00d3\u00d6\u0005!\u0000\u0000\u00d4\u00d7\u0003\b\u0004"+
		"\u0000\u00d5\u00d7\u0005#\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dc\u0005\u001e\u0000\u0000\u00d9\u00db\u0003\n\u0005\u0000\u00da"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e2\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0003\u0004\u0002\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001f\u0000\u0000\u00e6"+
		"\r\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8\u00e9"+
		"\u0005!\u0000\u0000\u00e9\u00ea\u0003\b\u0004\u0000\u00ea\u000f\u0001"+
		"\u0000\u0000\u0000\u001439=\\^gr\u0091\u0097\u009c\u00a3\u00a7\u00b2\u00b6"+
		"\u00be\u00c9\u00cf\u00d6\u00dc\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}