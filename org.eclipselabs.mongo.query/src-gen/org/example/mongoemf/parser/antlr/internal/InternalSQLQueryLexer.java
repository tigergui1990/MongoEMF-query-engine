package org.example.mongoemf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLQueryLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_MORE_THAN=9;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_LESS_THAN=8;
    public static final int RULE_WS=13;

    // delegates
    // delegators

    public InternalSQLQueryLexer() {;} 
    public InternalSQLQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSQLQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:11:7: ( 'SELECT' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:11:9: 'SELECT'
            {
            match("SELECT"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:12:7: ( 'FROM' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:12:9: 'FROM'
            {
            match("FROM"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:13:7: ( 'mongo://' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:13:9: 'mongo://'
            {
            match("mongo://"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:14:7: ( ':' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:14:9: ':'
            {
            match(':'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:15:7: ( '/' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:15:9: '/'
            {
            match('/'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:16:7: ( ',' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:16:9: ','
            {
            match(','); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:17:7: ( '*' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:17:9: '*'
            {
            match('*'); 

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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:18:7: ( 'WHERE' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:18:9: 'WHERE'
            {
            match("WHERE"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:19:7: ( 'AND' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:19:9: 'AND'
            {
            match("AND"); 


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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:20:7: ( 'OR' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:20:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:572:13: ( '=' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:572:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_NOT_EQUALS"
    public final void mRULE_NOT_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:574:17: ( ( '!=' | '<>' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:574:19: ( '!=' | '<>' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:574:19: ( '!=' | '<>' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='!') ) {
                alt1=1;
            }
            else if ( (LA1_0=='<') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:574:20: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:574:25: '<>'
                    {
                    match("<>"); 


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
    // $ANTLR end "RULE_NOT_EQUALS"

    // $ANTLR start "RULE_LESS_THAN"
    public final void mRULE_LESS_THAN() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:576:16: ( '<' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:576:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN"

    // $ANTLR start "RULE_MORE_THAN"
    public final void mRULE_MORE_THAN() throws RecognitionException {
        try {
            int _type = RULE_MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:578:16: ( '>' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:578:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORE_THAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:580:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:580:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:580:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:580:11: '^'
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

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:580:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:
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
            	    break loop3;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:582:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:582:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:582:12: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:582:13: '0' .. '9'
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:584:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:586:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:586:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:586:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:586:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:588:41: '\\r'
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
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:590:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:590:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:590:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:592:16: ( . )
            // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:592:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_EQUALS | RULE_NOT_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=21;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:70: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:82: RULE_NOT_EQUALS
                {
                mRULE_NOT_EQUALS(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:98: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:113: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:128: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:136: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:145: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:157: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:173: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:189: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.mongo.query/src-gen/org/example/mongoemf/parser/antlr/internal/InternalSQLQuery.g:1:197: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\27\1\uffff\1\35\2\uffff\3\27\1\uffff\1\25\1\45\1\uffff"+
        "\1\25\2\uffff\2\25\2\uffff\1\27\1\uffff\2\27\6\uffff\2\27\1\57\7"+
        "\uffff\4\27\1\64\1\uffff\1\27\1\66\2\27\1\uffff\1\27\1\uffff\1\27"+
        "\1\73\1\74\3\uffff";
    static final String DFA13_eofS =
        "\75\uffff";
    static final String DFA13_minS =
        "\1\0\1\105\1\122\1\157\1\uffff\1\52\2\uffff\1\110\1\116\1\122\1"+
        "\uffff\1\75\1\76\1\uffff\1\101\2\uffff\2\0\2\uffff\1\114\1\uffff"+
        "\1\117\1\156\6\uffff\1\105\1\104\1\60\7\uffff\1\105\1\115\1\147"+
        "\1\122\1\60\1\uffff\1\103\1\60\1\157\1\105\1\uffff\1\124\1\uffff"+
        "\1\72\2\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\105\1\122\1\157\1\uffff\1\57\2\uffff\1\110\1\116\1\122"+
        "\1\uffff\1\75\1\76\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\114\1"+
        "\uffff\1\117\1\156\6\uffff\1\105\1\104\1\172\7\uffff\1\105\1\115"+
        "\1\147\1\122\1\172\1\uffff\1\103\1\172\1\157\1\105\1\uffff\1\124"+
        "\1\uffff\1\72\2\172\3\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\3\uffff\1\13\2\uffff\1\16\1\uffff"+
        "\1\17\1\20\2\uffff\1\24\1\25\1\uffff\1\17\2\uffff\1\4\1\22\1\23"+
        "\1\5\1\6\1\7\3\uffff\1\13\1\14\1\15\1\16\1\20\1\21\1\24\5\uffff"+
        "\1\12\4\uffff\1\11\1\uffff\1\2\3\uffff\1\3\1\10\1\1";
    static final String DFA13_specialS =
        "\1\0\21\uffff\1\1\1\2\51\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\14\1\22\4\25\1\23\2\25\1"+
            "\7\1\25\1\6\2\25\1\5\12\21\1\4\1\25\1\15\1\13\1\16\2\25\1\11"+
            "\4\20\1\2\10\20\1\12\3\20\1\1\3\20\1\10\3\20\3\25\1\17\1\20"+
            "\1\25\14\20\1\3\15\20\uff85\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\44",
            "\1\44",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\50",
            "\0\50",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\65",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "",
            "\1\72",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_EQUALS | RULE_NOT_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='S') ) {s = 1;}

                        else if ( (LA13_0=='F') ) {s = 2;}

                        else if ( (LA13_0=='m') ) {s = 3;}

                        else if ( (LA13_0==':') ) {s = 4;}

                        else if ( (LA13_0=='/') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='*') ) {s = 7;}

                        else if ( (LA13_0=='W') ) {s = 8;}

                        else if ( (LA13_0=='A') ) {s = 9;}

                        else if ( (LA13_0=='O') ) {s = 10;}

                        else if ( (LA13_0=='=') ) {s = 11;}

                        else if ( (LA13_0=='!') ) {s = 12;}

                        else if ( (LA13_0=='<') ) {s = 13;}

                        else if ( (LA13_0=='>') ) {s = 14;}

                        else if ( (LA13_0=='^') ) {s = 15;}

                        else if ( ((LA13_0>='B' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='z')) ) {s = 16;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 17;}

                        else if ( (LA13_0=='\"') ) {s = 18;}

                        else if ( (LA13_0=='\'') ) {s = 19;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 20;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||LA13_0=='+'||(LA13_0>='-' && LA13_0<='.')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}