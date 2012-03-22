package org.eclipselabs.mongo.query.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.mongo.query.services.MongoSQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMongoSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SINGED_LONG", "RULE_SIGNED_DOUBLE", "RULE_STRING", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'*'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'like'", "'not like'", "'not in'", "'in'", "'SELECT'", "'FROM'", "'WHERE'", "'mongo://'", "'/'", "':'", "','", "'OR'", "'AND'", "'('", "')'", "'?'", "'null'", "'true'", "'false'"
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
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g"; }


     
     	private MongoSQLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MongoSQLGrammarAccess grammarAccess) {
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:62:1: ruleModel EOF
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:76:2: rule__Model__Group__0
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:88:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:89:1: ( ruleDatabase EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:90:1: ruleDatabase EOF
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:97:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:101:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:102:1: ( ( rule__Database__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:102:1: ( ( rule__Database__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:103:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:104:1: ( rule__Database__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:104:2: rule__Database__Group__0
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:116:1: entryRuleColumnList : ruleColumnList EOF ;
    public final void entryRuleColumnList() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:117:1: ( ruleColumnList EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:118:1: ruleColumnList EOF
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:125:1: ruleColumnList : ( ( rule__ColumnList__Alternatives ) ) ;
    public final void ruleColumnList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:129:2: ( ( ( rule__ColumnList__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:130:1: ( ( rule__ColumnList__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:130:1: ( ( rule__ColumnList__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:131:1: ( rule__ColumnList__Alternatives )
            {
             before(grammarAccess.getColumnListAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:132:1: ( rule__ColumnList__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:132:2: rule__ColumnList__Alternatives
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


    // $ANTLR start "entryRuleWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:144:1: entryRuleWhereEntry : ruleWhereEntry EOF ;
    public final void entryRuleWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:145:1: ( ruleWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:146:1: ruleWhereEntry EOF
            {
             before(grammarAccess.getWhereEntryRule()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_entryRuleWhereEntry241);
            ruleWhereEntry();

            state._fsp--;

             after(grammarAccess.getWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereEntry248); 

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
    // $ANTLR end "entryRuleWhereEntry"


    // $ANTLR start "ruleWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:153:1: ruleWhereEntry : ( ( rule__WhereEntry__Group__0 ) ) ;
    public final void ruleWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:157:2: ( ( ( rule__WhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:158:1: ( ( rule__WhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:158:1: ( ( rule__WhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:159:1: ( rule__WhereEntry__Group__0 )
            {
             before(grammarAccess.getWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:160:1: ( rule__WhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:160:2: rule__WhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group__0_in_ruleWhereEntry274);
            rule__WhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleWhereEntry"


    // $ANTLR start "entryRuleAndWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:172:1: entryRuleAndWhereEntry : ruleAndWhereEntry EOF ;
    public final void entryRuleAndWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:173:1: ( ruleAndWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:174:1: ruleAndWhereEntry EOF
            {
             before(grammarAccess.getAndWhereEntryRule()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_entryRuleAndWhereEntry301);
            ruleAndWhereEntry();

            state._fsp--;

             after(grammarAccess.getAndWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndWhereEntry308); 

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
    // $ANTLR end "entryRuleAndWhereEntry"


    // $ANTLR start "ruleAndWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:181:1: ruleAndWhereEntry : ( ( rule__AndWhereEntry__Group__0 ) ) ;
    public final void ruleAndWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:185:2: ( ( ( rule__AndWhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:186:1: ( ( rule__AndWhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:186:1: ( ( rule__AndWhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:187:1: ( rule__AndWhereEntry__Group__0 )
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:188:1: ( rule__AndWhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:188:2: rule__AndWhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group__0_in_ruleAndWhereEntry334);
            rule__AndWhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleAndWhereEntry"


    // $ANTLR start "entryRuleConcreteWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:200:1: entryRuleConcreteWhereEntry : ruleConcreteWhereEntry EOF ;
    public final void entryRuleConcreteWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:201:1: ( ruleConcreteWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:202:1: ruleConcreteWhereEntry EOF
            {
             before(grammarAccess.getConcreteWhereEntryRule()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_entryRuleConcreteWhereEntry361);
            ruleConcreteWhereEntry();

            state._fsp--;

             after(grammarAccess.getConcreteWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteWhereEntry368); 

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
    // $ANTLR end "entryRuleConcreteWhereEntry"


    // $ANTLR start "ruleConcreteWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:209:1: ruleConcreteWhereEntry : ( ( rule__ConcreteWhereEntry__Alternatives ) ) ;
    public final void ruleConcreteWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:213:2: ( ( ( rule__ConcreteWhereEntry__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:214:1: ( ( rule__ConcreteWhereEntry__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:214:1: ( ( rule__ConcreteWhereEntry__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:215:1: ( rule__ConcreteWhereEntry__Alternatives )
            {
             before(grammarAccess.getConcreteWhereEntryAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:216:1: ( rule__ConcreteWhereEntry__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:216:2: rule__ConcreteWhereEntry__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcreteWhereEntry__Alternatives_in_ruleConcreteWhereEntry394);
            rule__ConcreteWhereEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConcreteWhereEntryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConcreteWhereEntry"


    // $ANTLR start "entryRuleParWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:228:1: entryRuleParWhereEntry : ruleParWhereEntry EOF ;
    public final void entryRuleParWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:229:1: ( ruleParWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:230:1: ruleParWhereEntry EOF
            {
             before(grammarAccess.getParWhereEntryRule()); 
            pushFollow(FOLLOW_ruleParWhereEntry_in_entryRuleParWhereEntry421);
            ruleParWhereEntry();

            state._fsp--;

             after(grammarAccess.getParWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParWhereEntry428); 

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
    // $ANTLR end "entryRuleParWhereEntry"


    // $ANTLR start "ruleParWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:237:1: ruleParWhereEntry : ( ( rule__ParWhereEntry__Group__0 ) ) ;
    public final void ruleParWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:241:2: ( ( ( rule__ParWhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:242:1: ( ( rule__ParWhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:242:1: ( ( rule__ParWhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:243:1: ( rule__ParWhereEntry__Group__0 )
            {
             before(grammarAccess.getParWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:244:1: ( rule__ParWhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:244:2: rule__ParWhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__0_in_ruleParWhereEntry454);
            rule__ParWhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleParWhereEntry"


    // $ANTLR start "entryRuleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:256:1: entryRuleExpressionWhereEntry : ruleExpressionWhereEntry EOF ;
    public final void entryRuleExpressionWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:257:1: ( ruleExpressionWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:258:1: ruleExpressionWhereEntry EOF
            {
             before(grammarAccess.getExpressionWhereEntryRule()); 
            pushFollow(FOLLOW_ruleExpressionWhereEntry_in_entryRuleExpressionWhereEntry481);
            ruleExpressionWhereEntry();

            state._fsp--;

             after(grammarAccess.getExpressionWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionWhereEntry488); 

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
    // $ANTLR end "entryRuleExpressionWhereEntry"


    // $ANTLR start "ruleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:265:1: ruleExpressionWhereEntry : ( ( rule__ExpressionWhereEntry__Group__0 ) ) ;
    public final void ruleExpressionWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:269:2: ( ( ( rule__ExpressionWhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:270:1: ( ( rule__ExpressionWhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:270:1: ( ( rule__ExpressionWhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:271:1: ( rule__ExpressionWhereEntry__Group__0 )
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:272:1: ( rule__ExpressionWhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:272:2: rule__ExpressionWhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__0_in_ruleExpressionWhereEntry514);
            rule__ExpressionWhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionWhereEntry"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:284:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:285:1: ( ruleExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:286:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression541);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression548); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:293:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:297:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:298:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:298:1: ( ( rule__Expression__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:299:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:300:1: ( rule__Expression__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:300:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression574);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleReplacableValue"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:312:1: entryRuleReplacableValue : ruleReplacableValue EOF ;
    public final void entryRuleReplacableValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:313:1: ( ruleReplacableValue EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:314:1: ruleReplacableValue EOF
            {
             before(grammarAccess.getReplacableValueRule()); 
            pushFollow(FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue601);
            ruleReplacableValue();

            state._fsp--;

             after(grammarAccess.getReplacableValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplacableValue608); 

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
    // $ANTLR end "entryRuleReplacableValue"


    // $ANTLR start "ruleReplacableValue"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:321:1: ruleReplacableValue : ( ( rule__ReplacableValue__ValueAssignment ) ) ;
    public final void ruleReplacableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:325:2: ( ( ( rule__ReplacableValue__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:326:1: ( ( rule__ReplacableValue__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:326:1: ( ( rule__ReplacableValue__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:327:1: ( rule__ReplacableValue__ValueAssignment )
            {
             before(grammarAccess.getReplacableValueAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:328:1: ( rule__ReplacableValue__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:328:2: rule__ReplacableValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ReplacableValue__ValueAssignment_in_ruleReplacableValue634);
            rule__ReplacableValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReplacableValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleReplacableValue"


    // $ANTLR start "entryRuleDoubleExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:340:1: entryRuleDoubleExpression : ruleDoubleExpression EOF ;
    public final void entryRuleDoubleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:341:1: ( ruleDoubleExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:342:1: ruleDoubleExpression EOF
            {
             before(grammarAccess.getDoubleExpressionRule()); 
            pushFollow(FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression661);
            ruleDoubleExpression();

            state._fsp--;

             after(grammarAccess.getDoubleExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleExpression668); 

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
    // $ANTLR end "entryRuleDoubleExpression"


    // $ANTLR start "ruleDoubleExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:349:1: ruleDoubleExpression : ( ( rule__DoubleExpression__ValueAssignment ) ) ;
    public final void ruleDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:353:2: ( ( ( rule__DoubleExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:354:1: ( ( rule__DoubleExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:354:1: ( ( rule__DoubleExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:355:1: ( rule__DoubleExpression__ValueAssignment )
            {
             before(grammarAccess.getDoubleExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:356:1: ( rule__DoubleExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:356:2: rule__DoubleExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleExpression__ValueAssignment_in_ruleDoubleExpression694);
            rule__DoubleExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDoubleExpression"


    // $ANTLR start "entryRuleLongExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:368:1: entryRuleLongExpression : ruleLongExpression EOF ;
    public final void entryRuleLongExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:369:1: ( ruleLongExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:370:1: ruleLongExpression EOF
            {
             before(grammarAccess.getLongExpressionRule()); 
            pushFollow(FOLLOW_ruleLongExpression_in_entryRuleLongExpression721);
            ruleLongExpression();

            state._fsp--;

             after(grammarAccess.getLongExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongExpression728); 

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
    // $ANTLR end "entryRuleLongExpression"


    // $ANTLR start "ruleLongExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:377:1: ruleLongExpression : ( ( rule__LongExpression__ValueAssignment ) ) ;
    public final void ruleLongExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:381:2: ( ( ( rule__LongExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:382:1: ( ( rule__LongExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:382:1: ( ( rule__LongExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:383:1: ( rule__LongExpression__ValueAssignment )
            {
             before(grammarAccess.getLongExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:384:1: ( rule__LongExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:384:2: rule__LongExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LongExpression__ValueAssignment_in_ruleLongExpression754);
            rule__LongExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLongExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleLongExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:396:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:397:1: ( ruleStringExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:398:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression781);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression788); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:405:1: ruleStringExpression : ( ( rule__StringExpression__ValueAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:409:2: ( ( ( rule__StringExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:410:1: ( ( rule__StringExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:410:1: ( ( rule__StringExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:411:1: ( rule__StringExpression__ValueAssignment )
            {
             before(grammarAccess.getStringExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:412:1: ( rule__StringExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:412:2: rule__StringExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringExpression__ValueAssignment_in_ruleStringExpression814);
            rule__StringExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:424:1: entryRuleNullExpression : ruleNullExpression EOF ;
    public final void entryRuleNullExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:425:1: ( ruleNullExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:426:1: ruleNullExpression EOF
            {
             before(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression841);
            ruleNullExpression();

            state._fsp--;

             after(grammarAccess.getNullExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression848); 

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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:433:1: ruleNullExpression : ( ( rule__NullExpression__ValueAssignment ) ) ;
    public final void ruleNullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:437:2: ( ( ( rule__NullExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:438:1: ( ( rule__NullExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:438:1: ( ( rule__NullExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:439:1: ( rule__NullExpression__ValueAssignment )
            {
             before(grammarAccess.getNullExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:440:1: ( rule__NullExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:440:2: rule__NullExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullExpression__ValueAssignment_in_ruleNullExpression874);
            rule__NullExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleDateExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:452:1: entryRuleDateExpression : ruleDateExpression EOF ;
    public final void entryRuleDateExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:453:1: ( ruleDateExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:454:1: ruleDateExpression EOF
            {
             before(grammarAccess.getDateExpressionRule()); 
            pushFollow(FOLLOW_ruleDateExpression_in_entryRuleDateExpression901);
            ruleDateExpression();

            state._fsp--;

             after(grammarAccess.getDateExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateExpression908); 

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
    // $ANTLR end "entryRuleDateExpression"


    // $ANTLR start "ruleDateExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:461:1: ruleDateExpression : ( ( rule__DateExpression__ValueAssignment ) ) ;
    public final void ruleDateExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:465:2: ( ( ( rule__DateExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:466:1: ( ( rule__DateExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:466:1: ( ( rule__DateExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:467:1: ( rule__DateExpression__ValueAssignment )
            {
             before(grammarAccess.getDateExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:468:1: ( rule__DateExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:468:2: rule__DateExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DateExpression__ValueAssignment_in_ruleDateExpression934);
            rule__DateExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDateExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDateExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:480:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:481:1: ( ruleBooleanExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:482:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression961);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression968); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:489:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Alternatives ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:493:2: ( ( ( rule__BooleanExpression__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:494:1: ( ( rule__BooleanExpression__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:494:1: ( ( rule__BooleanExpression__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:495:1: ( rule__BooleanExpression__Alternatives )
            {
             before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:496:1: ( rule__BooleanExpression__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:496:2: rule__BooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression994);
            rule__BooleanExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "ruleOperator"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:509:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:513:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:514:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:514:1: ( ( rule__Operator__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:515:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:516:1: ( rule__Operator__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:516:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1031);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__ColumnList__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:527:1: rule__ColumnList__Alternatives : ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) );
    public final void rule__ColumnList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:531:1: ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:532:1: ( ( rule__ColumnList__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:532:1: ( ( rule__ColumnList__Group_0__0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:533:1: ( rule__ColumnList__Group_0__0 )
                    {
                     before(grammarAccess.getColumnListAccess().getGroup_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:534:1: ( rule__ColumnList__Group_0__0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:534:2: rule__ColumnList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives1066);
                    rule__ColumnList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:538:6: ( '*' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:538:6: ( '*' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:539:1: '*'
                    {
                     before(grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ColumnList__Alternatives1085); 
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


    // $ANTLR start "rule__ConcreteWhereEntry__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:551:1: rule__ConcreteWhereEntry__Alternatives : ( ( ruleParWhereEntry ) | ( ruleExpressionWhereEntry ) );
    public final void rule__ConcreteWhereEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:555:1: ( ( ruleParWhereEntry ) | ( ruleExpressionWhereEntry ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:556:1: ( ruleParWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:556:1: ( ruleParWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:557:1: ruleParWhereEntry
                    {
                     before(grammarAccess.getConcreteWhereEntryAccess().getParWhereEntryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1119);
                    ruleParWhereEntry();

                    state._fsp--;

                     after(grammarAccess.getConcreteWhereEntryAccess().getParWhereEntryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:562:6: ( ruleExpressionWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:562:6: ( ruleExpressionWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:563:1: ruleExpressionWhereEntry
                    {
                     before(grammarAccess.getConcreteWhereEntryAccess().getExpressionWhereEntryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpressionWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1136);
                    ruleExpressionWhereEntry();

                    state._fsp--;

                     after(grammarAccess.getConcreteWhereEntryAccess().getExpressionWhereEntryParserRuleCall_1()); 

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
    // $ANTLR end "rule__ConcreteWhereEntry__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:573:1: rule__Expression__Alternatives : ( ( ruleDoubleExpression ) | ( ruleLongExpression ) | ( ruleStringExpression ) | ( ruleNullExpression ) | ( ruleDateExpression ) | ( ruleBooleanExpression ) | ( ruleReplacableValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:577:1: ( ( ruleDoubleExpression ) | ( ruleLongExpression ) | ( ruleStringExpression ) | ( ruleNullExpression ) | ( ruleDateExpression ) | ( ruleBooleanExpression ) | ( ruleReplacableValue ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_DOUBLE:
                {
                alt3=1;
                }
                break;
            case RULE_SINGED_LONG:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case RULE_DATE:
                {
                alt3=5;
                }
                break;
            case 36:
            case 37:
                {
                alt3=6;
                }
                break;
            case 34:
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
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:578:1: ( ruleDoubleExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:578:1: ( ruleDoubleExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:579:1: ruleDoubleExpression
                    {
                     before(grammarAccess.getExpressionAccess().getDoubleExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDoubleExpression_in_rule__Expression__Alternatives1168);
                    ruleDoubleExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDoubleExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:584:6: ( ruleLongExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:584:6: ( ruleLongExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:585:1: ruleLongExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLongExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongExpression_in_rule__Expression__Alternatives1185);
                    ruleLongExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLongExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:590:6: ( ruleStringExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:590:6: ( ruleStringExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:591:1: ruleStringExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringExpression_in_rule__Expression__Alternatives1202);
                    ruleStringExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:596:6: ( ruleNullExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:596:6: ( ruleNullExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:597:1: ruleNullExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNullExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullExpression_in_rule__Expression__Alternatives1219);
                    ruleNullExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNullExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:602:6: ( ruleDateExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:602:6: ( ruleDateExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:603:1: ruleDateExpression
                    {
                     before(grammarAccess.getExpressionAccess().getDateExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDateExpression_in_rule__Expression__Alternatives1236);
                    ruleDateExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDateExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:608:6: ( ruleBooleanExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:608:6: ( ruleBooleanExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:609:1: ruleBooleanExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1253);
                    ruleBooleanExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:614:6: ( ruleReplacableValue )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:614:6: ( ruleReplacableValue )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:615:1: ruleReplacableValue
                    {
                     before(grammarAccess.getExpressionAccess().getReplacableValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleReplacableValue_in_rule__Expression__Alternatives1270);
                    ruleReplacableValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getReplacableValueParserRuleCall_6()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BooleanExpression__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:625:1: rule__BooleanExpression__Alternatives : ( ( ( rule__BooleanExpression__TrueAssignment_0 ) ) | ( ( rule__BooleanExpression__TrueAssignment_1 ) ) );
    public final void rule__BooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:629:1: ( ( ( rule__BooleanExpression__TrueAssignment_0 ) ) | ( ( rule__BooleanExpression__TrueAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:630:1: ( ( rule__BooleanExpression__TrueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:630:1: ( ( rule__BooleanExpression__TrueAssignment_0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:631:1: ( rule__BooleanExpression__TrueAssignment_0 )
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:632:1: ( rule__BooleanExpression__TrueAssignment_0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:632:2: rule__BooleanExpression__TrueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanExpression__TrueAssignment_0_in_rule__BooleanExpression__Alternatives1302);
                    rule__BooleanExpression__TrueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:636:6: ( ( rule__BooleanExpression__TrueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:636:6: ( ( rule__BooleanExpression__TrueAssignment_1 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:637:1: ( rule__BooleanExpression__TrueAssignment_1 )
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_1()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:638:1: ( rule__BooleanExpression__TrueAssignment_1 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:638:2: rule__BooleanExpression__TrueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanExpression__TrueAssignment_1_in_rule__BooleanExpression__Alternatives1320);
                    rule__BooleanExpression__TrueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_1()); 

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
    // $ANTLR end "rule__BooleanExpression__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:647:1: rule__Operator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '!=' ) ) | ( ( 'like' ) ) | ( ( 'not like' ) ) | ( ( 'not in' ) ) | ( ( 'in' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:651:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '!=' ) ) | ( ( 'like' ) ) | ( ( 'not like' ) ) | ( ( 'not in' ) ) | ( ( 'in' ) ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
                {
                alt5=8;
                }
                break;
            case 21:
                {
                alt5=9;
                }
                break;
            case 22:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:652:1: ( ( '<' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:652:1: ( ( '<' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:653:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:654:1: ( '<' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:654:3: '<'
                    {
                    match(input,13,FOLLOW_13_in_rule__Operator__Alternatives1354); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:659:6: ( ( '>' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:659:6: ( ( '>' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:660:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:661:1: ( '>' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:661:3: '>'
                    {
                    match(input,14,FOLLOW_14_in_rule__Operator__Alternatives1375); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:666:6: ( ( '<=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:666:6: ( ( '<=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:667:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:668:1: ( '<=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:668:3: '<='
                    {
                    match(input,15,FOLLOW_15_in_rule__Operator__Alternatives1396); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:673:6: ( ( '>=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:673:6: ( ( '>=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:674:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:675:1: ( '>=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:675:3: '>='
                    {
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives1417); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:680:6: ( ( '=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:680:6: ( ( '=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:681:1: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:682:1: ( '=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:682:3: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives1438); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:687:6: ( ( '!=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:687:6: ( ( '!=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:688:1: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:689:1: ( '!=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:689:3: '!='
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives1459); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:694:6: ( ( 'like' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:694:6: ( ( 'like' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:695:1: ( 'like' )
                    {
                     before(grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:696:1: ( 'like' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:696:3: 'like'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives1480); 

                    }

                     after(grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:701:6: ( ( 'not like' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:701:6: ( ( 'not like' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:702:1: ( 'not like' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:703:1: ( 'not like' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:703:3: 'not like'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives1501); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:708:6: ( ( 'not in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:708:6: ( ( 'not in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:709:1: ( 'not in' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:710:1: ( 'not in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:710:3: 'not in'
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives1522); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:715:6: ( ( 'in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:715:6: ( ( 'in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:716:1: ( 'in' )
                    {
                     before(grammarAccess.getOperatorAccess().getInEnumLiteralDeclaration_9()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:717:1: ( 'in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:717:3: 'in'
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives1543); 

                    }

                     after(grammarAccess.getOperatorAccess().getInEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:729:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:733:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:734:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01576);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01579);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:741:1: rule__Model__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:745:1: ( ( 'SELECT' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:746:1: ( 'SELECT' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:746:1: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:747:1: 'SELECT'
            {
             before(grammarAccess.getModelAccess().getSELECTKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__0__Impl1607); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:760:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:764:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:765:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11638);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11641);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:772:1: rule__Model__Group__1__Impl : ( ( rule__Model__AttrsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:776:1: ( ( ( rule__Model__AttrsAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:777:1: ( ( rule__Model__AttrsAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:777:1: ( ( rule__Model__AttrsAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:778:1: ( rule__Model__AttrsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAttrsAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:779:1: ( rule__Model__AttrsAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:779:2: rule__Model__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl1668);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:789:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:793:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:794:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21698);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21701);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:801:1: rule__Model__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:805:1: ( ( 'FROM' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:806:1: ( 'FROM' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:806:1: ( 'FROM' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:807:1: 'FROM'
            {
             before(grammarAccess.getModelAccess().getFROMKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__2__Impl1729); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:820:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:824:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:825:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31760);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31763);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:832:1: rule__Model__Group__3__Impl : ( ( rule__Model__DbAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:836:1: ( ( ( rule__Model__DbAssignment_3 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:837:1: ( ( rule__Model__DbAssignment_3 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:837:1: ( ( rule__Model__DbAssignment_3 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:838:1: ( rule__Model__DbAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDbAssignment_3()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:839:1: ( rule__Model__DbAssignment_3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:839:2: rule__Model__DbAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1790);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:849:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:853:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:854:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41820);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:860:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:864:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:865:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:865:1: ( ( rule__Model__Group_4__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:866:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:867:1: ( rule__Model__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:867:2: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1847);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Model__Group_4__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:887:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:891:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:892:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01888);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01891);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:899:1: rule__Model__Group_4__0__Impl : ( 'WHERE' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:903:1: ( ( 'WHERE' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:904:1: ( 'WHERE' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:904:1: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:905:1: 'WHERE'
            {
             before(grammarAccess.getModelAccess().getWHEREKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group_4__0__Impl1919); 
             after(grammarAccess.getModelAccess().getWHEREKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:918:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:922:1: ( rule__Model__Group_4__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:923:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11950);
            rule__Model__Group_4__1__Impl();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:929:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__WhereEntryAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:933:1: ( ( ( rule__Model__WhereEntryAssignment_4_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:934:1: ( ( rule__Model__WhereEntryAssignment_4_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:934:1: ( ( rule__Model__WhereEntryAssignment_4_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:935:1: ( rule__Model__WhereEntryAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getWhereEntryAssignment_4_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:936:1: ( rule__Model__WhereEntryAssignment_4_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:936:2: rule__Model__WhereEntryAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__WhereEntryAssignment_4_1_in_rule__Model__Group_4__1__Impl1977);
            rule__Model__WhereEntryAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWhereEntryAssignment_4_1()); 

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
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:950:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:954:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:955:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02011);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02014);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:962:1: rule__Database__Group__0__Impl : ( 'mongo://' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:966:1: ( ( 'mongo://' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:967:1: ( 'mongo://' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:967:1: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:968:1: 'mongo://'
            {
             before(grammarAccess.getDatabaseAccess().getMongoKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Database__Group__0__Impl2042); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:981:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:985:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:986:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12073);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12076);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:993:1: rule__Database__Group__1__Impl : ( ( rule__Database__UrlAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:997:1: ( ( ( rule__Database__UrlAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:998:1: ( ( rule__Database__UrlAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:998:1: ( ( rule__Database__UrlAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:999:1: ( rule__Database__UrlAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1000:1: ( rule__Database__UrlAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1000:2: rule__Database__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl2103);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1010:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1014:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1015:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22133);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22136);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1022:1: rule__Database__Group__2__Impl : ( ( rule__Database__Group_2__0 )? ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1026:1: ( ( ( rule__Database__Group_2__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1027:1: ( ( rule__Database__Group_2__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1027:1: ( ( rule__Database__Group_2__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1028:1: ( rule__Database__Group_2__0 )?
            {
             before(grammarAccess.getDatabaseAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1029:1: ( rule__Database__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1029:2: rule__Database__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl2163);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1039:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1043:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1044:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__32194);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__32197);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1051:1: rule__Database__Group__3__Impl : ( '/' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1055:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1056:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1056:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1057:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Database__Group__3__Impl2225); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1070:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1074:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1075:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__42256);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__5_in_rule__Database__Group__42259);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1082:1: rule__Database__Group__4__Impl : ( ( rule__Database__DbNameAssignment_4 ) ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1086:1: ( ( ( rule__Database__DbNameAssignment_4 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1087:1: ( ( rule__Database__DbNameAssignment_4 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1087:1: ( ( rule__Database__DbNameAssignment_4 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1088:1: ( rule__Database__DbNameAssignment_4 )
            {
             before(grammarAccess.getDatabaseAccess().getDbNameAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1089:1: ( rule__Database__DbNameAssignment_4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1089:2: rule__Database__DbNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl2286);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1099:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1103:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1104:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__52316);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__6_in_rule__Database__Group__52319);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1111:1: rule__Database__Group__5__Impl : ( '/' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1115:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1116:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1116:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1117:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Database__Group__5__Impl2347); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1130:1: rule__Database__Group__6 : rule__Database__Group__6__Impl ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1134:1: ( rule__Database__Group__6__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1135:2: rule__Database__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__62378);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1141:1: rule__Database__Group__6__Impl : ( ( rule__Database__NameAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1145:1: ( ( ( rule__Database__NameAssignment_6 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1146:1: ( ( rule__Database__NameAssignment_6 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1146:1: ( ( rule__Database__NameAssignment_6 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1147:1: ( rule__Database__NameAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_6()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1148:1: ( rule__Database__NameAssignment_6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1148:2: rule__Database__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl2405);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1172:1: rule__Database__Group_2__0 : rule__Database__Group_2__0__Impl rule__Database__Group_2__1 ;
    public final void rule__Database__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1176:1: ( rule__Database__Group_2__0__Impl rule__Database__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1177:2: rule__Database__Group_2__0__Impl rule__Database__Group_2__1
            {
            pushFollow(FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__02449);
            rule__Database__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__02452);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1184:1: rule__Database__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Database__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1188:1: ( ( ':' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1189:1: ( ':' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1189:1: ( ':' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1190:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Database__Group_2__0__Impl2480); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1203:1: rule__Database__Group_2__1 : rule__Database__Group_2__1__Impl ;
    public final void rule__Database__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1207:1: ( rule__Database__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1208:2: rule__Database__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__12511);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1214:1: rule__Database__Group_2__1__Impl : ( ( rule__Database__PortAssignment_2_1 ) ) ;
    public final void rule__Database__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1218:1: ( ( ( rule__Database__PortAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1219:1: ( ( rule__Database__PortAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1219:1: ( ( rule__Database__PortAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1220:1: ( rule__Database__PortAssignment_2_1 )
            {
             before(grammarAccess.getDatabaseAccess().getPortAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1221:1: ( rule__Database__PortAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1221:2: rule__Database__PortAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl2538);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1235:1: rule__ColumnList__Group_0__0 : rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 ;
    public final void rule__ColumnList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1239:1: ( rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1240:2: rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__02572);
            rule__ColumnList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__02575);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1247:1: rule__ColumnList__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1251:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1252:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1252:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1253:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl2602); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1264:1: rule__ColumnList__Group_0__1 : rule__ColumnList__Group_0__1__Impl ;
    public final void rule__ColumnList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1268:1: ( rule__ColumnList__Group_0__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1269:2: rule__ColumnList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__12631);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1275:1: rule__ColumnList__Group_0__1__Impl : ( ( rule__ColumnList__Group_0_1__0 )* ) ;
    public final void rule__ColumnList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1279:1: ( ( ( rule__ColumnList__Group_0_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1280:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1280:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1281:1: ( rule__ColumnList__Group_0_1__0 )*
            {
             before(grammarAccess.getColumnListAccess().getGroup_0_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1282:1: ( rule__ColumnList__Group_0_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1282:2: rule__ColumnList__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl2658);
            	    rule__ColumnList__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1296:1: rule__ColumnList__Group_0_1__0 : rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 ;
    public final void rule__ColumnList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1300:1: ( rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1301:2: rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__02693);
            rule__ColumnList__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__02696);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1308:1: rule__ColumnList__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnList__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1312:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1313:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1313:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1314:1: ','
            {
             before(grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
            match(input,29,FOLLOW_29_in_rule__ColumnList__Group_0_1__0__Impl2724); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1327:1: rule__ColumnList__Group_0_1__1 : rule__ColumnList__Group_0_1__1__Impl ;
    public final void rule__ColumnList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1331:1: ( rule__ColumnList__Group_0_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1332:2: rule__ColumnList__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__12755);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1338:1: rule__ColumnList__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1342:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1343:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1343:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1344:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl2782); 
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


    // $ANTLR start "rule__WhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1359:1: rule__WhereEntry__Group__0 : rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1 ;
    public final void rule__WhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1363:1: ( rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1364:2: rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group__0__Impl_in_rule__WhereEntry__Group__02815);
            rule__WhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group__1_in_rule__WhereEntry__Group__02818);
            rule__WhereEntry__Group__1();

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
    // $ANTLR end "rule__WhereEntry__Group__0"


    // $ANTLR start "rule__WhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1371:1: rule__WhereEntry__Group__0__Impl : ( ruleAndWhereEntry ) ;
    public final void rule__WhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1375:1: ( ( ruleAndWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1376:1: ( ruleAndWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1376:1: ( ruleAndWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1377:1: ruleAndWhereEntry
            {
             before(grammarAccess.getWhereEntryAccess().getAndWhereEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__Group__0__Impl2845);
            ruleAndWhereEntry();

            state._fsp--;

             after(grammarAccess.getWhereEntryAccess().getAndWhereEntryParserRuleCall_0()); 

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
    // $ANTLR end "rule__WhereEntry__Group__0__Impl"


    // $ANTLR start "rule__WhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1388:1: rule__WhereEntry__Group__1 : rule__WhereEntry__Group__1__Impl ;
    public final void rule__WhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1392:1: ( rule__WhereEntry__Group__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1393:2: rule__WhereEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group__1__Impl_in_rule__WhereEntry__Group__12874);
            rule__WhereEntry__Group__1__Impl();

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
    // $ANTLR end "rule__WhereEntry__Group__1"


    // $ANTLR start "rule__WhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1399:1: rule__WhereEntry__Group__1__Impl : ( ( rule__WhereEntry__Group_1__0 )? ) ;
    public final void rule__WhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1403:1: ( ( ( rule__WhereEntry__Group_1__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1404:1: ( ( rule__WhereEntry__Group_1__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1404:1: ( ( rule__WhereEntry__Group_1__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1405:1: ( rule__WhereEntry__Group_1__0 )?
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1406:1: ( rule__WhereEntry__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1406:2: rule__WhereEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__WhereEntry__Group_1__0_in_rule__WhereEntry__Group__1__Impl2901);
                    rule__WhereEntry__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereEntryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__WhereEntry__Group__1__Impl"


    // $ANTLR start "rule__WhereEntry__Group_1__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1420:1: rule__WhereEntry__Group_1__0 : rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1 ;
    public final void rule__WhereEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1424:1: ( rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1425:2: rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1__0__Impl_in_rule__WhereEntry__Group_1__02936);
            rule__WhereEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group_1__1_in_rule__WhereEntry__Group_1__02939);
            rule__WhereEntry__Group_1__1();

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
    // $ANTLR end "rule__WhereEntry__Group_1__0"


    // $ANTLR start "rule__WhereEntry__Group_1__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1432:1: rule__WhereEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__WhereEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1436:1: ( ( () ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1437:1: ( () )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1437:1: ( () )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1438:1: ()
            {
             before(grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1439:1: ()
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1441:1: 
            {
            }

             after(grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereEntry__Group_1__0__Impl"


    // $ANTLR start "rule__WhereEntry__Group_1__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1451:1: rule__WhereEntry__Group_1__1 : rule__WhereEntry__Group_1__1__Impl ;
    public final void rule__WhereEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1455:1: ( rule__WhereEntry__Group_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1456:2: rule__WhereEntry__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1__1__Impl_in_rule__WhereEntry__Group_1__12997);
            rule__WhereEntry__Group_1__1__Impl();

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
    // $ANTLR end "rule__WhereEntry__Group_1__1"


    // $ANTLR start "rule__WhereEntry__Group_1__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1462:1: rule__WhereEntry__Group_1__1__Impl : ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) ) ;
    public final void rule__WhereEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1466:1: ( ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1467:1: ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1467:1: ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1468:1: ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1468:1: ( ( rule__WhereEntry__Group_1_1__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1469:1: ( rule__WhereEntry__Group_1_1__0 )
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1470:1: ( rule__WhereEntry__Group_1_1__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1470:2: rule__WhereEntry__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3026);
            rule__WhereEntry__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 

            }

            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1473:1: ( ( rule__WhereEntry__Group_1_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1474:1: ( rule__WhereEntry__Group_1_1__0 )*
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1475:1: ( rule__WhereEntry__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1475:2: rule__WhereEntry__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3038);
            	    rule__WhereEntry__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 

            }


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
    // $ANTLR end "rule__WhereEntry__Group_1__1__Impl"


    // $ANTLR start "rule__WhereEntry__Group_1_1__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1490:1: rule__WhereEntry__Group_1_1__0 : rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1 ;
    public final void rule__WhereEntry__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1494:1: ( rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1495:2: rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0__Impl_in_rule__WhereEntry__Group_1_1__03075);
            rule__WhereEntry__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__1_in_rule__WhereEntry__Group_1_1__03078);
            rule__WhereEntry__Group_1_1__1();

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
    // $ANTLR end "rule__WhereEntry__Group_1_1__0"


    // $ANTLR start "rule__WhereEntry__Group_1_1__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1502:1: rule__WhereEntry__Group_1_1__0__Impl : ( 'OR' ) ;
    public final void rule__WhereEntry__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1506:1: ( ( 'OR' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1507:1: ( 'OR' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1507:1: ( 'OR' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1508:1: 'OR'
            {
             before(grammarAccess.getWhereEntryAccess().getORKeyword_1_1_0()); 
            match(input,30,FOLLOW_30_in_rule__WhereEntry__Group_1_1__0__Impl3106); 
             after(grammarAccess.getWhereEntryAccess().getORKeyword_1_1_0()); 

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
    // $ANTLR end "rule__WhereEntry__Group_1_1__0__Impl"


    // $ANTLR start "rule__WhereEntry__Group_1_1__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1521:1: rule__WhereEntry__Group_1_1__1 : rule__WhereEntry__Group_1_1__1__Impl ;
    public final void rule__WhereEntry__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1525:1: ( rule__WhereEntry__Group_1_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1526:2: rule__WhereEntry__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__1__Impl_in_rule__WhereEntry__Group_1_1__13137);
            rule__WhereEntry__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__WhereEntry__Group_1_1__1"


    // $ANTLR start "rule__WhereEntry__Group_1_1__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1532:1: rule__WhereEntry__Group_1_1__1__Impl : ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__WhereEntry__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1536:1: ( ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1537:1: ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1537:1: ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1538:1: ( rule__WhereEntry__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getWhereEntryAccess().getEntriesAssignment_1_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1539:1: ( rule__WhereEntry__EntriesAssignment_1_1_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1539:2: rule__WhereEntry__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__WhereEntry__EntriesAssignment_1_1_1_in_rule__WhereEntry__Group_1_1__1__Impl3164);
            rule__WhereEntry__EntriesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereEntryAccess().getEntriesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__WhereEntry__Group_1_1__1__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1553:1: rule__AndWhereEntry__Group__0 : rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1 ;
    public final void rule__AndWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1557:1: ( rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1558:2: rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group__0__Impl_in_rule__AndWhereEntry__Group__03198);
            rule__AndWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group__1_in_rule__AndWhereEntry__Group__03201);
            rule__AndWhereEntry__Group__1();

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
    // $ANTLR end "rule__AndWhereEntry__Group__0"


    // $ANTLR start "rule__AndWhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1565:1: rule__AndWhereEntry__Group__0__Impl : ( ruleConcreteWhereEntry ) ;
    public final void rule__AndWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1569:1: ( ( ruleConcreteWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1570:1: ( ruleConcreteWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1570:1: ( ruleConcreteWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1571:1: ruleConcreteWhereEntry
            {
             before(grammarAccess.getAndWhereEntryAccess().getConcreteWhereEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__Group__0__Impl3228);
            ruleConcreteWhereEntry();

            state._fsp--;

             after(grammarAccess.getAndWhereEntryAccess().getConcreteWhereEntryParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndWhereEntry__Group__0__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1582:1: rule__AndWhereEntry__Group__1 : rule__AndWhereEntry__Group__1__Impl ;
    public final void rule__AndWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1586:1: ( rule__AndWhereEntry__Group__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1587:2: rule__AndWhereEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group__1__Impl_in_rule__AndWhereEntry__Group__13257);
            rule__AndWhereEntry__Group__1__Impl();

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
    // $ANTLR end "rule__AndWhereEntry__Group__1"


    // $ANTLR start "rule__AndWhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1593:1: rule__AndWhereEntry__Group__1__Impl : ( ( rule__AndWhereEntry__Group_1__0 )? ) ;
    public final void rule__AndWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1597:1: ( ( ( rule__AndWhereEntry__Group_1__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1598:1: ( ( rule__AndWhereEntry__Group_1__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1598:1: ( ( rule__AndWhereEntry__Group_1__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1599:1: ( rule__AndWhereEntry__Group_1__0 )?
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1600:1: ( rule__AndWhereEntry__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1600:2: rule__AndWhereEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__0_in_rule__AndWhereEntry__Group__1__Impl3284);
                    rule__AndWhereEntry__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndWhereEntryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndWhereEntry__Group__1__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group_1__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1614:1: rule__AndWhereEntry__Group_1__0 : rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1 ;
    public final void rule__AndWhereEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1618:1: ( rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1619:2: rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__0__Impl_in_rule__AndWhereEntry__Group_1__03319);
            rule__AndWhereEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__1_in_rule__AndWhereEntry__Group_1__03322);
            rule__AndWhereEntry__Group_1__1();

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
    // $ANTLR end "rule__AndWhereEntry__Group_1__0"


    // $ANTLR start "rule__AndWhereEntry__Group_1__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1626:1: rule__AndWhereEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__AndWhereEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1630:1: ( ( () ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1631:1: ( () )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1631:1: ( () )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1632:1: ()
            {
             before(grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1633:1: ()
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1635:1: 
            {
            }

             after(grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndWhereEntry__Group_1__0__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group_1__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1645:1: rule__AndWhereEntry__Group_1__1 : rule__AndWhereEntry__Group_1__1__Impl ;
    public final void rule__AndWhereEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1649:1: ( rule__AndWhereEntry__Group_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1650:2: rule__AndWhereEntry__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__1__Impl_in_rule__AndWhereEntry__Group_1__13380);
            rule__AndWhereEntry__Group_1__1__Impl();

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
    // $ANTLR end "rule__AndWhereEntry__Group_1__1"


    // $ANTLR start "rule__AndWhereEntry__Group_1__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1656:1: rule__AndWhereEntry__Group_1__1__Impl : ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) ) ;
    public final void rule__AndWhereEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1660:1: ( ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1661:1: ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1661:1: ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1662:1: ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1662:1: ( ( rule__AndWhereEntry__Group_1_1__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1663:1: ( rule__AndWhereEntry__Group_1_1__0 )
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1664:1: ( rule__AndWhereEntry__Group_1_1__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1664:2: rule__AndWhereEntry__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl3409);
            rule__AndWhereEntry__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 

            }

            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1667:1: ( ( rule__AndWhereEntry__Group_1_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1668:1: ( rule__AndWhereEntry__Group_1_1__0 )*
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1669:1: ( rule__AndWhereEntry__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1669:2: rule__AndWhereEntry__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl3421);
            	    rule__AndWhereEntry__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 

            }


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
    // $ANTLR end "rule__AndWhereEntry__Group_1__1__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group_1_1__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1684:1: rule__AndWhereEntry__Group_1_1__0 : rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1 ;
    public final void rule__AndWhereEntry__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1688:1: ( rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1689:2: rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0__Impl_in_rule__AndWhereEntry__Group_1_1__03458);
            rule__AndWhereEntry__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__1_in_rule__AndWhereEntry__Group_1_1__03461);
            rule__AndWhereEntry__Group_1_1__1();

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
    // $ANTLR end "rule__AndWhereEntry__Group_1_1__0"


    // $ANTLR start "rule__AndWhereEntry__Group_1_1__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1696:1: rule__AndWhereEntry__Group_1_1__0__Impl : ( 'AND' ) ;
    public final void rule__AndWhereEntry__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1700:1: ( ( 'AND' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1701:1: ( 'AND' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1701:1: ( 'AND' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1702:1: 'AND'
            {
             before(grammarAccess.getAndWhereEntryAccess().getANDKeyword_1_1_0()); 
            match(input,31,FOLLOW_31_in_rule__AndWhereEntry__Group_1_1__0__Impl3489); 
             after(grammarAccess.getAndWhereEntryAccess().getANDKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AndWhereEntry__Group_1_1__0__Impl"


    // $ANTLR start "rule__AndWhereEntry__Group_1_1__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1715:1: rule__AndWhereEntry__Group_1_1__1 : rule__AndWhereEntry__Group_1_1__1__Impl ;
    public final void rule__AndWhereEntry__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1719:1: ( rule__AndWhereEntry__Group_1_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1720:2: rule__AndWhereEntry__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__1__Impl_in_rule__AndWhereEntry__Group_1_1__13520);
            rule__AndWhereEntry__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__AndWhereEntry__Group_1_1__1"


    // $ANTLR start "rule__AndWhereEntry__Group_1_1__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1726:1: rule__AndWhereEntry__Group_1_1__1__Impl : ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__AndWhereEntry__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1730:1: ( ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1731:1: ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1731:1: ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1732:1: ( rule__AndWhereEntry__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getAndWhereEntryAccess().getEntriesAssignment_1_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1733:1: ( rule__AndWhereEntry__EntriesAssignment_1_1_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1733:2: rule__AndWhereEntry__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__EntriesAssignment_1_1_1_in_rule__AndWhereEntry__Group_1_1__1__Impl3547);
            rule__AndWhereEntry__EntriesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndWhereEntryAccess().getEntriesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__AndWhereEntry__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParWhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1747:1: rule__ParWhereEntry__Group__0 : rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1 ;
    public final void rule__ParWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1751:1: ( rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1752:2: rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__0__Impl_in_rule__ParWhereEntry__Group__03581);
            rule__ParWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParWhereEntry__Group__1_in_rule__ParWhereEntry__Group__03584);
            rule__ParWhereEntry__Group__1();

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
    // $ANTLR end "rule__ParWhereEntry__Group__0"


    // $ANTLR start "rule__ParWhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1759:1: rule__ParWhereEntry__Group__0__Impl : ( '(' ) ;
    public final void rule__ParWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1763:1: ( ( '(' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1764:1: ( '(' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1764:1: ( '(' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1765:1: '('
            {
             before(grammarAccess.getParWhereEntryAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ParWhereEntry__Group__0__Impl3612); 
             after(grammarAccess.getParWhereEntryAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParWhereEntry__Group__0__Impl"


    // $ANTLR start "rule__ParWhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1778:1: rule__ParWhereEntry__Group__1 : rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2 ;
    public final void rule__ParWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1782:1: ( rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1783:2: rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__1__Impl_in_rule__ParWhereEntry__Group__13643);
            rule__ParWhereEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParWhereEntry__Group__2_in_rule__ParWhereEntry__Group__13646);
            rule__ParWhereEntry__Group__2();

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
    // $ANTLR end "rule__ParWhereEntry__Group__1"


    // $ANTLR start "rule__ParWhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1790:1: rule__ParWhereEntry__Group__1__Impl : ( ruleWhereEntry ) ;
    public final void rule__ParWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1794:1: ( ( ruleWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1795:1: ( ruleWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1795:1: ( ruleWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1796:1: ruleWhereEntry
            {
             before(grammarAccess.getParWhereEntryAccess().getWhereEntryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_rule__ParWhereEntry__Group__1__Impl3673);
            ruleWhereEntry();

            state._fsp--;

             after(grammarAccess.getParWhereEntryAccess().getWhereEntryParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParWhereEntry__Group__1__Impl"


    // $ANTLR start "rule__ParWhereEntry__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1807:1: rule__ParWhereEntry__Group__2 : rule__ParWhereEntry__Group__2__Impl ;
    public final void rule__ParWhereEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1811:1: ( rule__ParWhereEntry__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1812:2: rule__ParWhereEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__2__Impl_in_rule__ParWhereEntry__Group__23702);
            rule__ParWhereEntry__Group__2__Impl();

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
    // $ANTLR end "rule__ParWhereEntry__Group__2"


    // $ANTLR start "rule__ParWhereEntry__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1818:1: rule__ParWhereEntry__Group__2__Impl : ( ')' ) ;
    public final void rule__ParWhereEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1822:1: ( ( ')' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1823:1: ( ')' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1823:1: ( ')' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1824:1: ')'
            {
             before(grammarAccess.getParWhereEntryAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ParWhereEntry__Group__2__Impl3730); 
             after(grammarAccess.getParWhereEntryAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ParWhereEntry__Group__2__Impl"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1843:1: rule__ExpressionWhereEntry__Group__0 : rule__ExpressionWhereEntry__Group__0__Impl rule__ExpressionWhereEntry__Group__1 ;
    public final void rule__ExpressionWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1847:1: ( rule__ExpressionWhereEntry__Group__0__Impl rule__ExpressionWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1848:2: rule__ExpressionWhereEntry__Group__0__Impl rule__ExpressionWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__0__Impl_in_rule__ExpressionWhereEntry__Group__03767);
            rule__ExpressionWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__1_in_rule__ExpressionWhereEntry__Group__03770);
            rule__ExpressionWhereEntry__Group__1();

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__0"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1855:1: rule__ExpressionWhereEntry__Group__0__Impl : ( ( rule__ExpressionWhereEntry__NameAssignment_0 ) ) ;
    public final void rule__ExpressionWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1859:1: ( ( ( rule__ExpressionWhereEntry__NameAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1860:1: ( ( rule__ExpressionWhereEntry__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1860:1: ( ( rule__ExpressionWhereEntry__NameAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1861:1: ( rule__ExpressionWhereEntry__NameAssignment_0 )
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1862:1: ( rule__ExpressionWhereEntry__NameAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1862:2: rule__ExpressionWhereEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__NameAssignment_0_in_rule__ExpressionWhereEntry__Group__0__Impl3797);
            rule__ExpressionWhereEntry__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionWhereEntryAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__0__Impl"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1872:1: rule__ExpressionWhereEntry__Group__1 : rule__ExpressionWhereEntry__Group__1__Impl rule__ExpressionWhereEntry__Group__2 ;
    public final void rule__ExpressionWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1876:1: ( rule__ExpressionWhereEntry__Group__1__Impl rule__ExpressionWhereEntry__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1877:2: rule__ExpressionWhereEntry__Group__1__Impl rule__ExpressionWhereEntry__Group__2
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__1__Impl_in_rule__ExpressionWhereEntry__Group__13827);
            rule__ExpressionWhereEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__2_in_rule__ExpressionWhereEntry__Group__13830);
            rule__ExpressionWhereEntry__Group__2();

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__1"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1884:1: rule__ExpressionWhereEntry__Group__1__Impl : ( ( rule__ExpressionWhereEntry__OperatorAssignment_1 ) ) ;
    public final void rule__ExpressionWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1888:1: ( ( ( rule__ExpressionWhereEntry__OperatorAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1889:1: ( ( rule__ExpressionWhereEntry__OperatorAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1889:1: ( ( rule__ExpressionWhereEntry__OperatorAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1890:1: ( rule__ExpressionWhereEntry__OperatorAssignment_1 )
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getOperatorAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1891:1: ( rule__ExpressionWhereEntry__OperatorAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1891:2: rule__ExpressionWhereEntry__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__OperatorAssignment_1_in_rule__ExpressionWhereEntry__Group__1__Impl3857);
            rule__ExpressionWhereEntry__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionWhereEntryAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__1__Impl"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1901:1: rule__ExpressionWhereEntry__Group__2 : rule__ExpressionWhereEntry__Group__2__Impl ;
    public final void rule__ExpressionWhereEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1905:1: ( rule__ExpressionWhereEntry__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1906:2: rule__ExpressionWhereEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Group__2__Impl_in_rule__ExpressionWhereEntry__Group__23887);
            rule__ExpressionWhereEntry__Group__2__Impl();

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__2"


    // $ANTLR start "rule__ExpressionWhereEntry__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1912:1: rule__ExpressionWhereEntry__Group__2__Impl : ( ( rule__ExpressionWhereEntry__RhsAssignment_2 ) ) ;
    public final void rule__ExpressionWhereEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1916:1: ( ( ( rule__ExpressionWhereEntry__RhsAssignment_2 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1917:1: ( ( rule__ExpressionWhereEntry__RhsAssignment_2 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1917:1: ( ( rule__ExpressionWhereEntry__RhsAssignment_2 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1918:1: ( rule__ExpressionWhereEntry__RhsAssignment_2 )
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getRhsAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1919:1: ( rule__ExpressionWhereEntry__RhsAssignment_2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1919:2: rule__ExpressionWhereEntry__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__RhsAssignment_2_in_rule__ExpressionWhereEntry__Group__2__Impl3914);
            rule__ExpressionWhereEntry__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionWhereEntryAccess().getRhsAssignment_2()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__Group__2__Impl"


    // $ANTLR start "rule__Model__AttrsAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1936:1: rule__Model__AttrsAssignment_1 : ( ruleColumnList ) ;
    public final void rule__Model__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1940:1: ( ( ruleColumnList ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1941:1: ( ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1941:1: ( ruleColumnList )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1942:1: ruleColumnList
            {
             before(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_13955);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1951:1: rule__Model__DbAssignment_3 : ( ruleDatabase ) ;
    public final void rule__Model__DbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1955:1: ( ( ruleDatabase ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1956:1: ( ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1956:1: ( ruleDatabase )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1957:1: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_33986);
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


    // $ANTLR start "rule__Model__WhereEntryAssignment_4_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1966:1: rule__Model__WhereEntryAssignment_4_1 : ( ruleWhereEntry ) ;
    public final void rule__Model__WhereEntryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1970:1: ( ( ruleWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1971:1: ( ruleWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1971:1: ( ruleWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1972:1: ruleWhereEntry
            {
             before(grammarAccess.getModelAccess().getWhereEntryWhereEntryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_rule__Model__WhereEntryAssignment_4_14017);
            ruleWhereEntry();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWhereEntryWhereEntryParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Model__WhereEntryAssignment_4_1"


    // $ANTLR start "rule__Database__UrlAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1981:1: rule__Database__UrlAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1985:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1986:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1986:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1987:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_14048); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1996:1: rule__Database__PortAssignment_2_1 : ( RULE_SINGED_LONG ) ;
    public final void rule__Database__PortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2000:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2001:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2001:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2002:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getDatabaseAccess().getPortSINGED_LONGTerminalRuleCall_2_1_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__Database__PortAssignment_2_14079); 
             after(grammarAccess.getDatabaseAccess().getPortSINGED_LONGTerminalRuleCall_2_1_0()); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2011:1: rule__Database__DbNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Database__DbNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2015:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2016:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2016:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2017:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_44110); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2026:1: rule__Database__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2030:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2031:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2031:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2032:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_64141); 
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


    // $ANTLR start "rule__WhereEntry__EntriesAssignment_1_1_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2041:1: rule__WhereEntry__EntriesAssignment_1_1_1 : ( ruleAndWhereEntry ) ;
    public final void rule__WhereEntry__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2045:1: ( ( ruleAndWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2046:1: ( ruleAndWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2046:1: ( ruleAndWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2047:1: ruleAndWhereEntry
            {
             before(grammarAccess.getWhereEntryAccess().getEntriesAndWhereEntryParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__EntriesAssignment_1_1_14172);
            ruleAndWhereEntry();

            state._fsp--;

             after(grammarAccess.getWhereEntryAccess().getEntriesAndWhereEntryParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__WhereEntry__EntriesAssignment_1_1_1"


    // $ANTLR start "rule__AndWhereEntry__EntriesAssignment_1_1_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2056:1: rule__AndWhereEntry__EntriesAssignment_1_1_1 : ( ruleConcreteWhereEntry ) ;
    public final void rule__AndWhereEntry__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2060:1: ( ( ruleConcreteWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2061:1: ( ruleConcreteWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2061:1: ( ruleConcreteWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2062:1: ruleConcreteWhereEntry
            {
             before(grammarAccess.getAndWhereEntryAccess().getEntriesConcreteWhereEntryParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__EntriesAssignment_1_1_14203);
            ruleConcreteWhereEntry();

            state._fsp--;

             after(grammarAccess.getAndWhereEntryAccess().getEntriesConcreteWhereEntryParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__AndWhereEntry__EntriesAssignment_1_1_1"


    // $ANTLR start "rule__ExpressionWhereEntry__NameAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2071:1: rule__ExpressionWhereEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExpressionWhereEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2075:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2076:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2076:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2077:1: RULE_ID
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionWhereEntry__NameAssignment_04234); 
             after(grammarAccess.getExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__NameAssignment_0"


    // $ANTLR start "rule__ExpressionWhereEntry__OperatorAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2086:1: rule__ExpressionWhereEntry__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__ExpressionWhereEntry__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2090:1: ( ( ruleOperator ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2091:1: ( ruleOperator )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2091:1: ( ruleOperator )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2092:1: ruleOperator
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__ExpressionWhereEntry__OperatorAssignment_14265);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__OperatorAssignment_1"


    // $ANTLR start "rule__ExpressionWhereEntry__RhsAssignment_2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2101:1: rule__ExpressionWhereEntry__RhsAssignment_2 : ( ruleExpression ) ;
    public final void rule__ExpressionWhereEntry__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2105:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2106:1: ( ruleExpression )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2106:1: ( ruleExpression )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2107:1: ruleExpression
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionWhereEntry__RhsAssignment_24296);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__RhsAssignment_2"


    // $ANTLR start "rule__ReplacableValue__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2116:1: rule__ReplacableValue__ValueAssignment : ( ( '?' ) ) ;
    public final void rule__ReplacableValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2120:1: ( ( ( '?' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2121:1: ( ( '?' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2121:1: ( ( '?' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2122:1: ( '?' )
            {
             before(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2123:1: ( '?' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2124:1: '?'
            {
             before(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ReplacableValue__ValueAssignment4332); 
             after(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 

            }

             after(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 

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
    // $ANTLR end "rule__ReplacableValue__ValueAssignment"


    // $ANTLR start "rule__DoubleExpression__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2139:1: rule__DoubleExpression__ValueAssignment : ( RULE_SIGNED_DOUBLE ) ;
    public final void rule__DoubleExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2143:1: ( ( RULE_SIGNED_DOUBLE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2144:1: ( RULE_SIGNED_DOUBLE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2144:1: ( RULE_SIGNED_DOUBLE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2145:1: RULE_SIGNED_DOUBLE
            {
             before(grammarAccess.getDoubleExpressionAccess().getValueSIGNED_DOUBLETerminalRuleCall_0()); 
            match(input,RULE_SIGNED_DOUBLE,FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleExpression__ValueAssignment4371); 
             after(grammarAccess.getDoubleExpressionAccess().getValueSIGNED_DOUBLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DoubleExpression__ValueAssignment"


    // $ANTLR start "rule__LongExpression__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2154:1: rule__LongExpression__ValueAssignment : ( RULE_SINGED_LONG ) ;
    public final void rule__LongExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2158:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2159:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2159:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2160:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getLongExpressionAccess().getValueSINGED_LONGTerminalRuleCall_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__LongExpression__ValueAssignment4402); 
             after(grammarAccess.getLongExpressionAccess().getValueSINGED_LONGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__LongExpression__ValueAssignment"


    // $ANTLR start "rule__StringExpression__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2169:1: rule__StringExpression__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2173:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2174:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2174:1: ( RULE_STRING )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2175:1: RULE_STRING
            {
             before(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringExpression__ValueAssignment4433); 
             after(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringExpression__ValueAssignment"


    // $ANTLR start "rule__NullExpression__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2184:1: rule__NullExpression__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2188:1: ( ( ( 'null' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2189:1: ( ( 'null' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2189:1: ( ( 'null' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2190:1: ( 'null' )
            {
             before(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2191:1: ( 'null' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2192:1: 'null'
            {
             before(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__NullExpression__ValueAssignment4469); 
             after(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 

            }

             after(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 

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
    // $ANTLR end "rule__NullExpression__ValueAssignment"


    // $ANTLR start "rule__DateExpression__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2207:1: rule__DateExpression__ValueAssignment : ( RULE_DATE ) ;
    public final void rule__DateExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2211:1: ( ( RULE_DATE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2212:1: ( RULE_DATE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2212:1: ( RULE_DATE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2213:1: RULE_DATE
            {
             before(grammarAccess.getDateExpressionAccess().getValueDATETerminalRuleCall_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateExpression__ValueAssignment4508); 
             after(grammarAccess.getDateExpressionAccess().getValueDATETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DateExpression__ValueAssignment"


    // $ANTLR start "rule__BooleanExpression__TrueAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2222:1: rule__BooleanExpression__TrueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanExpression__TrueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2226:1: ( ( ( 'true' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2227:1: ( ( 'true' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2227:1: ( ( 'true' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2228:1: ( 'true' )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2229:1: ( 'true' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2230:1: 'true'
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__BooleanExpression__TrueAssignment_04544); 
             after(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 

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
    // $ANTLR end "rule__BooleanExpression__TrueAssignment_0"


    // $ANTLR start "rule__BooleanExpression__TrueAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2245:1: rule__BooleanExpression__TrueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BooleanExpression__TrueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2249:1: ( ( ( 'false' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2250:1: ( ( 'false' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2250:1: ( ( 'false' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2251:1: ( 'false' )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2252:1: ( 'false' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2253:1: 'false'
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__BooleanExpression__TrueAssignment_14588); 
             after(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 

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
    // $ANTLR end "rule__BooleanExpression__TrueAssignment_1"

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
    public static final BitSet FOLLOW_ruleWhereEntry_in_entryRuleWhereEntry241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereEntry248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__0_in_ruleWhereEntry274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_entryRuleAndWhereEntry301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndWhereEntry308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__0_in_ruleAndWhereEntry334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_entryRuleConcreteWhereEntry361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteWhereEntry368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteWhereEntry__Alternatives_in_ruleConcreteWhereEntry394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParWhereEntry_in_entryRuleParWhereEntry421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParWhereEntry428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__0_in_ruleParWhereEntry454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWhereEntry_in_entryRuleExpressionWhereEntry481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionWhereEntry488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__0_in_ruleExpressionWhereEntry514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplacableValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplacableValue__ValueAssignment_in_ruleReplacableValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleExpression668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleExpression__ValueAssignment_in_ruleDoubleExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_entryRuleLongExpression721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongExpression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongExpression__ValueAssignment_in_ruleLongExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__ValueAssignment_in_ruleStringExpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullExpression__ValueAssignment_in_ruleNullExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_entryRuleDateExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateExpression__ValueAssignment_in_ruleDateExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ColumnList__Alternatives1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_rule__Expression__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_rule__Expression__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_rule__Expression__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_rule__Expression__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_rule__Expression__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_rule__Expression__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__TrueAssignment_0_in_rule__BooleanExpression__Alternatives1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__TrueAssignment_1_in_rule__BooleanExpression__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01576 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__0__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11638 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21698 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__2__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31760 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01888 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group_4__0__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WhereEntryAssignment_4_1_in_rule__Model__Group_4__1__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Database__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12073 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22133 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__32194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__32197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Database__Group__3__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__42256 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Database__Group__5_in_rule__Database__Group__42259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__52316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__6_in_rule__Database__Group__52319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Database__Group__5__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__62378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__02449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__02452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Database__Group_2__0__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__02572 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__12631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl2658 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__02693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ColumnList__Group_0_1__0__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__0__Impl_in_rule__WhereEntry__Group__02815 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__1_in_rule__WhereEntry__Group__02818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__Group__0__Impl2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__1__Impl_in_rule__WhereEntry__Group__12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__0_in_rule__WhereEntry__Group__1__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__0__Impl_in_rule__WhereEntry__Group_1__02936 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__1_in_rule__WhereEntry__Group_1__02939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__1__Impl_in_rule__WhereEntry__Group_1__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3026 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3038 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0__Impl_in_rule__WhereEntry__Group_1_1__03075 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__1_in_rule__WhereEntry__Group_1_1__03078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__WhereEntry__Group_1_1__0__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__1__Impl_in_rule__WhereEntry__Group_1_1__13137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__EntriesAssignment_1_1_1_in_rule__WhereEntry__Group_1_1__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__0__Impl_in_rule__AndWhereEntry__Group__03198 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__1_in_rule__AndWhereEntry__Group__03201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__Group__0__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__1__Impl_in_rule__AndWhereEntry__Group__13257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__0_in_rule__AndWhereEntry__Group__1__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__0__Impl_in_rule__AndWhereEntry__Group_1__03319 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__1_in_rule__AndWhereEntry__Group_1__03322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__1__Impl_in_rule__AndWhereEntry__Group_1__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl3409 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl3421 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0__Impl_in_rule__AndWhereEntry__Group_1_1__03458 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__1_in_rule__AndWhereEntry__Group_1_1__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AndWhereEntry__Group_1_1__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__1__Impl_in_rule__AndWhereEntry__Group_1_1__13520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__EntriesAssignment_1_1_1_in_rule__AndWhereEntry__Group_1_1__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__0__Impl_in_rule__ParWhereEntry__Group__03581 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__1_in_rule__ParWhereEntry__Group__03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ParWhereEntry__Group__0__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__1__Impl_in_rule__ParWhereEntry__Group__13643 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__2_in_rule__ParWhereEntry__Group__13646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_rule__ParWhereEntry__Group__1__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__2__Impl_in_rule__ParWhereEntry__Group__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ParWhereEntry__Group__2__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__0__Impl_in_rule__ExpressionWhereEntry__Group__03767 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__1_in_rule__ExpressionWhereEntry__Group__03770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__NameAssignment_0_in_rule__ExpressionWhereEntry__Group__0__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__1__Impl_in_rule__ExpressionWhereEntry__Group__13827 = new BitSet(new long[]{0x0000003C000001E0L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__2_in_rule__ExpressionWhereEntry__Group__13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__OperatorAssignment_1_in_rule__ExpressionWhereEntry__Group__1__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Group__2__Impl_in_rule__ExpressionWhereEntry__Group__23887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__RhsAssignment_2_in_rule__ExpressionWhereEntry__Group__2__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_33986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_rule__Model__WhereEntryAssignment_4_14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_14048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__Database__PortAssignment_2_14079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_44110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_64141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__EntriesAssignment_1_1_14172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__EntriesAssignment_1_1_14203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionWhereEntry__NameAssignment_04234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ExpressionWhereEntry__OperatorAssignment_14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionWhereEntry__RhsAssignment_24296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ReplacableValue__ValueAssignment4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleExpression__ValueAssignment4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__LongExpression__ValueAssignment4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringExpression__ValueAssignment4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NullExpression__ValueAssignment4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateExpression__ValueAssignment4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BooleanExpression__TrueAssignment_04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BooleanExpression__TrueAssignment_14588 = new BitSet(new long[]{0x0000000000000002L});

}