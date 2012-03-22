package org.eclipselabs.mongo.query.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.mongo.query.services.MongoSQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMongoSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SINGED_LONG", "RULE_SIGNED_DOUBLE", "RULE_STRING", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SELECT'", "'FROM'", "'WHERE'", "'mongo://'", "':'", "'/'", "','", "'*'", "'OR'", "'AND'", "'('", "')'", "'?'", "'null'", "'true'", "'false'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'like'", "'not like'", "'not in'", "'in'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DATE=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SINGED_LONG=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SIGNED_DOUBLE=6;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalMongoSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMongoSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMongoSQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g"; }



     	private MongoSQLGrammarAccess grammarAccess;
     	
        public InternalMongoSQLParser(TokenStream input, MongoSQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MongoSQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_attrs_1_0 = null;

        EObject lv_db_3_0 = null;

        EObject lv_whereEntry_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:80:28: ( (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )? ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:81:1: (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )? )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:81:1: (otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:81:3: otherlv_0= 'SELECT' ( (lv_attrs_1_0= ruleColumnList ) ) otherlv_2= 'FROM' ( (lv_db_3_0= ruleDatabase ) ) (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSELECTKeyword_0());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:85:1: ( (lv_attrs_1_0= ruleColumnList ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:86:1: (lv_attrs_1_0= ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:86:1: (lv_attrs_1_0= ruleColumnList )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:87:3: lv_attrs_1_0= ruleColumnList
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFROMKeyword_2());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:107:1: ( (lv_db_3_0= ruleDatabase ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:108:1: (lv_db_3_0= ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:108:1: (lv_db_3_0= ruleDatabase )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:109:3: lv_db_3_0= ruleDatabase
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

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:125:2: (otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:125:4: otherlv_4= 'WHERE' ( (lv_whereEntry_5_0= ruleWhereEntry ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel189); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getWHEREKeyword_4_0());
                        
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:129:1: ( (lv_whereEntry_5_0= ruleWhereEntry ) )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:130:1: (lv_whereEntry_5_0= ruleWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:130:1: (lv_whereEntry_5_0= ruleWhereEntry )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:131:3: lv_whereEntry_5_0= ruleWhereEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getWhereEntryWhereEntryParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereEntry_in_ruleModel210);
                    lv_whereEntry_5_0=ruleWhereEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"whereEntry",
                            		lv_whereEntry_5_0, 
                            		"WhereEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:155:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:156:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:157:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase248);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase258); 

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
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:164:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) ) ;
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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:167:28: ( (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:168:1: (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:168:1: (otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:168:3: otherlv_0= 'mongo://' ( (lv_url_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )? otherlv_4= '/' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= '/' ( (lv_name_7_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDatabase295); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getMongoKeyword_0());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:172:1: ( (lv_url_1_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:173:1: (lv_url_1_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:173:1: (lv_url_1_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:174:3: lv_url_1_0= RULE_ID
            {
            lv_url_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase312); 

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

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:190:2: (otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:190:4: otherlv_2= ':' ( (lv_port_3_0= RULE_SINGED_LONG ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDatabase330); 

                        	newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getColonKeyword_2_0());
                        
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:194:1: ( (lv_port_3_0= RULE_SINGED_LONG ) )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:195:1: (lv_port_3_0= RULE_SINGED_LONG )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:195:1: (lv_port_3_0= RULE_SINGED_LONG )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:196:3: lv_port_3_0= RULE_SINGED_LONG
                    {
                    lv_port_3_0=(Token)match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_ruleDatabase347); 

                    			newLeafNode(lv_port_3_0, grammarAccess.getDatabaseAccess().getPortSINGED_LONGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDatabaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"port",
                            		lv_port_3_0, 
                            		"SINGED_LONG");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDatabase366); 

                	newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getSolidusKeyword_3());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:216:1: ( (lv_dbName_5_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:217:1: (lv_dbName_5_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:217:1: (lv_dbName_5_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:218:3: lv_dbName_5_0= RULE_ID
            {
            lv_dbName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase383); 

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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleDatabase400); 

                	newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getSolidusKeyword_5());
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:238:1: ( (lv_name_7_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:239:1: (lv_name_7_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:239:1: (lv_name_7_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:240:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase417); 

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
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:264:1: entryRuleColumnList returns [String current=null] : iv_ruleColumnList= ruleColumnList EOF ;
    public final String entryRuleColumnList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColumnList = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:265:2: (iv_ruleColumnList= ruleColumnList EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:266:2: iv_ruleColumnList= ruleColumnList EOF
            {
             newCompositeNode(grammarAccess.getColumnListRule()); 
            pushFollow(FOLLOW_ruleColumnList_in_entryRuleColumnList459);
            iv_ruleColumnList=ruleColumnList();

            state._fsp--;

             current =iv_ruleColumnList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnList470); 

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
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:273:1: ruleColumnList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleColumnList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:276:28: ( ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:277:1: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:277:1: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) | kw= '*' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:277:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:277:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:277:7: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnList511); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
                        
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:284:1: (kw= ',' this_ID_2= RULE_ID )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:285:2: kw= ',' this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,18,FOLLOW_18_in_ruleColumnList530); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
                    	        
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnList545); 

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
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:299:2: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleColumnList572); 

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


    // $ANTLR start "entryRuleWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:312:1: entryRuleWhereEntry returns [EObject current=null] : iv_ruleWhereEntry= ruleWhereEntry EOF ;
    public final EObject entryRuleWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereEntry = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:313:2: (iv_ruleWhereEntry= ruleWhereEntry EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:314:2: iv_ruleWhereEntry= ruleWhereEntry EOF
            {
             newCompositeNode(grammarAccess.getWhereEntryRule()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_entryRuleWhereEntry612);
            iv_ruleWhereEntry=ruleWhereEntry();

            state._fsp--;

             current =iv_ruleWhereEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereEntry622); 

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
    // $ANTLR end "entryRuleWhereEntry"


    // $ANTLR start "ruleWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:321:1: ruleWhereEntry returns [EObject current=null] : (this_AndWhereEntry_0= ruleAndWhereEntry ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )? ) ;
    public final EObject ruleWhereEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndWhereEntry_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:324:28: ( (this_AndWhereEntry_0= ruleAndWhereEntry ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )? ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:325:1: (this_AndWhereEntry_0= ruleAndWhereEntry ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )? )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:325:1: (this_AndWhereEntry_0= ruleAndWhereEntry ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:326:5: this_AndWhereEntry_0= ruleAndWhereEntry ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getWhereEntryAccess().getAndWhereEntryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndWhereEntry_in_ruleWhereEntry669);
            this_AndWhereEntry_0=ruleAndWhereEntry();

            state._fsp--;

             
                    current = this_AndWhereEntry_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:334:1: ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:334:2: () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:334:2: ()
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:335:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:340:2: (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:340:4: otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndWhereEntry ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleWhereEntry691); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getWhereEntryAccess().getORKeyword_1_1_0());
                    	        
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:344:1: ( (lv_entries_3_0= ruleAndWhereEntry ) )
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:345:1: (lv_entries_3_0= ruleAndWhereEntry )
                    	    {
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:345:1: (lv_entries_3_0= ruleAndWhereEntry )
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:346:3: lv_entries_3_0= ruleAndWhereEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWhereEntryAccess().getEntriesAndWhereEntryParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAndWhereEntry_in_ruleWhereEntry712);
                    	    lv_entries_3_0=ruleAndWhereEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWhereEntryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entries",
                    	            		lv_entries_3_0, 
                    	            		"AndWhereEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


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
    // $ANTLR end "ruleWhereEntry"


    // $ANTLR start "entryRuleAndWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:370:1: entryRuleAndWhereEntry returns [EObject current=null] : iv_ruleAndWhereEntry= ruleAndWhereEntry EOF ;
    public final EObject entryRuleAndWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndWhereEntry = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:371:2: (iv_ruleAndWhereEntry= ruleAndWhereEntry EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:372:2: iv_ruleAndWhereEntry= ruleAndWhereEntry EOF
            {
             newCompositeNode(grammarAccess.getAndWhereEntryRule()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_entryRuleAndWhereEntry752);
            iv_ruleAndWhereEntry=ruleAndWhereEntry();

            state._fsp--;

             current =iv_ruleAndWhereEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndWhereEntry762); 

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
    // $ANTLR end "entryRuleAndWhereEntry"


    // $ANTLR start "ruleAndWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:379:1: ruleAndWhereEntry returns [EObject current=null] : (this_ConcreteWhereEntry_0= ruleConcreteWhereEntry ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )? ) ;
    public final EObject ruleAndWhereEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteWhereEntry_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:382:28: ( (this_ConcreteWhereEntry_0= ruleConcreteWhereEntry ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )? ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:383:1: (this_ConcreteWhereEntry_0= ruleConcreteWhereEntry ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )? )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:383:1: (this_ConcreteWhereEntry_0= ruleConcreteWhereEntry ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:384:5: this_ConcreteWhereEntry_0= ruleConcreteWhereEntry ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAndWhereEntryAccess().getConcreteWhereEntryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_ruleAndWhereEntry809);
            this_ConcreteWhereEntry_0=ruleConcreteWhereEntry();

            state._fsp--;

             
                    current = this_ConcreteWhereEntry_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:392:1: ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:392:2: () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:392:2: ()
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:393:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:398:2: (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:398:4: otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteWhereEntry ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAndWhereEntry831); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAndWhereEntryAccess().getANDKeyword_1_1_0());
                    	        
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:402:1: ( (lv_entries_3_0= ruleConcreteWhereEntry ) )
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:403:1: (lv_entries_3_0= ruleConcreteWhereEntry )
                    	    {
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:403:1: (lv_entries_3_0= ruleConcreteWhereEntry )
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:404:3: lv_entries_3_0= ruleConcreteWhereEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAndWhereEntryAccess().getEntriesConcreteWhereEntryParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConcreteWhereEntry_in_ruleAndWhereEntry852);
                    	    lv_entries_3_0=ruleConcreteWhereEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAndWhereEntryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entries",
                    	            		lv_entries_3_0, 
                    	            		"ConcreteWhereEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


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
    // $ANTLR end "ruleAndWhereEntry"


    // $ANTLR start "entryRuleConcreteWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:428:1: entryRuleConcreteWhereEntry returns [EObject current=null] : iv_ruleConcreteWhereEntry= ruleConcreteWhereEntry EOF ;
    public final EObject entryRuleConcreteWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteWhereEntry = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:429:2: (iv_ruleConcreteWhereEntry= ruleConcreteWhereEntry EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:430:2: iv_ruleConcreteWhereEntry= ruleConcreteWhereEntry EOF
            {
             newCompositeNode(grammarAccess.getConcreteWhereEntryRule()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_entryRuleConcreteWhereEntry892);
            iv_ruleConcreteWhereEntry=ruleConcreteWhereEntry();

            state._fsp--;

             current =iv_ruleConcreteWhereEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteWhereEntry902); 

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
    // $ANTLR end "entryRuleConcreteWhereEntry"


    // $ANTLR start "ruleConcreteWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:437:1: ruleConcreteWhereEntry returns [EObject current=null] : (this_ParWhereEntry_0= ruleParWhereEntry | this_ExpressionWhereEntry_1= ruleExpressionWhereEntry ) ;
    public final EObject ruleConcreteWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ParWhereEntry_0 = null;

        EObject this_ExpressionWhereEntry_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:440:28: ( (this_ParWhereEntry_0= ruleParWhereEntry | this_ExpressionWhereEntry_1= ruleExpressionWhereEntry ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:441:1: (this_ParWhereEntry_0= ruleParWhereEntry | this_ExpressionWhereEntry_1= ruleExpressionWhereEntry )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:441:1: (this_ParWhereEntry_0= ruleParWhereEntry | this_ExpressionWhereEntry_1= ruleExpressionWhereEntry )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:442:5: this_ParWhereEntry_0= ruleParWhereEntry
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteWhereEntryAccess().getParWhereEntryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParWhereEntry_in_ruleConcreteWhereEntry949);
                    this_ParWhereEntry_0=ruleParWhereEntry();

                    state._fsp--;

                     
                            current = this_ParWhereEntry_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:452:5: this_ExpressionWhereEntry_1= ruleExpressionWhereEntry
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteWhereEntryAccess().getExpressionWhereEntryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpressionWhereEntry_in_ruleConcreteWhereEntry976);
                    this_ExpressionWhereEntry_1=ruleExpressionWhereEntry();

                    state._fsp--;

                     
                            current = this_ExpressionWhereEntry_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleConcreteWhereEntry"


    // $ANTLR start "entryRuleParWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:468:1: entryRuleParWhereEntry returns [EObject current=null] : iv_ruleParWhereEntry= ruleParWhereEntry EOF ;
    public final EObject entryRuleParWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParWhereEntry = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:469:2: (iv_ruleParWhereEntry= ruleParWhereEntry EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:470:2: iv_ruleParWhereEntry= ruleParWhereEntry EOF
            {
             newCompositeNode(grammarAccess.getParWhereEntryRule()); 
            pushFollow(FOLLOW_ruleParWhereEntry_in_entryRuleParWhereEntry1011);
            iv_ruleParWhereEntry=ruleParWhereEntry();

            state._fsp--;

             current =iv_ruleParWhereEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParWhereEntry1021); 

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
    // $ANTLR end "entryRuleParWhereEntry"


    // $ANTLR start "ruleParWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:477:1: ruleParWhereEntry returns [EObject current=null] : (otherlv_0= '(' this_WhereEntry_1= ruleWhereEntry otherlv_2= ')' ) ;
    public final EObject ruleParWhereEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_WhereEntry_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:480:28: ( (otherlv_0= '(' this_WhereEntry_1= ruleWhereEntry otherlv_2= ')' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:481:1: (otherlv_0= '(' this_WhereEntry_1= ruleWhereEntry otherlv_2= ')' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:481:1: (otherlv_0= '(' this_WhereEntry_1= ruleWhereEntry otherlv_2= ')' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:481:3: otherlv_0= '(' this_WhereEntry_1= ruleWhereEntry otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleParWhereEntry1058); 

                	newLeafNode(otherlv_0, grammarAccess.getParWhereEntryAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParWhereEntryAccess().getWhereEntryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleWhereEntry_in_ruleParWhereEntry1080);
            this_WhereEntry_1=ruleWhereEntry();

            state._fsp--;

             
                    current = this_WhereEntry_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleParWhereEntry1091); 

                	newLeafNode(otherlv_2, grammarAccess.getParWhereEntryAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParWhereEntry"


    // $ANTLR start "entryRuleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:506:1: entryRuleExpressionWhereEntry returns [EObject current=null] : iv_ruleExpressionWhereEntry= ruleExpressionWhereEntry EOF ;
    public final EObject entryRuleExpressionWhereEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionWhereEntry = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:507:2: (iv_ruleExpressionWhereEntry= ruleExpressionWhereEntry EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:508:2: iv_ruleExpressionWhereEntry= ruleExpressionWhereEntry EOF
            {
             newCompositeNode(grammarAccess.getExpressionWhereEntryRule()); 
            pushFollow(FOLLOW_ruleExpressionWhereEntry_in_entryRuleExpressionWhereEntry1127);
            iv_ruleExpressionWhereEntry=ruleExpressionWhereEntry();

            state._fsp--;

             current =iv_ruleExpressionWhereEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionWhereEntry1137); 

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
    // $ANTLR end "entryRuleExpressionWhereEntry"


    // $ANTLR start "ruleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:515:1: ruleExpressionWhereEntry returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionWhereEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:518:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:519:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:519:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:519:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:519:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:520:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:520:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:521:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionWhereEntry1179); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionWhereEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:537:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:538:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:538:1: (lv_operator_1_0= ruleOperator )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:539:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleExpressionWhereEntry1205);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionWhereEntryRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:555:2: ( (lv_rhs_2_0= ruleExpression ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:556:1: (lv_rhs_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:556:1: (lv_rhs_2_0= ruleExpression )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:557:3: lv_rhs_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionWhereEntry1226);
            lv_rhs_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionWhereEntryRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"Expression");
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
    // $ANTLR end "ruleExpressionWhereEntry"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:581:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:582:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:583:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1262);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1272); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:590:1: ruleExpression returns [EObject current=null] : (this_DoubleExpression_0= ruleDoubleExpression | this_LongExpression_1= ruleLongExpression | this_StringExpression_2= ruleStringExpression | this_NullExpression_3= ruleNullExpression | this_DateExpression_4= ruleDateExpression | this_BooleanExpression_5= ruleBooleanExpression | this_ReplacableValue_6= ruleReplacableValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DoubleExpression_0 = null;

        EObject this_LongExpression_1 = null;

        EObject this_StringExpression_2 = null;

        EObject this_NullExpression_3 = null;

        EObject this_DateExpression_4 = null;

        EObject this_BooleanExpression_5 = null;

        EObject this_ReplacableValue_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:593:28: ( (this_DoubleExpression_0= ruleDoubleExpression | this_LongExpression_1= ruleLongExpression | this_StringExpression_2= ruleStringExpression | this_NullExpression_3= ruleNullExpression | this_DateExpression_4= ruleDateExpression | this_BooleanExpression_5= ruleBooleanExpression | this_ReplacableValue_6= ruleReplacableValue ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:594:1: (this_DoubleExpression_0= ruleDoubleExpression | this_LongExpression_1= ruleLongExpression | this_StringExpression_2= ruleStringExpression | this_NullExpression_3= ruleNullExpression | this_DateExpression_4= ruleDateExpression | this_BooleanExpression_5= ruleBooleanExpression | this_ReplacableValue_6= ruleReplacableValue )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:594:1: (this_DoubleExpression_0= ruleDoubleExpression | this_LongExpression_1= ruleLongExpression | this_StringExpression_2= ruleStringExpression | this_NullExpression_3= ruleNullExpression | this_DateExpression_4= ruleDateExpression | this_BooleanExpression_5= ruleBooleanExpression | this_ReplacableValue_6= ruleReplacableValue )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_DOUBLE:
                {
                alt10=1;
                }
                break;
            case RULE_SINGED_LONG:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case RULE_DATE:
                {
                alt10=5;
                }
                break;
            case 26:
            case 27:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:595:5: this_DoubleExpression_0= ruleDoubleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getDoubleExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDoubleExpression_in_ruleExpression1319);
                    this_DoubleExpression_0=ruleDoubleExpression();

                    state._fsp--;

                     
                            current = this_DoubleExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:605:5: this_LongExpression_1= ruleLongExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLongExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongExpression_in_ruleExpression1346);
                    this_LongExpression_1=ruleLongExpression();

                    state._fsp--;

                     
                            current = this_LongExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:615:5: this_StringExpression_2= ruleStringExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleExpression1373);
                    this_StringExpression_2=ruleStringExpression();

                    state._fsp--;

                     
                            current = this_StringExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:625:5: this_NullExpression_3= ruleNullExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNullExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleExpression1400);
                    this_NullExpression_3=ruleNullExpression();

                    state._fsp--;

                     
                            current = this_NullExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:635:5: this_DateExpression_4= ruleDateExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getDateExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDateExpression_in_ruleExpression1427);
                    this_DateExpression_4=ruleDateExpression();

                    state._fsp--;

                     
                            current = this_DateExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:645:5: this_BooleanExpression_5= ruleBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression1454);
                    this_BooleanExpression_5=ruleBooleanExpression();

                    state._fsp--;

                     
                            current = this_BooleanExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:655:5: this_ReplacableValue_6= ruleReplacableValue
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getReplacableValueParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleReplacableValue_in_ruleExpression1481);
                    this_ReplacableValue_6=ruleReplacableValue();

                    state._fsp--;

                     
                            current = this_ReplacableValue_6; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleReplacableValue"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:671:1: entryRuleReplacableValue returns [EObject current=null] : iv_ruleReplacableValue= ruleReplacableValue EOF ;
    public final EObject entryRuleReplacableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplacableValue = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:672:2: (iv_ruleReplacableValue= ruleReplacableValue EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:673:2: iv_ruleReplacableValue= ruleReplacableValue EOF
            {
             newCompositeNode(grammarAccess.getReplacableValueRule()); 
            pushFollow(FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue1516);
            iv_ruleReplacableValue=ruleReplacableValue();

            state._fsp--;

             current =iv_ruleReplacableValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplacableValue1526); 

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
    // $ANTLR end "entryRuleReplacableValue"


    // $ANTLR start "ruleReplacableValue"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:680:1: ruleReplacableValue returns [EObject current=null] : ( (lv_value_0_0= '?' ) ) ;
    public final EObject ruleReplacableValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:683:28: ( ( (lv_value_0_0= '?' ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:684:1: ( (lv_value_0_0= '?' ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:684:1: ( (lv_value_0_0= '?' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:685:1: (lv_value_0_0= '?' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:685:1: (lv_value_0_0= '?' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:686:3: lv_value_0_0= '?'
            {
            lv_value_0_0=(Token)match(input,24,FOLLOW_24_in_ruleReplacableValue1568); 

                    newLeafNode(lv_value_0_0, grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReplacableValueRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "?");
            	    

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
    // $ANTLR end "ruleReplacableValue"


    // $ANTLR start "entryRuleDoubleExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:707:1: entryRuleDoubleExpression returns [EObject current=null] : iv_ruleDoubleExpression= ruleDoubleExpression EOF ;
    public final EObject entryRuleDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:708:2: (iv_ruleDoubleExpression= ruleDoubleExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:709:2: iv_ruleDoubleExpression= ruleDoubleExpression EOF
            {
             newCompositeNode(grammarAccess.getDoubleExpressionRule()); 
            pushFollow(FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression1616);
            iv_ruleDoubleExpression=ruleDoubleExpression();

            state._fsp--;

             current =iv_ruleDoubleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleExpression1626); 

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
    // $ANTLR end "entryRuleDoubleExpression"


    // $ANTLR start "ruleDoubleExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:716:1: ruleDoubleExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_SIGNED_DOUBLE ) ) ;
    public final EObject ruleDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:719:28: ( ( (lv_value_0_0= RULE_SIGNED_DOUBLE ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:720:1: ( (lv_value_0_0= RULE_SIGNED_DOUBLE ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:720:1: ( (lv_value_0_0= RULE_SIGNED_DOUBLE ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:721:1: (lv_value_0_0= RULE_SIGNED_DOUBLE )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:721:1: (lv_value_0_0= RULE_SIGNED_DOUBLE )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:722:3: lv_value_0_0= RULE_SIGNED_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_SIGNED_DOUBLE,FOLLOW_RULE_SIGNED_DOUBLE_in_ruleDoubleExpression1667); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDoubleExpressionAccess().getValueSIGNED_DOUBLETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SIGNED_DOUBLE");
            	    

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
    // $ANTLR end "ruleDoubleExpression"


    // $ANTLR start "entryRuleLongExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:746:1: entryRuleLongExpression returns [EObject current=null] : iv_ruleLongExpression= ruleLongExpression EOF ;
    public final EObject entryRuleLongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:747:2: (iv_ruleLongExpression= ruleLongExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:748:2: iv_ruleLongExpression= ruleLongExpression EOF
            {
             newCompositeNode(grammarAccess.getLongExpressionRule()); 
            pushFollow(FOLLOW_ruleLongExpression_in_entryRuleLongExpression1707);
            iv_ruleLongExpression=ruleLongExpression();

            state._fsp--;

             current =iv_ruleLongExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongExpression1717); 

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
    // $ANTLR end "entryRuleLongExpression"


    // $ANTLR start "ruleLongExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:755:1: ruleLongExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_SINGED_LONG ) ) ;
    public final EObject ruleLongExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:758:28: ( ( (lv_value_0_0= RULE_SINGED_LONG ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:759:1: ( (lv_value_0_0= RULE_SINGED_LONG ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:759:1: ( (lv_value_0_0= RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:760:1: (lv_value_0_0= RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:760:1: (lv_value_0_0= RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:761:3: lv_value_0_0= RULE_SINGED_LONG
            {
            lv_value_0_0=(Token)match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_ruleLongExpression1758); 

            			newLeafNode(lv_value_0_0, grammarAccess.getLongExpressionAccess().getValueSINGED_LONGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLongExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SINGED_LONG");
            	    

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
    // $ANTLR end "ruleLongExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:785:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:786:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:787:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression1798);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression1808); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:794:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:797:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:798:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:798:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:799:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:799:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:800:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression1849); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:824:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:825:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:826:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression1889);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression1899); 

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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:833:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:836:28: ( ( (lv_value_0_0= 'null' ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:837:1: ( (lv_value_0_0= 'null' ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:837:1: ( (lv_value_0_0= 'null' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:838:1: (lv_value_0_0= 'null' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:838:1: (lv_value_0_0= 'null' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:839:3: lv_value_0_0= 'null'
            {
            lv_value_0_0=(Token)match(input,25,FOLLOW_25_in_ruleNullExpression1941); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNullExpressionAccess().getValueNullKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullExpressionRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "null");
            	    

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleDateExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:860:1: entryRuleDateExpression returns [EObject current=null] : iv_ruleDateExpression= ruleDateExpression EOF ;
    public final EObject entryRuleDateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:861:2: (iv_ruleDateExpression= ruleDateExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:862:2: iv_ruleDateExpression= ruleDateExpression EOF
            {
             newCompositeNode(grammarAccess.getDateExpressionRule()); 
            pushFollow(FOLLOW_ruleDateExpression_in_entryRuleDateExpression1989);
            iv_ruleDateExpression=ruleDateExpression();

            state._fsp--;

             current =iv_ruleDateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateExpression1999); 

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
    // $ANTLR end "entryRuleDateExpression"


    // $ANTLR start "ruleDateExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:869:1: ruleDateExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:872:28: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:873:1: ( (lv_value_0_0= RULE_DATE ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:873:1: ( (lv_value_0_0= RULE_DATE ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:874:1: (lv_value_0_0= RULE_DATE )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:874:1: (lv_value_0_0= RULE_DATE )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:875:3: lv_value_0_0= RULE_DATE
            {
            lv_value_0_0=(Token)match(input,RULE_DATE,FOLLOW_RULE_DATE_in_ruleDateExpression2040); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDateExpressionAccess().getValueDATETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DATE");
            	    

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
    // $ANTLR end "ruleDateExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:899:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:900:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:901:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2080);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression2090); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:908:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_true_0_0= 'true' ) ) | ( (lv_true_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_true_0_0=null;
        Token lv_true_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:911:28: ( ( ( (lv_true_0_0= 'true' ) ) | ( (lv_true_1_0= 'false' ) ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:912:1: ( ( (lv_true_0_0= 'true' ) ) | ( (lv_true_1_0= 'false' ) ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:912:1: ( ( (lv_true_0_0= 'true' ) ) | ( (lv_true_1_0= 'false' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:912:2: ( (lv_true_0_0= 'true' ) )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:912:2: ( (lv_true_0_0= 'true' ) )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:913:1: (lv_true_0_0= 'true' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:913:1: (lv_true_0_0= 'true' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:914:3: lv_true_0_0= 'true'
                    {
                    lv_true_0_0=(Token)match(input,26,FOLLOW_26_in_ruleBooleanExpression2133); 

                            newLeafNode(lv_true_0_0, grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "true", lv_true_0_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:928:6: ( (lv_true_1_0= 'false' ) )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:928:6: ( (lv_true_1_0= 'false' ) )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:929:1: (lv_true_1_0= 'false' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:929:1: (lv_true_1_0= 'false' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:930:3: lv_true_1_0= 'false'
                    {
                    lv_true_1_0=(Token)match(input,27,FOLLOW_27_in_ruleBooleanExpression2170); 

                            newLeafNode(lv_true_1_0, grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "true", lv_true_1_0, "false");
                    	    

                    }


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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "ruleOperator"
    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:951:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= 'like' ) | (enumLiteral_7= 'not like' ) | (enumLiteral_8= 'not in' ) | (enumLiteral_9= 'in' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:953:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= 'like' ) | (enumLiteral_7= 'not like' ) | (enumLiteral_8= 'not in' ) | (enumLiteral_9= 'in' ) ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:954:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= 'like' ) | (enumLiteral_7= 'not like' ) | (enumLiteral_8= 'not in' ) | (enumLiteral_9= 'in' ) )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:954:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= 'like' ) | (enumLiteral_7= 'not like' ) | (enumLiteral_8= 'not in' ) | (enumLiteral_9= 'in' ) )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            case 32:
                {
                alt12=5;
                }
                break;
            case 33:
                {
                alt12=6;
                }
                break;
            case 34:
                {
                alt12=7;
                }
                break;
            case 35:
                {
                alt12=8;
                }
                break;
            case 36:
                {
                alt12=9;
                }
                break;
            case 37:
                {
                alt12=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:954:2: (enumLiteral_0= '<' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:954:2: (enumLiteral_0= '<' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:954:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleOperator2233); 

                            current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:960:6: (enumLiteral_1= '>' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:960:6: (enumLiteral_1= '>' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:960:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleOperator2250); 

                            current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:966:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:966:6: (enumLiteral_2= '<=' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:966:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleOperator2267); 

                            current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:972:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:972:6: (enumLiteral_3= '>=' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:972:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleOperator2284); 

                            current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:978:6: (enumLiteral_4= '=' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:978:6: (enumLiteral_4= '=' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:978:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleOperator2301); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:984:6: (enumLiteral_5= '!=' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:984:6: (enumLiteral_5= '!=' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:984:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_33_in_ruleOperator2318); 

                            current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:990:6: (enumLiteral_6= 'like' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:990:6: (enumLiteral_6= 'like' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:990:8: enumLiteral_6= 'like'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_34_in_ruleOperator2335); 

                            current = grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:996:6: (enumLiteral_7= 'not like' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:996:6: (enumLiteral_7= 'not like' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:996:8: enumLiteral_7= 'not like'
                    {
                    enumLiteral_7=(Token)match(input,35,FOLLOW_35_in_ruleOperator2352); 

                            current = grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1002:6: (enumLiteral_8= 'not in' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1002:6: (enumLiteral_8= 'not in' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1002:8: enumLiteral_8= 'not in'
                    {
                    enumLiteral_8=(Token)match(input,36,FOLLOW_36_in_ruleOperator2369); 

                            current = grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1008:6: (enumLiteral_9= 'in' )
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1008:6: (enumLiteral_9= 'in' )
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1008:8: enumLiteral_9= 'in'
                    {
                    enumLiteral_9=(Token)match(input,37,FOLLOW_37_in_ruleOperator2386); 

                            current = grammarAccess.getOperatorAccess().getInEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getOperatorAccess().getInEnumLiteralDeclaration_9()); 
                        

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleColumnList_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel155 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleModel176 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleModel189 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_ruleModel210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDatabase295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase312 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleDatabase330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_ruleDatabase347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDatabase366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase383 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDatabase400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_entryRuleColumnList459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnList470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnList511 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleColumnList530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnList545 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19_in_ruleColumnList572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_entryRuleWhereEntry612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereEntry622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_ruleWhereEntry669 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleWhereEntry691 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_ruleWhereEntry712 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_entryRuleAndWhereEntry752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndWhereEntry762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_ruleAndWhereEntry809 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAndWhereEntry831 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_ruleAndWhereEntry852 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_entryRuleConcreteWhereEntry892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteWhereEntry902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParWhereEntry_in_ruleConcreteWhereEntry949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWhereEntry_in_ruleConcreteWhereEntry976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParWhereEntry_in_entryRuleParWhereEntry1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParWhereEntry1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleParWhereEntry1058 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_ruleParWhereEntry1080 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParWhereEntry1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWhereEntry_in_entryRuleExpressionWhereEntry1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionWhereEntry1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionWhereEntry1179 = new BitSet(new long[]{0x0000003FF0000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpressionWhereEntry1205 = new BitSet(new long[]{0x000000000F0001E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionWhereEntry1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_ruleExpression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_ruleExpression1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleExpression1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_ruleExpression1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_ruleExpression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue1516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplacableValue1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReplacableValue1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleExpression1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_DOUBLE_in_ruleDoubleExpression1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_entryRuleLongExpression1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongExpression1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_ruleLongExpression1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNullExpression1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_entryRuleDateExpression1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateExpression1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_ruleDateExpression2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBooleanExpression2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBooleanExpression2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator2386 = new BitSet(new long[]{0x0000000000000002L});

}