// Generated from .\cdd.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cddParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, K_FLOAT=21, K_INT=22, K_VOID=23, K_CHAR=24, 
		K_ARRAY=25, K_STRING=26, ID=27, INT=28, FLOAT=29, COMMENTS=30, CHAR_CONST=31, 
		STRING=32, SL_COMMENT=33, WS=34;
	public static final int
		RULE_file = 0, RULE_varDecl = 1, RULE_functionDecl = 2, RULE_formalParameters = 3, 
		RULE_formalParameter = 4, RULE_type = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_expr = 8, RULE_exprList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
			"type", "block", "stat", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", 
			"'return'", "'['", "']'", "'-'", "'!'", "'*'", "'+'", "'<'", "'>'", "'<='", 
			"'=='", "'float'", "'int'", "'void'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "K_FLOAT", "K_INT", 
			"K_VOID", "K_CHAR", "K_ARRAY", "K_STRING", "ID", "INT", "FLOAT", "COMMENTS", 
			"CHAR_CONST", "STRING", "SL_COMMENT", "WS"
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
	public String getGrammarFileName() { return "cdd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cddParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(21);
					varDecl();
					}
					break;
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID) | (1L << K_CHAR) | (1L << K_ARRAY) | (1L << K_STRING))) != 0) );
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(cddParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			type();
			setState(27);
			match(ID);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(28);
				match(T__0);
				setState(29);
				expr(0);
				}
			}

			setState(32);
			match(T__1);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(cddParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			type();
			setState(35);
			match(ID);
			setState(36);
			match(T__2);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID) | (1L << K_CHAR) | (1L << K_ARRAY) | (1L << K_STRING))) != 0)) {
				{
				setState(37);
				formalParameters();
				}
			}

			setState(40);
			match(T__3);
			setState(41);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public TerminalNode K_VOID() { return getToken(cddParser.K_VOID, 0); }
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameters);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				formalParameter();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(44);
					match(T__4);
					setState(45);
					formalParameter();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(K_VOID);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(cddParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_ARRAY() { return getToken(cddParser.K_ARRAY, 0); }
		public TerminalNode K_STRING() { return getToken(cddParser.K_STRING, 0); }
		public TerminalNode K_VOID() { return getToken(cddParser.K_VOID, 0); }
		public TerminalNode K_INT() { return getToken(cddParser.K_INT, 0); }
		public TerminalNode K_CHAR() { return getToken(cddParser.K_CHAR, 0); }
		public TerminalNode K_FLOAT() { return getToken(cddParser.K_FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID) | (1L << K_CHAR) | (1L << K_ARRAY) | (1L << K_STRING))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__5);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID) | (1L << K_CHAR) | (1L << K_ARRAY) | (1L << K_STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR_CONST) | (1L << STRING))) != 0)) {
				{
				{
				setState(60);
				stat();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__6);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(T__7);
				setState(71);
				expr(0);
				setState(72);
				stat();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(73);
					match(T__8);
					setState(74);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__9);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR_CONST) | (1L << STRING))) != 0)) {
					{
					setState(78);
					expr(0);
					}
				}

				setState(81);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				expr(0);
				setState(83);
				match(T__0);
				setState(84);
				expr(0);
				setState(85);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				expr(0);
				setState(88);
				match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(cddParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitCall(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitAddSub(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(cddParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitVar(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitParens(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitIndex(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(cddParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitString(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(cddParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitInt(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(cddParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitFloat(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitNot(this);
		}
	}
	public static class RelationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitRelation(this);
		}
	}
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitMult(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitEqual(this);
		}
	}
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR_CONST() { return getToken(cddParser.CHAR_CONST, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitChar(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitNegate(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93);
				match(ID);
				setState(94);
				match(T__2);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR_CONST) | (1L << STRING))) != 0)) {
					{
					setState(95);
					exprList();
					}
				}

				setState(98);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__12);
				setState(100);
				expr(12);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__13);
				setState(102);
				expr(11);
				}
				break;
			case 4:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(CHAR_CONST);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__2);
				setState(109);
				expr(0);
				setState(110);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						match(T__14);
						setState(116);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(T__19);
						setState(125);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(127);
						match(T__10);
						setState(128);
						expr(0);
						setState(129);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cddListener ) ((cddListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			expr(0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(137);
				match(T__4);
				setState(138);
				expr(0);
				}
				}
				setState(143);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0093\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b@\n\b\f\b\16\bC\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\t\3\t\5\tR\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\n\5\nc\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0086\n"+
		"\n\f\n\16\n\u0089\13\n\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091"+
		"\13\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\27\34\4\2\17\17\22"+
		"\22\3\2\23\25\2\u00a5\2\30\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b\66\3\2\2"+
		"\2\n8\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20\\\3\2\2\2\22r\3\2\2\2\24\u008a"+
		"\3\2\2\2\26\31\5\6\4\2\27\31\5\4\3\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3\2\2\2\34\35\5\f\7\2\35 \7"+
		"\35\2\2\36\37\7\3\2\2\37!\5\22\n\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\""+
		"#\7\4\2\2#\5\3\2\2\2$%\5\f\7\2%&\7\35\2\2&(\7\5\2\2\')\5\b\5\2(\'\3\2"+
		"\2\2()\3\2\2\2)*\3\2\2\2*+\7\6\2\2+,\5\16\b\2,\7\3\2\2\2-\62\5\n\6\2."+
		"/\7\7\2\2/\61\5\n\6\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\67\3\2\2\2\64\62\3\2\2\2\65\67\7\31\2\2\66-\3\2\2\2\66\65\3"+
		"\2\2\2\67\t\3\2\2\289\5\f\7\29:\7\35\2\2:\13\3\2\2\2;<\t\2\2\2<\r\3\2"+
		"\2\2=A\7\b\2\2>@\5\20\t\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CA\3\2\2\2DE\7\t\2\2E\17\3\2\2\2F]\5\16\b\2G]\5\4\3\2HI\7\n\2\2"+
		"IJ\5\22\n\2JM\5\20\t\2KL\7\13\2\2LN\5\20\t\2MK\3\2\2\2MN\3\2\2\2N]\3\2"+
		"\2\2OQ\7\f\2\2PR\5\22\n\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2S]\7\4\2\2TU\5"+
		"\22\n\2UV\7\3\2\2VW\5\22\n\2WX\7\4\2\2X]\3\2\2\2YZ\5\22\n\2Z[\7\4\2\2"+
		"[]\3\2\2\2\\F\3\2\2\2\\G\3\2\2\2\\H\3\2\2\2\\O\3\2\2\2\\T\3\2\2\2\\Y\3"+
		"\2\2\2]\21\3\2\2\2^_\b\n\1\2_`\7\35\2\2`b\7\5\2\2ac\5\24\13\2ba\3\2\2"+
		"\2bc\3\2\2\2cd\3\2\2\2ds\7\6\2\2ef\7\17\2\2fs\5\22\n\16gh\7\20\2\2hs\5"+
		"\22\n\ris\7\35\2\2js\7\36\2\2ks\7\37\2\2ls\7!\2\2ms\7\"\2\2no\7\5\2\2"+
		"op\5\22\n\2pq\7\6\2\2qs\3\2\2\2r^\3\2\2\2re\3\2\2\2rg\3\2\2\2ri\3\2\2"+
		"\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\u0087\3\2\2\2tu"+
		"\f\f\2\2uv\7\21\2\2v\u0086\5\22\n\rwx\f\13\2\2xy\t\3\2\2y\u0086\5\22\n"+
		"\fz{\f\n\2\2{|\t\4\2\2|\u0086\5\22\n\13}~\f\t\2\2~\177\7\26\2\2\177\u0086"+
		"\5\22\n\n\u0080\u0081\f\17\2\2\u0081\u0082\7\r\2\2\u0082\u0083\5\22\n"+
		"\2\u0083\u0084\7\16\2\2\u0084\u0086\3\2\2\2\u0085t\3\2\2\2\u0085w\3\2"+
		"\2\2\u0085z\3\2\2\2\u0085}\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008f\5\22\n\2\u008b\u008c\7\7\2\2\u008c\u008e\5\22\n\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\21\30\32 (\62\66AMQ\\br"+
		"\u0085\u0087\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}