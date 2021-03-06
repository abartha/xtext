/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types.impl;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.impl.ClassURIHelper;
import org.eclipse.xtext.common.types.util.ITypeReferenceVisitor;
import org.eclipse.xtext.common.types.util.ITypeReferenceVisitorWithParameter;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class JvmAnyTypeReferenceImplCustom extends JvmAnyTypeReferenceImpl {

	/**
	 * {@inheritDoc}
	 * 
	 * Returns the value of the 'Type' reference. If there is no type set, 
	 * a reference to <code>java.lang.Object</code> is assumed.
	 */
	@Override
	public JvmType getType() {
		if (type == null) {
			JvmGenericType objectType = TypesFactory.eINSTANCE.createJvmGenericType();
			((InternalEObject) objectType).eSetProxyURI(new ClassURIHelper().getFullURI(Object.class));
			setType(objectType);
		}
		return super.getType();
	}
	
	@Override
	public <Result> Result accept(ITypeReferenceVisitor<Result> visitor) {
		Result result = visitor.doVisitAnyTypeReference(this);
		return result;
	}
	
	@Override
	public <Parameter, Result> Result accept(ITypeReferenceVisitorWithParameter<Parameter,Result> visitor, Parameter parameter) {
		Result result = visitor.doVisitAnyTypeReference(this, parameter);
		return result;
	}
	
	/**
	 * The identifier of a {@link org.eclipse.xtext.common.types.JvmAnyTypeReference JvmAnyTypeReference} 
	 * is always "<code>null</code>".
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public String getIdentifier() {
		return "null";
	}
	
	/**
	 * The simple name of a {@link org.eclipse.xtext.common.types.JvmAnyTypeReference JvmAnyTypeReference} 
	 * is always "<code>null</code>".
	 */
	@Override
	public String getSimpleName() {
		return "null";
	}
	
	/**
	 * The qualified name of a {@link org.eclipse.xtext.common.types.JvmAnyTypeReference JvmAnyTypeReference} 
	 * is always "<code>null</code>".
	 */
	@Override
	public String getQualifiedName(char innerClassDelimiter) {
		return "null";
	}
	
	@Override
	public String toString() {
		return eClass().getName();
	}
	
}
