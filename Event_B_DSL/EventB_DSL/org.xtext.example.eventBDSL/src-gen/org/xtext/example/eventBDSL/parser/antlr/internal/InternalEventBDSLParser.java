package org.xtext.example.eventBDSL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.eventBDSL.services.EventBDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventBDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EVENTB_TYPE_KEYWORD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SYSTEM'", "'SETS'", "';'", "'VARIABLES'", "','", "'INVARIANT'", "'&'", "'INITIALISATION'", "'||'", "'EVENTS'", "'END'", "'//'", "'='", "'{'", "'}'", "':'", "'('", "'=>'", "')'", "'or'", "'/='", "':='", "'\\n'", "'ANY'", "'WHERE'", "'THEN'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_EVENTB_TYPE_KEYWORD=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEventBDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventBDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventBDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventBDSL.g"; }



     	private EventBDSLGrammarAccess grammarAccess;

        public InternalEventBDSLParser(TokenStream input, EventBDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected EventBDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalEventBDSL.g:64:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalEventBDSL.g:64:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalEventBDSL.g:65:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalEventBDSL.g:71:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'SYSTEM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )? (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )? (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )? (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )? (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )? otherlv_24= 'END' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_sets_3_0 = null;

        EObject lv_sets_5_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_invariants1_11_0 = null;

        EObject lv_invariantsLeftPart2_13_0 = null;

        EObject lv_invariantsLeftPart2_15_0 = null;

        EObject lv_initializations_17_0 = null;

        EObject lv_initializations_19_0 = null;

        EObject lv_events_21_0 = null;

        EObject lv_events_23_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:77:2: ( (otherlv_0= 'SYSTEM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )? (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )? (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )? (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )? (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )? otherlv_24= 'END' ) )
            // InternalEventBDSL.g:78:2: (otherlv_0= 'SYSTEM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )? (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )? (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )? (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )? (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )? otherlv_24= 'END' )
            {
            // InternalEventBDSL.g:78:2: (otherlv_0= 'SYSTEM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )? (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )? (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )? (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )? (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )? otherlv_24= 'END' )
            // InternalEventBDSL.g:79:3: otherlv_0= 'SYSTEM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )? (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )? (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )? (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )? (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )? otherlv_24= 'END'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getSYSTEMKeyword_0());
            		
            // InternalEventBDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalEventBDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEventBDSL.g:101:3: (otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventBDSL.g:102:4: otherlv_2= 'SETS' ( (lv_sets_3_0= ruleSet ) ) (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getSETSKeyword_2_0());
                    			
                    // InternalEventBDSL.g:106:4: ( (lv_sets_3_0= ruleSet ) )
                    // InternalEventBDSL.g:107:5: (lv_sets_3_0= ruleSet )
                    {
                    // InternalEventBDSL.g:107:5: (lv_sets_3_0= ruleSet )
                    // InternalEventBDSL.g:108:6: lv_sets_3_0= ruleSet
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getSetsSetParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_sets_3_0=ruleSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"sets",
                    							lv_sets_3_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.Set");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBDSL.g:125:4: (otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEventBDSL.g:126:5: otherlv_4= ';' ( (lv_sets_5_0= ruleSet ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getSemicolonKeyword_2_2_0());
                    	    				
                    	    // InternalEventBDSL.g:130:5: ( (lv_sets_5_0= ruleSet ) )
                    	    // InternalEventBDSL.g:131:6: (lv_sets_5_0= ruleSet )
                    	    {
                    	    // InternalEventBDSL.g:131:6: (lv_sets_5_0= ruleSet )
                    	    // InternalEventBDSL.g:132:7: lv_sets_5_0= ruleSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineAccess().getSetsSetParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sets_5_0=ruleSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sets",
                    	    								lv_sets_5_0,
                    	    								"org.xtext.example.eventBDSL.EventBDSL.Set");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalEventBDSL.g:151:3: (otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventBDSL.g:152:4: otherlv_6= 'VARIABLES' ( (lv_variables_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getVARIABLESKeyword_3_0());
                    			
                    // InternalEventBDSL.g:156:4: ( (lv_variables_7_0= ruleVariable ) )
                    // InternalEventBDSL.g:157:5: (lv_variables_7_0= ruleVariable )
                    {
                    // InternalEventBDSL.g:157:5: (lv_variables_7_0= ruleVariable )
                    // InternalEventBDSL.g:158:6: lv_variables_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_variables_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_7_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBDSL.g:175:4: (otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEventBDSL.g:176:5: otherlv_8= ',' ( (lv_variables_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalEventBDSL.g:180:5: ( (lv_variables_9_0= ruleVariable ) )
                    	    // InternalEventBDSL.g:181:6: (lv_variables_9_0= ruleVariable )
                    	    {
                    	    // InternalEventBDSL.g:181:6: (lv_variables_9_0= ruleVariable )
                    	    // InternalEventBDSL.g:182:7: lv_variables_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_variables_9_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_9_0,
                    	    								"org.xtext.example.eventBDSL.EventBDSL.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalEventBDSL.g:201:3: (otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventBDSL.g:202:4: otherlv_10= 'INVARIANT' ( (lv_invariants1_11_0= ruleInvariant1 ) ) (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )?
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getINVARIANTKeyword_4_0());
                    			
                    // InternalEventBDSL.g:206:4: ( (lv_invariants1_11_0= ruleInvariant1 ) )
                    // InternalEventBDSL.g:207:5: (lv_invariants1_11_0= ruleInvariant1 )
                    {
                    // InternalEventBDSL.g:207:5: (lv_invariants1_11_0= ruleInvariant1 )
                    // InternalEventBDSL.g:208:6: lv_invariants1_11_0= ruleInvariant1
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getInvariants1Invariant1ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_invariants1_11_0=ruleInvariant1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						set(
                    							current,
                    							"invariants1",
                    							lv_invariants1_11_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.Invariant1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBDSL.g:225:4: (otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalEventBDSL.g:226:5: otherlv_12= '&' ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) ) (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )*
                            {
                            otherlv_12=(Token)match(input,18,FOLLOW_9); 

                            					newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getAmpersandKeyword_4_2_0());
                            				
                            // InternalEventBDSL.g:230:5: ( (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList ) )
                            // InternalEventBDSL.g:231:6: (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList )
                            {
                            // InternalEventBDSL.g:231:6: (lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList )
                            // InternalEventBDSL.g:232:7: lv_invariantsLeftPart2_13_0= ruleLeftPartPredicateSubList
                            {

                            							newCompositeNode(grammarAccess.getMachineAccess().getInvariantsLeftPart2LeftPartPredicateSubListParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_invariantsLeftPart2_13_0=ruleLeftPartPredicateSubList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMachineRule());
                            							}
                            							add(
                            								current,
                            								"invariantsLeftPart2",
                            								lv_invariantsLeftPart2_13_0,
                            								"org.xtext.example.eventBDSL.EventBDSL.LeftPartPredicateSubList");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalEventBDSL.g:249:5: (otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==18) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalEventBDSL.g:250:6: otherlv_14= '&' ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) )
                            	    {
                            	    otherlv_14=(Token)match(input,18,FOLLOW_9); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getAmpersandKeyword_4_2_2_0());
                            	    					
                            	    // InternalEventBDSL.g:254:6: ( (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList ) )
                            	    // InternalEventBDSL.g:255:7: (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList )
                            	    {
                            	    // InternalEventBDSL.g:255:7: (lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList )
                            	    // InternalEventBDSL.g:256:8: lv_invariantsLeftPart2_15_0= ruleLeftPartPredicateSubList
                            	    {

                            	    								newCompositeNode(grammarAccess.getMachineAccess().getInvariantsLeftPart2LeftPartPredicateSubListParserRuleCall_4_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_invariantsLeftPart2_15_0=ruleLeftPartPredicateSubList();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMachineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"invariantsLeftPart2",
                            	    									lv_invariantsLeftPart2_15_0,
                            	    									"org.xtext.example.eventBDSL.EventBDSL.LeftPartPredicateSubList");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEventBDSL.g:276:3: (otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEventBDSL.g:277:4: otherlv_16= 'INITIALISATION' ( (lv_initializations_17_0= ruleInitialization ) ) (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )*
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getINITIALISATIONKeyword_5_0());
                    			
                    // InternalEventBDSL.g:281:4: ( (lv_initializations_17_0= ruleInitialization ) )
                    // InternalEventBDSL.g:282:5: (lv_initializations_17_0= ruleInitialization )
                    {
                    // InternalEventBDSL.g:282:5: (lv_initializations_17_0= ruleInitialization )
                    // InternalEventBDSL.g:283:6: lv_initializations_17_0= ruleInitialization
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getInitializationsInitializationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_initializations_17_0=ruleInitialization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"initializations",
                    							lv_initializations_17_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.Initialization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBDSL.g:300:4: (otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEventBDSL.g:301:5: otherlv_18= '||' ( (lv_initializations_19_0= ruleInitialization ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getVerticalLineVerticalLineKeyword_5_2_0());
                    	    				
                    	    // InternalEventBDSL.g:305:5: ( (lv_initializations_19_0= ruleInitialization ) )
                    	    // InternalEventBDSL.g:306:6: (lv_initializations_19_0= ruleInitialization )
                    	    {
                    	    // InternalEventBDSL.g:306:6: (lv_initializations_19_0= ruleInitialization )
                    	    // InternalEventBDSL.g:307:7: lv_initializations_19_0= ruleInitialization
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineAccess().getInitializationsInitializationParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_initializations_19_0=ruleInitialization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"initializations",
                    	    								lv_initializations_19_0,
                    	    								"org.xtext.example.eventBDSL.EventBDSL.Initialization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalEventBDSL.g:326:3: (otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventBDSL.g:327:4: otherlv_20= 'EVENTS' ( (lv_events_21_0= ruleEvent ) ) (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )*
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getMachineAccess().getEVENTSKeyword_6_0());
                    			
                    // InternalEventBDSL.g:331:4: ( (lv_events_21_0= ruleEvent ) )
                    // InternalEventBDSL.g:332:5: (lv_events_21_0= ruleEvent )
                    {
                    // InternalEventBDSL.g:332:5: (lv_events_21_0= ruleEvent )
                    // InternalEventBDSL.g:333:6: lv_events_21_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_events_21_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_21_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBDSL.g:350:4: (otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEventBDSL.g:351:5: otherlv_22= ';' ( (lv_events_23_0= ruleEvent ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getMachineAccess().getSemicolonKeyword_6_2_0());
                    	    				
                    	    // InternalEventBDSL.g:355:5: ( (lv_events_23_0= ruleEvent ) )
                    	    // InternalEventBDSL.g:356:6: (lv_events_23_0= ruleEvent )
                    	    {
                    	    // InternalEventBDSL.g:356:6: (lv_events_23_0= ruleEvent )
                    	    // InternalEventBDSL.g:357:7: lv_events_23_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_events_23_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_23_0,
                    	    								"org.xtext.example.eventBDSL.EventBDSL.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getMachineAccess().getENDKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleSet"
    // InternalEventBDSL.g:384:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalEventBDSL.g:384:44: (iv_ruleSet= ruleSet EOF )
            // InternalEventBDSL.g:385:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalEventBDSL.g:391:1: ruleSet returns [EObject current=null] : ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= '{' ( (lv_values_5_0= ruleSetValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:397:2: ( ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= '{' ( (lv_values_5_0= ruleSetValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )* otherlv_8= '}' ) )
            // InternalEventBDSL.g:398:2: ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= '{' ( (lv_values_5_0= ruleSetValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )* otherlv_8= '}' )
            {
            // InternalEventBDSL.g:398:2: ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= '{' ( (lv_values_5_0= ruleSetValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )* otherlv_8= '}' )
            // InternalEventBDSL.g:399:3: (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= '{' ( (lv_values_5_0= ruleSetValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )* otherlv_8= '}'
            {
            // InternalEventBDSL.g:399:3: (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEventBDSL.g:400:4: otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSolidusSolidusKeyword_0_0());
                    			
                    // InternalEventBDSL.g:404:4: ( (lv_comment_1_0= RULE_STRING ) )
                    // InternalEventBDSL.g:405:5: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalEventBDSL.g:405:5: (lv_comment_1_0= RULE_STRING )
                    // InternalEventBDSL.g:406:6: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    						newLeafNode(lv_comment_1_0, grammarAccess.getSetAccess().getCommentSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_1_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventBDSL.g:423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEventBDSL.g:424:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEventBDSL.g:424:4: (lv_name_2_0= RULE_ID )
            // InternalEventBDSL.g:425:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSetAccess().getEqualsSignKeyword_2());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEventBDSL.g:449:3: ( (lv_values_5_0= ruleSetValue ) )
            // InternalEventBDSL.g:450:4: (lv_values_5_0= ruleSetValue )
            {
            // InternalEventBDSL.g:450:4: (lv_values_5_0= ruleSetValue )
            // InternalEventBDSL.g:451:5: lv_values_5_0= ruleSetValue
            {

            					newCompositeNode(grammarAccess.getSetAccess().getValuesSetValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_values_5_0=ruleSetValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_5_0,
            						"org.xtext.example.eventBDSL.EventBDSL.SetValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventBDSL.g:468:3: (otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEventBDSL.g:469:4: otherlv_6= ',' ( (lv_values_7_0= ruleSetValue ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSetAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalEventBDSL.g:473:4: ( (lv_values_7_0= ruleSetValue ) )
            	    // InternalEventBDSL.g:474:5: (lv_values_7_0= ruleSetValue )
            	    {
            	    // InternalEventBDSL.g:474:5: (lv_values_7_0= ruleSetValue )
            	    // InternalEventBDSL.g:475:6: lv_values_7_0= ruleSetValue
            	    {

            	    						newCompositeNode(grammarAccess.getSetAccess().getValuesSetValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_values_7_0=ruleSetValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_7_0,
            	    							"org.xtext.example.eventBDSL.EventBDSL.SetValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleSetValue"
    // InternalEventBDSL.g:501:1: entryRuleSetValue returns [EObject current=null] : iv_ruleSetValue= ruleSetValue EOF ;
    public final EObject entryRuleSetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetValue = null;


        try {
            // InternalEventBDSL.g:501:49: (iv_ruleSetValue= ruleSetValue EOF )
            // InternalEventBDSL.g:502:2: iv_ruleSetValue= ruleSetValue EOF
            {
             newCompositeNode(grammarAccess.getSetValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetValue=ruleSetValue();

            state._fsp--;

             current =iv_ruleSetValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetValue"


    // $ANTLR start "ruleSetValue"
    // InternalEventBDSL.g:508:1: ruleSetValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSetValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:514:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEventBDSL.g:515:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEventBDSL.g:515:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEventBDSL.g:516:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEventBDSL.g:516:3: (lv_name_0_0= RULE_ID )
            // InternalEventBDSL.g:517:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSetValueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSetValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetValue"


    // $ANTLR start "entryRuleVariable"
    // InternalEventBDSL.g:536:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEventBDSL.g:536:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEventBDSL.g:537:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEventBDSL.g:543:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:549:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEventBDSL.g:550:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEventBDSL.g:550:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEventBDSL.g:551:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEventBDSL.g:551:3: (lv_name_0_0= RULE_ID )
            // InternalEventBDSL.g:552:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariant1"
    // InternalEventBDSL.g:571:1: entryRuleInvariant1 returns [EObject current=null] : iv_ruleInvariant1= ruleInvariant1 EOF ;
    public final EObject entryRuleInvariant1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant1 = null;


        try {
            // InternalEventBDSL.g:571:51: (iv_ruleInvariant1= ruleInvariant1 EOF )
            // InternalEventBDSL.g:572:2: iv_ruleInvariant1= ruleInvariant1 EOF
            {
             newCompositeNode(grammarAccess.getInvariant1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariant1=ruleInvariant1();

            state._fsp--;

             current =iv_ruleInvariant1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariant1"


    // $ANTLR start "ruleInvariant1"
    // InternalEventBDSL.g:578:1: ruleInvariant1 returns [EObject current=null] : ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) ) (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )* ) ;
    public final EObject ruleInvariant1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_1_0=null;
        Token otherlv_3=null;
        EObject lv_typagePredicates_2_1 = null;

        EObject lv_typagePredicates_2_2 = null;

        EObject lv_typagePredicates_4_1 = null;

        EObject lv_typagePredicates_4_2 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:584:2: ( ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) ) (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )* ) )
            // InternalEventBDSL.g:585:2: ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) ) (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )* )
            {
            // InternalEventBDSL.g:585:2: ( (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) ) (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )* )
            // InternalEventBDSL.g:586:3: (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )? ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) ) (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )*
            {
            // InternalEventBDSL.g:586:3: (otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEventBDSL.g:587:4: otherlv_0= '//' ( (lv_comment_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getInvariant1Access().getSolidusSolidusKeyword_0_0());
                    			
                    // InternalEventBDSL.g:591:4: ( (lv_comment_1_0= RULE_STRING ) )
                    // InternalEventBDSL.g:592:5: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalEventBDSL.g:592:5: (lv_comment_1_0= RULE_STRING )
                    // InternalEventBDSL.g:593:6: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_comment_1_0, grammarAccess.getInvariant1Access().getCommentSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvariant1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_1_0,
                    							"org.xtext.example.eventBDSL.EventBDSL.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventBDSL.g:610:3: ( ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) ) )
            // InternalEventBDSL.g:611:4: ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) )
            {
            // InternalEventBDSL.g:611:4: ( (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 ) )
            // InternalEventBDSL.g:612:5: (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 )
            {
            // InternalEventBDSL.g:612:5: (lv_typagePredicates_2_1= ruleTypagePredicate1 | lv_typagePredicates_2_2= ruleTypagePredicate2 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==27) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==RULE_EVENTB_TYPE_KEYWORD) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEventBDSL.g:613:6: lv_typagePredicates_2_1= ruleTypagePredicate1
                    {

                    						newCompositeNode(grammarAccess.getInvariant1Access().getTypagePredicatesTypagePredicate1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_typagePredicates_2_1=ruleTypagePredicate1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInvariant1Rule());
                    						}
                    						add(
                    							current,
                    							"typagePredicates",
                    							lv_typagePredicates_2_1,
                    							"org.xtext.example.eventBDSL.EventBDSL.TypagePredicate1");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalEventBDSL.g:629:6: lv_typagePredicates_2_2= ruleTypagePredicate2
                    {

                    						newCompositeNode(grammarAccess.getInvariant1Access().getTypagePredicatesTypagePredicate2ParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_17);
                    lv_typagePredicates_2_2=ruleTypagePredicate2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInvariant1Rule());
                    						}
                    						add(
                    							current,
                    							"typagePredicates",
                    							lv_typagePredicates_2_2,
                    							"org.xtext.example.eventBDSL.EventBDSL.TypagePredicate2");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalEventBDSL.g:647:3: (otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalEventBDSL.g:648:4: otherlv_3= '&' ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInvariant1Access().getAmpersandKeyword_2_0());
            	    			
            	    // InternalEventBDSL.g:652:4: ( ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) ) )
            	    // InternalEventBDSL.g:653:5: ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) )
            	    {
            	    // InternalEventBDSL.g:653:5: ( (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 ) )
            	    // InternalEventBDSL.g:654:6: (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 )
            	    {
            	    // InternalEventBDSL.g:654:6: (lv_typagePredicates_4_1= ruleTypagePredicate1 | lv_typagePredicates_4_2= ruleTypagePredicate2 )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_ID) ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1==27) ) {
            	            int LA16_2 = input.LA(3);

            	            if ( (LA16_2==RULE_ID) ) {
            	                alt16=1;
            	            }
            	            else if ( (LA16_2==RULE_EVENTB_TYPE_KEYWORD) ) {
            	                alt16=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 16, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalEventBDSL.g:655:7: lv_typagePredicates_4_1= ruleTypagePredicate1
            	            {

            	            							newCompositeNode(grammarAccess.getInvariant1Access().getTypagePredicatesTypagePredicate1ParserRuleCall_2_1_0_0());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_typagePredicates_4_1=ruleTypagePredicate1();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getInvariant1Rule());
            	            							}
            	            							add(
            	            								current,
            	            								"typagePredicates",
            	            								lv_typagePredicates_4_1,
            	            								"org.xtext.example.eventBDSL.EventBDSL.TypagePredicate1");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEventBDSL.g:671:7: lv_typagePredicates_4_2= ruleTypagePredicate2
            	            {

            	            							newCompositeNode(grammarAccess.getInvariant1Access().getTypagePredicatesTypagePredicate2ParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_typagePredicates_4_2=ruleTypagePredicate2();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getInvariant1Rule());
            	            							}
            	            							add(
            	            								current,
            	            								"typagePredicates",
            	            								lv_typagePredicates_4_2,
            	            								"org.xtext.example.eventBDSL.EventBDSL.TypagePredicate2");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariant1"


    // $ANTLR start "entryRuleTypagePredicate1"
    // InternalEventBDSL.g:694:1: entryRuleTypagePredicate1 returns [EObject current=null] : iv_ruleTypagePredicate1= ruleTypagePredicate1 EOF ;
    public final EObject entryRuleTypagePredicate1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypagePredicate1 = null;


        try {
            // InternalEventBDSL.g:694:57: (iv_ruleTypagePredicate1= ruleTypagePredicate1 EOF )
            // InternalEventBDSL.g:695:2: iv_ruleTypagePredicate1= ruleTypagePredicate1 EOF
            {
             newCompositeNode(grammarAccess.getTypagePredicate1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypagePredicate1=ruleTypagePredicate1();

            state._fsp--;

             current =iv_ruleTypagePredicate1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypagePredicate1"


    // $ANTLR start "ruleTypagePredicate1"
    // InternalEventBDSL.g:701:1: ruleTypagePredicate1 returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTypagePredicate1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:707:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEventBDSL.g:708:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEventBDSL.g:708:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalEventBDSL.g:709:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEventBDSL.g:709:3: ( (otherlv_0= RULE_ID ) )
            // InternalEventBDSL.g:710:4: (otherlv_0= RULE_ID )
            {
            // InternalEventBDSL.g:710:4: (otherlv_0= RULE_ID )
            // InternalEventBDSL.g:711:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypagePredicate1Rule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTypagePredicate1Access().getNameVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypagePredicate1Access().getColonKeyword_1());
            		
            // InternalEventBDSL.g:726:3: ( (otherlv_2= RULE_ID ) )
            // InternalEventBDSL.g:727:4: (otherlv_2= RULE_ID )
            {
            // InternalEventBDSL.g:727:4: (otherlv_2= RULE_ID )
            // InternalEventBDSL.g:728:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypagePredicate1Rule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTypagePredicate1Access().getValueSetCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypagePredicate1"


    // $ANTLR start "entryRuleTypagePredicate2"
    // InternalEventBDSL.g:743:1: entryRuleTypagePredicate2 returns [EObject current=null] : iv_ruleTypagePredicate2= ruleTypagePredicate2 EOF ;
    public final EObject entryRuleTypagePredicate2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypagePredicate2 = null;


        try {
            // InternalEventBDSL.g:743:57: (iv_ruleTypagePredicate2= ruleTypagePredicate2 EOF )
            // InternalEventBDSL.g:744:2: iv_ruleTypagePredicate2= ruleTypagePredicate2 EOF
            {
             newCompositeNode(grammarAccess.getTypagePredicate2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypagePredicate2=ruleTypagePredicate2();

            state._fsp--;

             current =iv_ruleTypagePredicate2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypagePredicate2"


    // $ANTLR start "ruleTypagePredicate2"
    // InternalEventBDSL.g:750:1: ruleTypagePredicate2 returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) ) ) ;
    public final EObject ruleTypagePredicate2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:756:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) ) ) )
            // InternalEventBDSL.g:757:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) ) )
            {
            // InternalEventBDSL.g:757:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) ) )
            // InternalEventBDSL.g:758:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) )
            {
            // InternalEventBDSL.g:758:3: ( (otherlv_0= RULE_ID ) )
            // InternalEventBDSL.g:759:4: (otherlv_0= RULE_ID )
            {
            // InternalEventBDSL.g:759:4: (otherlv_0= RULE_ID )
            // InternalEventBDSL.g:760:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypagePredicate2Rule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTypagePredicate2Access().getNameVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTypagePredicate2Access().getColonKeyword_1());
            		
            // InternalEventBDSL.g:775:3: ( (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD ) )
            // InternalEventBDSL.g:776:4: (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD )
            {
            // InternalEventBDSL.g:776:4: (lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD )
            // InternalEventBDSL.g:777:5: lv_value_2_0= RULE_EVENTB_TYPE_KEYWORD
            {
            lv_value_2_0=(Token)match(input,RULE_EVENTB_TYPE_KEYWORD,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTypagePredicate2Access().getValueEVENTB_TYPE_KEYWORDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypagePredicate2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.eventBDSL.EventBDSL.EVENTB_TYPE_KEYWORD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypagePredicate2"


    // $ANTLR start "entryRuleLeftPartPredicateSubList"
    // InternalEventBDSL.g:797:1: entryRuleLeftPartPredicateSubList returns [EObject current=null] : iv_ruleLeftPartPredicateSubList= ruleLeftPartPredicateSubList EOF ;
    public final EObject entryRuleLeftPartPredicateSubList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPartPredicateSubList = null;


        try {
            // InternalEventBDSL.g:797:65: (iv_ruleLeftPartPredicateSubList= ruleLeftPartPredicateSubList EOF )
            // InternalEventBDSL.g:798:2: iv_ruleLeftPartPredicateSubList= ruleLeftPartPredicateSubList EOF
            {
             newCompositeNode(grammarAccess.getLeftPartPredicateSubListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftPartPredicateSubList=ruleLeftPartPredicateSubList();

            state._fsp--;

             current =iv_ruleLeftPartPredicateSubList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPartPredicateSubList"


    // $ANTLR start "ruleLeftPartPredicateSubList"
    // InternalEventBDSL.g:804:1: ruleLeftPartPredicateSubList returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) ) otherlv_2= '=>' ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) ) otherlv_4= ')' ) ;
    public final EObject ruleLeftPartPredicateSubList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftPartPredicateList_1_0 = null;

        EObject lv_rightPartPredicateList_3_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:810:2: ( (otherlv_0= '(' ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) ) otherlv_2= '=>' ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) ) otherlv_4= ')' ) )
            // InternalEventBDSL.g:811:2: (otherlv_0= '(' ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) ) otherlv_2= '=>' ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) ) otherlv_4= ')' )
            {
            // InternalEventBDSL.g:811:2: (otherlv_0= '(' ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) ) otherlv_2= '=>' ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) ) otherlv_4= ')' )
            // InternalEventBDSL.g:812:3: otherlv_0= '(' ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) ) otherlv_2= '=>' ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftPartPredicateSubListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalEventBDSL.g:816:3: ( (lv_leftPartPredicateList_1_0= ruleDisconjuction ) )
            // InternalEventBDSL.g:817:4: (lv_leftPartPredicateList_1_0= ruleDisconjuction )
            {
            // InternalEventBDSL.g:817:4: (lv_leftPartPredicateList_1_0= ruleDisconjuction )
            // InternalEventBDSL.g:818:5: lv_leftPartPredicateList_1_0= ruleDisconjuction
            {

            					newCompositeNode(grammarAccess.getLeftPartPredicateSubListAccess().getLeftPartPredicateListDisconjuctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_leftPartPredicateList_1_0=ruleDisconjuction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftPartPredicateSubListRule());
            					}
            					set(
            						current,
            						"leftPartPredicateList",
            						lv_leftPartPredicateList_1_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Disconjuction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLeftPartPredicateSubListAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalEventBDSL.g:839:3: ( (lv_rightPartPredicateList_3_0= ruleDisconjuction ) )
            // InternalEventBDSL.g:840:4: (lv_rightPartPredicateList_3_0= ruleDisconjuction )
            {
            // InternalEventBDSL.g:840:4: (lv_rightPartPredicateList_3_0= ruleDisconjuction )
            // InternalEventBDSL.g:841:5: lv_rightPartPredicateList_3_0= ruleDisconjuction
            {

            					newCompositeNode(grammarAccess.getLeftPartPredicateSubListAccess().getRightPartPredicateListDisconjuctionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_rightPartPredicateList_3_0=ruleDisconjuction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftPartPredicateSubListRule());
            					}
            					set(
            						current,
            						"rightPartPredicateList",
            						lv_rightPartPredicateList_3_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Disconjuction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLeftPartPredicateSubListAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftPartPredicateSubList"


    // $ANTLR start "entryRuleDisconjuction"
    // InternalEventBDSL.g:866:1: entryRuleDisconjuction returns [EObject current=null] : iv_ruleDisconjuction= ruleDisconjuction EOF ;
    public final EObject entryRuleDisconjuction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisconjuction = null;


        try {
            // InternalEventBDSL.g:866:54: (iv_ruleDisconjuction= ruleDisconjuction EOF )
            // InternalEventBDSL.g:867:2: iv_ruleDisconjuction= ruleDisconjuction EOF
            {
             newCompositeNode(grammarAccess.getDisconjuctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisconjuction=ruleDisconjuction();

            state._fsp--;

             current =iv_ruleDisconjuction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisconjuction"


    // $ANTLR start "ruleDisconjuction"
    // InternalEventBDSL.g:873:1: ruleDisconjuction returns [EObject current=null] : (this_Conjuction_0= ruleConjuction ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )* ) ;
    public final EObject ruleDisconjuction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Conjuction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:879:2: ( (this_Conjuction_0= ruleConjuction ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )* ) )
            // InternalEventBDSL.g:880:2: (this_Conjuction_0= ruleConjuction ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )* )
            {
            // InternalEventBDSL.g:880:2: (this_Conjuction_0= ruleConjuction ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )* )
            // InternalEventBDSL.g:881:3: this_Conjuction_0= ruleConjuction ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisconjuctionAccess().getConjuctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Conjuction_0=ruleConjuction();

            state._fsp--;


            			current = this_Conjuction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEventBDSL.g:889:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEventBDSL.g:890:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleConjuction ) )
            	    {
            	    // InternalEventBDSL.g:890:4: ()
            	    // InternalEventBDSL.g:891:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisconjuctionAccess().getDisconjuctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDisconjuctionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalEventBDSL.g:901:4: ( (lv_right_3_0= ruleConjuction ) )
            	    // InternalEventBDSL.g:902:5: (lv_right_3_0= ruleConjuction )
            	    {
            	    // InternalEventBDSL.g:902:5: (lv_right_3_0= ruleConjuction )
            	    // InternalEventBDSL.g:903:6: lv_right_3_0= ruleConjuction
            	    {

            	    						newCompositeNode(grammarAccess.getDisconjuctionAccess().getRightConjuctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleConjuction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisconjuctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.eventBDSL.EventBDSL.Conjuction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisconjuction"


    // $ANTLR start "entryRuleConjuction"
    // InternalEventBDSL.g:925:1: entryRuleConjuction returns [EObject current=null] : iv_ruleConjuction= ruleConjuction EOF ;
    public final EObject entryRuleConjuction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjuction = null;


        try {
            // InternalEventBDSL.g:925:51: (iv_ruleConjuction= ruleConjuction EOF )
            // InternalEventBDSL.g:926:2: iv_ruleConjuction= ruleConjuction EOF
            {
             newCompositeNode(grammarAccess.getConjuctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjuction=ruleConjuction();

            state._fsp--;

             current =iv_ruleConjuction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjuction"


    // $ANTLR start "ruleConjuction"
    // InternalEventBDSL.g:932:1: ruleConjuction returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleConjuction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:938:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalEventBDSL.g:939:2: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalEventBDSL.g:939:2: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalEventBDSL.g:940:3: this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjuctionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEventBDSL.g:948:3: ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEventBDSL.g:949:4: () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalEventBDSL.g:949:4: ()
            	    // InternalEventBDSL.g:950:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjuctionAccess().getConjuctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConjuctionAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalEventBDSL.g:960:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalEventBDSL.g:961:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalEventBDSL.g:961:5: (lv_right_3_0= rulePrimary )
            	    // InternalEventBDSL.g:962:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getConjuctionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjuctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.eventBDSL.EventBDSL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjuction"


    // $ANTLR start "entryRulePrimary"
    // InternalEventBDSL.g:984:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEventBDSL.g:984:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEventBDSL.g:985:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalEventBDSL.g:991:1: rulePrimary returns [EObject current=null] : (this_LeftPartPredicate_0= ruleLeftPartPredicate | (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LeftPartPredicate_0 = null;

        EObject this_Disconjuction_2 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:997:2: ( (this_LeftPartPredicate_0= ruleLeftPartPredicate | (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' ) ) )
            // InternalEventBDSL.g:998:2: (this_LeftPartPredicate_0= ruleLeftPartPredicate | (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' ) )
            {
            // InternalEventBDSL.g:998:2: (this_LeftPartPredicate_0= ruleLeftPartPredicate | (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==28) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEventBDSL.g:999:3: this_LeftPartPredicate_0= ruleLeftPartPredicate
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPartPredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftPartPredicate_0=ruleLeftPartPredicate();

                    state._fsp--;


                    			current = this_LeftPartPredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBDSL.g:1008:3: (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' )
                    {
                    // InternalEventBDSL.g:1008:3: (otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')' )
                    // InternalEventBDSL.g:1009:4: otherlv_1= '(' this_Disconjuction_2= ruleDisconjuction otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getDisconjuctionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_Disconjuction_2=ruleDisconjuction();

                    state._fsp--;


                    				current = this_Disconjuction_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLeftPartPredicate"
    // InternalEventBDSL.g:1030:1: entryRuleLeftPartPredicate returns [EObject current=null] : iv_ruleLeftPartPredicate= ruleLeftPartPredicate EOF ;
    public final EObject entryRuleLeftPartPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPartPredicate = null;


        try {
            // InternalEventBDSL.g:1030:58: (iv_ruleLeftPartPredicate= ruleLeftPartPredicate EOF )
            // InternalEventBDSL.g:1031:2: iv_ruleLeftPartPredicate= ruleLeftPartPredicate EOF
            {
             newCompositeNode(grammarAccess.getLeftPartPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftPartPredicate=ruleLeftPartPredicate();

            state._fsp--;

             current =iv_ruleLeftPartPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPartPredicate"


    // $ANTLR start "ruleLeftPartPredicate"
    // InternalEventBDSL.g:1037:1: ruleLeftPartPredicate returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= '/=' ) ( (lv_val2_3_0= ruleMyID ) ) ) ;
    public final EObject ruleLeftPartPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_val2_3_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1043:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= '/=' ) ( (lv_val2_3_0= ruleMyID ) ) ) )
            // InternalEventBDSL.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= '/=' ) ( (lv_val2_3_0= ruleMyID ) ) )
            {
            // InternalEventBDSL.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= '/=' ) ( (lv_val2_3_0= ruleMyID ) ) )
            // InternalEventBDSL.g:1045:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= '/=' ) ( (lv_val2_3_0= ruleMyID ) )
            {
            // InternalEventBDSL.g:1045:3: ( (otherlv_0= RULE_ID ) )
            // InternalEventBDSL.g:1046:4: (otherlv_0= RULE_ID )
            {
            // InternalEventBDSL.g:1046:4: (otherlv_0= RULE_ID )
            // InternalEventBDSL.g:1047:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftPartPredicateRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getLeftPartPredicateAccess().getVal1VariableCrossReference_0_0());
            				

            }


            }

            // InternalEventBDSL.g:1058:3: (otherlv_1= '=' | otherlv_2= '/=' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEventBDSL.g:1059:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getLeftPartPredicateAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEventBDSL.g:1064:4: otherlv_2= '/='
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getLeftPartPredicateAccess().getSolidusEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalEventBDSL.g:1069:3: ( (lv_val2_3_0= ruleMyID ) )
            // InternalEventBDSL.g:1070:4: (lv_val2_3_0= ruleMyID )
            {
            // InternalEventBDSL.g:1070:4: (lv_val2_3_0= ruleMyID )
            // InternalEventBDSL.g:1071:5: lv_val2_3_0= ruleMyID
            {

            					newCompositeNode(grammarAccess.getLeftPartPredicateAccess().getVal2MyIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_val2_3_0=ruleMyID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftPartPredicateRule());
            					}
            					set(
            						current,
            						"val2",
            						lv_val2_3_0,
            						"org.xtext.example.eventBDSL.EventBDSL.MyID");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftPartPredicate"


    // $ANTLR start "entryRuleMyID"
    // InternalEventBDSL.g:1092:1: entryRuleMyID returns [String current=null] : iv_ruleMyID= ruleMyID EOF ;
    public final String entryRuleMyID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMyID = null;


        try {
            // InternalEventBDSL.g:1092:44: (iv_ruleMyID= ruleMyID EOF )
            // InternalEventBDSL.g:1093:2: iv_ruleMyID= ruleMyID EOF
            {
             newCompositeNode(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyID=ruleMyID();

            state._fsp--;

             current =iv_ruleMyID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // InternalEventBDSL.g:1099:1: ruleMyID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_TYPE_KEYWORD_1= RULE_EVENTB_TYPE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleMyID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_EVENTB_TYPE_KEYWORD_1=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:1105:2: ( (this_ID_0= RULE_ID | this_EVENTB_TYPE_KEYWORD_1= RULE_EVENTB_TYPE_KEYWORD ) )
            // InternalEventBDSL.g:1106:2: (this_ID_0= RULE_ID | this_EVENTB_TYPE_KEYWORD_1= RULE_EVENTB_TYPE_KEYWORD )
            {
            // InternalEventBDSL.g:1106:2: (this_ID_0= RULE_ID | this_EVENTB_TYPE_KEYWORD_1= RULE_EVENTB_TYPE_KEYWORD )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_EVENTB_TYPE_KEYWORD) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEventBDSL.g:1107:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBDSL.g:1115:3: this_EVENTB_TYPE_KEYWORD_1= RULE_EVENTB_TYPE_KEYWORD
                    {
                    this_EVENTB_TYPE_KEYWORD_1=(Token)match(input,RULE_EVENTB_TYPE_KEYWORD,FOLLOW_2); 

                    			current.merge(this_EVENTB_TYPE_KEYWORD_1);
                    		

                    			newLeafNode(this_EVENTB_TYPE_KEYWORD_1, grammarAccess.getMyIDAccess().getEVENTB_TYPE_KEYWORDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleInitialization"
    // InternalEventBDSL.g:1126:1: entryRuleInitialization returns [EObject current=null] : iv_ruleInitialization= ruleInitialization EOF ;
    public final EObject entryRuleInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialization = null;


        try {
            // InternalEventBDSL.g:1126:55: (iv_ruleInitialization= ruleInitialization EOF )
            // InternalEventBDSL.g:1127:2: iv_ruleInitialization= ruleInitialization EOF
            {
             newCompositeNode(grammarAccess.getInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialization=ruleInitialization();

            state._fsp--;

             current =iv_ruleInitialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialization"


    // $ANTLR start "ruleInitialization"
    // InternalEventBDSL.g:1133:1: ruleInitialization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleMyID ) ) ) ;
    public final EObject ruleInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1139:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleMyID ) ) ) )
            // InternalEventBDSL.g:1140:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleMyID ) ) )
            {
            // InternalEventBDSL.g:1140:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleMyID ) ) )
            // InternalEventBDSL.g:1141:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleMyID ) )
            {
            // InternalEventBDSL.g:1141:3: ( (otherlv_0= RULE_ID ) )
            // InternalEventBDSL.g:1142:4: (otherlv_0= RULE_ID )
            {
            // InternalEventBDSL.g:1142:4: (otherlv_0= RULE_ID )
            // InternalEventBDSL.g:1143:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitializationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getInitializationAccess().getNameVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInitializationAccess().getColonEqualsSignKeyword_1());
            		
            // InternalEventBDSL.g:1158:3: ( (lv_value_2_0= ruleMyID ) )
            // InternalEventBDSL.g:1159:4: (lv_value_2_0= ruleMyID )
            {
            // InternalEventBDSL.g:1159:4: (lv_value_2_0= ruleMyID )
            // InternalEventBDSL.g:1160:5: lv_value_2_0= ruleMyID
            {

            					newCompositeNode(grammarAccess.getInitializationAccess().getValueMyIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleMyID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitializationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.eventBDSL.EventBDSL.MyID");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialization"


    // $ANTLR start "entryRuleEvent"
    // InternalEventBDSL.g:1181:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventBDSL.g:1181:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventBDSL.g:1182:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEventBDSL.g:1188:1: ruleEvent returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= '\\n' )* otherlv_4= 'ANY' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'WHERE' ( (lv_guards_7_0= ruleGuard ) ) otherlv_8= 'THEN' ( (lv_actions_9_0= ruleActionsRule ) ) otherlv_10= 'END' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_guards_7_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1194:2: ( ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= '\\n' )* otherlv_4= 'ANY' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'WHERE' ( (lv_guards_7_0= ruleGuard ) ) otherlv_8= 'THEN' ( (lv_actions_9_0= ruleActionsRule ) ) otherlv_10= 'END' ) )
            // InternalEventBDSL.g:1195:2: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= '\\n' )* otherlv_4= 'ANY' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'WHERE' ( (lv_guards_7_0= ruleGuard ) ) otherlv_8= 'THEN' ( (lv_actions_9_0= ruleActionsRule ) ) otherlv_10= 'END' )
            {
            // InternalEventBDSL.g:1195:2: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= '\\n' )* otherlv_4= 'ANY' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'WHERE' ( (lv_guards_7_0= ruleGuard ) ) otherlv_8= 'THEN' ( (lv_actions_9_0= ruleActionsRule ) ) otherlv_10= 'END' )
            // InternalEventBDSL.g:1196:3: ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= '\\n' )* otherlv_4= 'ANY' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'WHERE' ( (lv_guards_7_0= ruleGuard ) ) otherlv_8= 'THEN' ( (lv_actions_9_0= ruleActionsRule ) ) otherlv_10= 'END'
            {
            // InternalEventBDSL.g:1196:3: ( (lv_comment_0_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEventBDSL.g:1197:4: (lv_comment_0_0= RULE_STRING )
                    {
                    // InternalEventBDSL.g:1197:4: (lv_comment_0_0= RULE_STRING )
                    // InternalEventBDSL.g:1198:5: lv_comment_0_0= RULE_STRING
                    {
                    lv_comment_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    					newLeafNode(lv_comment_0_0, grammarAccess.getEventAccess().getCommentSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_0_0,
                    						"org.xtext.example.eventBDSL.EventBDSL.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalEventBDSL.g:1214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBDSL.g:1215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBDSL.g:1215:4: (lv_name_1_0= RULE_ID )
            // InternalEventBDSL.g:1216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getEqualsSignKeyword_2());
            		
            // InternalEventBDSL.g:1236:3: (otherlv_3= '\\n' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEventBDSL.g:1237:4: otherlv_3= '\\n'
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_27); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLineFeedKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getANYKeyword_4());
            		
            // InternalEventBDSL.g:1246:3: ( (otherlv_5= RULE_ID ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEventBDSL.g:1247:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalEventBDSL.g:1247:4: (otherlv_5= RULE_ID )
            	    // InternalEventBDSL.g:1248:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEventRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getParametersParameterCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEventAccess().getWHEREKeyword_6());
            		
            // InternalEventBDSL.g:1263:3: ( (lv_guards_7_0= ruleGuard ) )
            // InternalEventBDSL.g:1264:4: (lv_guards_7_0= ruleGuard )
            {
            // InternalEventBDSL.g:1264:4: (lv_guards_7_0= ruleGuard )
            // InternalEventBDSL.g:1265:5: lv_guards_7_0= ruleGuard
            {

            					newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_guards_7_0=ruleGuard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"guards",
            						lv_guards_7_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Guard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEventAccess().getTHENKeyword_8());
            		
            // InternalEventBDSL.g:1286:3: ( (lv_actions_9_0= ruleActionsRule ) )
            // InternalEventBDSL.g:1287:4: (lv_actions_9_0= ruleActionsRule )
            {
            // InternalEventBDSL.g:1287:4: (lv_actions_9_0= ruleActionsRule )
            // InternalEventBDSL.g:1288:5: lv_actions_9_0= ruleActionsRule
            {

            					newCompositeNode(grammarAccess.getEventAccess().getActionsActionsRuleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_actions_9_0=ruleActionsRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"actions",
            						lv_actions_9_0,
            						"org.xtext.example.eventBDSL.EventBDSL.ActionsRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getENDKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameter"
    // InternalEventBDSL.g:1313:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalEventBDSL.g:1313:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalEventBDSL.g:1314:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalEventBDSL.g:1320:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEventBDSL.g:1326:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEventBDSL.g:1327:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEventBDSL.g:1327:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalEventBDSL.g:1328:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEventBDSL.g:1328:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEventBDSL.g:1329:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEventBDSL.g:1329:4: (lv_name_0_0= RULE_ID )
            // InternalEventBDSL.g:1330:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalEventBDSL.g:1350:3: ( (otherlv_2= RULE_ID ) )
            // InternalEventBDSL.g:1351:4: (otherlv_2= RULE_ID )
            {
            // InternalEventBDSL.g:1351:4: (otherlv_2= RULE_ID )
            // InternalEventBDSL.g:1352:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAssignedSetSetCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // InternalEventBDSL.g:1367:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalEventBDSL.g:1367:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalEventBDSL.g:1368:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalEventBDSL.g:1374:1: ruleGuard returns [EObject current=null] : ( ( (lv_guardExp1_0_0= ruleParameter ) ) otherlv_1= '&' ( (otherlv_2= RULE_ID ) ) otherlv_3= '/=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_guardExp4_6_0= ruleDisconjuction ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_guardExp1_0_0 = null;

        EObject lv_guardExp4_6_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1380:2: ( ( ( (lv_guardExp1_0_0= ruleParameter ) ) otherlv_1= '&' ( (otherlv_2= RULE_ID ) ) otherlv_3= '/=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_guardExp4_6_0= ruleDisconjuction ) ) ) )
            // InternalEventBDSL.g:1381:2: ( ( (lv_guardExp1_0_0= ruleParameter ) ) otherlv_1= '&' ( (otherlv_2= RULE_ID ) ) otherlv_3= '/=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_guardExp4_6_0= ruleDisconjuction ) ) )
            {
            // InternalEventBDSL.g:1381:2: ( ( (lv_guardExp1_0_0= ruleParameter ) ) otherlv_1= '&' ( (otherlv_2= RULE_ID ) ) otherlv_3= '/=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_guardExp4_6_0= ruleDisconjuction ) ) )
            // InternalEventBDSL.g:1382:3: ( (lv_guardExp1_0_0= ruleParameter ) ) otherlv_1= '&' ( (otherlv_2= RULE_ID ) ) otherlv_3= '/=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_guardExp4_6_0= ruleDisconjuction ) )
            {
            // InternalEventBDSL.g:1382:3: ( (lv_guardExp1_0_0= ruleParameter ) )
            // InternalEventBDSL.g:1383:4: (lv_guardExp1_0_0= ruleParameter )
            {
            // InternalEventBDSL.g:1383:4: (lv_guardExp1_0_0= ruleParameter )
            // InternalEventBDSL.g:1384:5: lv_guardExp1_0_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getGuardExp1ParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_guardExp1_0_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"guardExp1",
            						lv_guardExp1_0_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getAmpersandKeyword_1());
            		
            // InternalEventBDSL.g:1405:3: ( (otherlv_2= RULE_ID ) )
            // InternalEventBDSL.g:1406:4: (otherlv_2= RULE_ID )
            {
            // InternalEventBDSL.g:1406:4: (otherlv_2= RULE_ID )
            // InternalEventBDSL.g:1407:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getGuardExp2ParameterCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getSolidusEqualsSignKeyword_3());
            		
            // InternalEventBDSL.g:1422:3: ( (otherlv_4= RULE_ID ) )
            // InternalEventBDSL.g:1423:4: (otherlv_4= RULE_ID )
            {
            // InternalEventBDSL.g:1423:4: (otherlv_4= RULE_ID )
            // InternalEventBDSL.g:1424:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getGuardExp3VariableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getAmpersandKeyword_5());
            		
            // InternalEventBDSL.g:1439:3: ( (lv_guardExp4_6_0= ruleDisconjuction ) )
            // InternalEventBDSL.g:1440:4: (lv_guardExp4_6_0= ruleDisconjuction )
            {
            // InternalEventBDSL.g:1440:4: (lv_guardExp4_6_0= ruleDisconjuction )
            // InternalEventBDSL.g:1441:5: lv_guardExp4_6_0= ruleDisconjuction
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getGuardExp4DisconjuctionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_guardExp4_6_0=ruleDisconjuction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"guardExp4",
            						lv_guardExp4_6_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Disconjuction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleActionsRule"
    // InternalEventBDSL.g:1462:1: entryRuleActionsRule returns [EObject current=null] : iv_ruleActionsRule= ruleActionsRule EOF ;
    public final EObject entryRuleActionsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionsRule = null;


        try {
            // InternalEventBDSL.g:1462:52: (iv_ruleActionsRule= ruleActionsRule EOF )
            // InternalEventBDSL.g:1463:2: iv_ruleActionsRule= ruleActionsRule EOF
            {
             newCompositeNode(grammarAccess.getActionsRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionsRule=ruleActionsRule();

            state._fsp--;

             current =iv_ruleActionsRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionsRule"


    // $ANTLR start "ruleActionsRule"
    // InternalEventBDSL.g:1469:1: ruleActionsRule returns [EObject current=null] : ( ( (lv_actionList_0_0= ruleAction ) ) (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )* ) ;
    public final EObject ruleActionsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actionList_0_0 = null;

        EObject lv_actionList_2_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1475:2: ( ( ( (lv_actionList_0_0= ruleAction ) ) (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )* ) )
            // InternalEventBDSL.g:1476:2: ( ( (lv_actionList_0_0= ruleAction ) ) (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )* )
            {
            // InternalEventBDSL.g:1476:2: ( ( (lv_actionList_0_0= ruleAction ) ) (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )* )
            // InternalEventBDSL.g:1477:3: ( (lv_actionList_0_0= ruleAction ) ) (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )*
            {
            // InternalEventBDSL.g:1477:3: ( (lv_actionList_0_0= ruleAction ) )
            // InternalEventBDSL.g:1478:4: (lv_actionList_0_0= ruleAction )
            {
            // InternalEventBDSL.g:1478:4: (lv_actionList_0_0= ruleAction )
            // InternalEventBDSL.g:1479:5: lv_actionList_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsRuleAccess().getActionListActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_actionList_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsRuleRule());
            					}
            					add(
            						current,
            						"actionList",
            						lv_actionList_0_0,
            						"org.xtext.example.eventBDSL.EventBDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventBDSL.g:1496:3: (otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEventBDSL.g:1497:4: otherlv_1= ';' ( (lv_actionList_2_0= ruleAction ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getActionsRuleAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalEventBDSL.g:1501:4: ( (lv_actionList_2_0= ruleAction ) )
            	    // InternalEventBDSL.g:1502:5: (lv_actionList_2_0= ruleAction )
            	    {
            	    // InternalEventBDSL.g:1502:5: (lv_actionList_2_0= ruleAction )
            	    // InternalEventBDSL.g:1503:6: lv_actionList_2_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getActionsRuleAccess().getActionListActionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_actionList_2_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionsRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actionList",
            	    							lv_actionList_2_0,
            	    							"org.xtext.example.eventBDSL.EventBDSL.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionsRule"


    // $ANTLR start "entryRuleAction"
    // InternalEventBDSL.g:1525:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventBDSL.g:1525:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventBDSL.g:1526:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalEventBDSL.g:1532:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_actionRightPart_2_0= ruleMyID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_actionRightPart_2_0 = null;



        	enterRule();

        try {
            // InternalEventBDSL.g:1538:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_actionRightPart_2_0= ruleMyID ) ) ) )
            // InternalEventBDSL.g:1539:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_actionRightPart_2_0= ruleMyID ) ) )
            {
            // InternalEventBDSL.g:1539:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_actionRightPart_2_0= ruleMyID ) ) )
            // InternalEventBDSL.g:1540:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_actionRightPart_2_0= ruleMyID ) )
            {
            // InternalEventBDSL.g:1540:3: ( (otherlv_0= RULE_ID ) )
            // InternalEventBDSL.g:1541:4: (otherlv_0= RULE_ID )
            {
            // InternalEventBDSL.g:1541:4: (otherlv_0= RULE_ID )
            // InternalEventBDSL.g:1542:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionLeftPartVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalEventBDSL.g:1557:3: ( (lv_actionRightPart_2_0= ruleMyID ) )
            // InternalEventBDSL.g:1558:4: (lv_actionRightPart_2_0= ruleMyID )
            {
            // InternalEventBDSL.g:1558:4: (lv_actionRightPart_2_0= ruleMyID )
            // InternalEventBDSL.g:1559:5: lv_actionRightPart_2_0= ruleMyID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionRightPartMyIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_actionRightPart_2_0=ruleMyID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionRightPart",
            						lv_actionRightPart_2_0,
            						"org.xtext.example.eventBDSL.EventBDSL.MyID");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000006AA000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000006AC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000006B0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000006C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004002L});

}