/*
* generated by Xtext
*/
package org.eclipse.xtext.common.types.xtext.ui;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RefactoringTestLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipse.xtext.common.types.tests.AbstractActivator.getInstance().getInjector("org.eclipse.xtext.common.types.xtext.ui.RefactoringTestLanguage");
	}
	
}
