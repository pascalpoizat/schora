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
package fr.lri.schora.stg.dot;

import java.util.ArrayList;
import java.util.List;

import fr.lri.schora.util.parser.ParserToken;

public class DOT {
    public List<String> states;    //name
    public List<String> stateLabels;
    public List<String> startStates;
    public List<String> endStates;
    public List<ParserToken> labels;

    public DOT() {
        states = new ArrayList<String>();
        stateLabels = new ArrayList<String>();
        startStates = new ArrayList<String>();
        endStates = new ArrayList<String>();
        labels = new ArrayList<ParserToken>();
    }

    @Override
    public String toString() {
        String rtr = "";
        int n = states.size();
        for (int i = 0; i < n; i++) {
            rtr += String.format("%s [label=\"%s\"];\n", states.get(i), stateLabels.get(i));
        }
        n = startStates.size();
        for (int i = 0; i < n; i++) {
            rtr += String.format("%s -> %s [label=\"%s\"];\n",startStates.get(i),endStates.get(i),labels.get(i));
        }
        return rtr;
    }

    public void print() {
        System.out.println(this.toString());
    }
}
