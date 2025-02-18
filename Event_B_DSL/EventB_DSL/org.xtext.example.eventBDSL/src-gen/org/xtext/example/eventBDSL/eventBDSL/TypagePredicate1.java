/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.eventBDSL.eventBDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typage Predicate1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.eventBDSL.eventBDSL.TypagePredicate1#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.eventBDSL.eventBDSL.TypagePredicate1#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.eventBDSL.eventBDSL.EventBDSLPackage#getTypagePredicate1()
 * @model
 * @generated
 */
public interface TypagePredicate1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Variable)
   * @see org.xtext.example.eventBDSL.eventBDSL.EventBDSLPackage#getTypagePredicate1_Name()
   * @model
   * @generated
   */
  Variable getName();

  /**
   * Sets the value of the '{@link org.xtext.example.eventBDSL.eventBDSL.TypagePredicate1#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Set)
   * @see org.xtext.example.eventBDSL.eventBDSL.EventBDSLPackage#getTypagePredicate1_Value()
   * @model
   * @generated
   */
  Set getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.eventBDSL.eventBDSL.TypagePredicate1#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Set value);

} // TypagePredicate1
