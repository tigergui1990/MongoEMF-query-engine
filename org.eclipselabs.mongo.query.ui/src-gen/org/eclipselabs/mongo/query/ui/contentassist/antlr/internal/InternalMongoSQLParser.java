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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SINGED_LONG", "RULE_SIGNED_DOUBLE", "RULE_STRING", "RULE_DATE", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'*'", "'$all'", "'$in'", "'in'", "'$nin'", "'not in'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'like'", "'not like'", "'SELECT'", "'FROM'", "'WHERE'", "'mongo://'", "'/'", "':'", "','", "'OR'", "'AND'", "'('", "')'", "'['", "']'", "'?'", "'null'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int RULE_DATE=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SIGNED_DOUBLE=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SINGED_LONG=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:265:1: ruleExpressionWhereEntry : ( ( rule__ExpressionWhereEntry__Alternatives ) ) ;
    public final void ruleExpressionWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:269:2: ( ( ( rule__ExpressionWhereEntry__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:270:1: ( ( rule__ExpressionWhereEntry__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:270:1: ( ( rule__ExpressionWhereEntry__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:271:1: ( rule__ExpressionWhereEntry__Alternatives )
            {
             before(grammarAccess.getExpressionWhereEntryAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:272:1: ( rule__ExpressionWhereEntry__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:272:2: rule__ExpressionWhereEntry__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionWhereEntry__Alternatives_in_ruleExpressionWhereEntry514);
            rule__ExpressionWhereEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionWhereEntryAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleSingleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:284:1: entryRuleSingleExpressionWhereEntry : ruleSingleExpressionWhereEntry EOF ;
    public final void entryRuleSingleExpressionWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:285:1: ( ruleSingleExpressionWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:286:1: ruleSingleExpressionWhereEntry EOF
            {
             before(grammarAccess.getSingleExpressionWhereEntryRule()); 
            pushFollow(FOLLOW_ruleSingleExpressionWhereEntry_in_entryRuleSingleExpressionWhereEntry541);
            ruleSingleExpressionWhereEntry();

            state._fsp--;

             after(grammarAccess.getSingleExpressionWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleExpressionWhereEntry548); 

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
    // $ANTLR end "entryRuleSingleExpressionWhereEntry"


    // $ANTLR start "ruleSingleExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:293:1: ruleSingleExpressionWhereEntry : ( ( rule__SingleExpressionWhereEntry__Group__0 ) ) ;
    public final void ruleSingleExpressionWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:297:2: ( ( ( rule__SingleExpressionWhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:298:1: ( ( rule__SingleExpressionWhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:298:1: ( ( rule__SingleExpressionWhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:299:1: ( rule__SingleExpressionWhereEntry__Group__0 )
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:300:1: ( rule__SingleExpressionWhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:300:2: rule__SingleExpressionWhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__0_in_ruleSingleExpressionWhereEntry574);
            rule__SingleExpressionWhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleExpressionWhereEntry"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:312:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:313:1: ( ruleExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:314:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression601);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression608); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:321:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:325:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:326:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:326:1: ( ( rule__Expression__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:327:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:328:1: ( rule__Expression__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:328:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression634);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:340:1: entryRuleReplacableValue : ruleReplacableValue EOF ;
    public final void entryRuleReplacableValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:341:1: ( ruleReplacableValue EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:342:1: ruleReplacableValue EOF
            {
             before(grammarAccess.getReplacableValueRule()); 
            pushFollow(FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue661);
            ruleReplacableValue();

            state._fsp--;

             after(grammarAccess.getReplacableValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplacableValue668); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:349:1: ruleReplacableValue : ( ( rule__ReplacableValue__ValueAssignment ) ) ;
    public final void ruleReplacableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:353:2: ( ( ( rule__ReplacableValue__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:354:1: ( ( rule__ReplacableValue__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:354:1: ( ( rule__ReplacableValue__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:355:1: ( rule__ReplacableValue__ValueAssignment )
            {
             before(grammarAccess.getReplacableValueAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:356:1: ( rule__ReplacableValue__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:356:2: rule__ReplacableValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ReplacableValue__ValueAssignment_in_ruleReplacableValue694);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:368:1: entryRuleDoubleExpression : ruleDoubleExpression EOF ;
    public final void entryRuleDoubleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:369:1: ( ruleDoubleExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:370:1: ruleDoubleExpression EOF
            {
             before(grammarAccess.getDoubleExpressionRule()); 
            pushFollow(FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression721);
            ruleDoubleExpression();

            state._fsp--;

             after(grammarAccess.getDoubleExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleExpression728); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:377:1: ruleDoubleExpression : ( ( rule__DoubleExpression__ValueAssignment ) ) ;
    public final void ruleDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:381:2: ( ( ( rule__DoubleExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:382:1: ( ( rule__DoubleExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:382:1: ( ( rule__DoubleExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:383:1: ( rule__DoubleExpression__ValueAssignment )
            {
             before(grammarAccess.getDoubleExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:384:1: ( rule__DoubleExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:384:2: rule__DoubleExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleExpression__ValueAssignment_in_ruleDoubleExpression754);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:396:1: entryRuleLongExpression : ruleLongExpression EOF ;
    public final void entryRuleLongExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:397:1: ( ruleLongExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:398:1: ruleLongExpression EOF
            {
             before(grammarAccess.getLongExpressionRule()); 
            pushFollow(FOLLOW_ruleLongExpression_in_entryRuleLongExpression781);
            ruleLongExpression();

            state._fsp--;

             after(grammarAccess.getLongExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongExpression788); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:405:1: ruleLongExpression : ( ( rule__LongExpression__ValueAssignment ) ) ;
    public final void ruleLongExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:409:2: ( ( ( rule__LongExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:410:1: ( ( rule__LongExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:410:1: ( ( rule__LongExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:411:1: ( rule__LongExpression__ValueAssignment )
            {
             before(grammarAccess.getLongExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:412:1: ( rule__LongExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:412:2: rule__LongExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LongExpression__ValueAssignment_in_ruleLongExpression814);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:424:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:425:1: ( ruleStringExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:426:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression841);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression848); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:433:1: ruleStringExpression : ( ( rule__StringExpression__ValueAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:437:2: ( ( ( rule__StringExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:438:1: ( ( rule__StringExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:438:1: ( ( rule__StringExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:439:1: ( rule__StringExpression__ValueAssignment )
            {
             before(grammarAccess.getStringExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:440:1: ( rule__StringExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:440:2: rule__StringExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringExpression__ValueAssignment_in_ruleStringExpression874);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:452:1: entryRuleNullExpression : ruleNullExpression EOF ;
    public final void entryRuleNullExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:453:1: ( ruleNullExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:454:1: ruleNullExpression EOF
            {
             before(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression901);
            ruleNullExpression();

            state._fsp--;

             after(grammarAccess.getNullExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression908); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:461:1: ruleNullExpression : ( ( rule__NullExpression__ValueAssignment ) ) ;
    public final void ruleNullExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:465:2: ( ( ( rule__NullExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:466:1: ( ( rule__NullExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:466:1: ( ( rule__NullExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:467:1: ( rule__NullExpression__ValueAssignment )
            {
             before(grammarAccess.getNullExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:468:1: ( rule__NullExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:468:2: rule__NullExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullExpression__ValueAssignment_in_ruleNullExpression934);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:480:1: entryRuleDateExpression : ruleDateExpression EOF ;
    public final void entryRuleDateExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:481:1: ( ruleDateExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:482:1: ruleDateExpression EOF
            {
             before(grammarAccess.getDateExpressionRule()); 
            pushFollow(FOLLOW_ruleDateExpression_in_entryRuleDateExpression961);
            ruleDateExpression();

            state._fsp--;

             after(grammarAccess.getDateExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateExpression968); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:489:1: ruleDateExpression : ( ( rule__DateExpression__ValueAssignment ) ) ;
    public final void ruleDateExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:493:2: ( ( ( rule__DateExpression__ValueAssignment ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:494:1: ( ( rule__DateExpression__ValueAssignment ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:494:1: ( ( rule__DateExpression__ValueAssignment ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:495:1: ( rule__DateExpression__ValueAssignment )
            {
             before(grammarAccess.getDateExpressionAccess().getValueAssignment()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:496:1: ( rule__DateExpression__ValueAssignment )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:496:2: rule__DateExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DateExpression__ValueAssignment_in_ruleDateExpression994);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:508:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:509:1: ( ruleBooleanExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:510:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1021);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1028); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:517:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Alternatives ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:521:2: ( ( ( rule__BooleanExpression__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:522:1: ( ( rule__BooleanExpression__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:522:1: ( ( rule__BooleanExpression__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:523:1: ( rule__BooleanExpression__Alternatives )
            {
             before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:524:1: ( rule__BooleanExpression__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:524:2: rule__BooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression1054);
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


    // $ANTLR start "entryRuleMultiExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:536:1: entryRuleMultiExpressionWhereEntry : ruleMultiExpressionWhereEntry EOF ;
    public final void entryRuleMultiExpressionWhereEntry() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:537:1: ( ruleMultiExpressionWhereEntry EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:538:1: ruleMultiExpressionWhereEntry EOF
            {
             before(grammarAccess.getMultiExpressionWhereEntryRule()); 
            pushFollow(FOLLOW_ruleMultiExpressionWhereEntry_in_entryRuleMultiExpressionWhereEntry1081);
            ruleMultiExpressionWhereEntry();

            state._fsp--;

             after(grammarAccess.getMultiExpressionWhereEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiExpressionWhereEntry1088); 

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
    // $ANTLR end "entryRuleMultiExpressionWhereEntry"


    // $ANTLR start "ruleMultiExpressionWhereEntry"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:545:1: ruleMultiExpressionWhereEntry : ( ( rule__MultiExpressionWhereEntry__Group__0 ) ) ;
    public final void ruleMultiExpressionWhereEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:549:2: ( ( ( rule__MultiExpressionWhereEntry__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:550:1: ( ( rule__MultiExpressionWhereEntry__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:550:1: ( ( rule__MultiExpressionWhereEntry__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:551:1: ( rule__MultiExpressionWhereEntry__Group__0 )
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:552:1: ( rule__MultiExpressionWhereEntry__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:552:2: rule__MultiExpressionWhereEntry__Group__0
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__0_in_ruleMultiExpressionWhereEntry1114);
            rule__MultiExpressionWhereEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiExpressionWhereEntry"


    // $ANTLR start "entryRuleArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:564:1: entryRuleArrayExpression : ruleArrayExpression EOF ;
    public final void entryRuleArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:565:1: ( ruleArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:566:1: ruleArrayExpression EOF
            {
             before(grammarAccess.getArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleArrayExpression_in_entryRuleArrayExpression1141);
            ruleArrayExpression();

            state._fsp--;

             after(grammarAccess.getArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayExpression1148); 

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
    // $ANTLR end "entryRuleArrayExpression"


    // $ANTLR start "ruleArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:573:1: ruleArrayExpression : ( ( rule__ArrayExpression__Alternatives ) ) ;
    public final void ruleArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:577:2: ( ( ( rule__ArrayExpression__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:578:1: ( ( rule__ArrayExpression__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:578:1: ( ( rule__ArrayExpression__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:579:1: ( rule__ArrayExpression__Alternatives )
            {
             before(grammarAccess.getArrayExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:580:1: ( rule__ArrayExpression__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:580:2: rule__ArrayExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ArrayExpression__Alternatives_in_ruleArrayExpression1174);
            rule__ArrayExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArrayExpression"


    // $ANTLR start "entryRuleDoubleArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:592:1: entryRuleDoubleArrayExpression : ruleDoubleArrayExpression EOF ;
    public final void entryRuleDoubleArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:593:1: ( ruleDoubleArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:594:1: ruleDoubleArrayExpression EOF
            {
             before(grammarAccess.getDoubleArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayExpression_in_entryRuleDoubleArrayExpression1201);
            ruleDoubleArrayExpression();

            state._fsp--;

             after(grammarAccess.getDoubleArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayExpression1208); 

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
    // $ANTLR end "entryRuleDoubleArrayExpression"


    // $ANTLR start "ruleDoubleArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:601:1: ruleDoubleArrayExpression : ( ( rule__DoubleArrayExpression__Group__0 ) ) ;
    public final void ruleDoubleArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:605:2: ( ( ( rule__DoubleArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:606:1: ( ( rule__DoubleArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:606:1: ( ( rule__DoubleArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:607:1: ( rule__DoubleArrayExpression__Group__0 )
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:608:1: ( rule__DoubleArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:608:2: rule__DoubleArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__0_in_ruleDoubleArrayExpression1234);
            rule__DoubleArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleDoubleArrayExpression"


    // $ANTLR start "entryRuleLongArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:620:1: entryRuleLongArrayExpression : ruleLongArrayExpression EOF ;
    public final void entryRuleLongArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:621:1: ( ruleLongArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:622:1: ruleLongArrayExpression EOF
            {
             before(grammarAccess.getLongArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleLongArrayExpression_in_entryRuleLongArrayExpression1261);
            ruleLongArrayExpression();

            state._fsp--;

             after(grammarAccess.getLongArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayExpression1268); 

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
    // $ANTLR end "entryRuleLongArrayExpression"


    // $ANTLR start "ruleLongArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:629:1: ruleLongArrayExpression : ( ( rule__LongArrayExpression__Group__0 ) ) ;
    public final void ruleLongArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:633:2: ( ( ( rule__LongArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:634:1: ( ( rule__LongArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:634:1: ( ( rule__LongArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:635:1: ( rule__LongArrayExpression__Group__0 )
            {
             before(grammarAccess.getLongArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:636:1: ( rule__LongArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:636:2: rule__LongArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group__0_in_ruleLongArrayExpression1294);
            rule__LongArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleLongArrayExpression"


    // $ANTLR start "entryRuleStringArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:648:1: entryRuleStringArrayExpression : ruleStringArrayExpression EOF ;
    public final void entryRuleStringArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:649:1: ( ruleStringArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:650:1: ruleStringArrayExpression EOF
            {
             before(grammarAccess.getStringArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleStringArrayExpression_in_entryRuleStringArrayExpression1321);
            ruleStringArrayExpression();

            state._fsp--;

             after(grammarAccess.getStringArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayExpression1328); 

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
    // $ANTLR end "entryRuleStringArrayExpression"


    // $ANTLR start "ruleStringArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:657:1: ruleStringArrayExpression : ( ( rule__StringArrayExpression__Group__0 ) ) ;
    public final void ruleStringArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:661:2: ( ( ( rule__StringArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:662:1: ( ( rule__StringArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:662:1: ( ( rule__StringArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:663:1: ( rule__StringArrayExpression__Group__0 )
            {
             before(grammarAccess.getStringArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:664:1: ( rule__StringArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:664:2: rule__StringArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group__0_in_ruleStringArrayExpression1354);
            rule__StringArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleStringArrayExpression"


    // $ANTLR start "entryRuleNullArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:676:1: entryRuleNullArrayExpression : ruleNullArrayExpression EOF ;
    public final void entryRuleNullArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:677:1: ( ruleNullArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:678:1: ruleNullArrayExpression EOF
            {
             before(grammarAccess.getNullArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleNullArrayExpression_in_entryRuleNullArrayExpression1381);
            ruleNullArrayExpression();

            state._fsp--;

             after(grammarAccess.getNullArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullArrayExpression1388); 

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
    // $ANTLR end "entryRuleNullArrayExpression"


    // $ANTLR start "ruleNullArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:685:1: ruleNullArrayExpression : ( ( rule__NullArrayExpression__Group__0 ) ) ;
    public final void ruleNullArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:689:2: ( ( ( rule__NullArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:690:1: ( ( rule__NullArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:690:1: ( ( rule__NullArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:691:1: ( rule__NullArrayExpression__Group__0 )
            {
             before(grammarAccess.getNullArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:692:1: ( rule__NullArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:692:2: rule__NullArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group__0_in_ruleNullArrayExpression1414);
            rule__NullArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNullArrayExpression"


    // $ANTLR start "entryRuleDateArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:704:1: entryRuleDateArrayExpression : ruleDateArrayExpression EOF ;
    public final void entryRuleDateArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:705:1: ( ruleDateArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:706:1: ruleDateArrayExpression EOF
            {
             before(grammarAccess.getDateArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleDateArrayExpression_in_entryRuleDateArrayExpression1441);
            ruleDateArrayExpression();

            state._fsp--;

             after(grammarAccess.getDateArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateArrayExpression1448); 

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
    // $ANTLR end "entryRuleDateArrayExpression"


    // $ANTLR start "ruleDateArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:713:1: ruleDateArrayExpression : ( ( rule__DateArrayExpression__Group__0 ) ) ;
    public final void ruleDateArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:717:2: ( ( ( rule__DateArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:718:1: ( ( rule__DateArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:718:1: ( ( rule__DateArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:719:1: ( rule__DateArrayExpression__Group__0 )
            {
             before(grammarAccess.getDateArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:720:1: ( rule__DateArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:720:2: rule__DateArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group__0_in_ruleDateArrayExpression1474);
            rule__DateArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleDateArrayExpression"


    // $ANTLR start "entryRuleBooleanArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:732:1: entryRuleBooleanArrayExpression : ruleBooleanArrayExpression EOF ;
    public final void entryRuleBooleanArrayExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:733:1: ( ruleBooleanArrayExpression EOF )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:734:1: ruleBooleanArrayExpression EOF
            {
             before(grammarAccess.getBooleanArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayExpression_in_entryRuleBooleanArrayExpression1501);
            ruleBooleanArrayExpression();

            state._fsp--;

             after(grammarAccess.getBooleanArrayExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayExpression1508); 

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
    // $ANTLR end "entryRuleBooleanArrayExpression"


    // $ANTLR start "ruleBooleanArrayExpression"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:741:1: ruleBooleanArrayExpression : ( ( rule__BooleanArrayExpression__Group__0 ) ) ;
    public final void ruleBooleanArrayExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:745:2: ( ( ( rule__BooleanArrayExpression__Group__0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:746:1: ( ( rule__BooleanArrayExpression__Group__0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:746:1: ( ( rule__BooleanArrayExpression__Group__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:747:1: ( rule__BooleanArrayExpression__Group__0 )
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getGroup()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:748:1: ( rule__BooleanArrayExpression__Group__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:748:2: rule__BooleanArrayExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__0_in_ruleBooleanArrayExpression1534);
            rule__BooleanArrayExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanArrayExpression"


    // $ANTLR start "ruleArrayOperator"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:761:1: ruleArrayOperator : ( ( rule__ArrayOperator__Alternatives ) ) ;
    public final void ruleArrayOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:765:1: ( ( ( rule__ArrayOperator__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:766:1: ( ( rule__ArrayOperator__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:766:1: ( ( rule__ArrayOperator__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:767:1: ( rule__ArrayOperator__Alternatives )
            {
             before(grammarAccess.getArrayOperatorAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:768:1: ( rule__ArrayOperator__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:768:2: rule__ArrayOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ArrayOperator__Alternatives_in_ruleArrayOperator1571);
            rule__ArrayOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArrayOperator"


    // $ANTLR start "ruleOperator"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:780:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:784:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:785:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:785:1: ( ( rule__Operator__Alternatives ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:786:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:787:1: ( rule__Operator__Alternatives )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:787:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1607);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:798:1: rule__ColumnList__Alternatives : ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) );
    public final void rule__ColumnList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:802:1: ( ( ( rule__ColumnList__Group_0__0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:803:1: ( ( rule__ColumnList__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:803:1: ( ( rule__ColumnList__Group_0__0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:804:1: ( rule__ColumnList__Group_0__0 )
                    {
                     before(grammarAccess.getColumnListAccess().getGroup_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:805:1: ( rule__ColumnList__Group_0__0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:805:2: rule__ColumnList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives1642);
                    rule__ColumnList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:809:6: ( '*' )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:809:6: ( '*' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:810:1: '*'
                    {
                     before(grammarAccess.getColumnListAccess().getAsteriskKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__ColumnList__Alternatives1661); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:822:1: rule__ConcreteWhereEntry__Alternatives : ( ( ruleParWhereEntry ) | ( ruleExpressionWhereEntry ) );
    public final void rule__ConcreteWhereEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:826:1: ( ( ruleParWhereEntry ) | ( ruleExpressionWhereEntry ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
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
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:827:1: ( ruleParWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:827:1: ( ruleParWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:828:1: ruleParWhereEntry
                    {
                     before(grammarAccess.getConcreteWhereEntryAccess().getParWhereEntryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1695);
                    ruleParWhereEntry();

                    state._fsp--;

                     after(grammarAccess.getConcreteWhereEntryAccess().getParWhereEntryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:833:6: ( ruleExpressionWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:833:6: ( ruleExpressionWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:834:1: ruleExpressionWhereEntry
                    {
                     before(grammarAccess.getConcreteWhereEntryAccess().getExpressionWhereEntryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpressionWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1712);
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


    // $ANTLR start "rule__ExpressionWhereEntry__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:844:1: rule__ExpressionWhereEntry__Alternatives : ( ( ruleSingleExpressionWhereEntry ) | ( ruleMultiExpressionWhereEntry ) );
    public final void rule__ExpressionWhereEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:848:1: ( ( ruleSingleExpressionWhereEntry ) | ( ruleMultiExpressionWhereEntry ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                    {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==38) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_3>=RULE_SINGED_LONG && LA3_3<=RULE_DATE)||(LA3_3>=40 && LA3_3<=43)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==38) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_4>=RULE_SINGED_LONG && LA3_4<=RULE_DATE)||(LA3_4>=40 && LA3_4<=43)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 15:
                case 17:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:849:1: ( ruleSingleExpressionWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:849:1: ( ruleSingleExpressionWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:850:1: ruleSingleExpressionWhereEntry
                    {
                     before(grammarAccess.getExpressionWhereEntryAccess().getSingleExpressionWhereEntryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleExpressionWhereEntry_in_rule__ExpressionWhereEntry__Alternatives1744);
                    ruleSingleExpressionWhereEntry();

                    state._fsp--;

                     after(grammarAccess.getExpressionWhereEntryAccess().getSingleExpressionWhereEntryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:855:6: ( ruleMultiExpressionWhereEntry )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:855:6: ( ruleMultiExpressionWhereEntry )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:856:1: ruleMultiExpressionWhereEntry
                    {
                     before(grammarAccess.getExpressionWhereEntryAccess().getMultiExpressionWhereEntryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiExpressionWhereEntry_in_rule__ExpressionWhereEntry__Alternatives1761);
                    ruleMultiExpressionWhereEntry();

                    state._fsp--;

                     after(grammarAccess.getExpressionWhereEntryAccess().getMultiExpressionWhereEntryParserRuleCall_1()); 

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
    // $ANTLR end "rule__ExpressionWhereEntry__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:866:1: rule__Expression__Alternatives : ( ( ruleDoubleExpression ) | ( ruleLongExpression ) | ( ruleStringExpression ) | ( ruleNullExpression ) | ( ruleDateExpression ) | ( ruleBooleanExpression ) | ( ruleReplacableValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:870:1: ( ( ruleDoubleExpression ) | ( ruleLongExpression ) | ( ruleStringExpression ) | ( ruleNullExpression ) | ( ruleDateExpression ) | ( ruleBooleanExpression ) | ( ruleReplacableValue ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_DOUBLE:
                {
                alt4=1;
                }
                break;
            case RULE_SINGED_LONG:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 41:
                {
                alt4=4;
                }
                break;
            case RULE_DATE:
                {
                alt4=5;
                }
                break;
            case 42:
            case 43:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:871:1: ( ruleDoubleExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:871:1: ( ruleDoubleExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:872:1: ruleDoubleExpression
                    {
                     before(grammarAccess.getExpressionAccess().getDoubleExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDoubleExpression_in_rule__Expression__Alternatives1793);
                    ruleDoubleExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDoubleExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:877:6: ( ruleLongExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:877:6: ( ruleLongExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:878:1: ruleLongExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLongExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongExpression_in_rule__Expression__Alternatives1810);
                    ruleLongExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLongExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:883:6: ( ruleStringExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:883:6: ( ruleStringExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:884:1: ruleStringExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringExpression_in_rule__Expression__Alternatives1827);
                    ruleStringExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:889:6: ( ruleNullExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:889:6: ( ruleNullExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:890:1: ruleNullExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNullExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullExpression_in_rule__Expression__Alternatives1844);
                    ruleNullExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNullExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:895:6: ( ruleDateExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:895:6: ( ruleDateExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:896:1: ruleDateExpression
                    {
                     before(grammarAccess.getExpressionAccess().getDateExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDateExpression_in_rule__Expression__Alternatives1861);
                    ruleDateExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDateExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:901:6: ( ruleBooleanExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:901:6: ( ruleBooleanExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:902:1: ruleBooleanExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1878);
                    ruleBooleanExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:907:6: ( ruleReplacableValue )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:907:6: ( ruleReplacableValue )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:908:1: ruleReplacableValue
                    {
                     before(grammarAccess.getExpressionAccess().getReplacableValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleReplacableValue_in_rule__Expression__Alternatives1895);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:918:1: rule__BooleanExpression__Alternatives : ( ( ( rule__BooleanExpression__TrueAssignment_0 ) ) | ( ( rule__BooleanExpression__TrueAssignment_1 ) ) );
    public final void rule__BooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:922:1: ( ( ( rule__BooleanExpression__TrueAssignment_0 ) ) | ( ( rule__BooleanExpression__TrueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:923:1: ( ( rule__BooleanExpression__TrueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:923:1: ( ( rule__BooleanExpression__TrueAssignment_0 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:924:1: ( rule__BooleanExpression__TrueAssignment_0 )
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:925:1: ( rule__BooleanExpression__TrueAssignment_0 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:925:2: rule__BooleanExpression__TrueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanExpression__TrueAssignment_0_in_rule__BooleanExpression__Alternatives1927);
                    rule__BooleanExpression__TrueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:929:6: ( ( rule__BooleanExpression__TrueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:929:6: ( ( rule__BooleanExpression__TrueAssignment_1 ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:930:1: ( rule__BooleanExpression__TrueAssignment_1 )
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getTrueAssignment_1()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:931:1: ( rule__BooleanExpression__TrueAssignment_1 )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:931:2: rule__BooleanExpression__TrueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanExpression__TrueAssignment_1_in_rule__BooleanExpression__Alternatives1945);
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


    // $ANTLR start "rule__ArrayExpression__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:940:1: rule__ArrayExpression__Alternatives : ( ( ruleDoubleArrayExpression ) | ( ruleLongArrayExpression ) | ( ruleStringArrayExpression ) | ( ruleNullArrayExpression ) | ( ruleDateArrayExpression ) | ( ruleBooleanArrayExpression ) );
    public final void rule__ArrayExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:944:1: ( ( ruleDoubleArrayExpression ) | ( ruleLongArrayExpression ) | ( ruleStringArrayExpression ) | ( ruleNullArrayExpression ) | ( ruleDateArrayExpression ) | ( ruleBooleanArrayExpression ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                switch ( input.LA(2) ) {
                case RULE_SIGNED_DOUBLE:
                    {
                    alt6=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_BOOL:
                    {
                    alt6=6;
                    }
                    break;
                case RULE_DATE:
                    {
                    alt6=5;
                    }
                    break;
                case 41:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_SINGED_LONG:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:945:1: ( ruleDoubleArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:945:1: ( ruleDoubleArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:946:1: ruleDoubleArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getDoubleArrayExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDoubleArrayExpression_in_rule__ArrayExpression__Alternatives1978);
                    ruleDoubleArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getDoubleArrayExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:951:6: ( ruleLongArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:951:6: ( ruleLongArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:952:1: ruleLongArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getLongArrayExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongArrayExpression_in_rule__ArrayExpression__Alternatives1995);
                    ruleLongArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getLongArrayExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:957:6: ( ruleStringArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:957:6: ( ruleStringArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:958:1: ruleStringArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getStringArrayExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringArrayExpression_in_rule__ArrayExpression__Alternatives2012);
                    ruleStringArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getStringArrayExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:963:6: ( ruleNullArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:963:6: ( ruleNullArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:964:1: ruleNullArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getNullArrayExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullArrayExpression_in_rule__ArrayExpression__Alternatives2029);
                    ruleNullArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getNullArrayExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:969:6: ( ruleDateArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:969:6: ( ruleDateArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:970:1: ruleDateArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getDateArrayExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDateArrayExpression_in_rule__ArrayExpression__Alternatives2046);
                    ruleDateArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getDateArrayExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:975:6: ( ruleBooleanArrayExpression )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:975:6: ( ruleBooleanArrayExpression )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:976:1: ruleBooleanArrayExpression
                    {
                     before(grammarAccess.getArrayExpressionAccess().getBooleanArrayExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBooleanArrayExpression_in_rule__ArrayExpression__Alternatives2063);
                    ruleBooleanArrayExpression();

                    state._fsp--;

                     after(grammarAccess.getArrayExpressionAccess().getBooleanArrayExpressionParserRuleCall_5()); 

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
    // $ANTLR end "rule__ArrayExpression__Alternatives"


    // $ANTLR start "rule__ArrayOperator__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:986:1: rule__ArrayOperator__Alternatives : ( ( ( '$all' ) ) | ( ( '$in' ) ) | ( ( 'in' ) ) | ( ( '$nin' ) ) | ( ( 'not in' ) ) );
    public final void rule__ArrayOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:990:1: ( ( ( '$all' ) ) | ( ( '$in' ) ) | ( ( 'in' ) ) | ( ( '$nin' ) ) | ( ( 'not in' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:991:1: ( ( '$all' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:991:1: ( ( '$all' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:992:1: ( '$all' )
                    {
                     before(grammarAccess.getArrayOperatorAccess().getMongo_allEnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:993:1: ( '$all' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:993:3: '$all'
                    {
                    match(input,14,FOLLOW_14_in_rule__ArrayOperator__Alternatives2096); 

                    }

                     after(grammarAccess.getArrayOperatorAccess().getMongo_allEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:998:6: ( ( '$in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:998:6: ( ( '$in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:999:1: ( '$in' )
                    {
                     before(grammarAccess.getArrayOperatorAccess().getMongo_inEnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1000:1: ( '$in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1000:3: '$in'
                    {
                    match(input,15,FOLLOW_15_in_rule__ArrayOperator__Alternatives2117); 

                    }

                     after(grammarAccess.getArrayOperatorAccess().getMongo_inEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1005:6: ( ( 'in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1005:6: ( ( 'in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1006:1: ( 'in' )
                    {
                     before(grammarAccess.getArrayOperatorAccess().getSql_inEnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1007:1: ( 'in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1007:3: 'in'
                    {
                    match(input,16,FOLLOW_16_in_rule__ArrayOperator__Alternatives2138); 

                    }

                     after(grammarAccess.getArrayOperatorAccess().getSql_inEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1012:6: ( ( '$nin' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1012:6: ( ( '$nin' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1013:1: ( '$nin' )
                    {
                     before(grammarAccess.getArrayOperatorAccess().getMongo_ninEnumLiteralDeclaration_3()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1014:1: ( '$nin' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1014:3: '$nin'
                    {
                    match(input,17,FOLLOW_17_in_rule__ArrayOperator__Alternatives2159); 

                    }

                     after(grammarAccess.getArrayOperatorAccess().getMongo_ninEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1019:6: ( ( 'not in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1019:6: ( ( 'not in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1020:1: ( 'not in' )
                    {
                     before(grammarAccess.getArrayOperatorAccess().getSql_notInEnumLiteralDeclaration_4()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1021:1: ( 'not in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1021:3: 'not in'
                    {
                    match(input,18,FOLLOW_18_in_rule__ArrayOperator__Alternatives2180); 

                    }

                     after(grammarAccess.getArrayOperatorAccess().getSql_notInEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ArrayOperator__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1031:1: rule__Operator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '!=' ) ) | ( ( 'like' ) ) | ( ( 'not like' ) ) | ( ( 'not in' ) ) | ( ( 'in' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1035:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '!=' ) ) | ( ( 'like' ) ) | ( ( 'not like' ) ) | ( ( 'not in' ) ) | ( ( 'in' ) ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            case 18:
                {
                alt8=9;
                }
                break;
            case 16:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1036:1: ( ( '<' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1036:1: ( ( '<' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1037:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1038:1: ( '<' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1038:3: '<'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives2216); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1043:6: ( ( '>' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1043:6: ( ( '>' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1044:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1045:1: ( '>' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1045:3: '>'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives2237); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1050:6: ( ( '<=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1050:6: ( ( '<=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1051:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1052:1: ( '<=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1052:3: '<='
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives2258); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1057:6: ( ( '>=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1057:6: ( ( '>=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1058:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1059:1: ( '>=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1059:3: '>='
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives2279); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1064:6: ( ( '=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1064:6: ( ( '=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1065:1: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1066:1: ( '=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1066:3: '='
                    {
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives2300); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1071:6: ( ( '!=' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1071:6: ( ( '!=' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1072:1: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1073:1: ( '!=' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1073:3: '!='
                    {
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives2321); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1078:6: ( ( 'like' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1078:6: ( ( 'like' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1079:1: ( 'like' )
                    {
                     before(grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1080:1: ( 'like' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1080:3: 'like'
                    {
                    match(input,25,FOLLOW_25_in_rule__Operator__Alternatives2342); 

                    }

                     after(grammarAccess.getOperatorAccess().getLikeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1085:6: ( ( 'not like' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1085:6: ( ( 'not like' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1086:1: ( 'not like' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1087:1: ( 'not like' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1087:3: 'not like'
                    {
                    match(input,26,FOLLOW_26_in_rule__Operator__Alternatives2363); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotLikeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1092:6: ( ( 'not in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1092:6: ( ( 'not in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1093:1: ( 'not in' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1094:1: ( 'not in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1094:3: 'not in'
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives2384); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotInEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1099:6: ( ( 'in' ) )
                    {
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1099:6: ( ( 'in' ) )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1100:1: ( 'in' )
                    {
                     before(grammarAccess.getOperatorAccess().getInEnumLiteralDeclaration_9()); 
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1101:1: ( 'in' )
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1101:3: 'in'
                    {
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives2405); 

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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1113:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1117:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1118:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02438);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02441);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1125:1: rule__Model__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1129:1: ( ( 'SELECT' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1130:1: ( 'SELECT' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1130:1: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1131:1: 'SELECT'
            {
             before(grammarAccess.getModelAccess().getSELECTKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Model__Group__0__Impl2469); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1144:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1148:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1149:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12500);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12503);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1156:1: rule__Model__Group__1__Impl : ( ( rule__Model__AttrsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1160:1: ( ( ( rule__Model__AttrsAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1161:1: ( ( rule__Model__AttrsAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1161:1: ( ( rule__Model__AttrsAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1162:1: ( rule__Model__AttrsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAttrsAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1163:1: ( rule__Model__AttrsAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1163:2: rule__Model__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl2530);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1173:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1177:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1178:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22560);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22563);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1185:1: rule__Model__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1189:1: ( ( 'FROM' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1190:1: ( 'FROM' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1190:1: ( 'FROM' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1191:1: 'FROM'
            {
             before(grammarAccess.getModelAccess().getFROMKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Model__Group__2__Impl2591); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1204:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1208:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1209:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32622);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32625);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1216:1: rule__Model__Group__3__Impl : ( ( rule__Model__DbAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1220:1: ( ( ( rule__Model__DbAssignment_3 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1221:1: ( ( rule__Model__DbAssignment_3 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1221:1: ( ( rule__Model__DbAssignment_3 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1222:1: ( rule__Model__DbAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDbAssignment_3()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1223:1: ( rule__Model__DbAssignment_3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1223:2: rule__Model__DbAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl2652);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1233:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1237:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1238:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42682);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1244:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1248:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1249:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1249:1: ( ( rule__Model__Group_4__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1250:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1251:1: ( rule__Model__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1251:2: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl2709);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1271:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1275:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1276:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02750);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02753);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1283:1: rule__Model__Group_4__0__Impl : ( 'WHERE' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1287:1: ( ( 'WHERE' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1288:1: ( 'WHERE' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1288:1: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1289:1: 'WHERE'
            {
             before(grammarAccess.getModelAccess().getWHEREKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Model__Group_4__0__Impl2781); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1302:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1306:1: ( rule__Model__Group_4__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1307:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12812);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1313:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__WhereEntryAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1317:1: ( ( ( rule__Model__WhereEntryAssignment_4_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1318:1: ( ( rule__Model__WhereEntryAssignment_4_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1318:1: ( ( rule__Model__WhereEntryAssignment_4_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1319:1: ( rule__Model__WhereEntryAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getWhereEntryAssignment_4_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1320:1: ( rule__Model__WhereEntryAssignment_4_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1320:2: rule__Model__WhereEntryAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__WhereEntryAssignment_4_1_in_rule__Model__Group_4__1__Impl2839);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1334:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1338:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1339:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02873);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02876);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1346:1: rule__Database__Group__0__Impl : ( 'mongo://' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1350:1: ( ( 'mongo://' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1351:1: ( 'mongo://' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1351:1: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1352:1: 'mongo://'
            {
             before(grammarAccess.getDatabaseAccess().getMongoKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Database__Group__0__Impl2904); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1365:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1369:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1370:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12935);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12938);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1377:1: rule__Database__Group__1__Impl : ( ( rule__Database__UrlAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1381:1: ( ( ( rule__Database__UrlAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1382:1: ( ( rule__Database__UrlAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1382:1: ( ( rule__Database__UrlAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1383:1: ( rule__Database__UrlAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getUrlAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1384:1: ( rule__Database__UrlAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1384:2: rule__Database__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl2965);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1394:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1398:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1399:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22995);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22998);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1406:1: rule__Database__Group__2__Impl : ( ( rule__Database__Group_2__0 )? ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1410:1: ( ( ( rule__Database__Group_2__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1411:1: ( ( rule__Database__Group_2__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1411:1: ( ( rule__Database__Group_2__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1412:1: ( rule__Database__Group_2__0 )?
            {
             before(grammarAccess.getDatabaseAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1413:1: ( rule__Database__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1413:2: rule__Database__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl3025);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1423:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1427:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1428:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__33056);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__33059);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1435:1: rule__Database__Group__3__Impl : ( '/' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1439:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1440:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1440:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1441:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Database__Group__3__Impl3087); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1454:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1458:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1459:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__43118);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__5_in_rule__Database__Group__43121);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1466:1: rule__Database__Group__4__Impl : ( ( rule__Database__DbNameAssignment_4 ) ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1470:1: ( ( ( rule__Database__DbNameAssignment_4 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1471:1: ( ( rule__Database__DbNameAssignment_4 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1471:1: ( ( rule__Database__DbNameAssignment_4 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1472:1: ( rule__Database__DbNameAssignment_4 )
            {
             before(grammarAccess.getDatabaseAccess().getDbNameAssignment_4()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1473:1: ( rule__Database__DbNameAssignment_4 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1473:2: rule__Database__DbNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl3148);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1483:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1487:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1488:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__53178);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__6_in_rule__Database__Group__53181);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1495:1: rule__Database__Group__5__Impl : ( '/' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1499:1: ( ( '/' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1500:1: ( '/' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1500:1: ( '/' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1501:1: '/'
            {
             before(grammarAccess.getDatabaseAccess().getSolidusKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__Database__Group__5__Impl3209); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1514:1: rule__Database__Group__6 : rule__Database__Group__6__Impl ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1518:1: ( rule__Database__Group__6__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1519:2: rule__Database__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__63240);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1525:1: rule__Database__Group__6__Impl : ( ( rule__Database__NameAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1529:1: ( ( ( rule__Database__NameAssignment_6 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1530:1: ( ( rule__Database__NameAssignment_6 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1530:1: ( ( rule__Database__NameAssignment_6 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1531:1: ( rule__Database__NameAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_6()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1532:1: ( rule__Database__NameAssignment_6 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1532:2: rule__Database__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl3267);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1556:1: rule__Database__Group_2__0 : rule__Database__Group_2__0__Impl rule__Database__Group_2__1 ;
    public final void rule__Database__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1560:1: ( rule__Database__Group_2__0__Impl rule__Database__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1561:2: rule__Database__Group_2__0__Impl rule__Database__Group_2__1
            {
            pushFollow(FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__03311);
            rule__Database__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__03314);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1568:1: rule__Database__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Database__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1572:1: ( ( ':' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1573:1: ( ':' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1573:1: ( ':' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1574:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Database__Group_2__0__Impl3342); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1587:1: rule__Database__Group_2__1 : rule__Database__Group_2__1__Impl ;
    public final void rule__Database__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1591:1: ( rule__Database__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1592:2: rule__Database__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__13373);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1598:1: rule__Database__Group_2__1__Impl : ( ( rule__Database__PortAssignment_2_1 ) ) ;
    public final void rule__Database__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1602:1: ( ( ( rule__Database__PortAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1603:1: ( ( rule__Database__PortAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1603:1: ( ( rule__Database__PortAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1604:1: ( rule__Database__PortAssignment_2_1 )
            {
             before(grammarAccess.getDatabaseAccess().getPortAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1605:1: ( rule__Database__PortAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1605:2: rule__Database__PortAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl3400);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1619:1: rule__ColumnList__Group_0__0 : rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 ;
    public final void rule__ColumnList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1623:1: ( rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1624:2: rule__ColumnList__Group_0__0__Impl rule__ColumnList__Group_0__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__03434);
            rule__ColumnList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__03437);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1631:1: rule__ColumnList__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1635:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1636:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1636:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1637:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl3464); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1648:1: rule__ColumnList__Group_0__1 : rule__ColumnList__Group_0__1__Impl ;
    public final void rule__ColumnList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1652:1: ( rule__ColumnList__Group_0__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1653:2: rule__ColumnList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__13493);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1659:1: rule__ColumnList__Group_0__1__Impl : ( ( rule__ColumnList__Group_0_1__0 )* ) ;
    public final void rule__ColumnList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1663:1: ( ( ( rule__ColumnList__Group_0_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1664:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1664:1: ( ( rule__ColumnList__Group_0_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1665:1: ( rule__ColumnList__Group_0_1__0 )*
            {
             before(grammarAccess.getColumnListAccess().getGroup_0_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1666:1: ( rule__ColumnList__Group_0_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1666:2: rule__ColumnList__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl3520);
            	    rule__ColumnList__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1680:1: rule__ColumnList__Group_0_1__0 : rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 ;
    public final void rule__ColumnList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1684:1: ( rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1685:2: rule__ColumnList__Group_0_1__0__Impl rule__ColumnList__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__03555);
            rule__ColumnList__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__03558);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1692:1: rule__ColumnList__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnList__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1696:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1697:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1697:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1698:1: ','
            {
             before(grammarAccess.getColumnListAccess().getCommaKeyword_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ColumnList__Group_0_1__0__Impl3586); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1711:1: rule__ColumnList__Group_0_1__1 : rule__ColumnList__Group_0_1__1__Impl ;
    public final void rule__ColumnList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1715:1: ( rule__ColumnList__Group_0_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1716:2: rule__ColumnList__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__13617);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1722:1: rule__ColumnList__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ColumnList__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1726:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1727:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1727:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1728:1: RULE_ID
            {
             before(grammarAccess.getColumnListAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl3644); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1743:1: rule__WhereEntry__Group__0 : rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1 ;
    public final void rule__WhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1747:1: ( rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1748:2: rule__WhereEntry__Group__0__Impl rule__WhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group__0__Impl_in_rule__WhereEntry__Group__03677);
            rule__WhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group__1_in_rule__WhereEntry__Group__03680);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1755:1: rule__WhereEntry__Group__0__Impl : ( ruleAndWhereEntry ) ;
    public final void rule__WhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1759:1: ( ( ruleAndWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1760:1: ( ruleAndWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1760:1: ( ruleAndWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1761:1: ruleAndWhereEntry
            {
             before(grammarAccess.getWhereEntryAccess().getAndWhereEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__Group__0__Impl3707);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1772:1: rule__WhereEntry__Group__1 : rule__WhereEntry__Group__1__Impl ;
    public final void rule__WhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1776:1: ( rule__WhereEntry__Group__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1777:2: rule__WhereEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group__1__Impl_in_rule__WhereEntry__Group__13736);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1783:1: rule__WhereEntry__Group__1__Impl : ( ( rule__WhereEntry__Group_1__0 )? ) ;
    public final void rule__WhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1787:1: ( ( ( rule__WhereEntry__Group_1__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1788:1: ( ( rule__WhereEntry__Group_1__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1788:1: ( ( rule__WhereEntry__Group_1__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1789:1: ( rule__WhereEntry__Group_1__0 )?
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1790:1: ( rule__WhereEntry__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1790:2: rule__WhereEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__WhereEntry__Group_1__0_in_rule__WhereEntry__Group__1__Impl3763);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1804:1: rule__WhereEntry__Group_1__0 : rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1 ;
    public final void rule__WhereEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1808:1: ( rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1809:2: rule__WhereEntry__Group_1__0__Impl rule__WhereEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1__0__Impl_in_rule__WhereEntry__Group_1__03798);
            rule__WhereEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group_1__1_in_rule__WhereEntry__Group_1__03801);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1816:1: rule__WhereEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__WhereEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1820:1: ( ( () ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1821:1: ( () )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1821:1: ( () )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1822:1: ()
            {
             before(grammarAccess.getWhereEntryAccess().getOrWhereEntryEntriesAction_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1823:1: ()
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1825:1: 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1835:1: rule__WhereEntry__Group_1__1 : rule__WhereEntry__Group_1__1__Impl ;
    public final void rule__WhereEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1839:1: ( rule__WhereEntry__Group_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1840:2: rule__WhereEntry__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1__1__Impl_in_rule__WhereEntry__Group_1__13859);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1846:1: rule__WhereEntry__Group_1__1__Impl : ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) ) ;
    public final void rule__WhereEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1850:1: ( ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1851:1: ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1851:1: ( ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1852:1: ( ( rule__WhereEntry__Group_1_1__0 ) ) ( ( rule__WhereEntry__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1852:1: ( ( rule__WhereEntry__Group_1_1__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1853:1: ( rule__WhereEntry__Group_1_1__0 )
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1854:1: ( rule__WhereEntry__Group_1_1__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1854:2: rule__WhereEntry__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3888);
            rule__WhereEntry__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 

            }

            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1857:1: ( ( rule__WhereEntry__Group_1_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1858:1: ( rule__WhereEntry__Group_1_1__0 )*
            {
             before(grammarAccess.getWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1859:1: ( rule__WhereEntry__Group_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1859:2: rule__WhereEntry__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3900);
            	    rule__WhereEntry__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1874:1: rule__WhereEntry__Group_1_1__0 : rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1 ;
    public final void rule__WhereEntry__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1878:1: ( rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1879:2: rule__WhereEntry__Group_1_1__0__Impl rule__WhereEntry__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__0__Impl_in_rule__WhereEntry__Group_1_1__03937);
            rule__WhereEntry__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__1_in_rule__WhereEntry__Group_1_1__03940);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1886:1: rule__WhereEntry__Group_1_1__0__Impl : ( 'OR' ) ;
    public final void rule__WhereEntry__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1890:1: ( ( 'OR' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1891:1: ( 'OR' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1891:1: ( 'OR' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1892:1: 'OR'
            {
             before(grammarAccess.getWhereEntryAccess().getORKeyword_1_1_0()); 
            match(input,34,FOLLOW_34_in_rule__WhereEntry__Group_1_1__0__Impl3968); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1905:1: rule__WhereEntry__Group_1_1__1 : rule__WhereEntry__Group_1_1__1__Impl ;
    public final void rule__WhereEntry__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1909:1: ( rule__WhereEntry__Group_1_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1910:2: rule__WhereEntry__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereEntry__Group_1_1__1__Impl_in_rule__WhereEntry__Group_1_1__13999);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1916:1: rule__WhereEntry__Group_1_1__1__Impl : ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__WhereEntry__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1920:1: ( ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1921:1: ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1921:1: ( ( rule__WhereEntry__EntriesAssignment_1_1_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1922:1: ( rule__WhereEntry__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getWhereEntryAccess().getEntriesAssignment_1_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1923:1: ( rule__WhereEntry__EntriesAssignment_1_1_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1923:2: rule__WhereEntry__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__WhereEntry__EntriesAssignment_1_1_1_in_rule__WhereEntry__Group_1_1__1__Impl4026);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1937:1: rule__AndWhereEntry__Group__0 : rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1 ;
    public final void rule__AndWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1941:1: ( rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1942:2: rule__AndWhereEntry__Group__0__Impl rule__AndWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group__0__Impl_in_rule__AndWhereEntry__Group__04060);
            rule__AndWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group__1_in_rule__AndWhereEntry__Group__04063);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1949:1: rule__AndWhereEntry__Group__0__Impl : ( ruleConcreteWhereEntry ) ;
    public final void rule__AndWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1953:1: ( ( ruleConcreteWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1954:1: ( ruleConcreteWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1954:1: ( ruleConcreteWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1955:1: ruleConcreteWhereEntry
            {
             before(grammarAccess.getAndWhereEntryAccess().getConcreteWhereEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__Group__0__Impl4090);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1966:1: rule__AndWhereEntry__Group__1 : rule__AndWhereEntry__Group__1__Impl ;
    public final void rule__AndWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1970:1: ( rule__AndWhereEntry__Group__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1971:2: rule__AndWhereEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group__1__Impl_in_rule__AndWhereEntry__Group__14119);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1977:1: rule__AndWhereEntry__Group__1__Impl : ( ( rule__AndWhereEntry__Group_1__0 )? ) ;
    public final void rule__AndWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1981:1: ( ( ( rule__AndWhereEntry__Group_1__0 )? ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1982:1: ( ( rule__AndWhereEntry__Group_1__0 )? )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1982:1: ( ( rule__AndWhereEntry__Group_1__0 )? )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1983:1: ( rule__AndWhereEntry__Group_1__0 )?
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1984:1: ( rule__AndWhereEntry__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1984:2: rule__AndWhereEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__0_in_rule__AndWhereEntry__Group__1__Impl4146);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:1998:1: rule__AndWhereEntry__Group_1__0 : rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1 ;
    public final void rule__AndWhereEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2002:1: ( rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2003:2: rule__AndWhereEntry__Group_1__0__Impl rule__AndWhereEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__0__Impl_in_rule__AndWhereEntry__Group_1__04181);
            rule__AndWhereEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__1_in_rule__AndWhereEntry__Group_1__04184);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2010:1: rule__AndWhereEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__AndWhereEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2014:1: ( ( () ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2015:1: ( () )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2015:1: ( () )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2016:1: ()
            {
             before(grammarAccess.getAndWhereEntryAccess().getAndWhereEntryEntriesAction_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2017:1: ()
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2019:1: 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2029:1: rule__AndWhereEntry__Group_1__1 : rule__AndWhereEntry__Group_1__1__Impl ;
    public final void rule__AndWhereEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2033:1: ( rule__AndWhereEntry__Group_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2034:2: rule__AndWhereEntry__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1__1__Impl_in_rule__AndWhereEntry__Group_1__14242);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2040:1: rule__AndWhereEntry__Group_1__1__Impl : ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) ) ;
    public final void rule__AndWhereEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2044:1: ( ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2045:1: ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2045:1: ( ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2046:1: ( ( rule__AndWhereEntry__Group_1_1__0 ) ) ( ( rule__AndWhereEntry__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2046:1: ( ( rule__AndWhereEntry__Group_1_1__0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2047:1: ( rule__AndWhereEntry__Group_1_1__0 )
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2048:1: ( rule__AndWhereEntry__Group_1_1__0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2048:2: rule__AndWhereEntry__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl4271);
            rule__AndWhereEntry__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 

            }

            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2051:1: ( ( rule__AndWhereEntry__Group_1_1__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2052:1: ( rule__AndWhereEntry__Group_1_1__0 )*
            {
             before(grammarAccess.getAndWhereEntryAccess().getGroup_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2053:1: ( rule__AndWhereEntry__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2053:2: rule__AndWhereEntry__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl4283);
            	    rule__AndWhereEntry__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2068:1: rule__AndWhereEntry__Group_1_1__0 : rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1 ;
    public final void rule__AndWhereEntry__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2072:1: ( rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2073:2: rule__AndWhereEntry__Group_1_1__0__Impl rule__AndWhereEntry__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__0__Impl_in_rule__AndWhereEntry__Group_1_1__04320);
            rule__AndWhereEntry__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__1_in_rule__AndWhereEntry__Group_1_1__04323);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2080:1: rule__AndWhereEntry__Group_1_1__0__Impl : ( 'AND' ) ;
    public final void rule__AndWhereEntry__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2084:1: ( ( 'AND' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2085:1: ( 'AND' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2085:1: ( 'AND' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2086:1: 'AND'
            {
             before(grammarAccess.getAndWhereEntryAccess().getANDKeyword_1_1_0()); 
            match(input,35,FOLLOW_35_in_rule__AndWhereEntry__Group_1_1__0__Impl4351); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2099:1: rule__AndWhereEntry__Group_1_1__1 : rule__AndWhereEntry__Group_1_1__1__Impl ;
    public final void rule__AndWhereEntry__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2103:1: ( rule__AndWhereEntry__Group_1_1__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2104:2: rule__AndWhereEntry__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__Group_1_1__1__Impl_in_rule__AndWhereEntry__Group_1_1__14382);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2110:1: rule__AndWhereEntry__Group_1_1__1__Impl : ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__AndWhereEntry__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2114:1: ( ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2115:1: ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2115:1: ( ( rule__AndWhereEntry__EntriesAssignment_1_1_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2116:1: ( rule__AndWhereEntry__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getAndWhereEntryAccess().getEntriesAssignment_1_1_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2117:1: ( rule__AndWhereEntry__EntriesAssignment_1_1_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2117:2: rule__AndWhereEntry__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AndWhereEntry__EntriesAssignment_1_1_1_in_rule__AndWhereEntry__Group_1_1__1__Impl4409);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2131:1: rule__ParWhereEntry__Group__0 : rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1 ;
    public final void rule__ParWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2135:1: ( rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2136:2: rule__ParWhereEntry__Group__0__Impl rule__ParWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__0__Impl_in_rule__ParWhereEntry__Group__04443);
            rule__ParWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParWhereEntry__Group__1_in_rule__ParWhereEntry__Group__04446);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2143:1: rule__ParWhereEntry__Group__0__Impl : ( '(' ) ;
    public final void rule__ParWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2147:1: ( ( '(' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2148:1: ( '(' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2148:1: ( '(' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2149:1: '('
            {
             before(grammarAccess.getParWhereEntryAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ParWhereEntry__Group__0__Impl4474); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2162:1: rule__ParWhereEntry__Group__1 : rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2 ;
    public final void rule__ParWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2166:1: ( rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2167:2: rule__ParWhereEntry__Group__1__Impl rule__ParWhereEntry__Group__2
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__1__Impl_in_rule__ParWhereEntry__Group__14505);
            rule__ParWhereEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParWhereEntry__Group__2_in_rule__ParWhereEntry__Group__14508);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2174:1: rule__ParWhereEntry__Group__1__Impl : ( ruleWhereEntry ) ;
    public final void rule__ParWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2178:1: ( ( ruleWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2179:1: ( ruleWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2179:1: ( ruleWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2180:1: ruleWhereEntry
            {
             before(grammarAccess.getParWhereEntryAccess().getWhereEntryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_rule__ParWhereEntry__Group__1__Impl4535);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2191:1: rule__ParWhereEntry__Group__2 : rule__ParWhereEntry__Group__2__Impl ;
    public final void rule__ParWhereEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2195:1: ( rule__ParWhereEntry__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2196:2: rule__ParWhereEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParWhereEntry__Group__2__Impl_in_rule__ParWhereEntry__Group__24564);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2202:1: rule__ParWhereEntry__Group__2__Impl : ( ')' ) ;
    public final void rule__ParWhereEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2206:1: ( ( ')' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2207:1: ( ')' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2207:1: ( ')' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2208:1: ')'
            {
             before(grammarAccess.getParWhereEntryAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__ParWhereEntry__Group__2__Impl4592); 
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


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2227:1: rule__SingleExpressionWhereEntry__Group__0 : rule__SingleExpressionWhereEntry__Group__0__Impl rule__SingleExpressionWhereEntry__Group__1 ;
    public final void rule__SingleExpressionWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2231:1: ( rule__SingleExpressionWhereEntry__Group__0__Impl rule__SingleExpressionWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2232:2: rule__SingleExpressionWhereEntry__Group__0__Impl rule__SingleExpressionWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__0__Impl_in_rule__SingleExpressionWhereEntry__Group__04629);
            rule__SingleExpressionWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__1_in_rule__SingleExpressionWhereEntry__Group__04632);
            rule__SingleExpressionWhereEntry__Group__1();

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__0"


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2239:1: rule__SingleExpressionWhereEntry__Group__0__Impl : ( ( rule__SingleExpressionWhereEntry__NameAssignment_0 ) ) ;
    public final void rule__SingleExpressionWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2243:1: ( ( ( rule__SingleExpressionWhereEntry__NameAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2244:1: ( ( rule__SingleExpressionWhereEntry__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2244:1: ( ( rule__SingleExpressionWhereEntry__NameAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2245:1: ( rule__SingleExpressionWhereEntry__NameAssignment_0 )
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2246:1: ( rule__SingleExpressionWhereEntry__NameAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2246:2: rule__SingleExpressionWhereEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__NameAssignment_0_in_rule__SingleExpressionWhereEntry__Group__0__Impl4659);
            rule__SingleExpressionWhereEntry__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__0__Impl"


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2256:1: rule__SingleExpressionWhereEntry__Group__1 : rule__SingleExpressionWhereEntry__Group__1__Impl rule__SingleExpressionWhereEntry__Group__2 ;
    public final void rule__SingleExpressionWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2260:1: ( rule__SingleExpressionWhereEntry__Group__1__Impl rule__SingleExpressionWhereEntry__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2261:2: rule__SingleExpressionWhereEntry__Group__1__Impl rule__SingleExpressionWhereEntry__Group__2
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__1__Impl_in_rule__SingleExpressionWhereEntry__Group__14689);
            rule__SingleExpressionWhereEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__2_in_rule__SingleExpressionWhereEntry__Group__14692);
            rule__SingleExpressionWhereEntry__Group__2();

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__1"


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2268:1: rule__SingleExpressionWhereEntry__Group__1__Impl : ( ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 ) ) ;
    public final void rule__SingleExpressionWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2272:1: ( ( ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2273:1: ( ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2273:1: ( ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2274:1: ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 )
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getOperatorAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2275:1: ( rule__SingleExpressionWhereEntry__OperatorAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2275:2: rule__SingleExpressionWhereEntry__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__OperatorAssignment_1_in_rule__SingleExpressionWhereEntry__Group__1__Impl4719);
            rule__SingleExpressionWhereEntry__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__1__Impl"


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2285:1: rule__SingleExpressionWhereEntry__Group__2 : rule__SingleExpressionWhereEntry__Group__2__Impl ;
    public final void rule__SingleExpressionWhereEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2289:1: ( rule__SingleExpressionWhereEntry__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2290:2: rule__SingleExpressionWhereEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__Group__2__Impl_in_rule__SingleExpressionWhereEntry__Group__24749);
            rule__SingleExpressionWhereEntry__Group__2__Impl();

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__2"


    // $ANTLR start "rule__SingleExpressionWhereEntry__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2296:1: rule__SingleExpressionWhereEntry__Group__2__Impl : ( ( rule__SingleExpressionWhereEntry__RhsAssignment_2 ) ) ;
    public final void rule__SingleExpressionWhereEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2300:1: ( ( ( rule__SingleExpressionWhereEntry__RhsAssignment_2 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2301:1: ( ( rule__SingleExpressionWhereEntry__RhsAssignment_2 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2301:1: ( ( rule__SingleExpressionWhereEntry__RhsAssignment_2 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2302:1: ( rule__SingleExpressionWhereEntry__RhsAssignment_2 )
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getRhsAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2303:1: ( rule__SingleExpressionWhereEntry__RhsAssignment_2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2303:2: rule__SingleExpressionWhereEntry__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleExpressionWhereEntry__RhsAssignment_2_in_rule__SingleExpressionWhereEntry__Group__2__Impl4776);
            rule__SingleExpressionWhereEntry__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getRhsAssignment_2()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__Group__2__Impl"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2319:1: rule__MultiExpressionWhereEntry__Group__0 : rule__MultiExpressionWhereEntry__Group__0__Impl rule__MultiExpressionWhereEntry__Group__1 ;
    public final void rule__MultiExpressionWhereEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2323:1: ( rule__MultiExpressionWhereEntry__Group__0__Impl rule__MultiExpressionWhereEntry__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2324:2: rule__MultiExpressionWhereEntry__Group__0__Impl rule__MultiExpressionWhereEntry__Group__1
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__0__Impl_in_rule__MultiExpressionWhereEntry__Group__04812);
            rule__MultiExpressionWhereEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__1_in_rule__MultiExpressionWhereEntry__Group__04815);
            rule__MultiExpressionWhereEntry__Group__1();

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__0"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2331:1: rule__MultiExpressionWhereEntry__Group__0__Impl : ( ( rule__MultiExpressionWhereEntry__NameAssignment_0 ) ) ;
    public final void rule__MultiExpressionWhereEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2335:1: ( ( ( rule__MultiExpressionWhereEntry__NameAssignment_0 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2336:1: ( ( rule__MultiExpressionWhereEntry__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2336:1: ( ( rule__MultiExpressionWhereEntry__NameAssignment_0 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2337:1: ( rule__MultiExpressionWhereEntry__NameAssignment_0 )
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2338:1: ( rule__MultiExpressionWhereEntry__NameAssignment_0 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2338:2: rule__MultiExpressionWhereEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__NameAssignment_0_in_rule__MultiExpressionWhereEntry__Group__0__Impl4842);
            rule__MultiExpressionWhereEntry__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__0__Impl"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2348:1: rule__MultiExpressionWhereEntry__Group__1 : rule__MultiExpressionWhereEntry__Group__1__Impl rule__MultiExpressionWhereEntry__Group__2 ;
    public final void rule__MultiExpressionWhereEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2352:1: ( rule__MultiExpressionWhereEntry__Group__1__Impl rule__MultiExpressionWhereEntry__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2353:2: rule__MultiExpressionWhereEntry__Group__1__Impl rule__MultiExpressionWhereEntry__Group__2
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__1__Impl_in_rule__MultiExpressionWhereEntry__Group__14872);
            rule__MultiExpressionWhereEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__2_in_rule__MultiExpressionWhereEntry__Group__14875);
            rule__MultiExpressionWhereEntry__Group__2();

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__1"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2360:1: rule__MultiExpressionWhereEntry__Group__1__Impl : ( ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 ) ) ;
    public final void rule__MultiExpressionWhereEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2364:1: ( ( ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2365:1: ( ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2365:1: ( ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2366:1: ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 )
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getOperatorAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2367:1: ( rule__MultiExpressionWhereEntry__OperatorAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2367:2: rule__MultiExpressionWhereEntry__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__OperatorAssignment_1_in_rule__MultiExpressionWhereEntry__Group__1__Impl4902);
            rule__MultiExpressionWhereEntry__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__1__Impl"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2377:1: rule__MultiExpressionWhereEntry__Group__2 : rule__MultiExpressionWhereEntry__Group__2__Impl ;
    public final void rule__MultiExpressionWhereEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2381:1: ( rule__MultiExpressionWhereEntry__Group__2__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2382:2: rule__MultiExpressionWhereEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__Group__2__Impl_in_rule__MultiExpressionWhereEntry__Group__24932);
            rule__MultiExpressionWhereEntry__Group__2__Impl();

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__2"


    // $ANTLR start "rule__MultiExpressionWhereEntry__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2388:1: rule__MultiExpressionWhereEntry__Group__2__Impl : ( ( rule__MultiExpressionWhereEntry__RhsAssignment_2 ) ) ;
    public final void rule__MultiExpressionWhereEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2392:1: ( ( ( rule__MultiExpressionWhereEntry__RhsAssignment_2 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2393:1: ( ( rule__MultiExpressionWhereEntry__RhsAssignment_2 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2393:1: ( ( rule__MultiExpressionWhereEntry__RhsAssignment_2 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2394:1: ( rule__MultiExpressionWhereEntry__RhsAssignment_2 )
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getRhsAssignment_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2395:1: ( rule__MultiExpressionWhereEntry__RhsAssignment_2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2395:2: rule__MultiExpressionWhereEntry__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiExpressionWhereEntry__RhsAssignment_2_in_rule__MultiExpressionWhereEntry__Group__2__Impl4959);
            rule__MultiExpressionWhereEntry__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getRhsAssignment_2()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__Group__2__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2411:1: rule__DoubleArrayExpression__Group__0 : rule__DoubleArrayExpression__Group__0__Impl rule__DoubleArrayExpression__Group__1 ;
    public final void rule__DoubleArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2415:1: ( rule__DoubleArrayExpression__Group__0__Impl rule__DoubleArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2416:2: rule__DoubleArrayExpression__Group__0__Impl rule__DoubleArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__0__Impl_in_rule__DoubleArrayExpression__Group__04995);
            rule__DoubleArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__1_in_rule__DoubleArrayExpression__Group__04998);
            rule__DoubleArrayExpression__Group__1();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__0"


    // $ANTLR start "rule__DoubleArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2423:1: rule__DoubleArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__DoubleArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2427:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2428:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2428:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2429:1: '['
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DoubleArrayExpression__Group__0__Impl5026); 
             after(grammarAccess.getDoubleArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2442:1: rule__DoubleArrayExpression__Group__1 : rule__DoubleArrayExpression__Group__1__Impl rule__DoubleArrayExpression__Group__2 ;
    public final void rule__DoubleArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2446:1: ( rule__DoubleArrayExpression__Group__1__Impl rule__DoubleArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2447:2: rule__DoubleArrayExpression__Group__1__Impl rule__DoubleArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__1__Impl_in_rule__DoubleArrayExpression__Group__15057);
            rule__DoubleArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__2_in_rule__DoubleArrayExpression__Group__15060);
            rule__DoubleArrayExpression__Group__2();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__1"


    // $ANTLR start "rule__DoubleArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2454:1: rule__DoubleArrayExpression__Group__1__Impl : ( ( rule__DoubleArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__DoubleArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2458:1: ( ( ( rule__DoubleArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2459:1: ( ( rule__DoubleArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2459:1: ( ( rule__DoubleArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2460:1: ( rule__DoubleArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2461:1: ( rule__DoubleArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2461:2: rule__DoubleArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__ValuesAssignment_1_in_rule__DoubleArrayExpression__Group__1__Impl5087);
            rule__DoubleArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2471:1: rule__DoubleArrayExpression__Group__2 : rule__DoubleArrayExpression__Group__2__Impl rule__DoubleArrayExpression__Group__3 ;
    public final void rule__DoubleArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2475:1: ( rule__DoubleArrayExpression__Group__2__Impl rule__DoubleArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2476:2: rule__DoubleArrayExpression__Group__2__Impl rule__DoubleArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__2__Impl_in_rule__DoubleArrayExpression__Group__25117);
            rule__DoubleArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__3_in_rule__DoubleArrayExpression__Group__25120);
            rule__DoubleArrayExpression__Group__3();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__2"


    // $ANTLR start "rule__DoubleArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2483:1: rule__DoubleArrayExpression__Group__2__Impl : ( ( rule__DoubleArrayExpression__Group_2__0 )* ) ;
    public final void rule__DoubleArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2487:1: ( ( ( rule__DoubleArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2488:1: ( ( rule__DoubleArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2488:1: ( ( rule__DoubleArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2489:1: ( rule__DoubleArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2490:1: ( rule__DoubleArrayExpression__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2490:2: rule__DoubleArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DoubleArrayExpression__Group_2__0_in_rule__DoubleArrayExpression__Group__2__Impl5147);
            	    rule__DoubleArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDoubleArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2500:1: rule__DoubleArrayExpression__Group__3 : rule__DoubleArrayExpression__Group__3__Impl ;
    public final void rule__DoubleArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2504:1: ( rule__DoubleArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2505:2: rule__DoubleArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group__3__Impl_in_rule__DoubleArrayExpression__Group__35178);
            rule__DoubleArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__3"


    // $ANTLR start "rule__DoubleArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2511:1: rule__DoubleArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__DoubleArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2515:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2516:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2516:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2517:1: ']'
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__DoubleArrayExpression__Group__3__Impl5206); 
             after(grammarAccess.getDoubleArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2538:1: rule__DoubleArrayExpression__Group_2__0 : rule__DoubleArrayExpression__Group_2__0__Impl rule__DoubleArrayExpression__Group_2__1 ;
    public final void rule__DoubleArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2542:1: ( rule__DoubleArrayExpression__Group_2__0__Impl rule__DoubleArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2543:2: rule__DoubleArrayExpression__Group_2__0__Impl rule__DoubleArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group_2__0__Impl_in_rule__DoubleArrayExpression__Group_2__05245);
            rule__DoubleArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group_2__1_in_rule__DoubleArrayExpression__Group_2__05248);
            rule__DoubleArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group_2__0"


    // $ANTLR start "rule__DoubleArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2550:1: rule__DoubleArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DoubleArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2554:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2555:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2555:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2556:1: ','
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__DoubleArrayExpression__Group_2__0__Impl5276); 
             after(grammarAccess.getDoubleArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__DoubleArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2569:1: rule__DoubleArrayExpression__Group_2__1 : rule__DoubleArrayExpression__Group_2__1__Impl ;
    public final void rule__DoubleArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2573:1: ( rule__DoubleArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2574:2: rule__DoubleArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__Group_2__1__Impl_in_rule__DoubleArrayExpression__Group_2__15307);
            rule__DoubleArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__DoubleArrayExpression__Group_2__1"


    // $ANTLR start "rule__DoubleArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2580:1: rule__DoubleArrayExpression__Group_2__1__Impl : ( ( rule__DoubleArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__DoubleArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2584:1: ( ( ( rule__DoubleArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2585:1: ( ( rule__DoubleArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2585:1: ( ( rule__DoubleArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2586:1: ( rule__DoubleArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2587:1: ( rule__DoubleArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2587:2: rule__DoubleArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DoubleArrayExpression__ValuesAssignment_2_1_in_rule__DoubleArrayExpression__Group_2__1__Impl5334);
            rule__DoubleArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2601:1: rule__LongArrayExpression__Group__0 : rule__LongArrayExpression__Group__0__Impl rule__LongArrayExpression__Group__1 ;
    public final void rule__LongArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2605:1: ( rule__LongArrayExpression__Group__0__Impl rule__LongArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2606:2: rule__LongArrayExpression__Group__0__Impl rule__LongArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group__0__Impl_in_rule__LongArrayExpression__Group__05368);
            rule__LongArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongArrayExpression__Group__1_in_rule__LongArrayExpression__Group__05371);
            rule__LongArrayExpression__Group__1();

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
    // $ANTLR end "rule__LongArrayExpression__Group__0"


    // $ANTLR start "rule__LongArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2613:1: rule__LongArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__LongArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2617:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2618:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2618:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2619:1: '['
            {
             before(grammarAccess.getLongArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__LongArrayExpression__Group__0__Impl5399); 
             after(grammarAccess.getLongArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2632:1: rule__LongArrayExpression__Group__1 : rule__LongArrayExpression__Group__1__Impl rule__LongArrayExpression__Group__2 ;
    public final void rule__LongArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2636:1: ( rule__LongArrayExpression__Group__1__Impl rule__LongArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2637:2: rule__LongArrayExpression__Group__1__Impl rule__LongArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group__1__Impl_in_rule__LongArrayExpression__Group__15430);
            rule__LongArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongArrayExpression__Group__2_in_rule__LongArrayExpression__Group__15433);
            rule__LongArrayExpression__Group__2();

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
    // $ANTLR end "rule__LongArrayExpression__Group__1"


    // $ANTLR start "rule__LongArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2644:1: rule__LongArrayExpression__Group__1__Impl : ( ( rule__LongArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__LongArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2648:1: ( ( ( rule__LongArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2649:1: ( ( rule__LongArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2649:1: ( ( rule__LongArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2650:1: ( rule__LongArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getLongArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2651:1: ( rule__LongArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2651:2: rule__LongArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__ValuesAssignment_1_in_rule__LongArrayExpression__Group__1__Impl5460);
            rule__LongArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLongArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2661:1: rule__LongArrayExpression__Group__2 : rule__LongArrayExpression__Group__2__Impl rule__LongArrayExpression__Group__3 ;
    public final void rule__LongArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2665:1: ( rule__LongArrayExpression__Group__2__Impl rule__LongArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2666:2: rule__LongArrayExpression__Group__2__Impl rule__LongArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group__2__Impl_in_rule__LongArrayExpression__Group__25490);
            rule__LongArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongArrayExpression__Group__3_in_rule__LongArrayExpression__Group__25493);
            rule__LongArrayExpression__Group__3();

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
    // $ANTLR end "rule__LongArrayExpression__Group__2"


    // $ANTLR start "rule__LongArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2673:1: rule__LongArrayExpression__Group__2__Impl : ( ( rule__LongArrayExpression__Group_2__0 )* ) ;
    public final void rule__LongArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2677:1: ( ( ( rule__LongArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2678:1: ( ( rule__LongArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2678:1: ( ( rule__LongArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2679:1: ( rule__LongArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getLongArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2680:1: ( rule__LongArrayExpression__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2680:2: rule__LongArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LongArrayExpression__Group_2__0_in_rule__LongArrayExpression__Group__2__Impl5520);
            	    rule__LongArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getLongArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2690:1: rule__LongArrayExpression__Group__3 : rule__LongArrayExpression__Group__3__Impl ;
    public final void rule__LongArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2694:1: ( rule__LongArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2695:2: rule__LongArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group__3__Impl_in_rule__LongArrayExpression__Group__35551);
            rule__LongArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__LongArrayExpression__Group__3"


    // $ANTLR start "rule__LongArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2701:1: rule__LongArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__LongArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2705:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2706:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2706:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2707:1: ']'
            {
             before(grammarAccess.getLongArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__LongArrayExpression__Group__3__Impl5579); 
             after(grammarAccess.getLongArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2728:1: rule__LongArrayExpression__Group_2__0 : rule__LongArrayExpression__Group_2__0__Impl rule__LongArrayExpression__Group_2__1 ;
    public final void rule__LongArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2732:1: ( rule__LongArrayExpression__Group_2__0__Impl rule__LongArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2733:2: rule__LongArrayExpression__Group_2__0__Impl rule__LongArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group_2__0__Impl_in_rule__LongArrayExpression__Group_2__05618);
            rule__LongArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongArrayExpression__Group_2__1_in_rule__LongArrayExpression__Group_2__05621);
            rule__LongArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__LongArrayExpression__Group_2__0"


    // $ANTLR start "rule__LongArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2740:1: rule__LongArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LongArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2744:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2745:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2745:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2746:1: ','
            {
             before(grammarAccess.getLongArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__LongArrayExpression__Group_2__0__Impl5649); 
             after(grammarAccess.getLongArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LongArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2759:1: rule__LongArrayExpression__Group_2__1 : rule__LongArrayExpression__Group_2__1__Impl ;
    public final void rule__LongArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2763:1: ( rule__LongArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2764:2: rule__LongArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__Group_2__1__Impl_in_rule__LongArrayExpression__Group_2__15680);
            rule__LongArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__LongArrayExpression__Group_2__1"


    // $ANTLR start "rule__LongArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2770:1: rule__LongArrayExpression__Group_2__1__Impl : ( ( rule__LongArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__LongArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2774:1: ( ( ( rule__LongArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2775:1: ( ( rule__LongArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2775:1: ( ( rule__LongArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2776:1: ( rule__LongArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getLongArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2777:1: ( rule__LongArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2777:2: rule__LongArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LongArrayExpression__ValuesAssignment_2_1_in_rule__LongArrayExpression__Group_2__1__Impl5707);
            rule__LongArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLongArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__LongArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2791:1: rule__StringArrayExpression__Group__0 : rule__StringArrayExpression__Group__0__Impl rule__StringArrayExpression__Group__1 ;
    public final void rule__StringArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2795:1: ( rule__StringArrayExpression__Group__0__Impl rule__StringArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2796:2: rule__StringArrayExpression__Group__0__Impl rule__StringArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group__0__Impl_in_rule__StringArrayExpression__Group__05741);
            rule__StringArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringArrayExpression__Group__1_in_rule__StringArrayExpression__Group__05744);
            rule__StringArrayExpression__Group__1();

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
    // $ANTLR end "rule__StringArrayExpression__Group__0"


    // $ANTLR start "rule__StringArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2803:1: rule__StringArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__StringArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2807:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2808:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2808:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2809:1: '['
            {
             before(grammarAccess.getStringArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__StringArrayExpression__Group__0__Impl5772); 
             after(grammarAccess.getStringArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2822:1: rule__StringArrayExpression__Group__1 : rule__StringArrayExpression__Group__1__Impl rule__StringArrayExpression__Group__2 ;
    public final void rule__StringArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2826:1: ( rule__StringArrayExpression__Group__1__Impl rule__StringArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2827:2: rule__StringArrayExpression__Group__1__Impl rule__StringArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group__1__Impl_in_rule__StringArrayExpression__Group__15803);
            rule__StringArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringArrayExpression__Group__2_in_rule__StringArrayExpression__Group__15806);
            rule__StringArrayExpression__Group__2();

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
    // $ANTLR end "rule__StringArrayExpression__Group__1"


    // $ANTLR start "rule__StringArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2834:1: rule__StringArrayExpression__Group__1__Impl : ( ( rule__StringArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__StringArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2838:1: ( ( ( rule__StringArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2839:1: ( ( rule__StringArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2839:1: ( ( rule__StringArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2840:1: ( rule__StringArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2841:1: ( rule__StringArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2841:2: rule__StringArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__ValuesAssignment_1_in_rule__StringArrayExpression__Group__1__Impl5833);
            rule__StringArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2851:1: rule__StringArrayExpression__Group__2 : rule__StringArrayExpression__Group__2__Impl rule__StringArrayExpression__Group__3 ;
    public final void rule__StringArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2855:1: ( rule__StringArrayExpression__Group__2__Impl rule__StringArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2856:2: rule__StringArrayExpression__Group__2__Impl rule__StringArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group__2__Impl_in_rule__StringArrayExpression__Group__25863);
            rule__StringArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringArrayExpression__Group__3_in_rule__StringArrayExpression__Group__25866);
            rule__StringArrayExpression__Group__3();

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
    // $ANTLR end "rule__StringArrayExpression__Group__2"


    // $ANTLR start "rule__StringArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2863:1: rule__StringArrayExpression__Group__2__Impl : ( ( rule__StringArrayExpression__Group_2__0 )* ) ;
    public final void rule__StringArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2867:1: ( ( ( rule__StringArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2868:1: ( ( rule__StringArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2868:1: ( ( rule__StringArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2869:1: ( rule__StringArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getStringArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2870:1: ( rule__StringArrayExpression__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2870:2: rule__StringArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringArrayExpression__Group_2__0_in_rule__StringArrayExpression__Group__2__Impl5893);
            	    rule__StringArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStringArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2880:1: rule__StringArrayExpression__Group__3 : rule__StringArrayExpression__Group__3__Impl ;
    public final void rule__StringArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2884:1: ( rule__StringArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2885:2: rule__StringArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group__3__Impl_in_rule__StringArrayExpression__Group__35924);
            rule__StringArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__StringArrayExpression__Group__3"


    // $ANTLR start "rule__StringArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2891:1: rule__StringArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__StringArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2895:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2896:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2896:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2897:1: ']'
            {
             before(grammarAccess.getStringArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__StringArrayExpression__Group__3__Impl5952); 
             after(grammarAccess.getStringArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2918:1: rule__StringArrayExpression__Group_2__0 : rule__StringArrayExpression__Group_2__0__Impl rule__StringArrayExpression__Group_2__1 ;
    public final void rule__StringArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2922:1: ( rule__StringArrayExpression__Group_2__0__Impl rule__StringArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2923:2: rule__StringArrayExpression__Group_2__0__Impl rule__StringArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group_2__0__Impl_in_rule__StringArrayExpression__Group_2__05991);
            rule__StringArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringArrayExpression__Group_2__1_in_rule__StringArrayExpression__Group_2__05994);
            rule__StringArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__StringArrayExpression__Group_2__0"


    // $ANTLR start "rule__StringArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2930:1: rule__StringArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2934:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2935:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2935:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2936:1: ','
            {
             before(grammarAccess.getStringArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__StringArrayExpression__Group_2__0__Impl6022); 
             after(grammarAccess.getStringArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__StringArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2949:1: rule__StringArrayExpression__Group_2__1 : rule__StringArrayExpression__Group_2__1__Impl ;
    public final void rule__StringArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2953:1: ( rule__StringArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2954:2: rule__StringArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__Group_2__1__Impl_in_rule__StringArrayExpression__Group_2__16053);
            rule__StringArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__StringArrayExpression__Group_2__1"


    // $ANTLR start "rule__StringArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2960:1: rule__StringArrayExpression__Group_2__1__Impl : ( ( rule__StringArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2964:1: ( ( ( rule__StringArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2965:1: ( ( rule__StringArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2965:1: ( ( rule__StringArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2966:1: ( rule__StringArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2967:1: ( rule__StringArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2967:2: rule__StringArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringArrayExpression__ValuesAssignment_2_1_in_rule__StringArrayExpression__Group_2__1__Impl6080);
            rule__StringArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__StringArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2981:1: rule__NullArrayExpression__Group__0 : rule__NullArrayExpression__Group__0__Impl rule__NullArrayExpression__Group__1 ;
    public final void rule__NullArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2985:1: ( rule__NullArrayExpression__Group__0__Impl rule__NullArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2986:2: rule__NullArrayExpression__Group__0__Impl rule__NullArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group__0__Impl_in_rule__NullArrayExpression__Group__06114);
            rule__NullArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullArrayExpression__Group__1_in_rule__NullArrayExpression__Group__06117);
            rule__NullArrayExpression__Group__1();

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
    // $ANTLR end "rule__NullArrayExpression__Group__0"


    // $ANTLR start "rule__NullArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2993:1: rule__NullArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__NullArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2997:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2998:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2998:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:2999:1: '['
            {
             before(grammarAccess.getNullArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__NullArrayExpression__Group__0__Impl6145); 
             after(grammarAccess.getNullArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3012:1: rule__NullArrayExpression__Group__1 : rule__NullArrayExpression__Group__1__Impl rule__NullArrayExpression__Group__2 ;
    public final void rule__NullArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3016:1: ( rule__NullArrayExpression__Group__1__Impl rule__NullArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3017:2: rule__NullArrayExpression__Group__1__Impl rule__NullArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group__1__Impl_in_rule__NullArrayExpression__Group__16176);
            rule__NullArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullArrayExpression__Group__2_in_rule__NullArrayExpression__Group__16179);
            rule__NullArrayExpression__Group__2();

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
    // $ANTLR end "rule__NullArrayExpression__Group__1"


    // $ANTLR start "rule__NullArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3024:1: rule__NullArrayExpression__Group__1__Impl : ( ( rule__NullArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__NullArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3028:1: ( ( ( rule__NullArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3029:1: ( ( rule__NullArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3029:1: ( ( rule__NullArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3030:1: ( rule__NullArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3031:1: ( rule__NullArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3031:2: rule__NullArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__ValuesAssignment_1_in_rule__NullArrayExpression__Group__1__Impl6206);
            rule__NullArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNullArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3041:1: rule__NullArrayExpression__Group__2 : rule__NullArrayExpression__Group__2__Impl rule__NullArrayExpression__Group__3 ;
    public final void rule__NullArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3045:1: ( rule__NullArrayExpression__Group__2__Impl rule__NullArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3046:2: rule__NullArrayExpression__Group__2__Impl rule__NullArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group__2__Impl_in_rule__NullArrayExpression__Group__26236);
            rule__NullArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullArrayExpression__Group__3_in_rule__NullArrayExpression__Group__26239);
            rule__NullArrayExpression__Group__3();

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
    // $ANTLR end "rule__NullArrayExpression__Group__2"


    // $ANTLR start "rule__NullArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3053:1: rule__NullArrayExpression__Group__2__Impl : ( ( rule__NullArrayExpression__Group_2__0 )* ) ;
    public final void rule__NullArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3057:1: ( ( ( rule__NullArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3058:1: ( ( rule__NullArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3058:1: ( ( rule__NullArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3059:1: ( rule__NullArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getNullArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3060:1: ( rule__NullArrayExpression__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3060:2: rule__NullArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NullArrayExpression__Group_2__0_in_rule__NullArrayExpression__Group__2__Impl6266);
            	    rule__NullArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNullArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3070:1: rule__NullArrayExpression__Group__3 : rule__NullArrayExpression__Group__3__Impl ;
    public final void rule__NullArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3074:1: ( rule__NullArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3075:2: rule__NullArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group__3__Impl_in_rule__NullArrayExpression__Group__36297);
            rule__NullArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__NullArrayExpression__Group__3"


    // $ANTLR start "rule__NullArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3081:1: rule__NullArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__NullArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3085:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3086:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3086:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3087:1: ']'
            {
             before(grammarAccess.getNullArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__NullArrayExpression__Group__3__Impl6325); 
             after(grammarAccess.getNullArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3108:1: rule__NullArrayExpression__Group_2__0 : rule__NullArrayExpression__Group_2__0__Impl rule__NullArrayExpression__Group_2__1 ;
    public final void rule__NullArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3112:1: ( rule__NullArrayExpression__Group_2__0__Impl rule__NullArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3113:2: rule__NullArrayExpression__Group_2__0__Impl rule__NullArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group_2__0__Impl_in_rule__NullArrayExpression__Group_2__06364);
            rule__NullArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullArrayExpression__Group_2__1_in_rule__NullArrayExpression__Group_2__06367);
            rule__NullArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__NullArrayExpression__Group_2__0"


    // $ANTLR start "rule__NullArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3120:1: rule__NullArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NullArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3124:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3125:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3125:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3126:1: ','
            {
             before(grammarAccess.getNullArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__NullArrayExpression__Group_2__0__Impl6395); 
             after(grammarAccess.getNullArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__NullArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3139:1: rule__NullArrayExpression__Group_2__1 : rule__NullArrayExpression__Group_2__1__Impl ;
    public final void rule__NullArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3143:1: ( rule__NullArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3144:2: rule__NullArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__Group_2__1__Impl_in_rule__NullArrayExpression__Group_2__16426);
            rule__NullArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__NullArrayExpression__Group_2__1"


    // $ANTLR start "rule__NullArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3150:1: rule__NullArrayExpression__Group_2__1__Impl : ( ( rule__NullArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__NullArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3154:1: ( ( ( rule__NullArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3155:1: ( ( rule__NullArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3155:1: ( ( rule__NullArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3156:1: ( rule__NullArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3157:1: ( rule__NullArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3157:2: rule__NullArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NullArrayExpression__ValuesAssignment_2_1_in_rule__NullArrayExpression__Group_2__1__Impl6453);
            rule__NullArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNullArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__NullArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3171:1: rule__DateArrayExpression__Group__0 : rule__DateArrayExpression__Group__0__Impl rule__DateArrayExpression__Group__1 ;
    public final void rule__DateArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3175:1: ( rule__DateArrayExpression__Group__0__Impl rule__DateArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3176:2: rule__DateArrayExpression__Group__0__Impl rule__DateArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group__0__Impl_in_rule__DateArrayExpression__Group__06487);
            rule__DateArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateArrayExpression__Group__1_in_rule__DateArrayExpression__Group__06490);
            rule__DateArrayExpression__Group__1();

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
    // $ANTLR end "rule__DateArrayExpression__Group__0"


    // $ANTLR start "rule__DateArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3183:1: rule__DateArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__DateArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3187:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3188:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3188:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3189:1: '['
            {
             before(grammarAccess.getDateArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DateArrayExpression__Group__0__Impl6518); 
             after(grammarAccess.getDateArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3202:1: rule__DateArrayExpression__Group__1 : rule__DateArrayExpression__Group__1__Impl rule__DateArrayExpression__Group__2 ;
    public final void rule__DateArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3206:1: ( rule__DateArrayExpression__Group__1__Impl rule__DateArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3207:2: rule__DateArrayExpression__Group__1__Impl rule__DateArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group__1__Impl_in_rule__DateArrayExpression__Group__16549);
            rule__DateArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateArrayExpression__Group__2_in_rule__DateArrayExpression__Group__16552);
            rule__DateArrayExpression__Group__2();

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
    // $ANTLR end "rule__DateArrayExpression__Group__1"


    // $ANTLR start "rule__DateArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3214:1: rule__DateArrayExpression__Group__1__Impl : ( ( rule__DateArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__DateArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3218:1: ( ( ( rule__DateArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3219:1: ( ( rule__DateArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3219:1: ( ( rule__DateArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3220:1: ( rule__DateArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getDateArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3221:1: ( rule__DateArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3221:2: rule__DateArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__ValuesAssignment_1_in_rule__DateArrayExpression__Group__1__Impl6579);
            rule__DateArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3231:1: rule__DateArrayExpression__Group__2 : rule__DateArrayExpression__Group__2__Impl rule__DateArrayExpression__Group__3 ;
    public final void rule__DateArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3235:1: ( rule__DateArrayExpression__Group__2__Impl rule__DateArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3236:2: rule__DateArrayExpression__Group__2__Impl rule__DateArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group__2__Impl_in_rule__DateArrayExpression__Group__26609);
            rule__DateArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateArrayExpression__Group__3_in_rule__DateArrayExpression__Group__26612);
            rule__DateArrayExpression__Group__3();

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
    // $ANTLR end "rule__DateArrayExpression__Group__2"


    // $ANTLR start "rule__DateArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3243:1: rule__DateArrayExpression__Group__2__Impl : ( ( rule__DateArrayExpression__Group_2__0 )* ) ;
    public final void rule__DateArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3247:1: ( ( ( rule__DateArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3248:1: ( ( rule__DateArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3248:1: ( ( rule__DateArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3249:1: ( rule__DateArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getDateArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3250:1: ( rule__DateArrayExpression__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3250:2: rule__DateArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DateArrayExpression__Group_2__0_in_rule__DateArrayExpression__Group__2__Impl6639);
            	    rule__DateArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDateArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3260:1: rule__DateArrayExpression__Group__3 : rule__DateArrayExpression__Group__3__Impl ;
    public final void rule__DateArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3264:1: ( rule__DateArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3265:2: rule__DateArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group__3__Impl_in_rule__DateArrayExpression__Group__36670);
            rule__DateArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__DateArrayExpression__Group__3"


    // $ANTLR start "rule__DateArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3271:1: rule__DateArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__DateArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3275:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3276:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3276:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3277:1: ']'
            {
             before(grammarAccess.getDateArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__DateArrayExpression__Group__3__Impl6698); 
             after(grammarAccess.getDateArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3298:1: rule__DateArrayExpression__Group_2__0 : rule__DateArrayExpression__Group_2__0__Impl rule__DateArrayExpression__Group_2__1 ;
    public final void rule__DateArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3302:1: ( rule__DateArrayExpression__Group_2__0__Impl rule__DateArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3303:2: rule__DateArrayExpression__Group_2__0__Impl rule__DateArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group_2__0__Impl_in_rule__DateArrayExpression__Group_2__06737);
            rule__DateArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateArrayExpression__Group_2__1_in_rule__DateArrayExpression__Group_2__06740);
            rule__DateArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__DateArrayExpression__Group_2__0"


    // $ANTLR start "rule__DateArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3310:1: rule__DateArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DateArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3314:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3315:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3315:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3316:1: ','
            {
             before(grammarAccess.getDateArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__DateArrayExpression__Group_2__0__Impl6768); 
             after(grammarAccess.getDateArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__DateArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3329:1: rule__DateArrayExpression__Group_2__1 : rule__DateArrayExpression__Group_2__1__Impl ;
    public final void rule__DateArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3333:1: ( rule__DateArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3334:2: rule__DateArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__Group_2__1__Impl_in_rule__DateArrayExpression__Group_2__16799);
            rule__DateArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__DateArrayExpression__Group_2__1"


    // $ANTLR start "rule__DateArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3340:1: rule__DateArrayExpression__Group_2__1__Impl : ( ( rule__DateArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__DateArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3344:1: ( ( ( rule__DateArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3345:1: ( ( rule__DateArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3345:1: ( ( rule__DateArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3346:1: ( rule__DateArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getDateArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3347:1: ( rule__DateArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3347:2: rule__DateArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DateArrayExpression__ValuesAssignment_2_1_in_rule__DateArrayExpression__Group_2__1__Impl6826);
            rule__DateArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDateArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__DateArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3361:1: rule__BooleanArrayExpression__Group__0 : rule__BooleanArrayExpression__Group__0__Impl rule__BooleanArrayExpression__Group__1 ;
    public final void rule__BooleanArrayExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3365:1: ( rule__BooleanArrayExpression__Group__0__Impl rule__BooleanArrayExpression__Group__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3366:2: rule__BooleanArrayExpression__Group__0__Impl rule__BooleanArrayExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__0__Impl_in_rule__BooleanArrayExpression__Group__06860);
            rule__BooleanArrayExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__1_in_rule__BooleanArrayExpression__Group__06863);
            rule__BooleanArrayExpression__Group__1();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__0"


    // $ANTLR start "rule__BooleanArrayExpression__Group__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3373:1: rule__BooleanArrayExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__BooleanArrayExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3377:1: ( ( '[' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3378:1: ( '[' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3378:1: ( '[' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3379:1: '['
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__BooleanArrayExpression__Group__0__Impl6891); 
             after(grammarAccess.getBooleanArrayExpressionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3392:1: rule__BooleanArrayExpression__Group__1 : rule__BooleanArrayExpression__Group__1__Impl rule__BooleanArrayExpression__Group__2 ;
    public final void rule__BooleanArrayExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3396:1: ( rule__BooleanArrayExpression__Group__1__Impl rule__BooleanArrayExpression__Group__2 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3397:2: rule__BooleanArrayExpression__Group__1__Impl rule__BooleanArrayExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__1__Impl_in_rule__BooleanArrayExpression__Group__16922);
            rule__BooleanArrayExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__2_in_rule__BooleanArrayExpression__Group__16925);
            rule__BooleanArrayExpression__Group__2();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__1"


    // $ANTLR start "rule__BooleanArrayExpression__Group__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3404:1: rule__BooleanArrayExpression__Group__1__Impl : ( ( rule__BooleanArrayExpression__ValuesAssignment_1 ) ) ;
    public final void rule__BooleanArrayExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3408:1: ( ( ( rule__BooleanArrayExpression__ValuesAssignment_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3409:1: ( ( rule__BooleanArrayExpression__ValuesAssignment_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3409:1: ( ( rule__BooleanArrayExpression__ValuesAssignment_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3410:1: ( rule__BooleanArrayExpression__ValuesAssignment_1 )
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getValuesAssignment_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3411:1: ( rule__BooleanArrayExpression__ValuesAssignment_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3411:2: rule__BooleanArrayExpression__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__ValuesAssignment_1_in_rule__BooleanArrayExpression__Group__1__Impl6952);
            rule__BooleanArrayExpression__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayExpressionAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group__2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3421:1: rule__BooleanArrayExpression__Group__2 : rule__BooleanArrayExpression__Group__2__Impl rule__BooleanArrayExpression__Group__3 ;
    public final void rule__BooleanArrayExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3425:1: ( rule__BooleanArrayExpression__Group__2__Impl rule__BooleanArrayExpression__Group__3 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3426:2: rule__BooleanArrayExpression__Group__2__Impl rule__BooleanArrayExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__2__Impl_in_rule__BooleanArrayExpression__Group__26982);
            rule__BooleanArrayExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__3_in_rule__BooleanArrayExpression__Group__26985);
            rule__BooleanArrayExpression__Group__3();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__2"


    // $ANTLR start "rule__BooleanArrayExpression__Group__2__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3433:1: rule__BooleanArrayExpression__Group__2__Impl : ( ( rule__BooleanArrayExpression__Group_2__0 )* ) ;
    public final void rule__BooleanArrayExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3437:1: ( ( ( rule__BooleanArrayExpression__Group_2__0 )* ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3438:1: ( ( rule__BooleanArrayExpression__Group_2__0 )* )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3438:1: ( ( rule__BooleanArrayExpression__Group_2__0 )* )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3439:1: ( rule__BooleanArrayExpression__Group_2__0 )*
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getGroup_2()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3440:1: ( rule__BooleanArrayExpression__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3440:2: rule__BooleanArrayExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BooleanArrayExpression__Group_2__0_in_rule__BooleanArrayExpression__Group__2__Impl7012);
            	    rule__BooleanArrayExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBooleanArrayExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__2__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group__3"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3450:1: rule__BooleanArrayExpression__Group__3 : rule__BooleanArrayExpression__Group__3__Impl ;
    public final void rule__BooleanArrayExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3454:1: ( rule__BooleanArrayExpression__Group__3__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3455:2: rule__BooleanArrayExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group__3__Impl_in_rule__BooleanArrayExpression__Group__37043);
            rule__BooleanArrayExpression__Group__3__Impl();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__3"


    // $ANTLR start "rule__BooleanArrayExpression__Group__3__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3461:1: rule__BooleanArrayExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__BooleanArrayExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3465:1: ( ( ']' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3466:1: ( ']' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3466:1: ( ']' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3467:1: ']'
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__BooleanArrayExpression__Group__3__Impl7071); 
             after(grammarAccess.getBooleanArrayExpressionAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group_2__0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3488:1: rule__BooleanArrayExpression__Group_2__0 : rule__BooleanArrayExpression__Group_2__0__Impl rule__BooleanArrayExpression__Group_2__1 ;
    public final void rule__BooleanArrayExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3492:1: ( rule__BooleanArrayExpression__Group_2__0__Impl rule__BooleanArrayExpression__Group_2__1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3493:2: rule__BooleanArrayExpression__Group_2__0__Impl rule__BooleanArrayExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group_2__0__Impl_in_rule__BooleanArrayExpression__Group_2__07110);
            rule__BooleanArrayExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group_2__1_in_rule__BooleanArrayExpression__Group_2__07113);
            rule__BooleanArrayExpression__Group_2__1();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group_2__0"


    // $ANTLR start "rule__BooleanArrayExpression__Group_2__0__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3500:1: rule__BooleanArrayExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__BooleanArrayExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3504:1: ( ( ',' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3505:1: ( ',' )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3505:1: ( ',' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3506:1: ','
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__BooleanArrayExpression__Group_2__0__Impl7141); 
             after(grammarAccess.getBooleanArrayExpressionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BooleanArrayExpression__Group_2__1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3519:1: rule__BooleanArrayExpression__Group_2__1 : rule__BooleanArrayExpression__Group_2__1__Impl ;
    public final void rule__BooleanArrayExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3523:1: ( rule__BooleanArrayExpression__Group_2__1__Impl )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3524:2: rule__BooleanArrayExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__Group_2__1__Impl_in_rule__BooleanArrayExpression__Group_2__17172);
            rule__BooleanArrayExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__BooleanArrayExpression__Group_2__1"


    // $ANTLR start "rule__BooleanArrayExpression__Group_2__1__Impl"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3530:1: rule__BooleanArrayExpression__Group_2__1__Impl : ( ( rule__BooleanArrayExpression__ValuesAssignment_2_1 ) ) ;
    public final void rule__BooleanArrayExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3534:1: ( ( ( rule__BooleanArrayExpression__ValuesAssignment_2_1 ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3535:1: ( ( rule__BooleanArrayExpression__ValuesAssignment_2_1 ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3535:1: ( ( rule__BooleanArrayExpression__ValuesAssignment_2_1 ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3536:1: ( rule__BooleanArrayExpression__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getValuesAssignment_2_1()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3537:1: ( rule__BooleanArrayExpression__ValuesAssignment_2_1 )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3537:2: rule__BooleanArrayExpression__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BooleanArrayExpression__ValuesAssignment_2_1_in_rule__BooleanArrayExpression__Group_2__1__Impl7199);
            rule__BooleanArrayExpression__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayExpressionAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Model__AttrsAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3552:1: rule__Model__AttrsAssignment_1 : ( ruleColumnList ) ;
    public final void rule__Model__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3556:1: ( ( ruleColumnList ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3557:1: ( ruleColumnList )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3557:1: ( ruleColumnList )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3558:1: ruleColumnList
            {
             before(grammarAccess.getModelAccess().getAttrsColumnListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_17238);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3567:1: rule__Model__DbAssignment_3 : ( ruleDatabase ) ;
    public final void rule__Model__DbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3571:1: ( ( ruleDatabase ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3572:1: ( ruleDatabase )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3572:1: ( ruleDatabase )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3573:1: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDbDatabaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_37269);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3582:1: rule__Model__WhereEntryAssignment_4_1 : ( ruleWhereEntry ) ;
    public final void rule__Model__WhereEntryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3586:1: ( ( ruleWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3587:1: ( ruleWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3587:1: ( ruleWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3588:1: ruleWhereEntry
            {
             before(grammarAccess.getModelAccess().getWhereEntryWhereEntryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleWhereEntry_in_rule__Model__WhereEntryAssignment_4_17300);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3597:1: rule__Database__UrlAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3601:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3602:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3602:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3603:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getUrlIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_17331); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3612:1: rule__Database__PortAssignment_2_1 : ( RULE_SINGED_LONG ) ;
    public final void rule__Database__PortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3616:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3617:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3617:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3618:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getDatabaseAccess().getPortSINGED_LONGTerminalRuleCall_2_1_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__Database__PortAssignment_2_17362); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3627:1: rule__Database__DbNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Database__DbNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3631:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3632:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3632:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3633:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getDbNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_47393); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3642:1: rule__Database__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3646:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3647:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3647:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3648:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_67424); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3657:1: rule__WhereEntry__EntriesAssignment_1_1_1 : ( ruleAndWhereEntry ) ;
    public final void rule__WhereEntry__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3661:1: ( ( ruleAndWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3662:1: ( ruleAndWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3662:1: ( ruleAndWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3663:1: ruleAndWhereEntry
            {
             before(grammarAccess.getWhereEntryAccess().getEntriesAndWhereEntryParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__EntriesAssignment_1_1_17455);
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3672:1: rule__AndWhereEntry__EntriesAssignment_1_1_1 : ( ruleConcreteWhereEntry ) ;
    public final void rule__AndWhereEntry__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3676:1: ( ( ruleConcreteWhereEntry ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3677:1: ( ruleConcreteWhereEntry )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3677:1: ( ruleConcreteWhereEntry )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3678:1: ruleConcreteWhereEntry
            {
             before(grammarAccess.getAndWhereEntryAccess().getEntriesConcreteWhereEntryParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__EntriesAssignment_1_1_17486);
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


    // $ANTLR start "rule__SingleExpressionWhereEntry__NameAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3687:1: rule__SingleExpressionWhereEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleExpressionWhereEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3691:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3692:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3692:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3693:1: RULE_ID
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleExpressionWhereEntry__NameAssignment_07517); 
             after(grammarAccess.getSingleExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__NameAssignment_0"


    // $ANTLR start "rule__SingleExpressionWhereEntry__OperatorAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3702:1: rule__SingleExpressionWhereEntry__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__SingleExpressionWhereEntry__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3706:1: ( ( ruleOperator ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3707:1: ( ruleOperator )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3707:1: ( ruleOperator )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3708:1: ruleOperator
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__SingleExpressionWhereEntry__OperatorAssignment_17548);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__OperatorAssignment_1"


    // $ANTLR start "rule__SingleExpressionWhereEntry__RhsAssignment_2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3717:1: rule__SingleExpressionWhereEntry__RhsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SingleExpressionWhereEntry__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3721:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3722:1: ( ruleExpression )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3722:1: ( ruleExpression )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3723:1: ruleExpression
            {
             before(grammarAccess.getSingleExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SingleExpressionWhereEntry__RhsAssignment_27579);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSingleExpressionWhereEntryAccess().getRhsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleExpressionWhereEntry__RhsAssignment_2"


    // $ANTLR start "rule__ReplacableValue__ValueAssignment"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3732:1: rule__ReplacableValue__ValueAssignment : ( ( '?' ) ) ;
    public final void rule__ReplacableValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3736:1: ( ( ( '?' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3737:1: ( ( '?' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3737:1: ( ( '?' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3738:1: ( '?' )
            {
             before(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3739:1: ( '?' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3740:1: '?'
            {
             before(grammarAccess.getReplacableValueAccess().getValueQuestionMarkKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ReplacableValue__ValueAssignment7615); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3755:1: rule__DoubleExpression__ValueAssignment : ( RULE_SIGNED_DOUBLE ) ;
    public final void rule__DoubleExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3759:1: ( ( RULE_SIGNED_DOUBLE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3760:1: ( RULE_SIGNED_DOUBLE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3760:1: ( RULE_SIGNED_DOUBLE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3761:1: RULE_SIGNED_DOUBLE
            {
             before(grammarAccess.getDoubleExpressionAccess().getValueSIGNED_DOUBLETerminalRuleCall_0()); 
            match(input,RULE_SIGNED_DOUBLE,FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleExpression__ValueAssignment7654); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3770:1: rule__LongExpression__ValueAssignment : ( RULE_SINGED_LONG ) ;
    public final void rule__LongExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3774:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3775:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3775:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3776:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getLongExpressionAccess().getValueSINGED_LONGTerminalRuleCall_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__LongExpression__ValueAssignment7685); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3785:1: rule__StringExpression__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3789:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3790:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3790:1: ( RULE_STRING )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3791:1: RULE_STRING
            {
             before(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringExpression__ValueAssignment7716); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3800:1: rule__NullExpression__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3804:1: ( ( ( 'null' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3805:1: ( ( 'null' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3805:1: ( ( 'null' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3806:1: ( 'null' )
            {
             before(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3807:1: ( 'null' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3808:1: 'null'
            {
             before(grammarAccess.getNullExpressionAccess().getValueNullKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__NullExpression__ValueAssignment7752); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3823:1: rule__DateExpression__ValueAssignment : ( RULE_DATE ) ;
    public final void rule__DateExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3827:1: ( ( RULE_DATE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3828:1: ( RULE_DATE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3828:1: ( RULE_DATE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3829:1: RULE_DATE
            {
             before(grammarAccess.getDateExpressionAccess().getValueDATETerminalRuleCall_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateExpression__ValueAssignment7791); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3838:1: rule__BooleanExpression__TrueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanExpression__TrueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3842:1: ( ( ( 'true' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3843:1: ( ( 'true' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3843:1: ( ( 'true' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3844:1: ( 'true' )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3845:1: ( 'true' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3846:1: 'true'
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueTrueKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__BooleanExpression__TrueAssignment_07827); 
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
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3861:1: rule__BooleanExpression__TrueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BooleanExpression__TrueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3865:1: ( ( ( 'false' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3866:1: ( ( 'false' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3866:1: ( ( 'false' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3867:1: ( 'false' )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3868:1: ( 'false' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3869:1: 'false'
            {
             before(grammarAccess.getBooleanExpressionAccess().getTrueFalseKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__BooleanExpression__TrueAssignment_17871); 
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


    // $ANTLR start "rule__MultiExpressionWhereEntry__NameAssignment_0"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3884:1: rule__MultiExpressionWhereEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MultiExpressionWhereEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3888:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3889:1: ( RULE_ID )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3889:1: ( RULE_ID )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3890:1: RULE_ID
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiExpressionWhereEntry__NameAssignment_07910); 
             after(grammarAccess.getMultiExpressionWhereEntryAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__NameAssignment_0"


    // $ANTLR start "rule__MultiExpressionWhereEntry__OperatorAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3899:1: rule__MultiExpressionWhereEntry__OperatorAssignment_1 : ( ruleArrayOperator ) ;
    public final void rule__MultiExpressionWhereEntry__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3903:1: ( ( ruleArrayOperator ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3904:1: ( ruleArrayOperator )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3904:1: ( ruleArrayOperator )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3905:1: ruleArrayOperator
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getOperatorArrayOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArrayOperator_in_rule__MultiExpressionWhereEntry__OperatorAssignment_17941);
            ruleArrayOperator();

            state._fsp--;

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getOperatorArrayOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__OperatorAssignment_1"


    // $ANTLR start "rule__MultiExpressionWhereEntry__RhsAssignment_2"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3914:1: rule__MultiExpressionWhereEntry__RhsAssignment_2 : ( ruleArrayExpression ) ;
    public final void rule__MultiExpressionWhereEntry__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3918:1: ( ( ruleArrayExpression ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3919:1: ( ruleArrayExpression )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3919:1: ( ruleArrayExpression )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3920:1: ruleArrayExpression
            {
             before(grammarAccess.getMultiExpressionWhereEntryAccess().getRhsArrayExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArrayExpression_in_rule__MultiExpressionWhereEntry__RhsAssignment_27972);
            ruleArrayExpression();

            state._fsp--;

             after(grammarAccess.getMultiExpressionWhereEntryAccess().getRhsArrayExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultiExpressionWhereEntry__RhsAssignment_2"


    // $ANTLR start "rule__DoubleArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3929:1: rule__DoubleArrayExpression__ValuesAssignment_1 : ( RULE_SIGNED_DOUBLE ) ;
    public final void rule__DoubleArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3933:1: ( ( RULE_SIGNED_DOUBLE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3934:1: ( RULE_SIGNED_DOUBLE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3934:1: ( RULE_SIGNED_DOUBLE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3935:1: RULE_SIGNED_DOUBLE
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getValuesSIGNED_DOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_SIGNED_DOUBLE,FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleArrayExpression__ValuesAssignment_18003); 
             after(grammarAccess.getDoubleArrayExpressionAccess().getValuesSIGNED_DOUBLETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__DoubleArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3944:1: rule__DoubleArrayExpression__ValuesAssignment_2_1 : ( RULE_SIGNED_DOUBLE ) ;
    public final void rule__DoubleArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3948:1: ( ( RULE_SIGNED_DOUBLE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3949:1: ( RULE_SIGNED_DOUBLE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3949:1: ( RULE_SIGNED_DOUBLE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3950:1: RULE_SIGNED_DOUBLE
            {
             before(grammarAccess.getDoubleArrayExpressionAccess().getValuesSIGNED_DOUBLETerminalRuleCall_2_1_0()); 
            match(input,RULE_SIGNED_DOUBLE,FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleArrayExpression__ValuesAssignment_2_18034); 
             after(grammarAccess.getDoubleArrayExpressionAccess().getValuesSIGNED_DOUBLETerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DoubleArrayExpression__ValuesAssignment_2_1"


    // $ANTLR start "rule__LongArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3959:1: rule__LongArrayExpression__ValuesAssignment_1 : ( RULE_SINGED_LONG ) ;
    public final void rule__LongArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3963:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3964:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3964:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3965:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getLongArrayExpressionAccess().getValuesSINGED_LONGTerminalRuleCall_1_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__LongArrayExpression__ValuesAssignment_18065); 
             after(grammarAccess.getLongArrayExpressionAccess().getValuesSINGED_LONGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LongArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__LongArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3974:1: rule__LongArrayExpression__ValuesAssignment_2_1 : ( RULE_SINGED_LONG ) ;
    public final void rule__LongArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3978:1: ( ( RULE_SINGED_LONG ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3979:1: ( RULE_SINGED_LONG )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3979:1: ( RULE_SINGED_LONG )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3980:1: RULE_SINGED_LONG
            {
             before(grammarAccess.getLongArrayExpressionAccess().getValuesSINGED_LONGTerminalRuleCall_2_1_0()); 
            match(input,RULE_SINGED_LONG,FOLLOW_RULE_SINGED_LONG_in_rule__LongArrayExpression__ValuesAssignment_2_18096); 
             after(grammarAccess.getLongArrayExpressionAccess().getValuesSINGED_LONGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LongArrayExpression__ValuesAssignment_2_1"


    // $ANTLR start "rule__StringArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3989:1: rule__StringArrayExpression__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3993:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3994:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3994:1: ( RULE_STRING )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:3995:1: RULE_STRING
            {
             before(grammarAccess.getStringArrayExpressionAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringArrayExpression__ValuesAssignment_18127); 
             after(grammarAccess.getStringArrayExpressionAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__StringArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4004:1: rule__StringArrayExpression__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4008:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4009:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4009:1: ( RULE_STRING )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4010:1: RULE_STRING
            {
             before(grammarAccess.getStringArrayExpressionAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringArrayExpression__ValuesAssignment_2_18158); 
             after(grammarAccess.getStringArrayExpressionAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__StringArrayExpression__ValuesAssignment_2_1"


    // $ANTLR start "rule__NullArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4019:1: rule__NullArrayExpression__ValuesAssignment_1 : ( ( 'null' ) ) ;
    public final void rule__NullArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4023:1: ( ( ( 'null' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4024:1: ( ( 'null' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4024:1: ( ( 'null' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4025:1: ( 'null' )
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4026:1: ( 'null' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4027:1: 'null'
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__NullArrayExpression__ValuesAssignment_18194); 
             after(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_1_0()); 

            }

             after(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_1_0()); 

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
    // $ANTLR end "rule__NullArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__NullArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4042:1: rule__NullArrayExpression__ValuesAssignment_2_1 : ( ( 'null' ) ) ;
    public final void rule__NullArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4046:1: ( ( ( 'null' ) ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4047:1: ( ( 'null' ) )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4047:1: ( ( 'null' ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4048:1: ( 'null' )
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_2_1_0()); 
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4049:1: ( 'null' )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4050:1: 'null'
            {
             before(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_2_1_0()); 
            match(input,41,FOLLOW_41_in_rule__NullArrayExpression__ValuesAssignment_2_18238); 
             after(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_2_1_0()); 

            }

             after(grammarAccess.getNullArrayExpressionAccess().getValuesNullKeyword_2_1_0()); 

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
    // $ANTLR end "rule__NullArrayExpression__ValuesAssignment_2_1"


    // $ANTLR start "rule__DateArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4065:1: rule__DateArrayExpression__ValuesAssignment_1 : ( RULE_DATE ) ;
    public final void rule__DateArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4069:1: ( ( RULE_DATE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4070:1: ( RULE_DATE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4070:1: ( RULE_DATE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4071:1: RULE_DATE
            {
             before(grammarAccess.getDateArrayExpressionAccess().getValuesDATETerminalRuleCall_1_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateArrayExpression__ValuesAssignment_18277); 
             after(grammarAccess.getDateArrayExpressionAccess().getValuesDATETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DateArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__DateArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4080:1: rule__DateArrayExpression__ValuesAssignment_2_1 : ( RULE_DATE ) ;
    public final void rule__DateArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4084:1: ( ( RULE_DATE ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4085:1: ( RULE_DATE )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4085:1: ( RULE_DATE )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4086:1: RULE_DATE
            {
             before(grammarAccess.getDateArrayExpressionAccess().getValuesDATETerminalRuleCall_2_1_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateArrayExpression__ValuesAssignment_2_18308); 
             after(grammarAccess.getDateArrayExpressionAccess().getValuesDATETerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DateArrayExpression__ValuesAssignment_2_1"


    // $ANTLR start "rule__BooleanArrayExpression__ValuesAssignment_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4095:1: rule__BooleanArrayExpression__ValuesAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BooleanArrayExpression__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4099:1: ( ( RULE_BOOL ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4100:1: ( RULE_BOOL )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4100:1: ( RULE_BOOL )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4101:1: RULE_BOOL
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getValuesBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BooleanArrayExpression__ValuesAssignment_18339); 
             after(grammarAccess.getBooleanArrayExpressionAccess().getValuesBOOLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__ValuesAssignment_1"


    // $ANTLR start "rule__BooleanArrayExpression__ValuesAssignment_2_1"
    // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4110:1: rule__BooleanArrayExpression__ValuesAssignment_2_1 : ( RULE_BOOL ) ;
    public final void rule__BooleanArrayExpression__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4114:1: ( ( RULE_BOOL ) )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4115:1: ( RULE_BOOL )
            {
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4115:1: ( RULE_BOOL )
            // ../org.eclipselabs.mongo.query.ui/src-gen/org/eclipselabs/mongo/query/ui/contentassist/antlr/internal/InternalMongoSQL.g:4116:1: RULE_BOOL
            {
             before(grammarAccess.getBooleanArrayExpressionAccess().getValuesBOOLTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BooleanArrayExpression__ValuesAssignment_2_18370); 
             after(grammarAccess.getBooleanArrayExpressionAccess().getValuesBOOLTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BooleanArrayExpression__ValuesAssignment_2_1"

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
    public static final BitSet FOLLOW_rule__ExpressionWhereEntry__Alternatives_in_ruleExpressionWhereEntry514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleExpressionWhereEntry_in_entryRuleSingleExpressionWhereEntry541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleExpressionWhereEntry548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__0_in_ruleSingleExpressionWhereEntry574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_entryRuleReplacableValue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplacableValue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplacableValue__ValueAssignment_in_ruleReplacableValue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_entryRuleDoubleExpression721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleExpression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleExpression__ValueAssignment_in_ruleDoubleExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_entryRuleLongExpression781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongExpression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongExpression__ValueAssignment_in_ruleLongExpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__ValueAssignment_in_ruleStringExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullExpression__ValueAssignment_in_ruleNullExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_entryRuleDateExpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateExpression__ValueAssignment_in_ruleDateExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiExpressionWhereEntry_in_entryRuleMultiExpressionWhereEntry1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiExpressionWhereEntry1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__0_in_ruleMultiExpressionWhereEntry1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayExpression_in_entryRuleArrayExpression1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayExpression1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayExpression__Alternatives_in_ruleArrayExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayExpression_in_entryRuleDoubleArrayExpression1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayExpression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__0_in_ruleDoubleArrayExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayExpression_in_entryRuleLongArrayExpression1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayExpression1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__0_in_ruleLongArrayExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayExpression_in_entryRuleStringArrayExpression1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__0_in_ruleStringArrayExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullArrayExpression_in_entryRuleNullArrayExpression1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullArrayExpression1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__0_in_ruleNullArrayExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateArrayExpression_in_entryRuleDateArrayExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateArrayExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__0_in_ruleDateArrayExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayExpression_in_entryRuleBooleanArrayExpression1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayExpression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__0_in_ruleBooleanArrayExpression1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayOperator__Alternatives_in_ruleArrayOperator1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0_in_rule__ColumnList__Alternatives1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ColumnList__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWhereEntry_in_rule__ConcreteWhereEntry__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleExpressionWhereEntry_in_rule__ExpressionWhereEntry__Alternatives1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiExpressionWhereEntry_in_rule__ExpressionWhereEntry__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleExpression_in_rule__Expression__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongExpression_in_rule__Expression__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_rule__Expression__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_rule__Expression__Alternatives1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateExpression_in_rule__Expression__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacableValue_in_rule__Expression__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__TrueAssignment_0_in_rule__BooleanExpression__Alternatives1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__TrueAssignment_1_in_rule__BooleanExpression__Alternatives1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayExpression_in_rule__ArrayExpression__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayExpression_in_rule__ArrayExpression__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayExpression_in_rule__ArrayExpression__Alternatives2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullArrayExpression_in_rule__ArrayExpression__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateArrayExpression_in_rule__ArrayExpression__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayExpression_in_rule__ArrayExpression__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArrayOperator__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArrayOperator__Alternatives2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArrayOperator__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArrayOperator__Alternatives2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ArrayOperator__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Alternatives2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02438 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Model__Group__0__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12500 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttrsAssignment_1_in_rule__Model__Group__1__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22560 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Model__Group__2__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32622 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DbAssignment_3_in_rule__Model__Group__3__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02750 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Model__Group_4__0__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WhereEntryAssignment_4_1_in_rule__Model__Group_4__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Database__Group__0__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12935 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__UrlAssignment_1_in_rule__Database__Group__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22995 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0_in_rule__Database__Group__2__Impl3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__33056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__33059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Database__Group__3__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__43118 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Database__Group__5_in_rule__Database__Group__43121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__DbNameAssignment_4_in_rule__Database__Group__4__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__53178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__6_in_rule__Database__Group__53181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Database__Group__5__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__63240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_6_in_rule__Database__Group__6__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__0__Impl_in_rule__Database__Group_2__03311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1_in_rule__Database__Group_2__03314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Database__Group_2__0__Impl3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group_2__1__Impl_in_rule__Database__Group_2__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__PortAssignment_2_1_in_rule__Database__Group_2__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__0__Impl_in_rule__ColumnList__Group_0__03434 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1_in_rule__ColumnList__Group_0__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0__0__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0__1__Impl_in_rule__ColumnList__Group_0__13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0_in_rule__ColumnList__Group_0__1__Impl3520 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__0__Impl_in_rule__ColumnList__Group_0_1__03555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1_in_rule__ColumnList__Group_0_1__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ColumnList__Group_0_1__0__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnList__Group_0_1__1__Impl_in_rule__ColumnList__Group_0_1__13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnList__Group_0_1__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__0__Impl_in_rule__WhereEntry__Group__03677 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__1_in_rule__WhereEntry__Group__03680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__Group__0__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group__1__Impl_in_rule__WhereEntry__Group__13736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__0_in_rule__WhereEntry__Group__1__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__0__Impl_in_rule__WhereEntry__Group_1__03798 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__1_in_rule__WhereEntry__Group_1__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1__1__Impl_in_rule__WhereEntry__Group_1__13859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3888 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0_in_rule__WhereEntry__Group_1__1__Impl3900 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__0__Impl_in_rule__WhereEntry__Group_1_1__03937 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__1_in_rule__WhereEntry__Group_1_1__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__WhereEntry__Group_1_1__0__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__Group_1_1__1__Impl_in_rule__WhereEntry__Group_1_1__13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereEntry__EntriesAssignment_1_1_1_in_rule__WhereEntry__Group_1_1__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__0__Impl_in_rule__AndWhereEntry__Group__04060 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__1_in_rule__AndWhereEntry__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__Group__0__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group__1__Impl_in_rule__AndWhereEntry__Group__14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__0_in_rule__AndWhereEntry__Group__1__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__0__Impl_in_rule__AndWhereEntry__Group_1__04181 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__1_in_rule__AndWhereEntry__Group_1__04184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1__1__Impl_in_rule__AndWhereEntry__Group_1__14242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl4271 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0_in_rule__AndWhereEntry__Group_1__1__Impl4283 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__0__Impl_in_rule__AndWhereEntry__Group_1_1__04320 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__1_in_rule__AndWhereEntry__Group_1_1__04323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AndWhereEntry__Group_1_1__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__Group_1_1__1__Impl_in_rule__AndWhereEntry__Group_1_1__14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndWhereEntry__EntriesAssignment_1_1_1_in_rule__AndWhereEntry__Group_1_1__1__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__0__Impl_in_rule__ParWhereEntry__Group__04443 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__1_in_rule__ParWhereEntry__Group__04446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParWhereEntry__Group__0__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__1__Impl_in_rule__ParWhereEntry__Group__14505 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__2_in_rule__ParWhereEntry__Group__14508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_rule__ParWhereEntry__Group__1__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParWhereEntry__Group__2__Impl_in_rule__ParWhereEntry__Group__24564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParWhereEntry__Group__2__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__0__Impl_in_rule__SingleExpressionWhereEntry__Group__04629 = new BitSet(new long[]{0x0000000007FD0000L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__1_in_rule__SingleExpressionWhereEntry__Group__04632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__NameAssignment_0_in_rule__SingleExpressionWhereEntry__Group__0__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__1__Impl_in_rule__SingleExpressionWhereEntry__Group__14689 = new BitSet(new long[]{0x00000F00000001E0L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__2_in_rule__SingleExpressionWhereEntry__Group__14692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__OperatorAssignment_1_in_rule__SingleExpressionWhereEntry__Group__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__Group__2__Impl_in_rule__SingleExpressionWhereEntry__Group__24749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleExpressionWhereEntry__RhsAssignment_2_in_rule__SingleExpressionWhereEntry__Group__2__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__0__Impl_in_rule__MultiExpressionWhereEntry__Group__04812 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__1_in_rule__MultiExpressionWhereEntry__Group__04815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__NameAssignment_0_in_rule__MultiExpressionWhereEntry__Group__0__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__1__Impl_in_rule__MultiExpressionWhereEntry__Group__14872 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__2_in_rule__MultiExpressionWhereEntry__Group__14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__OperatorAssignment_1_in_rule__MultiExpressionWhereEntry__Group__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__Group__2__Impl_in_rule__MultiExpressionWhereEntry__Group__24932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiExpressionWhereEntry__RhsAssignment_2_in_rule__MultiExpressionWhereEntry__Group__2__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__0__Impl_in_rule__DoubleArrayExpression__Group__04995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__1_in_rule__DoubleArrayExpression__Group__04998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DoubleArrayExpression__Group__0__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__1__Impl_in_rule__DoubleArrayExpression__Group__15057 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__2_in_rule__DoubleArrayExpression__Group__15060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__ValuesAssignment_1_in_rule__DoubleArrayExpression__Group__1__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__2__Impl_in_rule__DoubleArrayExpression__Group__25117 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__3_in_rule__DoubleArrayExpression__Group__25120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group_2__0_in_rule__DoubleArrayExpression__Group__2__Impl5147 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group__3__Impl_in_rule__DoubleArrayExpression__Group__35178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DoubleArrayExpression__Group__3__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group_2__0__Impl_in_rule__DoubleArrayExpression__Group_2__05245 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group_2__1_in_rule__DoubleArrayExpression__Group_2__05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DoubleArrayExpression__Group_2__0__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__Group_2__1__Impl_in_rule__DoubleArrayExpression__Group_2__15307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayExpression__ValuesAssignment_2_1_in_rule__DoubleArrayExpression__Group_2__1__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__0__Impl_in_rule__LongArrayExpression__Group__05368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__1_in_rule__LongArrayExpression__Group__05371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LongArrayExpression__Group__0__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__1__Impl_in_rule__LongArrayExpression__Group__15430 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__2_in_rule__LongArrayExpression__Group__15433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__ValuesAssignment_1_in_rule__LongArrayExpression__Group__1__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__2__Impl_in_rule__LongArrayExpression__Group__25490 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__3_in_rule__LongArrayExpression__Group__25493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group_2__0_in_rule__LongArrayExpression__Group__2__Impl5520 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group__3__Impl_in_rule__LongArrayExpression__Group__35551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LongArrayExpression__Group__3__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group_2__0__Impl_in_rule__LongArrayExpression__Group_2__05618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group_2__1_in_rule__LongArrayExpression__Group_2__05621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LongArrayExpression__Group_2__0__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__Group_2__1__Impl_in_rule__LongArrayExpression__Group_2__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayExpression__ValuesAssignment_2_1_in_rule__LongArrayExpression__Group_2__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__0__Impl_in_rule__StringArrayExpression__Group__05741 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__1_in_rule__StringArrayExpression__Group__05744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringArrayExpression__Group__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__1__Impl_in_rule__StringArrayExpression__Group__15803 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__2_in_rule__StringArrayExpression__Group__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__ValuesAssignment_1_in_rule__StringArrayExpression__Group__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__2__Impl_in_rule__StringArrayExpression__Group__25863 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__3_in_rule__StringArrayExpression__Group__25866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group_2__0_in_rule__StringArrayExpression__Group__2__Impl5893 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group__3__Impl_in_rule__StringArrayExpression__Group__35924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StringArrayExpression__Group__3__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group_2__0__Impl_in_rule__StringArrayExpression__Group_2__05991 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group_2__1_in_rule__StringArrayExpression__Group_2__05994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringArrayExpression__Group_2__0__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__Group_2__1__Impl_in_rule__StringArrayExpression__Group_2__16053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayExpression__ValuesAssignment_2_1_in_rule__StringArrayExpression__Group_2__1__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__0__Impl_in_rule__NullArrayExpression__Group__06114 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__1_in_rule__NullArrayExpression__Group__06117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NullArrayExpression__Group__0__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__1__Impl_in_rule__NullArrayExpression__Group__16176 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__2_in_rule__NullArrayExpression__Group__16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__ValuesAssignment_1_in_rule__NullArrayExpression__Group__1__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__2__Impl_in_rule__NullArrayExpression__Group__26236 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__3_in_rule__NullArrayExpression__Group__26239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group_2__0_in_rule__NullArrayExpression__Group__2__Impl6266 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group__3__Impl_in_rule__NullArrayExpression__Group__36297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NullArrayExpression__Group__3__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group_2__0__Impl_in_rule__NullArrayExpression__Group_2__06364 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group_2__1_in_rule__NullArrayExpression__Group_2__06367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NullArrayExpression__Group_2__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__Group_2__1__Impl_in_rule__NullArrayExpression__Group_2__16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullArrayExpression__ValuesAssignment_2_1_in_rule__NullArrayExpression__Group_2__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__0__Impl_in_rule__DateArrayExpression__Group__06487 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__1_in_rule__DateArrayExpression__Group__06490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DateArrayExpression__Group__0__Impl6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__1__Impl_in_rule__DateArrayExpression__Group__16549 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__2_in_rule__DateArrayExpression__Group__16552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__ValuesAssignment_1_in_rule__DateArrayExpression__Group__1__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__2__Impl_in_rule__DateArrayExpression__Group__26609 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__3_in_rule__DateArrayExpression__Group__26612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group_2__0_in_rule__DateArrayExpression__Group__2__Impl6639 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group__3__Impl_in_rule__DateArrayExpression__Group__36670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DateArrayExpression__Group__3__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group_2__0__Impl_in_rule__DateArrayExpression__Group_2__06737 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group_2__1_in_rule__DateArrayExpression__Group_2__06740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DateArrayExpression__Group_2__0__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__Group_2__1__Impl_in_rule__DateArrayExpression__Group_2__16799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateArrayExpression__ValuesAssignment_2_1_in_rule__DateArrayExpression__Group_2__1__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__0__Impl_in_rule__BooleanArrayExpression__Group__06860 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__1_in_rule__BooleanArrayExpression__Group__06863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BooleanArrayExpression__Group__0__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__1__Impl_in_rule__BooleanArrayExpression__Group__16922 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__2_in_rule__BooleanArrayExpression__Group__16925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__ValuesAssignment_1_in_rule__BooleanArrayExpression__Group__1__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__2__Impl_in_rule__BooleanArrayExpression__Group__26982 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__3_in_rule__BooleanArrayExpression__Group__26985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group_2__0_in_rule__BooleanArrayExpression__Group__2__Impl7012 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group__3__Impl_in_rule__BooleanArrayExpression__Group__37043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BooleanArrayExpression__Group__3__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group_2__0__Impl_in_rule__BooleanArrayExpression__Group_2__07110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group_2__1_in_rule__BooleanArrayExpression__Group_2__07113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BooleanArrayExpression__Group_2__0__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__Group_2__1__Impl_in_rule__BooleanArrayExpression__Group_2__17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayExpression__ValuesAssignment_2_1_in_rule__BooleanArrayExpression__Group_2__1__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnList_in_rule__Model__AttrsAssignment_17238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__Model__DbAssignment_37269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereEntry_in_rule__Model__WhereEntryAssignment_4_17300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__UrlAssignment_17331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__Database__PortAssignment_2_17362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__DbNameAssignment_47393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_67424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndWhereEntry_in_rule__WhereEntry__EntriesAssignment_1_1_17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteWhereEntry_in_rule__AndWhereEntry__EntriesAssignment_1_1_17486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleExpressionWhereEntry__NameAssignment_07517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__SingleExpressionWhereEntry__OperatorAssignment_17548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SingleExpressionWhereEntry__RhsAssignment_27579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ReplacableValue__ValueAssignment7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleExpression__ValueAssignment7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__LongExpression__ValueAssignment7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringExpression__ValueAssignment7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NullExpression__ValueAssignment7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateExpression__ValueAssignment7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BooleanExpression__TrueAssignment_07827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__BooleanExpression__TrueAssignment_17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiExpressionWhereEntry__NameAssignment_07910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayOperator_in_rule__MultiExpressionWhereEntry__OperatorAssignment_17941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayExpression_in_rule__MultiExpressionWhereEntry__RhsAssignment_27972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleArrayExpression__ValuesAssignment_18003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_DOUBLE_in_rule__DoubleArrayExpression__ValuesAssignment_2_18034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__LongArrayExpression__ValuesAssignment_18065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGED_LONG_in_rule__LongArrayExpression__ValuesAssignment_2_18096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringArrayExpression__ValuesAssignment_18127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringArrayExpression__ValuesAssignment_2_18158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NullArrayExpression__ValuesAssignment_18194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NullArrayExpression__ValuesAssignment_2_18238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateArrayExpression__ValuesAssignment_18277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateArrayExpression__ValuesAssignment_2_18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BooleanArrayExpression__ValuesAssignment_18339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BooleanArrayExpression__ValuesAssignment_2_18370 = new BitSet(new long[]{0x0000000000000002L});

}