/**
 */
package org.eclipse.xtext.parser.terminalrules.unicode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.terminalrules.unicode.Model#getStrings <em>Strings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.parser.terminalrules.unicode.UnicodePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Strings</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.parser.terminalrules.unicode.AbstractString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strings</em>' containment reference list.
   * @see org.eclipse.xtext.parser.terminalrules.unicode.UnicodePackage#getModel_Strings()
   * @model containment="true"
   * @generated
   */
  EList<AbstractString> getStrings();

} // Model
