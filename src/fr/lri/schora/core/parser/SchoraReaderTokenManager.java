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
 * email  : nhnghia@me.com
 ******************************************************************************/
/* Generated By:JavaCC: Do not edit this line. SchoraReaderTokenManager.java */
package fr.lri.schora.core.parser;
import fr.lri.schora.util.parser.ParserToken;
import fr.lri.schora.define.*;
import fr.lri.schora.core.*;
import fr.lri.schora.core.cmd.*;
import java.util.*;

/** Token Manager. */
public class SchoraReaderTokenManager implements SchoraReaderConstants
{
        static int commentNesting = 0;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa1_2(0x4000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa2_2(active0, 0x4000000L);
      default :
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa3_2(active0, 0x4000000L);
      default :
         return 3;
   }
}
private int jjMoveStringLiteralDfa3_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_2(active0, 0x4000000L);
      default :
         return 4;
   }
}
private int jjMoveStringLiteralDfa4_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_2(active0, 0x4000000L);
      default :
         return 5;
   }
}
private int jjMoveStringLiteralDfa5_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa6_2(active0, 0x4000000L);
      default :
         return 6;
   }
}
private int jjMoveStringLiteralDfa6_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa7_2(active0, 0x4000000L);
      default :
         return 7;
   }
}
private int jjMoveStringLiteralDfa7_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa8_2(active0, 0x4000000L);
      default :
         return 8;
   }
}
private int jjMoveStringLiteralDfa8_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa9_2(active0, 0x4000000L);
      default :
         return 9;
   }
}
private int jjMoveStringLiteralDfa9_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa10_2(active0, 0x4000000L);
      default :
         return 10;
   }
}
private int jjMoveStringLiteralDfa10_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 10;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 10;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa11_2(active0, 0x4000000L);
      default :
         return 11;
   }
}
private int jjMoveStringLiteralDfa11_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 11;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 11;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa12_2(active0, 0x4000000L);
      default :
         return 12;
   }
}
private int jjMoveStringLiteralDfa12_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 12;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 12;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(12, 26);
         break;
      default :
         return 13;
   }
   return 13;
}
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40L) != 0L)
            return 0;
         if ((active0 & 0x3fffc00L) != 0L)
         {
            jjmatchedKind = 28;
            return 6;
         }
         return -1;
      case 1:
         if ((active0 & 0x3fffc00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
            return 6;
         }
         return -1;
      case 2:
         if ((active0 & 0x3ffdc00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 2;
            return 6;
         }
         if ((active0 & 0x2000L) != 0L)
            return 6;
         return -1;
      case 3:
         if ((active0 & 0x400000L) != 0L)
            return 6;
         if ((active0 & 0x3bfdc00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
            return 6;
         }
         return -1;
      case 4:
         if ((active0 & 0x3bfcc00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 4;
            return 6;
         }
         if ((active0 & 0x1000L) != 0L)
            return 6;
         return -1;
      case 5:
         if ((active0 & 0x3bfcc00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 5;
            return 6;
         }
         return -1;
      case 6:
         if ((active0 & 0x3bf4c00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 6;
            return 6;
         }
         if ((active0 & 0x8000L) != 0L)
            return 6;
         return -1;
      case 7:
         if ((active0 & 0x34000L) != 0L)
            return 6;
         if ((active0 & 0x3bc0c00L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 7;
            return 6;
         }
         return -1;
      case 8:
         if ((active0 & 0x800L) != 0L)
            return 6;
         if ((active0 & 0x3bc0400L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 8;
            return 6;
         }
         return -1;
      case 9:
         if ((active0 & 0x40000L) != 0L)
            return 6;
         if ((active0 & 0x3b80400L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 9;
            return 6;
         }
         return -1;
      case 10:
         if ((active0 & 0x80000L) != 0L)
            return 6;
         if ((active0 & 0x3b00400L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 10;
            return 6;
         }
         return -1;
      case 11:
         if ((active0 & 0x800400L) != 0L)
            return 6;
         if ((active0 & 0x3300000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 11;
            return 6;
         }
         return -1;
      case 12:
         if ((active0 & 0x3300000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 12;
            return 6;
         }
         return -1;
      case 13:
         if ((active0 & 0x3000000L) != 0L)
            return 6;
         if ((active0 & 0x300000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 13;
            return 6;
         }
         return -1;
      case 14:
         if ((active0 & 0x300000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 14;
            return 6;
         }
         return -1;
      case 15:
         if ((active0 & 0x100000L) != 0L)
            return 6;
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 15;
            return 6;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x3800000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x402000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x81800L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x338000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x3800000L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 89:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x339000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x80800L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 71:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 6);
         break;
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 89:
         return jjMoveStringLiteralDfa3_0(active0, 0x3800000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x379000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 6);
         break;
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 77:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x3800000L);
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x338000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x4400L);
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x3800000L);
      case 68:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 6);
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x28000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x80800L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x3800000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x300000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 68:
         return jjMoveStringLiteralDfa7_0(active0, 0x2004000L);
      case 71:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 6);
         break;
      case 82:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 83:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x320000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x90000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x1800000L);
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000L);
      case 83:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 6);
         break;
      case 84:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 16, 6);
         break;
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      case 78:
         return jjMoveStringLiteralDfa9_0(active0, 0x800000L);
      case 83:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000L);
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x100000L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa10_0(active0, 0x800000L);
      case 69:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 74:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000000L);
      case 79:
         return jjMoveStringLiteralDfa10_0(active0, 0x400L);
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x100000L);
      case 99:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(9, 18, 6);
         break;
      case 122:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa11_0(active0, 0x800000L);
      case 73:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      case 78:
         return jjMoveStringLiteralDfa11_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa11_0(active0, 0x2000000L);
      case 97:
         return jjMoveStringLiteralDfa11_0(active0, 0x200000L);
      case 98:
         return jjMoveStringLiteralDfa11_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(10, 19, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa12_0(active0, 0x2000000L);
      case 82:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(11, 23, 6);
         break;
      case 83:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(11, 10, 6);
         break;
      case 86:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000L);
      case 98:
         return jjMoveStringLiteralDfa12_0(active0, 0x200000L);
      case 108:
         return jjMoveStringLiteralDfa12_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa13_0(active0, 0x1000000L);
      case 78:
         return jjMoveStringLiteralDfa13_0(active0, 0x2000000L);
      case 101:
         return jjMoveStringLiteralDfa13_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa13_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 82:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(13, 24, 6);
         break;
      case 83:
         return jjMoveStringLiteralDfa14_0(active0, 0x100000L);
      case 84:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(13, 25, 6);
         break;
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa15_0(active0, 0x200000L);
      case 84:
         return jjMoveStringLiteralDfa15_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 71:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(15, 20, 6);
         break;
      case 84:
         return jjMoveStringLiteralDfa16_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 71:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(16, 21, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAdd(6);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 6:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(6);
                  break;
               case 1:
                  jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x200L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 47:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   1, 2, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, 
"\104\105\103\114\101\122\101\124\111\117\116\123", "\143\157\155\160\157\156\145\156\164", "\143\150\157\162\104", 
"\123\124\107", "\103\117\115\115\101\116\104\123", "\163\150\157\167\123\124\107", 
"\163\150\157\167\124\151\155\145", "\163\150\157\167\123\164\141\164", 
"\160\162\157\152\145\143\164\151\157\156", "\143\157\156\146\157\162\155\141\156\143\145", 
"\163\150\157\167\122\145\141\143\150\141\142\154\145\123\124\107", "\163\150\157\167\122\145\141\154\151\172\141\142\154\145\123\124\107", 
"\123\131\116\103", "\101\123\131\116\103\137\123\105\116\104\105\122", 
"\101\123\131\116\103\137\122\105\103\105\111\126\105\122", "\101\123\131\116\103\137\104\111\123\112\117\111\116\124", 
"\145\156\144\40\143\157\155\160\157\156\145\156\164", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
   "IN_COMPONENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 2, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, 0, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffc01L, 
};
static final long[] jjtoSkip = {
   0x33eL, 
};
static final long[] jjtoMore = {
   0xc0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[7];
private final int[] jjstateSet = new int[14];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public SchoraReaderTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SchoraReaderTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 29)
         {
            jjmatchedKind = 29;
         }
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 7)
         {
            jjmatchedKind = 7;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 27)
         {
            jjmatchedKind = 27;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 8 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                    commentNesting++;
         break;
      case 9 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                    commentNesting--;
            if(commentNesting == 0) {
                SwitchTo(DEFAULT);
            }
         break;
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                  commentNesting++;
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
