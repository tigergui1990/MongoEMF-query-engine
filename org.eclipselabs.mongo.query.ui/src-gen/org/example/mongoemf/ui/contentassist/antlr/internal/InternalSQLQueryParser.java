package org.example.mongoemf.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.example.mongoemf.services.SQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUALS", "RULE_NOT_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_LESS_EQUAL", "RULE_MORE_EQUAL", "RULE_LIKE", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'AND'", "'OR'", "'SELECT'", "'FROM'", "'mongo://'", "'/'", "':'", "','", "'WHERE'"
    };
    public static final int RULE_ID=13;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_LIKE=10;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_MORE_THAN=7;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=15;
    public static final int EOF=-1;
    public static final int RULE_NOT_EQUALS=5;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_STRING=12;
    public static final int T__18=18;
    public static final int RULE_MORE_EQUAL=9;
    public static final int RULE_LESS_EQUAL=8;
    public static final int RULE_INT=11;
    public static final int RULE_EQUALS=4;
    public static final int RULE_WS=16;
    public static final int RULE_LESS_THAN=6;

    // delegates
    // delegators


        public InternalSQLQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLQueryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g"; }


     
     	private SQLQueryGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SQLQueryGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatabase"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:88:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:89:1: ( ruleDatabase EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:90:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase121);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase128); 

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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:97:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:101:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:102:1: ( ( rule__Database__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:102:1: ( ( rule__Database__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:103:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:104:1: ( rule__Database__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:104:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase154);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleColumnList"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:116:1: entryRuleColumnList : ruleColumnList EOF ;
    public final void entryRuleColumnList() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:117:1: ( ruleColumnList EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:118:1: ruleColumnList EOF
            {
             before(grammarAccess.getColumnListRule()); 
            pushFollow(FOLLOW_ruleColumnList_in_entryRuleColumnList181);
            ruleColumnList();

            state._fsp--;

             after(grammarAccess.getColumnListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnList188); 

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
    // $ANTLR end "entryRuleColumnList"


    // $ANTLR start "ruleColumnList"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:125:1: ruleColumnList : ( ( rule__ColumnList__Alternatives ) ) ;
    public final void ruleColumnList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:129:2: ( ( ( rule__ColumnList__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:130:1: ( ( rule__ColumnList__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:130:1: ( ( rule__ColumnList__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:131:1: ( rule__ColumnList__Alternatives )
            {
             before(grammarAccess.getColumnListAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:132:1: ( rule__ColumnList__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:132:2: rule__ColumnList__Alternatives
            {
            pushFollow(FOLLOW_rule__ColumnList__Alternatives_in_ruleColumnList214);
            rule__ColumnList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnList"


    // $ANTLR start "entryRuleQueryCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:144:1: entryRuleQueryCondition : ruleQueryCondition EOF ;
    public final void entryRuleQueryCondition() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:145:1: ( ruleQueryCondition EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:146:1: ruleQueryCondition EOF
            {
             before(grammarAccess.getQueryConditionRule()); 
            pushFollow(FOLLOW_ruleQueryCondition_in_entryRuleQueryCondition241);
            ruleQueryCondition();

            state._fsp--;

             after(grammarAccess.getQueryConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryCondition248); 

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
    // $ANTLR end "entryRuleQueryCondition"


    // $ANTLR start "ruleQueryCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:153:1: ruleQueryCondition : ( ( rule__QueryCondition__Group__0 ) ) ;
    public final void ruleQueryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:157:2: ( ( ( rule__QueryCondition__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:158:1: ( ( rule__QueryCondition__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:158:1: ( ( rule__QueryCondition__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:159:1: ( rule__QueryCondition__Group__0 )
            {
             before(grammarAccess.getQueryConditionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:160:1: ( rule__QueryCondition__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:160:2: rule__QueryCondition__Group__0
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__0_in_ruleQueryCondition274);
            rule__QueryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryCondition"


    // $ANTLR start "entryRuleFollowCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:172:1: entryRuleFollowCondition : ruleFollowCondition EOF ;
    public final void entryRuleFollowCondition() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:173:1: ( ruleFollowCondition EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:174:1: ruleFollowCondition EOF
            {
             before(grammarAccess.getFollowConditionRule()); 
            pushFollow(FOLLOW_ruleFollowCondition_in_entryRuleFollowCondition301);
            ruleFollowCondition();

            state._fsp--;

             after(grammarAccess.getFollowConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowCondition308); 

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
    // $ANTLR end "entryRuleFollowCondition"


    // $ANTLR start "ruleFollowCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:181:1: ruleFollowCondition : ( ( rule__FollowCondition__Group__0 ) ) ;
    public final void ruleFollowCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:185:2: ( ( ( rule__FollowCondition__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:186:1: ( ( rule__FollowCondition__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:186:1: ( ( rule__FollowCondition__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:187:1: ( rule__FollowCondition__Group__0 )
            {
             before(grammarAccess.getFollowConditionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:188:1: ( rule__FollowCondition__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:188:2: rule__FollowCondition__Group__0
            {
            pushFollow(FOLLOW_rule__FollowCondition__Group__0_in_ruleFollowCondition334);
            rule__FollowCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowCondition"


    // $ANTLR start "entryRuleCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:200:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:201:1: ( ruleCondition EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:202:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition361);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition368); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:209:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:213:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:214:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:214:1: ( ( rule__Condition__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:215:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:216:1: ( rule__Condition__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:216:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition394);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConjunction"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:228:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:229:1: ( ruleConjunction EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:230:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction421);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction428); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:237:1: ruleConjunction : ( ( rule__Conjunction__Alternatives ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:241:2: ( ( ( rule__Conjunction__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:242:1: ( ( rule__Conjunction__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:242:1: ( ( rule__Conjunction__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:243:1: ( rule__Conjunction__Alternatives )
            {
             before(grammarAccess.getConjunctionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:244:1: ( rule__Conjunction__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:244:2: rule__Conjunction__Alternatives
            {
            pushFollow(FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction454);
            rule__Conjunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleCOMPARE"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:256:1: entryRuleCOMPARE : ruleCOMPARE EOF ;
    public final void entryRuleCOMPARE() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:257:1: ( ruleCOMPARE EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:258:1: ruleCOMPARE EOF
            {
             before(grammarAccess.getCOMPARERule()); 
            pushFollow(FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE481);
            ruleCOMPARE();

            state._fsp--;

             after(grammarAccess.getCOMPARERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMPARE488); 

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
    // $ANTLR end "entryRuleCOMPARE"


    // $ANTLR start "ruleCOMPARE"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:265:1: ruleCOMPARE : ( ( rule__COMPARE__Alternatives ) ) ;
    public final void ruleCOMPARE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:269:2: ( ( ( rule__COMPARE__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:270:1: ( ( rule__COMPARE__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:270:1: ( ( rule__COMPARE__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:271:1: ( rule__COMPARE__Alternatives )
            {
             before(grammarAccess.getCOMPAREAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:272:1: ( rule__COMPARE__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:272:2: rule__COMPARE__Alternatives
            {
            pushFollow(FOLLOW_rule__COMPARE__Alternatives_in_ruleCOMPARE514);
            rule__COMPARE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOMPAREAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMPARE"


    // $ANTLR start "entryRuleVALUE"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:284:1: entryRuleVALUE : ruleVALUE EOF ;
    public final void entryRuleVALUE() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:285:1: ( ruleVALUE EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:286:1: ruleVALUE EOF
            {
             before(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE541);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getVALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE548); 

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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:293:1: ruleVALUE : ( ( rule__VALUE__Alternatives ) ) ;
    public final void ruleVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:297:2: ( ( ( rule__VALUE__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:298:1: ( ( rule__VALUE__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:298:1: ( ( rule__VALUE__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:299:1: ( rule__VALUE__Alternatives )
            {
             before(grammarAccess.getVALUEAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:300:1: ( rule__VALUE__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:300:2: rule__VALUE__Alternatives
            {
            pushFollow(FOLLOW_rule__VALUE__Alternatives_in_ruleVALUE574);
            rule__VALUE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALUEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "rule__ColumnList__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:312:1: rule__ColumnList__Alternatives : ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) );
    public final void rule__ColumnList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:316:1: ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:317:1: ( ( rule__ColumnList__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:317:1: ( ( rule__ColumnList__Group_0__0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:318:1: ( rule__ColumnList__Group_0__0 )
                    {
                     before(grammarAccess.getColumnListAccess().getGroup_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:319:1: ( rule__ColumnList__Group_0__0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:319:2: rule__ColumnList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives610);
                    rule__ColumnList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:323:6: ( '*' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:323:6: ( '*' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:324:1: '*'
                    {
                     before(grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__ColumnList__Alternatives629); 
                     after(grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Alternatives"


    // $ANTLR start "rule__Conjunction__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:336:1: rule__Conjunction__Alternatives : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__Conjunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:340:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:341:1: ( 'AND' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:341:1: ( 'AND' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:342:1: 'AND'
                    {
                     before(grammarAccess.getConjunctionAccess().getANDKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__Conjunction__Alternatives664); 
                     after(grammarAccess.getConjunctionAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:349:6: ( 'OR' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:349:6: ( 'OR' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:350:1: 'OR'
                    {
                     before(grammarAccess.getConjunctionAccess().getORKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__Conjunction__Alternatives684); 
                     after(grammarAccess.getConjunctionAccess().getORKeyword_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Alternatives"


    // $ANTLR start "rule__COMPARE__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:362:1: rule__COMPARE__Alternatives : ( ( RULE_EQUALS ) | ( RULE_NOT_EQUALS ) | ( RULE_LESS_THAN ) | ( RULE_MORE_THAN ) | ( RULE_LESS_EQUAL ) | ( RULE_MORE_EQUAL ) | ( RULE_LIKE ) );
    public final void rule__COMPARE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:366:1: ( ( RULE_EQUALS ) | ( RULE_NOT_EQUALS ) | ( RULE_LESS_THAN ) | ( RULE_MORE_THAN ) | ( RULE_LESS_EQUAL ) | ( RULE_MORE_EQUAL ) | ( RULE_LIKE ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_EQUALS:
                {
                alt3=1;
                }
                break;
            case RULE_NOT_EQUALS:
                {
                alt3=2;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt3=3;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt3=4;
                }
                break;
            case RULE_LESS_EQUAL:
                {
                alt3=5;
                }
                break;
            case RULE_MORE_EQUAL:
                {
                alt3=6;
                }
                break;
            case RULE_LIKE:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:367:1: ( RULE_EQUALS )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:367:1: ( RULE_EQUALS )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:368:1: RULE_EQUALS
                    {
                     before(grammarAccess.getCOMPAREAccess().getEQUALSTerminalRuleCall_0()); 
                    match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__COMPARE__Alternatives718); 
                     after(grammarAccess.getCOMPAREAccess().getEQUALSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:373:6: ( RULE_NOT_EQUALS )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:373:6: ( RULE_NOT_EQUALS )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:374:1: RULE_NOT_EQUALS
                    {
                     before(grammarAccess.getCOMPAREAccess().getNOT_EQUALSTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUALS,FOLLOW_RULE_NOT_EQUALS_in_rule__COMPARE__Alternatives735); 
                     after(grammarAccess.getCOMPAREAccess().getNOT_EQUALSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:379:6: ( RULE_LESS_THAN )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:379:6: ( RULE_LESS_THAN )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:380:1: RULE_LESS_THAN
                    {
                     before(grammarAccess.getCOMPAREAccess().getLESS_THANTerminalRuleCall_2()); 
                    match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rule__COMPARE__Alternatives752); 
                     after(grammarAccess.getCOMPAREAccess().getLESS_THANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:385:6: ( RULE_MORE_THAN )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:385:6: ( RULE_MORE_THAN )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:386:1: RULE_MORE_THAN
                    {
                     before(grammarAccess.getCOMPAREAccess().getMORE_THANTerminalRuleCall_3()); 
                    match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rule__COMPARE__Alternatives769); 
                     after(grammarAccess.getCOMPAREAccess().getMORE_THANTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:391:6: ( RULE_LESS_EQUAL )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:391:6: ( RULE_LESS_EQUAL )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:392:1: RULE_LESS_EQUAL
                    {
                     before(grammarAccess.getCOMPAREAccess().getLESS_EQUALTerminalRuleCall_4()); 
                    match(input,RULE_LESS_EQUAL,FOLLOW_RULE_LESS_EQUAL_in_rule__COMPARE__Alternatives786); 
                     after(grammarAccess.getCOMPAREAccess().getLESS_EQUALTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:397:6: ( RULE_MORE_EQUAL )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:397:6: ( RULE_MORE_EQUAL )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:398:1: RULE_MORE_EQUAL
                    {
                     before(grammarAccess.getCOMPAREAccess().getMORE_EQUALTerminalRuleCall_5()); 
                    match(input,RULE_MORE_EQUAL,FOLLOW_RULE_MORE_EQUAL_in_rule__COMPARE__Alternatives803); 
                     after(grammarAccess.getCOMPAREAccess().getMORE_EQUALTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:403:6: ( RULE_LIKE )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:403:6: ( RULE_LIKE )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:404:1: RULE_LIKE
                    {
                     before(grammarAccess.getCOMPAREAccess().getLIKETerminalRuleCall_6()); 
                    match(input,RULE_LIKE,FOLLOW_RULE_LIKE_in_rule__COMPARE__Alternatives820); 
                     after(grammarAccess.getCOMPAREAccess().getLIKETerminalRuleCall_6()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARE__Alternatives"


    // $ANTLR start "rule__VALUE__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:414:1: rule__VALUE__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:418:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:419:1: ( RULE_INT )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:419:1: ( RULE_INT )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:420:1: RULE_INT
                    {
                     before(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VALUE__Alternatives852); 
                     after(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:425:6: ( RULE_STRING )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:425:6: ( RULE_STRING )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:426:1: RULE_STRING
                    {
                     before(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VALUE__Alternatives869); 
                     after(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:438:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:442:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:443:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0899);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0902);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:450:1: rule__Model__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:454:1: ( ( 'SELECT' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:455:1: ( 'SELECT' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:455:1: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:456:1: 'SELECT'
            {
             before(grammarAccess.getModelAccess().getSELECTKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__0__Impl930); 
             after(grammarAccess.getModelAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:469:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:473:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:474:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1961);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1964);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:481:1: rule__Model__Group__1__Impl : ( ( rule__Model__AttrsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:485:1: ( ( ( rule__Model__AttrsAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:486:1: ( ( rule__Model__AttrsAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:486:1: ( ( rule__Model__AttrsAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:487:1: ( rule__Model__AttrsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAttrsAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:488:1: ( rule__Model__AttrsAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:488:2: rule__Model__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl991);
            rule__Model__AttrsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAttrsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:498:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:502:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:503:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21021);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21024);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:510:1: rule__Model__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:514:1: ( ( 'FROM' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:515:1: ( 'FROM' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:515:1: ( 'FROM' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:516:1: 'FROM'
            {
             before(grammarAccess.getModelAccess().getFROMKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__2__Impl1052); 
             after(grammarAccess.getModelAccess().getFROMKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:529:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:533:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:534:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31083);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31086);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:541:1: rule__Model__Group__3__Impl : ( ( rule__Model__DbAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:545:1: ( ( ( rule__Model__DbAssignment_3 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:546:1: ( ( rule__Model__DbAssignment_3 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:546:1: ( ( rule__Model__DbAssignment_3 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:547:1: ( rule__Model__DbAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDbAssignment_3()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:548:1: ( rule__Model__DbAssignment_3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:548:2: rule__Model__DbAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1113);
            rule__Model__DbAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDbAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:558:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:562:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:563:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41143);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:569:1: rule__Model__Group__4__Impl : ( ( rule__Model__QueryAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:573:1: ( ( ( rule__Model__QueryAssignment_4 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:574:1: ( ( rule__Model__QueryAssignment_4 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:574:1: ( ( rule__Model__QueryAssignment_4 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:575:1: ( rule__Model__QueryAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getQueryAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:576:1: ( rule__Model__QueryAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:576:2: rule__Model__QueryAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__QueryAssignment_4_in_rule__Model__Group__4__Impl1170);
                    rule__Model__QueryAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getQueryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:596:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:600:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:601:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01211);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01214);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:608:1: rule__Database__Group__0__Impl : ( 'mongo://' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:612:1: ( ( 'mongo://' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:613:1: ( 'mongo://' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:613:1: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:614:1: 'mongo://'
            {
             before(grammarAccess.getDatabaseAccess().getMongoKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Database__Group__0__Impl1242); 
             after(grammarAccess.getDatabaseAccess().getMongoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:627:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:631:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:632:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11273);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11276);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:639:1: rule__Database__Group__1__Impl : ( ( rule__Database__UrlAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:643:1: ( ( ( rule__Database__UrlAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:644:1: ( ( rule__Database__UrlAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:644:1: ( ( rule__Database__UrlAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:645:1: ( rule__Database__UrlAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:646:1: ( rule__Database__UrlAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:646:2: rule__Database__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl1303);
            rule__Database__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:656:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:660:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:661:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21333);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21336);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:668:1: rule__Database__Group__2__Impl : ( ( rule__Database__Group_2__0 )? ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:672:1: ( ( ( rule__Database__Group_2__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:673:1: ( ( rule__Database__Group_2__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:673:1: ( ( rule__Database__Group_2__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:674:1: ( rule__Database__Group_2__0 )?
            {
             before(grammarAccess.getDatabaseAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:675:1: ( rule__Database__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:675:2: rule__Database__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl1363);
                    rule__Database__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatabaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:685:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:689:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:690:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31394);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31397);
            rule__Database__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:697:1: rule__Database__Group__3__Impl : ( '/' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:701:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:702:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:702:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:703:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Database__Group__3__Impl1425); 
             after(grammarAccess.getDatabaseAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:716:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:720:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:721:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41456);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__5_in_rule__Database__Group__41459);
            rule__Database__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:728:1: rule__Database__Group__4__Impl : ( ( rule__Database__DbNameAssignment_4 ) ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:732:1: ( ( ( rule__Database__DbNameAssignment_4 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:733:1: ( ( rule__Database__DbNameAssignment_4 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:733:1: ( ( rule__Database__DbNameAssignment_4 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:734:1: ( rule__Database__DbNameAssignment_4 )
            {
             before(grammarAccess.getDatabaseAccess().getDbNameAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:735:1: ( rule__Database__DbNameAssignment_4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:735:2: rule__Database__DbNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl1486);
            rule__Database__DbNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getDbNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__5"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:745:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:749:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:750:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__51516);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__6_in_rule__Database__Group__51519);
            rule__Database__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__5"


    // $ANTLR start "rule__Database__Group__5__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:757:1: rule__Database__Group__5__Impl : ( '/' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:761:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:762:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:762:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:763:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Database__Group__5__Impl1547); 
             after(grammarAccess.getDatabaseAccess().getSolidusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__5__Impl"


    // $ANTLR start "rule__Database__Group__6"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:776:1: rule__Database__Group__6 : rule__Database__Group__6__Impl ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:780:1: ( rule__Database__Group__6__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:781:2: rule__Database__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__61578);
            rule__Database__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__6"


    // $ANTLR start "rule__Database__Group__6__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:787:1: rule__Database__Group__6__Impl : ( ( rule__Database__NameAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:791:1: ( ( ( rule__Database__NameAssignment_6 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:792:1: ( ( rule__Database__NameAssignment_6 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:792:1: ( ( rule__Database__NameAssignment_6 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:793:1: ( rule__Database__NameAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_6()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:794:1: ( rule__Database__NameAssignment_6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:794:2: rule__Database__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl1605);
            rule__Database__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__6__Impl"


    // $ANTLR start "rule__Database__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:818:1: rule__Database__Group_2__0 : rule__Database__Group_2__0__Impl rule__Database__Group_2__1 ;
    public final void rule__Database__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:822:1: ( rule__Database__Group_2__0__Impl rule__Database__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:823:2: rule__Database__Group_2__0__Impl rule__Database__Group_2__1
            {
            pushFollow(FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__01649);
            rule__Database__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__01652);
            rule__Database__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group_2__0"


    // $ANTLR start "rule__Database__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:830:1: rule__Database__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Database__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:834:1: ( ( ':' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:835:1: ( ':' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:835:1: ( ':' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:836:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Database__Group_2__0__Impl1680); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group_2__0__Impl"


    // $ANTLR start "rule__Database__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:849:1: rule__Database__Group_2__1 : rule__Database__Group_2__1__Impl ;
    public final void rule__Database__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:853:1: ( rule__Database__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:854:2: rule__Database__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__11711);
            rule__Database__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group_2__1"


    // $ANTLR start "rule__Database__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:860:1: rule__Database__Group_2__1__Impl : ( ( rule__Database__PortAssignment_2_1 ) ) ;
    public final void rule__Database__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:864:1: ( ( ( rule__Database__PortAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:865:1: ( ( rule__Database__PortAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:865:1: ( ( rule__Database__PortAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:866:1: ( rule__Database__PortAssignment_2_1 )
            {
             before(grammarAccess.getDatabaseAccess().getPortAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:867:1: ( rule__Database__PortAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:867:2: rule__Database__PortAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl1738);
            rule__Database__PortAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPortAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group_2__1__Impl"


    // $ANTLR start "rule__ColumnList__Group_0__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:881:1: rule__ColumnList__Group_0__0 : rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 ;
    public final void rule__ColumnList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:885:1: ( rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:886:2: rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__01772);
            rule__ColumnList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__01775);
            rule__ColumnList__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0__0"


    // $ANTLR start "rule__ColumnList__Group_0__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:893:1: rule__ColumnList__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:897:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:898:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:898:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:899:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl1802); 
             after(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0__0__Impl"


    // $ANTLR start "rule__ColumnList__Group_0__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:910:1: rule__ColumnList__Group_0__1 : rule__ColumnList__Group_0__1__Impl ;
    public final void rule__ColumnList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:914:1: ( rule__ColumnList__Group_0__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:915:2: rule__ColumnList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__11831);
            rule__ColumnList__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0__1"


    // $ANTLR start "rule__ColumnList__Group_0__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:921:1: rule__ColumnList__Group_0__1__Impl : ( ( rule__ColumnList__Group_0_1__0 )* ) ;
    public final void rule__ColumnList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:925:1: ( ( ( rule__ColumnList__Group_0_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:926:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:926:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:927:1: ( rule__ColumnList__Group_0_1__0 )*
            {
             before(grammarAccess.getColumnListAccess().getGroup_0_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:928:1: ( rule__ColumnList__Group_0_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:928:2: rule__ColumnList__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl1858);
            	    rule__ColumnList__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getColumnListAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0__1__Impl"


    // $ANTLR start "rule__ColumnList__Group_0_1__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:942:1: rule__ColumnList__Group_0_1__0 : rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 ;
    public final void rule__ColumnList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:946:1: ( rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:947:2: rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__01893);
            rule__ColumnList__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__01896);
            rule__ColumnList__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0_1__0"


    // $ANTLR start "rule__ColumnList__Group_0_1__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:954:1: rule__ColumnList__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnList__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:958:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:959:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:959:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:960:1: ','
            {
             before(grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ColumnList__Group_0_1__0__Impl1924); 
             after(grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0_1__0__Impl"


    // $ANTLR start "rule__ColumnList__Group_0_1__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:973:1: rule__ColumnList__Group_0_1__1 : rule__ColumnList__Group_0_1__1__Impl ;
    public final void rule__ColumnList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:977:1: ( rule__ColumnList__Group_0_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:978:2: rule__ColumnList__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__11955);
            rule__ColumnList__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0_1__1"


    // $ANTLR start "rule__ColumnList__Group_0_1__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:984:1: rule__ColumnList__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:988:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:989:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:989:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:990:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl1982); 
             after(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnList__Group_0_1__1__Impl"


    // $ANTLR start "rule__QueryCondition__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1005:1: rule__QueryCondition__Group__0 : rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1 ;
    public final void rule__QueryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1009:1: ( rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1010:2: rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__0__Impl_in_rule__QueryCondition__Group__02015);
            rule__QueryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryCondition__Group__1_in_rule__QueryCondition__Group__02018);
            rule__QueryCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__0"


    // $ANTLR start "rule__QueryCondition__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1017:1: rule__QueryCondition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__QueryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1021:1: ( ( 'WHERE' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1022:1: ( 'WHERE' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1022:1: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1023:1: 'WHERE'
            {
             before(grammarAccess.getQueryConditionAccess().getWHEREKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__QueryCondition__Group__0__Impl2046); 
             after(grammarAccess.getQueryConditionAccess().getWHEREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__0__Impl"


    // $ANTLR start "rule__QueryCondition__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1036:1: rule__QueryCondition__Group__1 : rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2 ;
    public final void rule__QueryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1040:1: ( rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1041:2: rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__1__Impl_in_rule__QueryCondition__Group__12077);
            rule__QueryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryCondition__Group__2_in_rule__QueryCondition__Group__12080);
            rule__QueryCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__1"


    // $ANTLR start "rule__QueryCondition__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1048:1: rule__QueryCondition__Group__1__Impl : ( ( rule__QueryCondition__StartcondAssignment_1 ) ) ;
    public final void rule__QueryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1052:1: ( ( ( rule__QueryCondition__StartcondAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1053:1: ( ( rule__QueryCondition__StartcondAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1053:1: ( ( rule__QueryCondition__StartcondAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1054:1: ( rule__QueryCondition__StartcondAssignment_1 )
            {
             before(grammarAccess.getQueryConditionAccess().getStartcondAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1055:1: ( rule__QueryCondition__StartcondAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1055:2: rule__QueryCondition__StartcondAssignment_1
            {
            pushFollow(FOLLOW_rule__QueryCondition__StartcondAssignment_1_in_rule__QueryCondition__Group__1__Impl2107);
            rule__QueryCondition__StartcondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryConditionAccess().getStartcondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__1__Impl"


    // $ANTLR start "rule__QueryCondition__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1065:1: rule__QueryCondition__Group__2 : rule__QueryCondition__Group__2__Impl ;
    public final void rule__QueryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1069:1: ( rule__QueryCondition__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1070:2: rule__QueryCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__2__Impl_in_rule__QueryCondition__Group__22137);
            rule__QueryCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__2"


    // $ANTLR start "rule__QueryCondition__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1076:1: rule__QueryCondition__Group__2__Impl : ( ( rule__QueryCondition__FollowcondAssignment_2 )* ) ;
    public final void rule__QueryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1080:1: ( ( ( rule__QueryCondition__FollowcondAssignment_2 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1081:1: ( ( rule__QueryCondition__FollowcondAssignment_2 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1081:1: ( ( rule__QueryCondition__FollowcondAssignment_2 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1082:1: ( rule__QueryCondition__FollowcondAssignment_2 )*
            {
             before(grammarAccess.getQueryConditionAccess().getFollowcondAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1083:1: ( rule__QueryCondition__FollowcondAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1083:2: rule__QueryCondition__FollowcondAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__QueryCondition__FollowcondAssignment_2_in_rule__QueryCondition__Group__2__Impl2164);
            	    rule__QueryCondition__FollowcondAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQueryConditionAccess().getFollowcondAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__Group__2__Impl"


    // $ANTLR start "rule__FollowCondition__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1099:1: rule__FollowCondition__Group__0 : rule__FollowCondition__Group__0__Impl rule__FollowCondition__Group__1 ;
    public final void rule__FollowCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1103:1: ( rule__FollowCondition__Group__0__Impl rule__FollowCondition__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1104:2: rule__FollowCondition__Group__0__Impl rule__FollowCondition__Group__1
            {
            pushFollow(FOLLOW_rule__FollowCondition__Group__0__Impl_in_rule__FollowCondition__Group__02201);
            rule__FollowCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowCondition__Group__1_in_rule__FollowCondition__Group__02204);
            rule__FollowCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__Group__0"


    // $ANTLR start "rule__FollowCondition__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1111:1: rule__FollowCondition__Group__0__Impl : ( ( rule__FollowCondition__ConjunctionAssignment_0 ) ) ;
    public final void rule__FollowCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1115:1: ( ( ( rule__FollowCondition__ConjunctionAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1116:1: ( ( rule__FollowCondition__ConjunctionAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1116:1: ( ( rule__FollowCondition__ConjunctionAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1117:1: ( rule__FollowCondition__ConjunctionAssignment_0 )
            {
             before(grammarAccess.getFollowConditionAccess().getConjunctionAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1118:1: ( rule__FollowCondition__ConjunctionAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1118:2: rule__FollowCondition__ConjunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__FollowCondition__ConjunctionAssignment_0_in_rule__FollowCondition__Group__0__Impl2231);
            rule__FollowCondition__ConjunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFollowConditionAccess().getConjunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__Group__0__Impl"


    // $ANTLR start "rule__FollowCondition__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1128:1: rule__FollowCondition__Group__1 : rule__FollowCondition__Group__1__Impl ;
    public final void rule__FollowCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1132:1: ( rule__FollowCondition__Group__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1133:2: rule__FollowCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FollowCondition__Group__1__Impl_in_rule__FollowCondition__Group__12261);
            rule__FollowCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__Group__1"


    // $ANTLR start "rule__FollowCondition__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1139:1: rule__FollowCondition__Group__1__Impl : ( ( rule__FollowCondition__CondAssignment_1 ) ) ;
    public final void rule__FollowCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1143:1: ( ( ( rule__FollowCondition__CondAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1144:1: ( ( rule__FollowCondition__CondAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1144:1: ( ( rule__FollowCondition__CondAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1145:1: ( rule__FollowCondition__CondAssignment_1 )
            {
             before(grammarAccess.getFollowConditionAccess().getCondAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1146:1: ( rule__FollowCondition__CondAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1146:2: rule__FollowCondition__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__FollowCondition__CondAssignment_1_in_rule__FollowCondition__Group__1__Impl2288);
            rule__FollowCondition__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowConditionAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1160:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1164:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1165:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02322);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02325);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1172:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__NameAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1176:1: ( ( ( rule__Condition__NameAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1177:1: ( ( rule__Condition__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1177:1: ( ( rule__Condition__NameAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1178:1: ( rule__Condition__NameAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1179:1: ( rule__Condition__NameAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1179:2: rule__Condition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__NameAssignment_0_in_rule__Condition__Group__0__Impl2352);
            rule__Condition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1189:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1193:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1194:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12382);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12385);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1201:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CompAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1205:1: ( ( ( rule__Condition__CompAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1206:1: ( ( rule__Condition__CompAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1206:1: ( ( rule__Condition__CompAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1207:1: ( rule__Condition__CompAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getCompAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1208:1: ( rule__Condition__CompAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1208:2: rule__Condition__CompAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__CompAssignment_1_in_rule__Condition__Group__1__Impl2412);
            rule__Condition__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCompAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1218:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1222:1: ( rule__Condition__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1223:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22442);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1229:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1233:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1234:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1234:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1235:1: ( rule__Condition__ValueAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1236:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1236:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl2469);
            rule__Condition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Model__AttrsAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1253:1: rule__Model__AttrsAssignment_1 : ( ruleColumnList ) ;
    public final void rule__Model__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1257:1: ( ( ruleColumnList ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1258:1: ( ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1258:1: ( ruleColumnList )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1259:1: ruleColumnList
            {
             before(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_12510);
            ruleColumnList();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AttrsAssignment_1"


    // $ANTLR start "rule__Model__DbAssignment_3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1268:1: rule__Model__DbAssignment_3 : ( ruleDatabase ) ;
    public final void rule__Model__DbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1272:1: ( ( ruleDatabase ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1273:1: ( ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1273:1: ( ruleDatabase )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1274:1: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_32541);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DbAssignment_3"


    // $ANTLR start "rule__Model__QueryAssignment_4"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1283:1: rule__Model__QueryAssignment_4 : ( ruleQueryCondition ) ;
    public final void rule__Model__QueryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1287:1: ( ( ruleQueryCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1288:1: ( ruleQueryCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1288:1: ( ruleQueryCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1289:1: ruleQueryCondition
            {
             before(grammarAccess.getModelAccess().getQueryQueryConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQueryCondition_in_rule__Model__QueryAssignment_42572);
            ruleQueryCondition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQueryQueryConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QueryAssignment_4"


    // $ANTLR start "rule__Database__UrlAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1298:1: rule__Database__UrlAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1302:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1303:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1303:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1304:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_12603); 
             after(grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__UrlAssignment_1"


    // $ANTLR start "rule__Database__PortAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1313:1: rule__Database__PortAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Database__PortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1317:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1318:1: ( RULE_INT )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1318:1: ( RULE_INT )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1319:1: RULE_INT
            {
             before(grammarAccess.getDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Database__PortAssignment_2_12634); 
             after(grammarAccess.getDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__PortAssignment_2_1"


    // $ANTLR start "rule__Database__DbNameAssignment_4"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1328:1: rule__Database__DbNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Database__DbNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1332:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1333:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1333:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1334:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_42665); 
             after(grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__DbNameAssignment_4"


    // $ANTLR start "rule__Database__NameAssignment_6"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1343:1: rule__Database__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1347:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1348:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1348:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1349:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_62696); 
             after(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__NameAssignment_6"


    // $ANTLR start "rule__QueryCondition__StartcondAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1358:1: rule__QueryCondition__StartcondAssignment_1 : ( ruleCondition ) ;
    public final void rule__QueryCondition__StartcondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1362:1: ( ( ruleCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1363:1: ( ruleCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1363:1: ( ruleCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1364:1: ruleCondition
            {
             before(grammarAccess.getQueryConditionAccess().getStartcondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__QueryCondition__StartcondAssignment_12727);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryConditionAccess().getStartcondConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__StartcondAssignment_1"


    // $ANTLR start "rule__QueryCondition__FollowcondAssignment_2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1373:1: rule__QueryCondition__FollowcondAssignment_2 : ( ruleFollowCondition ) ;
    public final void rule__QueryCondition__FollowcondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1377:1: ( ( ruleFollowCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1378:1: ( ruleFollowCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1378:1: ( ruleFollowCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1379:1: ruleFollowCondition
            {
             before(grammarAccess.getQueryConditionAccess().getFollowcondFollowConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFollowCondition_in_rule__QueryCondition__FollowcondAssignment_22758);
            ruleFollowCondition();

            state._fsp--;

             after(grammarAccess.getQueryConditionAccess().getFollowcondFollowConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryCondition__FollowcondAssignment_2"


    // $ANTLR start "rule__FollowCondition__ConjunctionAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1388:1: rule__FollowCondition__ConjunctionAssignment_0 : ( ruleConjunction ) ;
    public final void rule__FollowCondition__ConjunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1392:1: ( ( ruleConjunction ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1393:1: ( ruleConjunction )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1393:1: ( ruleConjunction )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1394:1: ruleConjunction
            {
             before(grammarAccess.getFollowConditionAccess().getConjunctionConjunctionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__FollowCondition__ConjunctionAssignment_02789);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getFollowConditionAccess().getConjunctionConjunctionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__ConjunctionAssignment_0"


    // $ANTLR start "rule__FollowCondition__CondAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1403:1: rule__FollowCondition__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__FollowCondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1407:1: ( ( ruleCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1408:1: ( ruleCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1408:1: ( ruleCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1409:1: ruleCondition
            {
             before(grammarAccess.getFollowConditionAccess().getCondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__FollowCondition__CondAssignment_12820);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getFollowConditionAccess().getCondConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowCondition__CondAssignment_1"


    // $ANTLR start "rule__Condition__NameAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1418:1: rule__Condition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1422:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1423:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1423:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1424:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_02851); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_0"


    // $ANTLR start "rule__Condition__CompAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1433:1: rule__Condition__CompAssignment_1 : ( ruleCOMPARE ) ;
    public final void rule__Condition__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1437:1: ( ( ruleCOMPARE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1438:1: ( ruleCOMPARE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1438:1: ( ruleCOMPARE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1439:1: ruleCOMPARE
            {
             before(grammarAccess.getConditionAccess().getCompCOMPAREParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCOMPARE_in_rule__Condition__CompAssignment_12882);
            ruleCOMPARE();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCompCOMPAREParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CompAssignment_1"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1448:1: rule__Condition__ValueAssignment_2 : ( ruleVALUE ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1452:1: ( ( ruleVALUE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1453:1: ( ruleVALUE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1453:1: ( ruleVALUE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1454:1: ruleVALUE
            {
             before(grammarAccess.getConditionAccess().getValueVALUEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVALUE_in_rule__Condition__ValueAssignment_22913);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueVALUEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_entryRuleColumnList181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnList188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Alternatives_in_ruleColumnList214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryCondition_in_entryRuleQueryCondition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryCondition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__0_in_ruleQueryCondition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowCondition_in_entryRuleFollowCondition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowCondition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowCondition__Group__0_in_ruleFollowCondition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMPARE488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COMPARE__Alternatives_in_ruleCOMPARE514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VALUE__Alternatives_in_ruleVALUE574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ColumnList__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Conjunction__Alternatives664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Conjunction__Alternatives684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__COMPARE__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUALS_in_rule__COMPARE__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rule__COMPARE__Alternatives752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rule__COMPARE__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_EQUAL_in_rule__COMPARE__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MORE_EQUAL_in_rule__COMPARE__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIKE_in_rule__COMPARE__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VALUE__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VALUE__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0899 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1961 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21021 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__2__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31083 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QueryAssignment_4_in_rule__Model__Group__4__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Database__Group__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11273 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21333 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Database__Group__3__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41456 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Database__Group__5_in_rule__Database__Group__41459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__51516 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Database__Group__6_in_rule__Database__Group__51519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Database__Group__5__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__61578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__01649 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__01652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Database__Group_2__0__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__01772 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl1858 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__01893 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__01896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ColumnList__Group_0_1__0__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__0__Impl_in_rule__QueryCondition__Group__02015 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__1_in_rule__QueryCondition__Group__02018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QueryCondition__Group__0__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__1__Impl_in_rule__QueryCondition__Group__12077 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__2_in_rule__QueryCondition__Group__12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__StartcondAssignment_1_in_rule__QueryCondition__Group__1__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__2__Impl_in_rule__QueryCondition__Group__22137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__FollowcondAssignment_2_in_rule__QueryCondition__Group__2__Impl2164 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_rule__FollowCondition__Group__0__Impl_in_rule__FollowCondition__Group__02201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FollowCondition__Group__1_in_rule__FollowCondition__Group__02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowCondition__ConjunctionAssignment_0_in_rule__FollowCondition__Group__0__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowCondition__Group__1__Impl_in_rule__FollowCondition__Group__12261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowCondition__CondAssignment_1_in_rule__FollowCondition__Group__1__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02322 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__NameAssignment_0_in_rule__Condition__Group__0__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12382 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__CompAssignment_1_in_rule__Condition__Group__1__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_32541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryCondition_in_rule__Model__QueryAssignment_42572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Database__PortAssignment_2_12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_42665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_62696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__QueryCondition__StartcondAssignment_12727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowCondition_in_rule__QueryCondition__FollowcondAssignment_22758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__FollowCondition__ConjunctionAssignment_02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__FollowCondition__CondAssignment_12820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_rule__Condition__CompAssignment_12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_rule__Condition__ValueAssignment_22913 = new BitSet(new long[]{0x0000000000000002L});

}