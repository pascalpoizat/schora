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
package fr.lri.schora.stg.testCase;


import java.io.StringReader;
import java.util.ArrayList;

import org.junit.Test;

import fr.lri.schora.solver.Z3SMT;
import fr.lri.schora.stg.STG;
import fr.lri.schora.stg.State;
import fr.lri.schora.stg.dot.DOT;
import fr.lri.schora.stg.dot.parser.*;

public class TestParser {

    @Test
    public void test() {
        try {
            // final String fileName = "bin/testCases/STG.dot";
            final String fileName = "/production/schora/fr/lri/schora/stg/testCase/Causality.stg";
            String str = fr.lri.schora.util.File.readFile(fileName);
            System.out.println(str);
            StringReader f = new StringReader(str);
            STGReader parser = new STGReader(f);
            DOT dot = parser.parser();
            System.out.println("DOT");
            dot.print();
        } catch (ParseException ex) {
            Token t = ex.currentToken;
            System.out.println(String.format("Line: %d, Column: %d, Encountered: %s",
                    t.beginLine, t.beginColumn, t.image));
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testDotSGT() {
        String str;
        try {
            // final String fileName = "bin/testCases/STG.dot";
            //final String fileName = "/production/schora/fr/lri/schora/stg/testCase/STG.dot";
            final String fileName = "/production/schora/fr/lri/schora/stg/testCase/Causality.stg";
            // final String z3path = "/Users/nhnghia/soft/z3/bin/z3";
            final String z3path = "/Users/pascalpoizat/Documents/Applications/Downloads/z3/bin/z3";
            str = fr.lri.schora.util.File.readFile(fileName);
            STG d = STG.parser(str);
            System.out.println("STG");
            System.out.println(fr.lri.schora.util.List.toString(d.states, ", "));
            System.out.println(fr.lri.schora.util.List.toString(d.transitions, ","));
            System.out.println("\nSTRING READ\n");
            System.out.println(str);
            System.out.println("\nDOT FORMAT\n");
            System.out.println(d.toDotFormat());
            System.out.println("\nSTG FORMAT\n");
            System.out.println(d.toStgFormat());

            System.out.println("Reachable");
            Z3SMT z3Solver = new Z3SMT(z3path);
            STG s = d.getReachableSTG(z3Solver);
            System.out.println("\nDOT FORMAT\n");
            System.out.println(s.toDotFormat());
            System.out.println("\nSTG FORMAT\n");
            System.out.println(s.toStgFormat());

            System.out.println(d.getRoles(new State("3", "2")));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
