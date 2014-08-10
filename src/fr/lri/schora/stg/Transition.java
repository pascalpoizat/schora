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
package fr.lri.schora.stg;

import fr.lri.schora.basicEvent.Event;
import fr.lri.schora.expr.BTrue;
import fr.lri.schora.expr.Condition;
import fr.lri.schora.expr.ExprFactory;

public class Transition {
	public State source, destination;
	public Condition guard;
	public Event event;
	
	public Transition(State src, State dst,  Event event){
		this.source =src;
		this.destination = dst;
		this.guard = ExprFactory.eINSTANCE.createBTrue();
		this.event = event;
	}
	
	public Transition(State src, State dst, Condition guard, Event event){
		this.source =src;
		this.destination = dst;
		this.guard = guard;
		this.event = event;
	}
	
	public String toString(){
		return String.format("%s --[%s]-%s--> %s", source.name, guard, event, destination.name);
	}

    public String toStgFormat() {
        Condition condition = guard;
        String label = "";
        if ((!(condition instanceof BTrue)) && (condition != null)) {
            label += "[" + condition.toString() + "] ";
        }
        if (event != null) {
            label += event.toDotFormat(); // same format for events in .dot and .stg files
        }
        return String.format("%s -> %s [label=\"%s\"]",source.name, destination.name, label);
    }

	public Condition getGuard() {
		return guard;
	}

	public Event getEvent() {
		return event;
	}
	
}
