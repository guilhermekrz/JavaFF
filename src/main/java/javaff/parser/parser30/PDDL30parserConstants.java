/* Generated By:JavaCC: Do not edit this line. PDDL30parserConstants.java */
package javaff.parser.parser30;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface PDDL30parserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int OPEN = 5;
  /** RegularExpression Id. */
  int CLOSE = 6;
  /** RegularExpression Id. */
  int DEFINE = 7;
  /** RegularExpression Id. */
  int DOMAIN = 8;
  /** RegularExpression Id. */
  int DOMAIN_LABEL = 9;
  /** RegularExpression Id. */
  int OBJECTS = 10;
  /** RegularExpression Id. */
  int GOAL = 11;
  /** RegularExpression Id. */
  int INIT = 12;
  /** RegularExpression Id. */
  int METRIC = 13;
  /** RegularExpression Id. */
  int PROBLEM = 14;
  /** RegularExpression Id. */
  int REQUIREMENTS = 15;
  /** RegularExpression Id. */
  int CONSTRAINTS = 16;
  /** RegularExpression Id. */
  int PREFERENCE = 17;
  /** RegularExpression Id. */
  int REQUIREMENT_LABELS = 18;
  /** RegularExpression Id. */
  int NON_HANDLED_LABELS = 19;
  /** RegularExpression Id. */
  int PDDL_1_7_LABELS = 20;
  /** RegularExpression Id. */
  int TYPES = 21;
  /** RegularExpression Id. */
  int EITHER = 22;
  /** RegularExpression Id. */
  int CONSTANTS = 23;
  /** RegularExpression Id. */
  int PREDICATES = 24;
  /** RegularExpression Id. */
  int FUNCTIONS = 25;
  /** RegularExpression Id. */
  int ACTION = 26;
  /** RegularExpression Id. */
  int DURATIVE_ACTION = 27;
  /** RegularExpression Id. */
  int PARAMETERS = 28;
  /** RegularExpression Id. */
  int DURATION = 29;
  /** RegularExpression Id. */
  int DUR_VAR = 30;
  /** RegularExpression Id. */
  int PRECONDITION = 31;
  /** RegularExpression Id. */
  int CONDITION = 32;
  /** RegularExpression Id. */
  int EFFECT = 33;
  /** RegularExpression Id. */
  int AT = 34;
  /** RegularExpression Id. */
  int AT_TIL = 35;
  /** RegularExpression Id. */
  int AND = 36;
  /** RegularExpression Id. */
  int OR = 37;
  /** RegularExpression Id. */
  int NOT = 38;
  /** RegularExpression Id. */
  int IMPLY = 39;
  /** RegularExpression Id. */
  int OVER_ALL = 40;
  /** RegularExpression Id. */
  int AT_START = 41;
  /** RegularExpression Id. */
  int AT_END = 42;
  /** RegularExpression Id. */
  int FOR_ALL = 43;
  /** RegularExpression Id. */
  int EXISTS = 44;
  /** RegularExpression Id. */
  int WHEN = 45;
  /** RegularExpression Id. */
  int EQUALS = 46;
  /** RegularExpression Id. */
  int TYPE_IDENT = 47;
  /** RegularExpression Id. */
  int BINARY_OP = 48;
  /** RegularExpression Id. */
  int BINARY_COMP = 49;
  /** RegularExpression Id. */
  int ASSIGN_OP = 50;
  /** RegularExpression Id. */
  int OPTIMIZATION = 51;
  /** RegularExpression Id. */
  int TOTAL_TIME = 52;
  /** RegularExpression Id. */
  int NUMBER_TYPE = 53;
  /** RegularExpression Id. */
  int VAR = 54;
  /** RegularExpression Id. */
  int ALWAYS = 55;
  /** RegularExpression Id. */
  int SOMETIME = 56;
  /** RegularExpression Id. */
  int WITHIN = 57;
  /** RegularExpression Id. */
  int AT_MOST_ONCE = 58;
  /** RegularExpression Id. */
  int SOMETIME_AFTER = 59;
  /** RegularExpression Id. */
  int SOMETIME_BEFORE = 60;
  /** RegularExpression Id. */
  int ALWAYS_WITHIN = 61;
  /** RegularExpression Id. */
  int HOLD_DURING = 62;
  /** RegularExpression Id. */
  int HOLD_AFTER = 63;
  /** RegularExpression Id. */
  int NUMBER = 64;
  /** RegularExpression Id. */
  int NAME = 65;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 66;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"(\"",
    "\")\"",
    "\"define\"",
    "\"domain\"",
    "\":domain\"",
    "\":objects\"",
    "\":goal\"",
    "\":init\"",
    "\":metric\"",
    "\"problem\"",
    "\":requirements\"",
    "\":constraints\"",
    "\"preference\"",
    "<REQUIREMENT_LABELS>",
    "<NON_HANDLED_LABELS>",
    "<PDDL_1_7_LABELS>",
    "\":types\"",
    "\"either\"",
    "\":constants\"",
    "\":predicates\"",
    "\":functions\"",
    "\":action\"",
    "\":durative-action\"",
    "\":parameters\"",
    "\":duration\"",
    "\"?duration\"",
    "\":precondition\"",
    "\":condition\"",
    "\":effect\"",
    "\": at\"",
    "\"at <NUMBER>\"",
    "\"and\"",
    "\"or\"",
    "\"not\"",
    "\"imply\"",
    "\"over all\"",
    "\"at start\"",
    "\"at end\"",
    "\"forall\"",
    "\"exists\"",
    "\"when\"",
    "\"=\"",
    "\"-\"",
    "<BINARY_OP>",
    "<BINARY_COMP>",
    "<ASSIGN_OP>",
    "<OPTIMIZATION>",
    "\"total-time\"",
    "\"number\"",
    "<VAR>",
    "\"always\"",
    "\"sometime\"",
    "\"within\"",
    "\"at-most-once\"",
    "\"sometime-after\"",
    "\"sometime-before\"",
    "\"always-within\"",
    "\"hold-during\"",
    "\"hold-after\"",
    "<NUMBER>",
    "<NAME>",
    "<SINGLE_LINE_COMMENT>",
  };

}
