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
package fr.lri.schora.define;

public enum COMMUNICATION_MODEL{
	/**
	 * synchronization
	 */
	SYNC,
	/**
	 * asynchronization, which 
	 */
	ASYNC_SENDER, 
	ASYNC_RECEIVER, 
	ASYNC_DISJOINT 
}
