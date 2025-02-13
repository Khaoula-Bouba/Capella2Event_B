/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.mydsl.myLADsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLADsl.MyLADslPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.myLADsl.MyLADslPackage#getExceptionHandler_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Handler Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler Body</em>' attribute.
   * @see #setHandlerBody(String)
   * @see org.xtext.example.mydsl.myLADsl.MyLADslPackage#getExceptionHandler_HandlerBody()
   * @model
   * @generated
   */
  String getHandlerBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler Body</em>' attribute.
   * @see #getHandlerBody()
   * @generated
   */
  void setHandlerBody(String value);

  /**
   * Returns the value of the '<em><b>Exception Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Input</em>' attribute.
   * @see #setExceptionInput(String)
   * @see org.xtext.example.mydsl.myLADsl.MyLADslPackage#getExceptionHandler_ExceptionInput()
   * @model
   * @generated
   */
  String getExceptionInput();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Input</em>' attribute.
   * @see #getExceptionInput()
   * @generated
   */
  void setExceptionInput(String value);

  /**
   * Returns the value of the '<em><b>Exception Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Types</em>' attribute.
   * @see #setExceptionTypes(String)
   * @see org.xtext.example.mydsl.myLADsl.MyLADslPackage#getExceptionHandler_ExceptionTypes()
   * @model
   * @generated
   */
  String getExceptionTypes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLADsl.ExceptionHandler#getExceptionTypes <em>Exception Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Types</em>' attribute.
   * @see #getExceptionTypes()
   * @generated
   */
  void setExceptionTypes(String value);

} // ExceptionHandler
