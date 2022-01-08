// $ANTLR 3.2 Sep 23, 2009 12:02:23 T.g 2022-01-07 21:34:17

import org.antlr.runtime.*;

public class TLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=4;
    public static final int WS=8;
    public static final int EOF=-1;
    public static final int Digit=5;
    public static final int NEWLINE=6;
    public static final int CR=9;
    public static final int Letter=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int LF=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public TLexer() {;} 
    public TLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "T.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:7:7: ( '=' )
            // T.g:7:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:8:7: ( ':' )
            // T.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:9:7: ( '[' )
            // T.g:9:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:10:7: ( ';' )
            // T.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:11:7: ( ']' )
            // T.g:11:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:12:7: ( '(' )
            // T.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:13:7: ( ',' )
            // T.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:14:7: ( ')' )
            // T.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:15:7: ( 'size' )
            // T.g:15:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:16:7: ( 'disp' )
            // T.g:16:9: 'disp'
            {
            match("disp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:17:7: ( '+' )
            // T.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:18:7: ( '-' )
            // T.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:19:7: ( '*' )
            // T.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:20:7: ( '/' )
            // T.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {


        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:245:26: ( ( Letter )+ ( Digit )* )
            // T.g:245:37: ( Letter )+ ( Digit )*
            {
            // T.g:245:37: ( Letter )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // T.g:245:37: Letter
            	    {
            	    mLetter(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // T.g:245:44: ( Digit )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // T.g:245:45: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            int _type = Letter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:267:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // T.g:267:11: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            int _type = Digit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:271:7: ( ( '0' .. '9' ) )
            // T.g:271:10: ( '0' .. '9' )
            {
            // T.g:271:10: ( '0' .. '9' )
            // T.g:271:11: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:275:6: ( ( ' ' | '\\t' )+ )
            // T.g:275:12: ( ' ' | '\\t' )+
            {
            // T.g:275:12: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // T.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:278:4: ( '\\r' )
            // T.g:278:7: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "LF"
    public final void mLF() throws RecognitionException {
        try {
            int _type = LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:280:4: ( '\\n' )
            // T.g:280:7: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LF"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:282:9: ( ( CR | LF )+ )
            // T.g:282:12: ( CR | LF )+
            {
            // T.g:282:12: ( CR | LF )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // T.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // T.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | Letter | Digit | WS | CR | LF | NEWLINE )
        int alt5=21;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // T.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // T.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // T.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // T.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // T.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // T.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // T.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // T.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // T.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // T.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // T.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // T.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // T.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // T.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // T.g:1:94: ID
                {
                mID(); 

                }
                break;
            case 16 :
                // T.g:1:97: Letter
                {
                mLetter(); 

                }
                break;
            case 17 :
                // T.g:1:104: Digit
                {
                mDigit(); 

                }
                break;
            case 18 :
                // T.g:1:110: WS
                {
                mWS(); 

                }
                break;
            case 19 :
                // T.g:1:113: CR
                {
                mCR(); 

                }
                break;
            case 20 :
                // T.g:1:116: LF
                {
                mLF(); 

                }
                break;
            case 21 :
                // T.g:1:119: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\11\uffff\2\25\7\uffff\1\27\1\31\1\25\1\uffff\1\25\3\uffff\2\25"+
        "\1\36\1\37\2\uffff";
    static final String DFA5_eofS =
        "\40\uffff";
    static final String DFA5_minS =
        "\1\11\10\uffff\2\151\7\uffff\2\12\1\172\1\uffff\1\163\3\uffff\1"+
        "\145\1\160\2\60\2\uffff";
    static final String DFA5_maxS =
        "\1\172\10\uffff\2\151\7\uffff\2\15\1\172\1\uffff\1\163\3\uffff"+
        "\1\145\1\160\2\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\13\1\14\1\15"+
        "\1\16\1\17\1\21\1\22\3\uffff\1\17\1\uffff\1\23\1\25\1\24\4\uffff"+
        "\1\11\1\12";
    static final String DFA5_specialS =
        "\40\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\21\1\23\2\uffff\1\22\22\uffff\1\21\7\uffff\1\6\1\10\1\15"+
            "\1\13\1\7\1\14\1\uffff\1\16\12\20\1\2\1\4\1\uffff\1\1\3\uffff"+
            "\32\17\1\3\1\uffff\1\5\3\uffff\3\17\1\12\16\17\1\11\7\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\1\30",
            "\1\30\2\uffff\1\30",
            "\1\32",
            "",
            "\1\33",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | Letter | Digit | WS | CR | LF | NEWLINE );";
        }
    }
 

}