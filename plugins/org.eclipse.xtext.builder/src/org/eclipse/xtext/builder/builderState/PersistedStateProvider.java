/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.builder.builderState;

import org.eclipse.xtext.resource.IResourceDescription;

import com.google.inject.ImplementedBy;

@ImplementedBy(EMFBasedPersister.class)
public interface PersistedStateProvider {
	
	Iterable<IResourceDescription> load();
	
}