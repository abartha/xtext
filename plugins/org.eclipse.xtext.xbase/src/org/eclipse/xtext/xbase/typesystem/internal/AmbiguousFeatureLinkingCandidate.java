/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.typesystem.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.typesystem.computation.IFeatureLinkingCandidate;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@NonNullByDefault
public class AmbiguousFeatureLinkingCandidate extends AbstractAmbiguousLinkingCandidate<FeatureLinkingCandidate> implements IFeatureLinkingCandidate{

	protected AmbiguousFeatureLinkingCandidate(FeatureLinkingCandidate first, AbstractPendingLinkingCandidate<?> second) {
		super(first, second);
	}
	
	@Override
	protected String getSyntaxDescriptions() {
		XExpression expression = getExpression();
		if (expression instanceof XBinaryOperation) {
			return "binary operation";
		} else if (expression instanceof XUnaryOperation) {
			return "unary operation";
		} else {
			return "feature call";
		}
	}
	
	@Override
	protected String getFeatureTypeName() {
		XExpression expression = getExpression();
		if (expression instanceof XBinaryOperation || expression instanceof XUnaryOperation) {
			return "operator declaration";
		}
		if (getPrimaryCandidate().isExtension()) {
			return "extension method";
		}
		return super.getFeatureTypeName();
	}

	public XAbstractFeatureCall getFeatureCall() {
		return getPrimaryCandidate().getFeatureCall();
	}

	public boolean isStatic() {
		return getPrimaryCandidate().isStatic();
	}

	public boolean isExtension() {
		return getPrimaryCandidate().isExtension();
	}

	public boolean isTypeLiteral() {
		return getPrimaryCandidate().isTypeLiteral();
	}
	
	@Override
	protected EStructuralFeature getFeatureToMark() {
		return XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE;
	}

}
