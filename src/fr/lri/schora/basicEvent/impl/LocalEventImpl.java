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
/**
 */
package fr.lri.schora.basicEvent.impl;

import fr.lri.schora.basicEvent.BasicEventPackage;
import fr.lri.schora.basicEvent.LocalEvent;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LocalEventImpl extends BasicEventImpl implements LocalEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicEventPackage.Literals.LOCAL_EVENT;
	}

} //LocalEventImpl
