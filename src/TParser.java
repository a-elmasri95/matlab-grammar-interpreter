// $ANTLR 3.2 Sep 23, 2009 12:02:23 T.g 2022-01-07 21:34:17
    //note that the MathObject class files of assignment 1 are in the assignment3 Folder
import java.util.HashMap;
import java.util.Vector;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map; 

public class TParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "Digit", "NEWLINE", "Letter", "WS", "CR", "LF", "'='", "':'", "'['", "';'", "']'", "'('", "','", "')'", "'size'", "'disp'", "'+'", "'-'", "'*'", "'/'"
    };
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


        public TParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TParser.tokenNames; }
    public String getGrammarFileName() { return "T.g"; }


    int variableCount = 0;
    Map memory  =  new HashMap<String,MathObject>();

    //method for assigning MathObject to a String
    public void AssignVar(String var,MathObject b)
    {
      memory.put(var,b);
    }

    //method that returns value of Variable
    public MathObject retVarVal(String var)
    { 
      return (MathObject)(memory.get(var));
    }




    // $ANTLR start "prog"
    // T.g:34:1: prog : ( stat )+ EOF ;
    public final void prog() throws RecognitionException {
        try {
            // T.g:34:6: ( ( stat )+ EOF )
            // T.g:34:10: ( stat )+ EOF
            {
            // T.g:34:10: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // T.g:0:0: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog44);
            	    stat();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_prog47); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "stat"
    // T.g:36:1: stat : ( assignment | sequenceassignment | soloexpr | matrixassignment | function );
    public final void stat() throws RecognitionException {
        try {
            // T.g:36:6: ( assignment | sequenceassignment | soloexpr | matrixassignment | function )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_T()) ) {
                    alt2=1;
                }
                else if ( (synpred3_T()) ) {
                    alt2=2;
                }
                else if ( (synpred4_T()) ) {
                    alt2=3;
                }
                else if ( (synpred5_T()) ) {
                    alt2=4;
                }
                else if ( (true) ) {
                    alt2=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                alt2=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // T.g:36:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_stat57);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // T.g:37:5: sequenceassignment
                    {
                    pushFollow(FOLLOW_sequenceassignment_in_stat63);
                    sequenceassignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // T.g:38:5: soloexpr
                    {
                    pushFollow(FOLLOW_soloexpr_in_stat70);
                    soloexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // T.g:39:5: matrixassignment
                    {
                    pushFollow(FOLLOW_matrixassignment_in_stat76);
                    matrixassignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // T.g:40:5: function
                    {
                    pushFollow(FOLLOW_function_in_stat82);
                    function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stat"


    // $ANTLR start "assignment"
    // T.g:43:1: assignment : ex1= ID '=' ex2= expr assignmenttail ;
    public final void assignment() throws RecognitionException {
        Token ex1=null;
        double ex2 = 0.0;


        try {
            // T.g:43:11: (ex1= ID '=' ex2= expr assignmenttail )
            // T.g:43:14: ex1= ID '=' ex2= expr assignmenttail
            {
            ex1=(Token)match(input,ID,FOLLOW_ID_in_assignment94); if (state.failed) return ;
            match(input,11,FOLLOW_11_in_assignment96); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_assignment100);
            ex2=expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_assignmenttail_in_assignment102);
            assignmenttail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              				System.out.println((ex1!=null?ex1.getText():null) + "=\n\t" + ex2); //just testing 
              				if (!(memory.containsKey((ex1!=null?ex1.getText():null))))
              				{	
              					MathScalar sc = new MathScalar(ex2); //USING MATHSCALAR since assignment is for  scalars
              					AssignVar((ex1!=null?ex1.getText():null),sc); 
              					variableCount++;
              				}			
              				//otherwise update key's object
              				//else{//not needed for input}
              			
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "sequenceassignment"
    // T.g:58:1: sequenceassignment : ex1= ID '=' ex2= expr ':' ex3= expr assignmenttail ;
    public final void sequenceassignment() throws RecognitionException {
        Token ex1=null;
        double ex2 = 0.0;

        double ex3 = 0.0;


        try {
            // T.g:58:19: (ex1= ID '=' ex2= expr ':' ex3= expr assignmenttail )
            // T.g:58:21: ex1= ID '=' ex2= expr ':' ex3= expr assignmenttail
            {
            ex1=(Token)match(input,ID,FOLLOW_ID_in_sequenceassignment121); if (state.failed) return ;
            match(input,11,FOLLOW_11_in_sequenceassignment123); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_sequenceassignment127);
            ex2=expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,12,FOLLOW_12_in_sequenceassignment129); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_sequenceassignment133);
            ex3=expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_assignmenttail_in_sequenceassignment135);
            assignmenttail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              		//	  System.out.print((ex1!=null?ex1.getText():null) + "=\n\t");
              		//	  for(double i=ex2;i<=ex3;i++)
              		//	  {
              		//	    System.out.print(i+"\t");
              		//	  }
              			  MathScalar m1 = new MathScalar(ex2);
              			  MathScalar m2 = new MathScalar(ex3);
              			  MathMatrix mx = MathOp.createSequence(m1,m2);
              			  AssignVar((ex1!=null?ex1.getText():null),mx);
              			  variableCount++;
              			
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sequenceassignment"


    // $ANTLR start "matrixassignment"
    // T.g:73:1: matrixassignment : (idd= ID '=' '[' d1= Digit d2= Digit ';' d3= Digit d4= Digit ']' NEWLINE | i1= ID '=' '[' b1= Digit b2= Digit ';' b3= Digit b4= Digit ']' ';' NEWLINE );
    public final void matrixassignment() throws RecognitionException {
        Token idd=null;
        Token d1=null;
        Token d2=null;
        Token d3=null;
        Token d4=null;
        Token i1=null;
        Token b1=null;
        Token b2=null;
        Token b3=null;
        Token b4=null;

        try {
            // T.g:73:17: (idd= ID '=' '[' d1= Digit d2= Digit ';' d3= Digit d4= Digit ']' NEWLINE | i1= ID '=' '[' b1= Digit b2= Digit ';' b3= Digit b4= Digit ']' ';' NEWLINE )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // T.g:73:19: idd= ID '=' '[' d1= Digit d2= Digit ';' d3= Digit d4= Digit ']' NEWLINE
                    {
                    idd=(Token)match(input,ID,FOLLOW_ID_in_matrixassignment154); if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_matrixassignment156); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_matrixassignment158); if (state.failed) return ;
                    d1=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment162); if (state.failed) return ;
                    d2=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment166); if (state.failed) return ;
                    match(input,14,FOLLOW_14_in_matrixassignment168); if (state.failed) return ;
                    d3=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment172); if (state.failed) return ;
                    d4=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment176); if (state.failed) return ;
                    match(input,15,FOLLOW_15_in_matrixassignment178); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_matrixassignment180); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       
                      				if (!(memory.containsKey((idd!=null?idd.getText():null))))
                      				{	
                      					double D1 = new Double((d1!=null?d1.getText():null)).doubleValue();
                      					double D2 = new Double((d2!=null?d2.getText():null)).doubleValue();
                      					double D3 = new Double((d3!=null?d3.getText():null)).doubleValue();
                      					double D4 = new Double((d4!=null?d4.getText():null)).doubleValue();
                      					double[][] arr = {{D1,D2},{D3,D4}};
                      					MathMatrix mxx = new MathMatrix(arr);
                      					AssignVar((idd!=null?idd.getText():null),mxx); 
                      					variableCount++;
                      					System.out.print((idd!=null?idd.getText():null)+"=");
                      				  	for(int i=0;i<mxx.getMatrix().length;i++)
                      					  {
                      					      System.out.print("\n\t");
                      					      for(int j=0;j<mxx.getMatrix()[0].length;j++)
                      					    {
                      					       System.out.print(mxx.getMatrix()[j][i] +" ");
                      					    }
                      					  }
                      					System.out.println();
                      				}				  
                      			
                    }

                    }
                    break;
                case 2 :
                    // T.g:98:5: i1= ID '=' '[' b1= Digit b2= Digit ';' b3= Digit b4= Digit ']' ';' NEWLINE
                    {
                    i1=(Token)match(input,ID,FOLLOW_ID_in_matrixassignment194); if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_matrixassignment196); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_matrixassignment198); if (state.failed) return ;
                    b1=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment202); if (state.failed) return ;
                    b2=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment206); if (state.failed) return ;
                    match(input,14,FOLLOW_14_in_matrixassignment208); if (state.failed) return ;
                    b3=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment212); if (state.failed) return ;
                    b4=(Token)match(input,Digit,FOLLOW_Digit_in_matrixassignment216); if (state.failed) return ;
                    match(input,15,FOLLOW_15_in_matrixassignment218); if (state.failed) return ;
                    match(input,14,FOLLOW_14_in_matrixassignment220); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_matrixassignment222); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      					double B1 = new Double((b1!=null?b1.getText():null)).doubleValue();
                      					double B2 = new Double((b2!=null?b2.getText():null)).doubleValue();
                      					double B3 = new Double((b3!=null?b3.getText():null)).doubleValue();
                      					double B4 = new Double((b4!=null?b4.getText():null)).doubleValue();
                      					double[][] arrr = {{B1,B2},{B3,B4}};
                      					MathMatrix mxx = new MathMatrix(arrr);
                      					AssignVar((i1!=null?i1.getText():null),mxx); 
                      					variableCount++;			  
                      			
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "matrixassignment"


    // $ANTLR start "soloexpr"
    // T.g:111:1: soloexpr : ( ID NEWLINE | ID ';' NEWLINE );
    public final void soloexpr() throws RecognitionException {
        Token ID1=null;

        try {
            // T.g:111:9: ( ID NEWLINE | ID ';' NEWLINE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==NEWLINE) ) {
                    alt4=1;
                }
                else if ( (LA4_1==14) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // T.g:111:28: ID NEWLINE
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_soloexpr238); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_soloexpr240); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			  if(memory.get((ID1!=null?ID1.getText():null)) instanceof MathMatrix)
                      			{
                      			  MathMatrix m = (MathMatrix)memory.get((ID1!=null?ID1.getText():null));
                      			  System.out.print("Ans "+"=\n\t");
                      			  for(int i=0;i<m.getMatrix().length;i++)
                      			  {
                      			      for(int j=0;j<m.getMatrix()[0].length;j++)
                      			    {
                      			       System.out.print(m.getMatrix()[j][i] +"\t");
                      			    }
                      			  }
                      			  System.out.println("\n");
                      			}
                      			
                    }

                    }
                    break;
                case 2 :
                    // T.g:127:5: ID ';' NEWLINE
                    {
                    match(input,ID,FOLLOW_ID_in_soloexpr252); if (state.failed) return ;
                    match(input,14,FOLLOW_14_in_soloexpr254); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_soloexpr256); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "soloexpr"


    // $ANTLR start "function"
    // T.g:130:1: function : (idf= ID '(' d1= Digit ',' d2= Digit ')' assignmenttail | 'size' '(' idff= ID ',' dg= Digit ')' assignmenttail | 'size' '(' idfff= ID ')' assignmenttail | 'disp' '(' idffff= ID ')' assignmenttail );
    public final void function() throws RecognitionException {
        Token idf=null;
        Token d1=null;
        Token d2=null;
        Token idff=null;
        Token dg=null;
        Token idfff=null;
        Token idffff=null;

        try {
            // T.g:130:9: (idf= ID '(' d1= Digit ',' d2= Digit ')' assignmenttail | 'size' '(' idff= ID ',' dg= Digit ')' assignmenttail | 'size' '(' idfff= ID ')' assignmenttail | 'disp' '(' idffff= ID ')' assignmenttail )
            int alt5=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==16) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==ID) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==17) ) {
                            alt5=2;
                        }
                        else if ( (LA5_5==18) ) {
                            alt5=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // T.g:131:4: idf= ID '(' d1= Digit ',' d2= Digit ')' assignmenttail
                    {
                    idf=(Token)match(input,ID,FOLLOW_ID_in_function274); if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_function276); if (state.failed) return ;
                    d1=(Token)match(input,Digit,FOLLOW_Digit_in_function280); if (state.failed) return ;
                    match(input,17,FOLLOW_17_in_function282); if (state.failed) return ;
                    d2=(Token)match(input,Digit,FOLLOW_Digit_in_function286); if (state.failed) return ;
                    match(input,18,FOLLOW_18_in_function288); if (state.failed) return ;
                    pushFollow(FOLLOW_assignmenttail_in_function290);
                    assignmenttail();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			  if(memory.containsKey((idf!=null?idf.getText():null)))
                      			    {
                      			      if(retVarVal((idf!=null?idf.getText():null)) instanceof MathMatrix)
                      				{
                      				    int D1 = new Integer((d1!=null?d1.getText():null)).intValue();
                      				    int D2 = new Integer((d2!=null?d2.getText():null)).intValue();
                      				    MathMatrix mxm = (MathMatrix)retVarVal((idf!=null?idf.getText():null));
                      				    System.out.print("Ans "+"=\n\t" + mxm.getMatrix()[D1][D2] +"\n");
                      				}
                      			    }
                      			
                    }

                    }
                    break;
                case 2 :
                    // T.g:145:5: 'size' '(' idff= ID ',' dg= Digit ')' assignmenttail
                    {
                    match(input,19,FOLLOW_19_in_function303); if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_function305); if (state.failed) return ;
                    idff=(Token)match(input,ID,FOLLOW_ID_in_function309); if (state.failed) return ;
                    match(input,17,FOLLOW_17_in_function311); if (state.failed) return ;
                    dg=(Token)match(input,Digit,FOLLOW_Digit_in_function315); if (state.failed) return ;
                    match(input,18,FOLLOW_18_in_function317); if (state.failed) return ;
                    pushFollow(FOLLOW_assignmenttail_in_function319);
                    assignmenttail();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			  if(memory.containsKey((idff!=null?idff.getText():null)))
                      			    {
                      			        if(memory.get((idff!=null?idff.getText():null)) instanceof MathMatrix)
                      				{
                      				    int D1 = new Integer((dg!=null?dg.getText():null)).intValue();
                      				    MathMatrix mxm = (MathMatrix)memory.get((idff!=null?idff.getText():null));
                      				    if(mxm!=null)
                      				    System.out.println("Ans "+"=\n\t" + (double)mxm.getMatrix()[D1-1].length +"\n");
                      				}
                      			    }
                      			
                    }

                    }
                    break;
                case 3 :
                    // T.g:159:5: 'size' '(' idfff= ID ')' assignmenttail
                    {
                    match(input,19,FOLLOW_19_in_function332); if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_function334); if (state.failed) return ;
                    idfff=(Token)match(input,ID,FOLLOW_ID_in_function338); if (state.failed) return ;
                    match(input,18,FOLLOW_18_in_function340); if (state.failed) return ;
                    pushFollow(FOLLOW_assignmenttail_in_function342);
                    assignmenttail();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			  if(memory.containsKey((idfff!=null?idfff.getText():null)))
                      			    {
                      			        if(memory.get((idfff!=null?idfff.getText():null)) instanceof MathMatrix)
                      				{
                      				    MathMatrix mxmx = (MathMatrix)memory.get((idfff!=null?idfff.getText():null));
                      				    if(mxmx!=null)
                      				    System.out.println("Ans "+"=\n\t" + (double)mxmx.rowsize +"  " + (double)mxmx.columnsize + "\n");
                      				}
                      			    }
                      			
                    }

                    }
                    break;
                case 4 :
                    // T.g:172:5: 'disp' '(' idffff= ID ')' assignmenttail
                    {
                    match(input,20,FOLLOW_20_in_function354); if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_function356); if (state.failed) return ;
                    idffff=(Token)match(input,ID,FOLLOW_ID_in_function360); if (state.failed) return ;
                    match(input,18,FOLLOW_18_in_function362); if (state.failed) return ;
                    pushFollow(FOLLOW_assignmenttail_in_function364);
                    assignmenttail();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			  if(memory.containsKey((idffff!=null?idffff.getText():null)))
                      			    {
                      			        if(memory.get((idffff!=null?idffff.getText():null)) instanceof MathMatrix)
                      				{
                      				    MathMatrix mxmxm = (MathMatrix)memory.get((idffff!=null?idffff.getText():null));
                      				    if(mxmxm!=null)
                      				    System.out.println((idffff!=null?idffff.getText():null) + "=\n" + mxmxm);
                      				}
                      			    }
                      			
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "assignmenttail"
    // T.g:187:1: assignmenttail : ( NEWLINE | ';' NEWLINE );
    public final void assignmenttail() throws RecognitionException {
        try {
            // T.g:187:15: ( NEWLINE | ';' NEWLINE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NEWLINE) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // T.g:187:18: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_assignmenttail381); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // T.g:188:5: ';' NEWLINE
                    {
                    match(input,14,FOLLOW_14_in_assignmenttail388); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_assignmenttail390); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignmenttail"


    // $ANTLR start "expr"
    // T.g:194:1: expr returns [double value] : (t1= term '+' e1= expr | t2= term '-' e2= expr | t3= term );
    public final double expr() throws RecognitionException {
        double value = 0.0;

        double t1 = 0.0;

        double e1 = 0.0;

        double t2 = 0.0;

        double e2 = 0.0;

        double t3 = 0.0;


        try {
            // T.g:194:28: (t1= term '+' e1= expr | t2= term '-' e2= expr | t3= term )
            int alt7=3;
            switch ( input.LA(1) ) {
            case Digit:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred12_T()) ) {
                    alt7=1;
                }
                else if ( (synpred13_T()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred12_T()) ) {
                    alt7=1;
                }
                else if ( (synpred13_T()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred12_T()) ) {
                    alt7=1;
                }
                else if ( (synpred13_T()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA7_4 = input.LA(2);

                if ( (synpred12_T()) ) {
                    alt7=1;
                }
                else if ( (synpred13_T()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // T.g:194:31: t1= term '+' e1= expr
                    {
                    pushFollow(FOLLOW_term_in_expr412);
                    t1=term();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,21,FOLLOW_21_in_expr414); if (state.failed) return value;
                    pushFollow(FOLLOW_expr_in_expr418);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = t1 + e1;
                      				
                    }

                    }
                    break;
                case 2 :
                    // T.g:199:6: t2= term '-' e2= expr
                    {
                    pushFollow(FOLLOW_term_in_expr434);
                    t2=term();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,22,FOLLOW_22_in_expr436); if (state.failed) return value;
                    pushFollow(FOLLOW_expr_in_expr440);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = t2 - e2;
                      				
                    }

                    }
                    break;
                case 3 :
                    // T.g:203:6: t3= term
                    {
                    pushFollow(FOLLOW_term_in_expr455);
                    t3=term();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = t3;
                      				
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expr"


    // $ANTLR start "term"
    // T.g:212:1: term returns [double value] : (a1= atom '*' t1= term | a2= atom '/' t2= term | atom );
    public final double term() throws RecognitionException {
        double value = 0.0;

        double a1 = 0.0;

        double t1 = 0.0;

        double a2 = 0.0;

        double t2 = 0.0;

        double atom2 = 0.0;


        try {
            // T.g:212:28: (a1= atom '*' t1= term | a2= atom '/' t2= term | atom )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Digit:
                {
                int LA8_1 = input.LA(2);

                if ( (synpred14_T()) ) {
                    alt8=1;
                }
                else if ( (synpred15_T()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred14_T()) ) {
                    alt8=1;
                }
                else if ( (synpred15_T()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred14_T()) ) {
                    alt8=1;
                }
                else if ( (synpred15_T()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred14_T()) ) {
                    alt8=1;
                }
                else if ( (synpred15_T()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // T.g:212:30: a1= atom '*' t1= term
                    {
                    pushFollow(FOLLOW_atom_in_term479);
                    a1=atom();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,23,FOLLOW_23_in_term481); if (state.failed) return value;
                    pushFollow(FOLLOW_term_in_term485);
                    t1=term();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = a1 * t1;
                      				
                    }

                    }
                    break;
                case 2 :
                    // T.g:217:7: a2= atom '/' t2= term
                    {
                    pushFollow(FOLLOW_atom_in_term503);
                    a2=atom();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,24,FOLLOW_24_in_term505); if (state.failed) return value;
                    pushFollow(FOLLOW_term_in_term509);
                    t2=term();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = a1 / t2;
                      				
                    }

                    }
                    break;
                case 3 :
                    // T.g:222:6: atom
                    {
                    pushFollow(FOLLOW_atom_in_term523);
                    atom2=atom();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = atom2;
                      				
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "term"


    // $ANTLR start "atom"
    // T.g:230:1: atom returns [double value] : (d= Digit | d1= Digit d2= Digit | ID | '(' e1= expr ')' | ';' );
    public final double atom() throws RecognitionException {
        double value = 0.0;

        Token d=null;
        Token d1=null;
        Token d2=null;
        double e1 = 0.0;


        try {
            // T.g:230:28: (d= Digit | d1= Digit d2= Digit | ID | '(' e1= expr ')' | ';' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case Digit:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==Digit) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==NEWLINE||LA9_1==12||LA9_1==14||LA9_1==18||(LA9_1>=21 && LA9_1<=24)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            case 14:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // T.g:230:30: d= Digit
                    {
                    d=(Token)match(input,Digit,FOLLOW_Digit_in_atom547); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = new Double((d!=null?d.getText():null)).doubleValue();
                    }

                    }
                    break;
                case 2 :
                    // T.g:232:6: d1= Digit d2= Digit
                    {
                    d1=(Token)match(input,Digit,FOLLOW_Digit_in_atom566); if (state.failed) return value;
                    d2=(Token)match(input,Digit,FOLLOW_Digit_in_atom570); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = new Double((d1!=null?d1.getText():null)+(d2!=null?d2.getText():null)).doubleValue();
                      				
                    }

                    }
                    break;
                case 3 :
                    // T.g:236:6: ID
                    {
                    match(input,ID,FOLLOW_ID_in_atom583); if (state.failed) return value;

                    }
                    break;
                case 4 :
                    // T.g:237:6: '(' e1= expr ')'
                    {
                    match(input,16,FOLLOW_16_in_atom591); if (state.failed) return value;
                    pushFollow(FOLLOW_expr_in_atom595);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,18,FOLLOW_18_in_atom597); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				  value = e1;
                      				
                    }

                    }
                    break;
                case 5 :
                    // T.g:241:6: ';'
                    {
                    match(input,14,FOLLOW_14_in_atom610); if (state.failed) return value;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred2_T
    public final void synpred2_T_fragment() throws RecognitionException {   
        // T.g:36:9: ( assignment )
        // T.g:36:9: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred2_T57);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_T

    // $ANTLR start synpred3_T
    public final void synpred3_T_fragment() throws RecognitionException {   
        // T.g:37:5: ( sequenceassignment )
        // T.g:37:5: sequenceassignment
        {
        pushFollow(FOLLOW_sequenceassignment_in_synpred3_T63);
        sequenceassignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_T

    // $ANTLR start synpred4_T
    public final void synpred4_T_fragment() throws RecognitionException {   
        // T.g:38:5: ( soloexpr )
        // T.g:38:5: soloexpr
        {
        pushFollow(FOLLOW_soloexpr_in_synpred4_T70);
        soloexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_T

    // $ANTLR start synpred5_T
    public final void synpred5_T_fragment() throws RecognitionException {   
        // T.g:39:5: ( matrixassignment )
        // T.g:39:5: matrixassignment
        {
        pushFollow(FOLLOW_matrixassignment_in_synpred5_T76);
        matrixassignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_T

    // $ANTLR start synpred12_T
    public final void synpred12_T_fragment() throws RecognitionException {   
        double t1 = 0.0;

        double e1 = 0.0;


        // T.g:194:31: (t1= term '+' e1= expr )
        // T.g:194:31: t1= term '+' e1= expr
        {
        pushFollow(FOLLOW_term_in_synpred12_T412);
        t1=term();

        state._fsp--;
        if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred12_T414); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred12_T418);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_T

    // $ANTLR start synpred13_T
    public final void synpred13_T_fragment() throws RecognitionException {   
        double t2 = 0.0;

        double e2 = 0.0;


        // T.g:199:6: (t2= term '-' e2= expr )
        // T.g:199:6: t2= term '-' e2= expr
        {
        pushFollow(FOLLOW_term_in_synpred13_T434);
        t2=term();

        state._fsp--;
        if (state.failed) return ;
        match(input,22,FOLLOW_22_in_synpred13_T436); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred13_T440);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_T

    // $ANTLR start synpred14_T
    public final void synpred14_T_fragment() throws RecognitionException {   
        double a1 = 0.0;

        double t1 = 0.0;


        // T.g:212:30: (a1= atom '*' t1= term )
        // T.g:212:30: a1= atom '*' t1= term
        {
        pushFollow(FOLLOW_atom_in_synpred14_T479);
        a1=atom();

        state._fsp--;
        if (state.failed) return ;
        match(input,23,FOLLOW_23_in_synpred14_T481); if (state.failed) return ;
        pushFollow(FOLLOW_term_in_synpred14_T485);
        t1=term();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_T

    // $ANTLR start synpred15_T
    public final void synpred15_T_fragment() throws RecognitionException {   
        double a2 = 0.0;

        double t2 = 0.0;


        // T.g:217:7: (a2= atom '/' t2= term )
        // T.g:217:7: a2= atom '/' t2= term
        {
        pushFollow(FOLLOW_atom_in_synpred15_T503);
        a2=atom();

        state._fsp--;
        if (state.failed) return ;
        match(input,24,FOLLOW_24_in_synpred15_T505); if (state.failed) return ;
        pushFollow(FOLLOW_term_in_synpred15_T509);
        t2=term();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_T

    // Delegated rules

    public final boolean synpred15_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_T() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_T_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\4\1\13\1\15\2\5\1\16\2\5\1\17\1\6\2\uffff";
    static final String DFA3_maxS =
        "\1\4\1\13\1\15\2\5\1\16\2\5\1\17\1\16\2\uffff";
    static final String DFA3_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\14\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\7\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "73:1: matrixassignment : (idd= ID '=' '[' d1= Digit d2= Digit ';' d3= Digit d4= Digit ']' NEWLINE | i1= ID '=' '[' b1= Digit b2= Digit ';' b3= Digit b4= Digit ']' ';' NEWLINE );";
        }
    }
 

    public static final BitSet FOLLOW_stat_in_prog44 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_EOF_in_prog47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceassignment_in_stat63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_soloexpr_in_stat70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matrixassignment_in_stat76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_stat82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment94 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assignment96 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_assignment100 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_assignment102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_sequenceassignment121 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sequenceassignment123 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_sequenceassignment127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sequenceassignment129 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_sequenceassignment133 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_sequenceassignment135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_matrixassignment154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_matrixassignment156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_matrixassignment158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment166 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_matrixassignment168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_matrixassignment178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_matrixassignment180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_matrixassignment194 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_matrixassignment196 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_matrixassignment198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_matrixassignment208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_matrixassignment216 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_matrixassignment218 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_matrixassignment220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_matrixassignment222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_soloexpr238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_soloexpr240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_soloexpr252 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_soloexpr254 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_soloexpr256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function274 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_function280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_function286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function288 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_function290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_function303 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_function315 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function317 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_function319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_function332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function338 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function340 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_function342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_function354 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function360 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function362 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_assignmenttail_in_function364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_assignmenttail381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_assignmenttail388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_assignmenttail390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expr414 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_expr418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr434 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_expr436 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_expr440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term479 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_term481 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_term_in_term485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term503 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_term505 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_term_in_term509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digit_in_atom547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digit_in_atom566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Digit_in_atom570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom591 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_atom595 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atom597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_atom610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred2_T57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceassignment_in_synpred3_T63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_soloexpr_in_synpred4_T70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matrixassignment_in_synpred5_T76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_synpred12_T412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred12_T414 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_synpred12_T418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_synpred13_T434 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred13_T436 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_expr_in_synpred13_T440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred14_T479 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred14_T481 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_term_in_synpred14_T485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred15_T503 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred15_T505 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_term_in_synpred15_T509 = new BitSet(new long[]{0x0000000000000002L});

}