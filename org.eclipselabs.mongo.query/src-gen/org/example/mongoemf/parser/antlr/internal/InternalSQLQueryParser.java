package org.example.mongoemf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.mongoemf.services.SQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EQUALS", "RULE_NOT_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "'FROM'", "'mongo://'", "':'", "'/'", "','", "'*'", "'WHERE'", "'AND'", "'OR'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_MORE_THAN=9;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_NOT_EQUALS=7;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int RULE_EQUALS=6;
    public static final int RULE_WS=13;
    public static final int RULE_LESS_THAN=8;

    // delegates
    // delegators


        public InternalSQLQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLQueryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g"; }



     	private SQLQueryGrammarAccess grammarAccess;
     	
        public InternalSQLQueryParser(TokenStream input, SQLQueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SQLQueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) ( (lv_query_4_0= ruleQueryCondition ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_attrs_1_0 = null;

        EObject lv_db_3_0 = null;

        EObject lv_query_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:79:28: ( (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) ( (lv_query_4_0= ruleQueryCondition ) )? ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:80:1: (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) ( (lv_query_4_0= ruleQueryCondition ) )? )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:80:1: (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) ( (lv_query_4_0= ruleQueryCondition ) )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:80:3: otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) ( (lv_query_4_0= ruleQueryCondition ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSELECTKeyword_0());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:84:1: ( (lv_attrs_1_0= ruleColumnList ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:85:1: (lv_attrs_1_0= ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:85:1: (lv_attrs_1_0= ruleColumnList )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:86:3: lv_attrs_1_0= ruleColumnList
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnList_in_ruleModel143);
            lv_attrs_1_0=ruleColumnList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"attrs",
                    		lv_attrs_1_0, 
                    		"ColumnList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFROMKeyword_2());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:106:1: ( (lv_db_3_0= ruleDatabase ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:107:1: (lv_db_3_0= ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:107:1: (lv_db_3_0= ruleDatabase )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:108:3: lv_db_3_0= ruleDatabase
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDatabase_in_ruleModel176);
            lv_db_3_0=ruleDatabase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"db",
                    		lv_db_3_0, 
                    		"Database");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:124:2: ( (lv_query_4_0= ruleQueryCondition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:125:1: (lv_query_4_0= ruleQueryCondition )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:125:1: (lv_query_4_0= ruleQueryCondition )
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:126:3: lv_query_4_0= ruleQueryCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getQueryQueryConditionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQueryCondition_in_ruleModel197);
                    lv_query_4_0=ruleQueryCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"query",
                            		lv_query_4_0, 
                            		"QueryCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatabase"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:150:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:151:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:152:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase234);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase244); 

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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:159:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_dbName_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:162:28: ( (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:163:1: (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:163:1: (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:163:3: otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDatabase281); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getMongoKeyword_0());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:167:1: ( (lv_url_1_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:168:1: (lv_url_1_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:168:1: (lv_url_1_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:169:3: lv_url_1_0= RULE_ID
            {
            lv_url_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase298); 

            			newLeafNode(lv_url_1_0, grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:185:2: (otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:185:4: otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDatabase316); 

                        	newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getColonKeyword_2_0());
                        
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:189:1: ( (lv_port_3_0= RULE_INT ) )
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:190:1: (lv_port_3_0= RULE_INT )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:190:1: (lv_port_3_0= RULE_INT )
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:191:3: lv_port_3_0= RULE_INT
                    {
                    lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDatabase333); 

                    			newLeafNode(lv_port_3_0, grammarAccess.getDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDatabaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"port",
                            		lv_port_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDatabase352); 

                	newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getSolidusKeyword_3());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:211:1: ( (lv_dbName_5_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:212:1: (lv_dbName_5_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:212:1: (lv_dbName_5_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:213:3: lv_dbName_5_0= RULE_ID
            {
            lv_dbName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase369); 

            			newLeafNode(lv_dbName_5_0, grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dbName",
                    		lv_dbName_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleDatabase386); 

                	newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getSolidusKeyword_5());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:233:1: ( (lv_name_7_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:234:1: (lv_name_7_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:234:1: (lv_name_7_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:235:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase403); 

            			newLeafNode(lv_name_7_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleColumnList"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:259:1: entryRuleColumnList returns [String current=null] : iv_ruleColumnList= ruleColumnList EOF ;
    public final String entryRuleColumnList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColumnList = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:260:2: (iv_ruleColumnList= ruleColumnList EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:261:2: iv_ruleColumnList= ruleColumnList EOF
            {
             newCompositeNode(grammarAccess.getColumnListRule()); 
            pushFollow(FOLLOW_ruleColumnList_in_entryRuleColumnList445);
            iv_ruleColumnList=ruleColumnList();

            state._fsp--;

             current =iv_ruleColumnList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnList456); 

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
    // $ANTLR end "entryRuleColumnList"


    // $ANTLR start "ruleColumnList"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:268:1: ruleColumnList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleColumnList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:271:28: ( ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:272:1: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:272:1: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:272:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:272:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:272:7: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnList497); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
                        
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:279:1: (kw= ',' this_ID_2= RULE_ID )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:280:2: kw= ',' this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,20,FOLLOW_20_in_ruleColumnList516); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
                    	        
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnList531); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:294:2: kw= '*'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleColumnList558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleColumnList"


    // $ANTLR start "entryRuleQueryCondition"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:307:1: entryRuleQueryCondition returns [EObject current=null] : iv_ruleQueryCondition= ruleQueryCondition EOF ;
    public final EObject entryRuleQueryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryCondition = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:308:2: (iv_ruleQueryCondition= ruleQueryCondition EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:309:2: iv_ruleQueryCondition= ruleQueryCondition EOF
            {
             newCompositeNode(grammarAccess.getQueryConditionRule()); 
            pushFollow(FOLLOW_ruleQueryCondition_in_entryRuleQueryCondition598);
            iv_ruleQueryCondition=ruleQueryCondition();

            state._fsp--;

             current =iv_ruleQueryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryCondition608); 

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
    // $ANTLR end "entryRuleQueryCondition"


    // $ANTLR start "ruleQueryCondition"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:316:1: ruleQueryCondition returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_cond_1_0= ruleCondition ) ) ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )* ) ;
    public final EObject ruleQueryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_cond_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:319:28: ( (otherlv_0= 'WHERE' ( (lv_cond_1_0= ruleCondition ) ) ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )* ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:320:1: (otherlv_0= 'WHERE' ( (lv_cond_1_0= ruleCondition ) ) ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )* )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:320:1: (otherlv_0= 'WHERE' ( (lv_cond_1_0= ruleCondition ) ) ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )* )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:320:3: otherlv_0= 'WHERE' ( (lv_cond_1_0= ruleCondition ) ) ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleQueryCondition645); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryConditionAccess().getWHEREKeyword_0());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:324:1: ( (lv_cond_1_0= ruleCondition ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:325:1: (lv_cond_1_0= ruleCondition )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:325:1: (lv_cond_1_0= ruleCondition )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:326:3: lv_cond_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleQueryCondition666);
            lv_cond_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryConditionRule());
            	        }
                   		add(
                   			current, 
                   			"cond",
                    		lv_cond_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:342:2: ( ruleConjunction ( (lv_cond_3_0= ruleCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=23 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:343:5: ruleConjunction ( (lv_cond_3_0= ruleCondition ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getQueryConditionAccess().getConjunctionParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleQueryCondition683);
            	    ruleConjunction();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:350:1: ( (lv_cond_3_0= ruleCondition ) )
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:351:1: (lv_cond_3_0= ruleCondition )
            	    {
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:351:1: (lv_cond_3_0= ruleCondition )
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:352:3: lv_cond_3_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondition_in_ruleQueryCondition703);
            	    lv_cond_3_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cond",
            	            		lv_cond_3_0, 
            	            		"Condition");
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
    // $ANTLR end "ruleQueryCondition"


    // $ANTLR start "entryRuleCondition"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:376:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:377:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:378:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition741);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition751); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:385:1: ruleCondition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_comp_1_0= ruleCOMPARE ) ) ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_comp_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:388:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_comp_1_0= ruleCOMPARE ) ) ( (lv_value_2_0= ruleVALUE ) ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:389:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_comp_1_0= ruleCOMPARE ) ) ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:389:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_comp_1_0= ruleCOMPARE ) ) ( (lv_value_2_0= ruleVALUE ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:389:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_comp_1_0= ruleCOMPARE ) ) ( (lv_value_2_0= ruleVALUE ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:389:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:390:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:390:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:391:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition793); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:407:2: ( (lv_comp_1_0= ruleCOMPARE ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:408:1: (lv_comp_1_0= ruleCOMPARE )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:408:1: (lv_comp_1_0= ruleCOMPARE )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:409:3: lv_comp_1_0= ruleCOMPARE
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getCompCOMPAREParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCOMPARE_in_ruleCondition819);
            lv_comp_1_0=ruleCOMPARE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"comp",
                    		lv_comp_1_0, 
                    		"COMPARE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:425:2: ( (lv_value_2_0= ruleVALUE ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:426:1: (lv_value_2_0= ruleVALUE )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:426:1: (lv_value_2_0= ruleVALUE )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:427:3: lv_value_2_0= ruleVALUE
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueVALUEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVALUE_in_ruleCondition840);
            lv_value_2_0=ruleVALUE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"VALUE");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConjunction"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:451:1: entryRuleConjunction returns [String current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final String entryRuleConjunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConjunction = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:452:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:453:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction877);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction888); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:460:1: ruleConjunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleConjunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:463:28: ( (kw= 'AND' | kw= 'OR' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:464:1: (kw= 'AND' | kw= 'OR' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:464:1: (kw= 'AND' | kw= 'OR' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:465:2: kw= 'AND'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleConjunction926); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConjunctionAccess().getANDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:472:2: kw= 'OR'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleConjunction945); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConjunctionAccess().getORKeyword_1()); 
                        

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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleCOMPARE"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:485:1: entryRuleCOMPARE returns [String current=null] : iv_ruleCOMPARE= ruleCOMPARE EOF ;
    public final String entryRuleCOMPARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMPARE = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:486:2: (iv_ruleCOMPARE= ruleCOMPARE EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:487:2: iv_ruleCOMPARE= ruleCOMPARE EOF
            {
             newCompositeNode(grammarAccess.getCOMPARERule()); 
            pushFollow(FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE986);
            iv_ruleCOMPARE=ruleCOMPARE();

            state._fsp--;

             current =iv_ruleCOMPARE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMPARE997); 

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
    // $ANTLR end "entryRuleCOMPARE"


    // $ANTLR start "ruleCOMPARE"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:494:1: ruleCOMPARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUALS_0= RULE_EQUALS | this_NOT_EQUALS_1= RULE_NOT_EQUALS | this_LESS_THAN_2= RULE_LESS_THAN | this_MORE_THAN_3= RULE_MORE_THAN ) ;
    public final AntlrDatatypeRuleToken ruleCOMPARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUALS_0=null;
        Token this_NOT_EQUALS_1=null;
        Token this_LESS_THAN_2=null;
        Token this_MORE_THAN_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:497:28: ( (this_EQUALS_0= RULE_EQUALS | this_NOT_EQUALS_1= RULE_NOT_EQUALS | this_LESS_THAN_2= RULE_LESS_THAN | this_MORE_THAN_3= RULE_MORE_THAN ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:498:1: (this_EQUALS_0= RULE_EQUALS | this_NOT_EQUALS_1= RULE_NOT_EQUALS | this_LESS_THAN_2= RULE_LESS_THAN | this_MORE_THAN_3= RULE_MORE_THAN )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:498:1: (this_EQUALS_0= RULE_EQUALS | this_NOT_EQUALS_1= RULE_NOT_EQUALS | this_LESS_THAN_2= RULE_LESS_THAN | this_MORE_THAN_3= RULE_MORE_THAN )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_EQUALS:
                {
                alt7=1;
                }
                break;
            case RULE_NOT_EQUALS:
                {
                alt7=2;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt7=3;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:498:6: this_EQUALS_0= RULE_EQUALS
                    {
                    this_EQUALS_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleCOMPARE1037); 

                    		current.merge(this_EQUALS_0);
                        
                     
                        newLeafNode(this_EQUALS_0, grammarAccess.getCOMPAREAccess().getEQUALSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:506:10: this_NOT_EQUALS_1= RULE_NOT_EQUALS
                    {
                    this_NOT_EQUALS_1=(Token)match(input,RULE_NOT_EQUALS,FOLLOW_RULE_NOT_EQUALS_in_ruleCOMPARE1063); 

                    		current.merge(this_NOT_EQUALS_1);
                        
                     
                        newLeafNode(this_NOT_EQUALS_1, grammarAccess.getCOMPAREAccess().getNOT_EQUALSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:514:10: this_LESS_THAN_2= RULE_LESS_THAN
                    {
                    this_LESS_THAN_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleCOMPARE1089); 

                    		current.merge(this_LESS_THAN_2);
                        
                     
                        newLeafNode(this_LESS_THAN_2, grammarAccess.getCOMPAREAccess().getLESS_THANTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:522:10: this_MORE_THAN_3= RULE_MORE_THAN
                    {
                    this_MORE_THAN_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleCOMPARE1115); 

                    		current.merge(this_MORE_THAN_3);
                        
                     
                        newLeafNode(this_MORE_THAN_3, grammarAccess.getCOMPAREAccess().getMORE_THANTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleCOMPARE"


    // $ANTLR start "entryRuleVALUE"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:537:1: entryRuleVALUE returns [String current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final String entryRuleVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:538:2: (iv_ruleVALUE= ruleVALUE EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:539:2: iv_ruleVALUE= ruleVALUE EOF
            {
             newCompositeNode(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE1161);
            iv_ruleVALUE=ruleVALUE();

            state._fsp--;

             current =iv_ruleVALUE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE1172); 

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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:546:1: ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:549:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:550:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:550:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:550:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVALUE1212); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getVALUEAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:558:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVALUE1238); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleVALUE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModel122 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleColumnList_in_ruleModel143 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModel155 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleModel176 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleQueryCondition_in_ruleModel197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDatabase281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase298 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDatabase316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDatabase333 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDatabase352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase369 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDatabase386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_entryRuleColumnList445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnList456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnList497 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleColumnList516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnList531 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_ruleColumnList558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryCondition_in_entryRuleQueryCondition598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryCondition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleQueryCondition645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleQueryCondition666 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleQueryCondition683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleQueryCondition703 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition793 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_ruleCondition819 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_ruleVALUE_in_ruleCondition840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConjunction926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConjunction945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMPARE997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleCOMPARE1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUALS_in_ruleCOMPARE1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleCOMPARE1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleCOMPARE1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVALUE1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVALUE1238 = new BitSet(new long[]{0x0000000000000002L});

}