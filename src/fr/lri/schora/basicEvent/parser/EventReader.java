/*******************************************************************************
 * This code is distributed under GPL v2 licence.
 * 
 * This code is provided solely "as is". 
 * There is no warranty or other guarantee of fitness of this code.
 * The author disclaims all responsibility and liability 
 * with respect to this code's usage
 * or its effect upon hardware or computer systems.
 * 
 * author: Huu-Nghia Nguyen
 * email : nhnghia@me.com
 ******************************************************************************/
/* Generated By:JavaCC: Do not edit this line. EventReader.java */
package fr.lri.schora.basicEvent.parser;
import fr.lri.schora.expr.*;
import fr.lri.schora.basicEvent.*;
import java.io.*;
import java.util.*;
public class EventReader implements EventReaderConstants {
        public static Event parser(String script) throws fr.lri.schora.util.parser.ParserException{
           return EventReader.parser(script, 0, 0);
        }
  /**
	 * parse a script which is a paragraph in a document
	 * @param script
	 * @param shiftLine: beginLine of the paragraph
	 * @param shiftColumn: beginColumn of the paragraph
	 * @return
	 * @throws fr.lri.schora.util.parser.ParserException
	 */
        public static Event parser(String script, int shiftLine, int shiftColumn) throws fr.lri.schora.util.parser.ParserException{
                try{
                        StringReader f = new StringReader(script);
                        EventReader parser = new EventReader(f);
                        Event dot = parser.parser();
                        return dot;
                }catch (ParseException ex){
                        Token ct = ex.currentToken;
                        java.util.List<String> expectedImages = new ArrayList<String>();
                        for (int i=0; i< ex.expectedTokenSequences.length; i++){
                                for (int j=0; j< ex.expectedTokenSequences[i].length; j++){
                                        expectedImages.add(ex.tokenImage[ex.expectedTokenSequences[i][j]]);
                                }
                        }
                        throw new fr.lri.schora.util.parser.ParserException(ct.beginLine + shiftLine, ct.endLine + shiftLine, ct.beginColumn+shiftColumn, ct.endColumn+shiftColumn, ct.next.image, expectedImages);
                }
        }

  final public Event parser() throws ParseException {
  Token t1, t2,t3,t4 = null;
  int eventType = 1;
  boolean isBound = false;
  boolean hasVariable = false;
    t1 = jj_consume_token(IDENT);
    jj_consume_token(BEGIN_OBJ);
    t2 = jj_consume_token(IDENT);
    jj_consume_token(COMMA);
    t3 = jj_consume_token(IDENT);
    jj_consume_token(END_OBJ);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTERACTION:
    case RECEPTION:
    case SENDING:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTERACTION:
        jj_consume_token(INTERACTION);
            eventType = 1;
        break;
      case SENDING:
        jj_consume_token(SENDING);
            eventType = 2;
        break;
      case RECEPTION:
        jj_consume_token(RECEPTION);
           eventType = 3;
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BEGIN_BOUND:
    case IDENT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BEGIN_BOUND:
        jj_consume_token(BEGIN_BOUND);
        t4 = jj_consume_token(IDENT);
        jj_consume_token(END_BOUND);
            isBound = true;
            hasVariable = true;
        break;
      case IDENT:
        t4 = jj_consume_token(IDENT);
            isBound = false;
            hasVariable = true;
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    jj_consume_token(0);
          BasicEvent e;
          BasicEventFactory fac = BasicEventFactory.eINSTANCE;
          if (eventType == 1)
          {
                if (isBound)
                        e = fac.createBoundInteraction();
                else
                        e = fac.createFreeInteraction();
          }
          else if (eventType == 2)
          {
                if (isBound)
                        e = fac.createBoundSending();
                else
                        e = fac.createFreeSending();
          }
          else
                        e = fac.createReception();

          e.setOperationName(t1.image);
          e.setSender(t2.image);
          e.setReceiver(t3.image);

          if (hasVariable)
          {
             Variable v = ExprFactory.eINSTANCE.createVariable();
             v.setName(t4.image);
             e.setVariable(v);
          }

          {if (true) return e;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public EventReaderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[4];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1c00,0x1c00,0x42000,0x42000,};
   }

  /** Constructor with InputStream. */
  public EventReader(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public EventReader(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new EventReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public EventReader(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new EventReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public EventReader(EventReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(EventReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[20];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 4; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 20; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
