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
/* Generated By:JavaCC: Do not edit this line. EventReaderConstants.java */
package fr.lri.schora.basicEvent.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface EventReaderConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int INTERACTION = 10;
  /** RegularExpression Id. */
  int RECEPTION = 11;
  /** RegularExpression Id. */
  int SENDING = 12;
  /** RegularExpression Id. */
  int BEGIN_BOUND = 13;
  /** RegularExpression Id. */
  int END_BOUND = 14;
  /** RegularExpression Id. */
  int BEGIN_OBJ = 15;
  /** RegularExpression Id. */
  int END_OBJ = 16;
  /** RegularExpression Id. */
  int COMMA = 17;
  /** RegularExpression Id. */
  int IDENT = 18;
  /** RegularExpression Id. */
  int UNEXPECTED_CHAR = 19;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_COMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 5>",
    "\"/*\"",
    "<token of kind 7>",
    "\"/*\"",
    "\"*/\"",
    "\".\"",
    "\"?\"",
    "\"!\"",
    "\"<\"",
    "\">\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "<IDENT>",
    "<UNEXPECTED_CHAR>",
  };

}
