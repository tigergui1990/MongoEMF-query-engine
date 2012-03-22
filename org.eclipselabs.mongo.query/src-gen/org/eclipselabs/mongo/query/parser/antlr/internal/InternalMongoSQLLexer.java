package org.eclipselabs.mongo.query.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMongoSQLLexer extends Lexer {
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
    public static final int RULE_SINGED_LONG=5;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SIGNED_DOUBLE=6;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalMongoSQLLexer() {;} 
    public InternalMongoSQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMongoSQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:11:7: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:11:9: 'SELECT'
            {
            match("SELECT"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:12:7: ( 'FROM' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:12:9: 'FROM'
            {
            match("FROM"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:13:7: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:13:9: 'WHERE'
            {
            match("WHERE"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:14:7: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:14:9: 'mongo://'
            {
            match("mongo://"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:15:7: ( ':' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:15:9: ':'
            {
            match(':'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:16:7: ( '/' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:16:9: '/'
            {
            match('/'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:17:7: ( ',' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:17:9: ','
            {
            match(','); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:18:7: ( '*' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:18:9: '*'
            {
            match('*'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:19:7: ( 'OR' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:19:9: 'OR'
            {
            match("OR"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:20:7: ( 'AND' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:20:9: 'AND'
            {
            match("AND"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:21:7: ( '(' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:21:9: '('
            {
            match('('); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:22:7: ( ')' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:22:9: ')'
            {
            match(')'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:23:7: ( '?' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:23:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:24:7: ( 'null' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:24:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:25:7: ( 'true' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:25:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:26:7: ( 'false' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:26:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:27:7: ( '<' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:28:7: ( '>' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:29:7: ( '<=' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:29:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:30:7: ( '>=' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:30:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:31:7: ( '=' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:31:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:32:7: ( '!=' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:32:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:33:7: ( 'like' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:33:9: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:34:7: ( 'not like' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:34:9: 'not like'
            {
            match("not like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:35:7: ( 'not in' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:35:9: 'not in'
            {
            match("not in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:36:7: ( 'in' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:36:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_SINGED_LONG"
    public final void mRULE_SINGED_LONG() throws RecognitionException {
        try {
            int _type = RULE_SINGED_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:18: ( ( '-' )? ( '0' .. '9' )+ )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:20: ( '-' )? ( '0' .. '9' )+
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:20: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:20: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:25: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1017:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGED_LONG"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1019:11: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '1' '0' .. '9' '-' '0' .. '3' '0' .. '9' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1019:13: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '1' '0' .. '9' '-' '0' .. '3' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','1'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','3'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_SIGNED_DOUBLE"
    public final void mRULE_SIGNED_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:20: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:22: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:22: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:22: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:27: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:39: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:40: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:44: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1021:45: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1023:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1023:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1023:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1023:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1023:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1025:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1027:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1027:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1027:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1027:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1029:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1031:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1031:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1031:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_SINGED_LONG | RULE_DATE | RULE_SIGNED_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt17=34;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:166: RULE_SINGED_LONG
                {
                mRULE_SINGED_LONG(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:183: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:193: RULE_SIGNED_DOUBLE
                {
                mRULE_SIGNED_DOUBLE(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:212: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:232: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:248: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.mongo.query/src-gen/org/eclipselabs/mongo/query/parser/antlr/internal/InternalMongoSQL.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\4\31\1\uffff\1\42\2\uffff\2\31\3\uffff\3\31\1\52\1\54"+
        "\2\uffff\2\31\1\uffff\1\62\3\uffff\4\31\3\uffff\1\67\5\31\4\uffff"+
        "\1\31\1\76\2\62\2\uffff\4\31\1\uffff\1\104\5\31\1\uffff\1\62\1\31"+
        "\1\114\2\31\1\uffff\1\117\1\uffff\1\122\1\31\1\124\1\62\1\31\1\uffff"+
        "\1\127\1\31\4\uffff\1\131\2\uffff\1\132\4\uffff";
    static final String DFA17_eofS =
        "\133\uffff";
    static final String DFA17_minS =
        "\1\11\1\105\1\122\1\110\1\157\1\uffff\1\52\2\uffff\1\122\1\116"+
        "\3\uffff\1\157\1\162\1\141\2\75\2\uffff\1\151\1\156\1\60\1\56\3"+
        "\uffff\1\114\1\117\1\105\1\156\3\uffff\1\60\1\104\1\154\1\164\1"+
        "\165\1\154\4\uffff\1\153\1\60\2\56\2\uffff\1\105\1\115\1\122\1\147"+
        "\1\uffff\1\60\1\154\1\40\1\145\1\163\1\145\1\uffff\1\56\1\103\1"+
        "\60\1\105\1\157\1\uffff\1\60\1\151\1\60\1\145\1\60\1\55\1\124\1"+
        "\uffff\1\60\1\72\4\uffff\1\60\2\uffff\1\60\4\uffff";
    static final String DFA17_maxS =
        "\1\172\1\105\1\122\1\110\1\157\1\uffff\1\57\2\uffff\1\122\1\116"+
        "\3\uffff\1\165\1\162\1\141\2\75\2\uffff\1\151\1\156\2\71\3\uffff"+
        "\1\114\1\117\1\105\1\156\3\uffff\1\172\1\104\1\154\1\164\1\165\1"+
        "\154\4\uffff\1\153\1\172\2\71\2\uffff\1\105\1\115\1\122\1\147\1"+
        "\uffff\1\172\1\154\1\40\1\145\1\163\1\145\1\uffff\1\71\1\103\1\172"+
        "\1\105\1\157\1\uffff\1\172\1\154\1\172\1\145\1\172\1\71\1\124\1"+
        "\uffff\1\172\1\72\4\uffff\1\172\2\uffff\1\172\4\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\1\uffff\1\7\1\10\2\uffff\1\13\1\14\1\15\5\uffff\1"+
        "\25\1\26\4\uffff\1\36\1\37\1\42\4\uffff\1\40\1\41\1\6\6\uffff\1"+
        "\23\1\21\1\24\1\22\4\uffff\1\35\1\33\4\uffff\1\11\6\uffff\1\32\5"+
        "\uffff\1\12\7\uffff\1\2\2\uffff\1\16\1\30\1\31\1\17\1\uffff\1\27"+
        "\1\34\1\uffff\1\3\1\4\1\20\1\1";
    static final String DFA17_specialS =
        "\133\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\24\1\32\4\uffff\1\32\1\13"+
            "\1\14\1\10\1\uffff\1\7\1\27\1\uffff\1\6\12\30\1\5\1\uffff\1"+
            "\21\1\23\1\22\1\15\1\uffff\1\12\4\31\1\2\10\31\1\11\3\31\1\1"+
            "\3\31\1\3\3\31\3\uffff\2\31\1\uffff\5\31\1\20\2\31\1\26\2\31"+
            "\1\25\1\4\1\16\5\31\1\17\6\31",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "\1\46\5\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53",
            "",
            "",
            "\1\55",
            "\1\56",
            "\12\57",
            "\1\61\1\uffff\12\60",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\75",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\61\1\uffff\12\57",
            "\1\61\1\uffff\12\77",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\61\1\uffff\12\112",
            "\1\113",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\115",
            "\1\116",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\121\2\uffff\1\120",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\123",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\125\1\61\1\uffff\12\57",
            "\1\126",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\130",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_SINGED_LONG | RULE_DATE | RULE_SIGNED_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}