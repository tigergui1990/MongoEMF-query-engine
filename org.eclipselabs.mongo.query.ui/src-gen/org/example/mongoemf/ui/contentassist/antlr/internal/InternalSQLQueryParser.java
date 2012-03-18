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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUALS", "RULE_NOT_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'AND'", "'OR'", "'SELECT'", "'FROM'", "'mongo://'", "'/'", "':'", "','", "'WHERE'"
    };
    public static final int RULE_ID=10;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_MORE_THAN=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_NOT_EQUALS=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_EQUALS=4;
    public static final int RULE_WS=13;
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


    // $ANTLR start "entryRuleCondition"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:172:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:173:1: ( ruleCondition EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:174:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition301);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition308); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:181:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:185:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:186:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:186:1: ( ( rule__Condition__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:187:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:188:1: ( rule__Condition__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:188:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition334);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:200:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:201:1: ( ruleConjunction EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:202:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction361);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction368); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:209:1: ruleConjunction : ( ( rule__Conjunction__Alternatives ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:213:2: ( ( ( rule__Conjunction__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:214:1: ( ( rule__Conjunction__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:214:1: ( ( rule__Conjunction__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:215:1: ( rule__Conjunction__Alternatives )
            {
             before(grammarAccess.getConjunctionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:216:1: ( rule__Conjunction__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:216:2: rule__Conjunction__Alternatives
            {
            pushFollow(FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction394);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:228:1: entryRuleCOMPARE : ruleCOMPARE EOF ;
    public final void entryRuleCOMPARE() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:229:1: ( ruleCOMPARE EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:230:1: ruleCOMPARE EOF
            {
             before(grammarAccess.getCOMPARERule()); 
            pushFollow(FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE421);
            ruleCOMPARE();

            state._fsp--;

             after(grammarAccess.getCOMPARERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMPARE428); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:237:1: ruleCOMPARE : ( ( rule__COMPARE__Alternatives ) ) ;
    public final void ruleCOMPARE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:241:2: ( ( ( rule__COMPARE__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:242:1: ( ( rule__COMPARE__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:242:1: ( ( rule__COMPARE__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:243:1: ( rule__COMPARE__Alternatives )
            {
             before(grammarAccess.getCOMPAREAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:244:1: ( rule__COMPARE__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:244:2: rule__COMPARE__Alternatives
            {
            pushFollow(FOLLOW_rule__COMPARE__Alternatives_in_ruleCOMPARE454);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:256:1: entryRuleVALUE : ruleVALUE EOF ;
    public final void entryRuleVALUE() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:257:1: ( ruleVALUE EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:258:1: ruleVALUE EOF
            {
             before(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE481);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getVALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE488); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:265:1: ruleVALUE : ( ( rule__VALUE__Alternatives ) ) ;
    public final void ruleVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:269:2: ( ( ( rule__VALUE__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:270:1: ( ( rule__VALUE__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:270:1: ( ( rule__VALUE__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:271:1: ( rule__VALUE__Alternatives )
            {
             before(grammarAccess.getVALUEAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:272:1: ( rule__VALUE__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:272:2: rule__VALUE__Alternatives
            {
            pushFollow(FOLLOW_rule__VALUE__Alternatives_in_ruleVALUE514);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:284:1: rule__ColumnList__Alternatives : ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) );
    public final void rule__ColumnList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:288:1: ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:289:1: ( ( rule__ColumnList__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:289:1: ( ( rule__ColumnList__Group_0__0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:290:1: ( rule__ColumnList__Group_0__0 )
                    {
                     before(grammarAccess.getColumnListAccess().getGroup_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:291:1: ( rule__ColumnList__Group_0__0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:291:2: rule__ColumnList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives550);
                    rule__ColumnList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:295:6: ( '*' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:295:6: ( '*' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:296:1: '*'
                    {
                     before(grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__ColumnList__Alternatives569); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:308:1: rule__Conjunction__Alternatives : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__Conjunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:312:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:313:1: ( 'AND' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:313:1: ( 'AND' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:314:1: 'AND'
                    {
                     before(grammarAccess.getConjunctionAccess().getANDKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__Conjunction__Alternatives604); 
                     after(grammarAccess.getConjunctionAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:321:6: ( 'OR' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:321:6: ( 'OR' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:322:1: 'OR'
                    {
                     before(grammarAccess.getConjunctionAccess().getORKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__Conjunction__Alternatives624); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:334:1: rule__COMPARE__Alternatives : ( ( RULE_EQUALS ) | ( RULE_NOT_EQUALS ) | ( RULE_LESS_THAN ) | ( RULE_MORE_THAN ) );
    public final void rule__COMPARE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:338:1: ( ( RULE_EQUALS ) | ( RULE_NOT_EQUALS ) | ( RULE_LESS_THAN ) | ( RULE_MORE_THAN ) )
            int alt3=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:339:1: ( RULE_EQUALS )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:339:1: ( RULE_EQUALS )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:340:1: RULE_EQUALS
                    {
                     before(grammarAccess.getCOMPAREAccess().getEQUALSTerminalRuleCall_0()); 
                    match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__COMPARE__Alternatives658); 
                     after(grammarAccess.getCOMPAREAccess().getEQUALSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:345:6: ( RULE_NOT_EQUALS )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:345:6: ( RULE_NOT_EQUALS )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:346:1: RULE_NOT_EQUALS
                    {
                     before(grammarAccess.getCOMPAREAccess().getNOT_EQUALSTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUALS,FOLLOW_RULE_NOT_EQUALS_in_rule__COMPARE__Alternatives675); 
                     after(grammarAccess.getCOMPAREAccess().getNOT_EQUALSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:351:6: ( RULE_LESS_THAN )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:351:6: ( RULE_LESS_THAN )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:352:1: RULE_LESS_THAN
                    {
                     before(grammarAccess.getCOMPAREAccess().getLESS_THANTerminalRuleCall_2()); 
                    match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rule__COMPARE__Alternatives692); 
                     after(grammarAccess.getCOMPAREAccess().getLESS_THANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:357:6: ( RULE_MORE_THAN )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:357:6: ( RULE_MORE_THAN )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:358:1: RULE_MORE_THAN
                    {
                     before(grammarAccess.getCOMPAREAccess().getMORE_THANTerminalRuleCall_3()); 
                    match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rule__COMPARE__Alternatives709); 
                     after(grammarAccess.getCOMPAREAccess().getMORE_THANTerminalRuleCall_3()); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:368:1: rule__VALUE__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:372:1: ( ( RULE_INT ) | ( RULE_STRING ) )
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
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:373:1: ( RULE_INT )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:373:1: ( RULE_INT )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:374:1: RULE_INT
                    {
                     before(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VALUE__Alternatives741); 
                     after(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:379:6: ( RULE_STRING )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:379:6: ( RULE_STRING )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:380:1: RULE_STRING
                    {
                     before(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VALUE__Alternatives758); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:392:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:396:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:397:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0788);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0791);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:404:1: rule__Model__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:408:1: ( ( 'SELECT' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:409:1: ( 'SELECT' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:409:1: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:410:1: 'SELECT'
            {
             before(grammarAccess.getModelAccess().getSELECTKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__0__Impl819); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:423:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:427:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:428:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1850);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1853);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:435:1: rule__Model__Group__1__Impl : ( ( rule__Model__AttrsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:439:1: ( ( ( rule__Model__AttrsAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:440:1: ( ( rule__Model__AttrsAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:440:1: ( ( rule__Model__AttrsAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:441:1: ( rule__Model__AttrsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAttrsAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:442:1: ( rule__Model__AttrsAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:442:2: rule__Model__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl880);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:452:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:456:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:457:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2910);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2913);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:464:1: rule__Model__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:468:1: ( ( 'FROM' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:469:1: ( 'FROM' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:469:1: ( 'FROM' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:470:1: 'FROM'
            {
             before(grammarAccess.getModelAccess().getFROMKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__2__Impl941); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:483:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:487:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:488:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3972);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3975);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:495:1: rule__Model__Group__3__Impl : ( ( rule__Model__DbAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:499:1: ( ( ( rule__Model__DbAssignment_3 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:500:1: ( ( rule__Model__DbAssignment_3 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:500:1: ( ( rule__Model__DbAssignment_3 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:501:1: ( rule__Model__DbAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDbAssignment_3()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:502:1: ( rule__Model__DbAssignment_3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:502:2: rule__Model__DbAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1002);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:512:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:516:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:517:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41032);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:523:1: rule__Model__Group__4__Impl : ( ( rule__Model__QueryAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:527:1: ( ( ( rule__Model__QueryAssignment_4 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:528:1: ( ( rule__Model__QueryAssignment_4 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:528:1: ( ( rule__Model__QueryAssignment_4 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:529:1: ( rule__Model__QueryAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getQueryAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:530:1: ( rule__Model__QueryAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:530:2: rule__Model__QueryAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__QueryAssignment_4_in_rule__Model__Group__4__Impl1059);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:550:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:554:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:555:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01100);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01103);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:562:1: rule__Database__Group__0__Impl : ( 'mongo://' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:566:1: ( ( 'mongo://' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:567:1: ( 'mongo://' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:567:1: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:568:1: 'mongo://'
            {
             before(grammarAccess.getDatabaseAccess().getMongoKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Database__Group__0__Impl1131); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:581:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:585:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:586:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11162);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11165);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:593:1: rule__Database__Group__1__Impl : ( ( rule__Database__UrlAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:597:1: ( ( ( rule__Database__UrlAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:598:1: ( ( rule__Database__UrlAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:598:1: ( ( rule__Database__UrlAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:599:1: ( rule__Database__UrlAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:600:1: ( rule__Database__UrlAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:600:2: rule__Database__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl1192);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:610:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:614:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:615:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21222);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21225);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:622:1: rule__Database__Group__2__Impl : ( ( rule__Database__Group_2__0 )? ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:626:1: ( ( ( rule__Database__Group_2__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:627:1: ( ( rule__Database__Group_2__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:627:1: ( ( rule__Database__Group_2__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:628:1: ( rule__Database__Group_2__0 )?
            {
             before(grammarAccess.getDatabaseAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:629:1: ( rule__Database__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:629:2: rule__Database__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl1252);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:639:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:643:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:644:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31283);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31286);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:651:1: rule__Database__Group__3__Impl : ( '/' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:655:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:656:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:656:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:657:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Database__Group__3__Impl1314); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:670:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:674:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:675:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41345);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__5_in_rule__Database__Group__41348);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:682:1: rule__Database__Group__4__Impl : ( ( rule__Database__DbNameAssignment_4 ) ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:686:1: ( ( ( rule__Database__DbNameAssignment_4 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:687:1: ( ( rule__Database__DbNameAssignment_4 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:687:1: ( ( rule__Database__DbNameAssignment_4 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:688:1: ( rule__Database__DbNameAssignment_4 )
            {
             before(grammarAccess.getDatabaseAccess().getDbNameAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:689:1: ( rule__Database__DbNameAssignment_4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:689:2: rule__Database__DbNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl1375);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:699:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:703:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:704:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__51405);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__6_in_rule__Database__Group__51408);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:711:1: rule__Database__Group__5__Impl : ( '/' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:715:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:716:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:716:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:717:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Database__Group__5__Impl1436); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:730:1: rule__Database__Group__6 : rule__Database__Group__6__Impl ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:734:1: ( rule__Database__Group__6__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:735:2: rule__Database__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__61467);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:741:1: rule__Database__Group__6__Impl : ( ( rule__Database__NameAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:745:1: ( ( ( rule__Database__NameAssignment_6 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:746:1: ( ( rule__Database__NameAssignment_6 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:746:1: ( ( rule__Database__NameAssignment_6 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:747:1: ( rule__Database__NameAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_6()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:748:1: ( rule__Database__NameAssignment_6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:748:2: rule__Database__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl1494);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:772:1: rule__Database__Group_2__0 : rule__Database__Group_2__0__Impl rule__Database__Group_2__1 ;
    public final void rule__Database__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:776:1: ( rule__Database__Group_2__0__Impl rule__Database__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:777:2: rule__Database__Group_2__0__Impl rule__Database__Group_2__1
            {
            pushFollow(FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__01538);
            rule__Database__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__01541);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:784:1: rule__Database__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Database__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:788:1: ( ( ':' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:789:1: ( ':' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:789:1: ( ':' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:790:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Database__Group_2__0__Impl1569); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:803:1: rule__Database__Group_2__1 : rule__Database__Group_2__1__Impl ;
    public final void rule__Database__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:807:1: ( rule__Database__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:808:2: rule__Database__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__11600);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:814:1: rule__Database__Group_2__1__Impl : ( ( rule__Database__PortAssignment_2_1 ) ) ;
    public final void rule__Database__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:818:1: ( ( ( rule__Database__PortAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:819:1: ( ( rule__Database__PortAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:819:1: ( ( rule__Database__PortAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:820:1: ( rule__Database__PortAssignment_2_1 )
            {
             before(grammarAccess.getDatabaseAccess().getPortAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:821:1: ( rule__Database__PortAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:821:2: rule__Database__PortAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl1627);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:835:1: rule__ColumnList__Group_0__0 : rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 ;
    public final void rule__ColumnList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:839:1: ( rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:840:2: rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__01661);
            rule__ColumnList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__01664);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:847:1: rule__ColumnList__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:851:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:852:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:852:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:853:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl1691); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:864:1: rule__ColumnList__Group_0__1 : rule__ColumnList__Group_0__1__Impl ;
    public final void rule__ColumnList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:868:1: ( rule__ColumnList__Group_0__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:869:2: rule__ColumnList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__11720);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:875:1: rule__ColumnList__Group_0__1__Impl : ( ( rule__ColumnList__Group_0_1__0 )* ) ;
    public final void rule__ColumnList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:879:1: ( ( ( rule__ColumnList__Group_0_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:880:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:880:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:881:1: ( rule__ColumnList__Group_0_1__0 )*
            {
             before(grammarAccess.getColumnListAccess().getGroup_0_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:882:1: ( rule__ColumnList__Group_0_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:882:2: rule__ColumnList__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl1747);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:896:1: rule__ColumnList__Group_0_1__0 : rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 ;
    public final void rule__ColumnList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:900:1: ( rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:901:2: rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__01782);
            rule__ColumnList__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__01785);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:908:1: rule__ColumnList__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnList__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:912:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:913:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:913:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:914:1: ','
            {
             before(grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ColumnList__Group_0_1__0__Impl1813); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:927:1: rule__ColumnList__Group_0_1__1 : rule__ColumnList__Group_0_1__1__Impl ;
    public final void rule__ColumnList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:931:1: ( rule__ColumnList__Group_0_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:932:2: rule__ColumnList__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__11844);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:938:1: rule__ColumnList__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:942:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:943:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:943:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:944:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl1871); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:959:1: rule__QueryCondition__Group__0 : rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1 ;
    public final void rule__QueryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:963:1: ( rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:964:2: rule__QueryCondition__Group__0__Impl rule__QueryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__0__Impl_in_rule__QueryCondition__Group__01904);
            rule__QueryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryCondition__Group__1_in_rule__QueryCondition__Group__01907);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:971:1: rule__QueryCondition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__QueryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:975:1: ( ( 'WHERE' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:976:1: ( 'WHERE' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:976:1: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:977:1: 'WHERE'
            {
             before(grammarAccess.getQueryConditionAccess().getWHEREKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__QueryCondition__Group__0__Impl1935); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:990:1: rule__QueryCondition__Group__1 : rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2 ;
    public final void rule__QueryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:994:1: ( rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:995:2: rule__QueryCondition__Group__1__Impl rule__QueryCondition__Group__2
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__1__Impl_in_rule__QueryCondition__Group__11966);
            rule__QueryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryCondition__Group__2_in_rule__QueryCondition__Group__11969);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1002:1: rule__QueryCondition__Group__1__Impl : ( ( rule__QueryCondition__CondAssignment_1 ) ) ;
    public final void rule__QueryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1006:1: ( ( ( rule__QueryCondition__CondAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1007:1: ( ( rule__QueryCondition__CondAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1007:1: ( ( rule__QueryCondition__CondAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1008:1: ( rule__QueryCondition__CondAssignment_1 )
            {
             before(grammarAccess.getQueryConditionAccess().getCondAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1009:1: ( rule__QueryCondition__CondAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1009:2: rule__QueryCondition__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__QueryCondition__CondAssignment_1_in_rule__QueryCondition__Group__1__Impl1996);
            rule__QueryCondition__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryConditionAccess().getCondAssignment_1()); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1019:1: rule__QueryCondition__Group__2 : rule__QueryCondition__Group__2__Impl ;
    public final void rule__QueryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1023:1: ( rule__QueryCondition__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1024:2: rule__QueryCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group__2__Impl_in_rule__QueryCondition__Group__22026);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1030:1: rule__QueryCondition__Group__2__Impl : ( ( rule__QueryCondition__Group_2__0 )* ) ;
    public final void rule__QueryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1034:1: ( ( ( rule__QueryCondition__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1035:1: ( ( rule__QueryCondition__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1035:1: ( ( rule__QueryCondition__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1036:1: ( rule__QueryCondition__Group_2__0 )*
            {
             before(grammarAccess.getQueryConditionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1037:1: ( rule__QueryCondition__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1037:2: rule__QueryCondition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__QueryCondition__Group_2__0_in_rule__QueryCondition__Group__2__Impl2053);
            	    rule__QueryCondition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQueryConditionAccess().getGroup_2()); 

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


    // $ANTLR start "rule__QueryCondition__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1053:1: rule__QueryCondition__Group_2__0 : rule__QueryCondition__Group_2__0__Impl rule__QueryCondition__Group_2__1 ;
    public final void rule__QueryCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1057:1: ( rule__QueryCondition__Group_2__0__Impl rule__QueryCondition__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1058:2: rule__QueryCondition__Group_2__0__Impl rule__QueryCondition__Group_2__1
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group_2__0__Impl_in_rule__QueryCondition__Group_2__02090);
            rule__QueryCondition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryCondition__Group_2__1_in_rule__QueryCondition__Group_2__02093);
            rule__QueryCondition__Group_2__1();

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
    // $ANTLR end "rule__QueryCondition__Group_2__0"


    // $ANTLR start "rule__QueryCondition__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1065:1: rule__QueryCondition__Group_2__0__Impl : ( ruleConjunction ) ;
    public final void rule__QueryCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1069:1: ( ( ruleConjunction ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1070:1: ( ruleConjunction )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1070:1: ( ruleConjunction )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1071:1: ruleConjunction
            {
             before(grammarAccess.getQueryConditionAccess().getConjunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__QueryCondition__Group_2__0__Impl2120);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getQueryConditionAccess().getConjunctionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QueryCondition__Group_2__0__Impl"


    // $ANTLR start "rule__QueryCondition__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1082:1: rule__QueryCondition__Group_2__1 : rule__QueryCondition__Group_2__1__Impl ;
    public final void rule__QueryCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1086:1: ( rule__QueryCondition__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1087:2: rule__QueryCondition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QueryCondition__Group_2__1__Impl_in_rule__QueryCondition__Group_2__12149);
            rule__QueryCondition__Group_2__1__Impl();

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
    // $ANTLR end "rule__QueryCondition__Group_2__1"


    // $ANTLR start "rule__QueryCondition__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1093:1: rule__QueryCondition__Group_2__1__Impl : ( ( rule__QueryCondition__CondAssignment_2_1 ) ) ;
    public final void rule__QueryCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1097:1: ( ( ( rule__QueryCondition__CondAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1098:1: ( ( rule__QueryCondition__CondAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1098:1: ( ( rule__QueryCondition__CondAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1099:1: ( rule__QueryCondition__CondAssignment_2_1 )
            {
             before(grammarAccess.getQueryConditionAccess().getCondAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1100:1: ( rule__QueryCondition__CondAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1100:2: rule__QueryCondition__CondAssignment_2_1
            {
            pushFollow(FOLLOW_rule__QueryCondition__CondAssignment_2_1_in_rule__QueryCondition__Group_2__1__Impl2176);
            rule__QueryCondition__CondAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryConditionAccess().getCondAssignment_2_1()); 

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
    // $ANTLR end "rule__QueryCondition__Group_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1114:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1118:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1119:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02210);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02213);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1126:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__NameAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1130:1: ( ( ( rule__Condition__NameAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1131:1: ( ( rule__Condition__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1131:1: ( ( rule__Condition__NameAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1132:1: ( rule__Condition__NameAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1133:1: ( rule__Condition__NameAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1133:2: rule__Condition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__NameAssignment_0_in_rule__Condition__Group__0__Impl2240);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1143:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1147:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1148:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12270);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12273);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1155:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CompAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1159:1: ( ( ( rule__Condition__CompAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1160:1: ( ( rule__Condition__CompAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1160:1: ( ( rule__Condition__CompAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1161:1: ( rule__Condition__CompAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getCompAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1162:1: ( rule__Condition__CompAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1162:2: rule__Condition__CompAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__CompAssignment_1_in_rule__Condition__Group__1__Impl2300);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1172:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1176:1: ( rule__Condition__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1177:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22330);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1183:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1187:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1188:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1188:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1189:1: ( rule__Condition__ValueAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1190:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1190:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl2357);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1207:1: rule__Model__AttrsAssignment_1 : ( ruleColumnList ) ;
    public final void rule__Model__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1211:1: ( ( ruleColumnList ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1212:1: ( ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1212:1: ( ruleColumnList )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1213:1: ruleColumnList
            {
             before(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_12398);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1222:1: rule__Model__DbAssignment_3 : ( ruleDatabase ) ;
    public final void rule__Model__DbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1226:1: ( ( ruleDatabase ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1227:1: ( ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1227:1: ( ruleDatabase )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1228:1: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_32429);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1237:1: rule__Model__QueryAssignment_4 : ( ruleQueryCondition ) ;
    public final void rule__Model__QueryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1241:1: ( ( ruleQueryCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1242:1: ( ruleQueryCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1242:1: ( ruleQueryCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1243:1: ruleQueryCondition
            {
             before(grammarAccess.getModelAccess().getQueryQueryConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQueryCondition_in_rule__Model__QueryAssignment_42460);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1252:1: rule__Database__UrlAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1256:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1257:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1257:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1258:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_12491); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1267:1: rule__Database__PortAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Database__PortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1271:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1272:1: ( RULE_INT )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1272:1: ( RULE_INT )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1273:1: RULE_INT
            {
             before(grammarAccess.getDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Database__PortAssignment_2_12522); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1282:1: rule__Database__DbNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Database__DbNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1286:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1287:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1287:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1288:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_42553); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1297:1: rule__Database__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1301:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1302:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1302:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1303:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_62584); 
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


    // $ANTLR start "rule__QueryCondition__CondAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1312:1: rule__QueryCondition__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__QueryCondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1316:1: ( ( ruleCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1317:1: ( ruleCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1317:1: ( ruleCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1318:1: ruleCondition
            {
             before(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__QueryCondition__CondAssignment_12615);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QueryCondition__CondAssignment_1"


    // $ANTLR start "rule__QueryCondition__CondAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1327:1: rule__QueryCondition__CondAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__QueryCondition__CondAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1331:1: ( ( ruleCondition ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1332:1: ( ruleCondition )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1332:1: ( ruleCondition )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1333:1: ruleCondition
            {
             before(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__QueryCondition__CondAssignment_2_12646);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryConditionAccess().getCondConditionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__QueryCondition__CondAssignment_2_1"


    // $ANTLR start "rule__Condition__NameAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1342:1: rule__Condition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1346:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1347:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1347:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1348:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_02677); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1357:1: rule__Condition__CompAssignment_1 : ( ruleCOMPARE ) ;
    public final void rule__Condition__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1361:1: ( ( ruleCOMPARE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1362:1: ( ruleCOMPARE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1362:1: ( ruleCOMPARE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1363:1: ruleCOMPARE
            {
             before(grammarAccess.getConditionAccess().getCompCOMPAREParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCOMPARE_in_rule__Condition__CompAssignment_12708);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1372:1: rule__Condition__ValueAssignment_2 : ( ruleVALUE ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1376:1: ( ( ruleVALUE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1377:1: ( ruleVALUE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1377:1: ( ruleVALUE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/example/mongoemf/ui/contentassist/antlr/internal/InternalSQLQuery.g:1378:1: ruleVALUE
            {
             before(grammarAccess.getConditionAccess().getValueVALUEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVALUE_in_rule__Condition__ValueAssignment_22739);
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
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Alternatives_in_ruleConjunction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_entryRuleCOMPARE421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMPARE428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COMPARE__Alternatives_in_ruleCOMPARE454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VALUE__Alternatives_in_ruleVALUE514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ColumnList__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Conjunction__Alternatives604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Conjunction__Alternatives624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__COMPARE__Alternatives658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUALS_in_rule__COMPARE__Alternatives675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rule__COMPARE__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rule__COMPARE__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VALUE__Alternatives741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VALUE__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0788 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__0__Impl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2910 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__2__Impl941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3972 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QueryAssignment_4_in_rule__Model__Group__4__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01100 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Database__Group__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11162 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21222 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31283 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Database__Group__3__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41345 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Database__Group__5_in_rule__Database__Group__41348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__51405 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Database__Group__6_in_rule__Database__Group__51408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Database__Group__5__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__61467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__01538 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Database__Group_2__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__01661 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl1747 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__01782 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ColumnList__Group_0_1__0__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__0__Impl_in_rule__QueryCondition__Group__01904 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__1_in_rule__QueryCondition__Group__01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QueryCondition__Group__0__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__1__Impl_in_rule__QueryCondition__Group__11966 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__2_in_rule__QueryCondition__Group__11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__CondAssignment_1_in_rule__QueryCondition__Group__1__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group__2__Impl_in_rule__QueryCondition__Group__22026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group_2__0_in_rule__QueryCondition__Group__2__Impl2053 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group_2__0__Impl_in_rule__QueryCondition__Group_2__02090 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group_2__1_in_rule__QueryCondition__Group_2__02093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__QueryCondition__Group_2__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__Group_2__1__Impl_in_rule__QueryCondition__Group_2__12149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryCondition__CondAssignment_2_1_in_rule__QueryCondition__Group_2__1__Impl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__02210 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__NameAssignment_0_in_rule__Condition__Group__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__12270 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__CompAssignment_1_in_rule__Condition__Group__1__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__22330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_32429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryCondition_in_rule__Model__QueryAssignment_42460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Database__PortAssignment_2_12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_42553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_62584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__QueryCondition__CondAssignment_12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__QueryCondition__CondAssignment_2_12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_02677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARE_in_rule__Condition__CompAssignment_12708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_rule__Condition__ValueAssignment_22739 = new BitSet(new long[]{0x0000000000000002L});

}