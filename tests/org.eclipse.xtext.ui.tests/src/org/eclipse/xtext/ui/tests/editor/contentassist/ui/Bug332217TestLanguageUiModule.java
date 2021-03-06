/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.IProposalConflictHelper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class Bug332217TestLanguageUiModule extends org.eclipse.xtext.ui.tests.editor.contentassist.ui.AbstractBug332217TestLanguageUiModule {
	public Bug332217TestLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * Bind a null implementation to detect wrong elements in the first element set
	 * of the content assist context.
	 */
	@Override
	public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {
		return IProposalConflictHelper.NullHelper.class;
	}
	
}
