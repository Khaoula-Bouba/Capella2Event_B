/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.mydsl.mySADsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSid <em>Sid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getReview <em>Review</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getExchangeSpecifications <em>Exchange Specifications</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getRate <em>Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getOwnedFunctionalExchangeRealizations <em>Owned Functional Exchange Realizations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange()
 * @model
 * @generated
 */
public interface FunctionalExchange extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Sid()
   * @model
   * @generated
   */
  String getSid();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
  void setSid(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible In Doc</em>' attribute.
   * @see #setVisibleInDoc(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_VisibleInDoc()
   * @model
   * @generated
   */
  String getVisibleInDoc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getVisibleInDoc <em>Visible In Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible In Doc</em>' attribute.
   * @see #getVisibleInDoc()
   * @generated
   */
  void setVisibleInDoc(String value);

  /**
   * Returns the value of the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible In LM</em>' attribute.
   * @see #setVisibleInLM(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_VisibleInLM()
   * @model
   * @generated
   */
  String getVisibleInLM();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getVisibleInLM <em>Visible In LM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible In LM</em>' attribute.
   * @see #getVisibleInLM()
   * @generated
   */
  void setVisibleInLM(String value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Summary()
   * @model
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSummary <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' attribute.
   * @see #getSummary()
   * @generated
   */
  void setSummary(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Review</em>' attribute.
   * @see #setReview(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Review()
   * @model
   * @generated
   */
  String getReview();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getReview <em>Review</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Review</em>' attribute.
   * @see #getReview()
   * @generated
   */
  void setReview(String value);

  /**
   * Returns the value of the '<em><b>Kind Of Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind Of Rate</em>' attribute.
   * @see #setKindOfRate(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_KindOfRate()
   * @model
   * @generated
   */
  String getKindOfRate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getKindOfRate <em>Kind Of Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind Of Rate</em>' attribute.
   * @see #getKindOfRate()
   * @generated
   */
  void setKindOfRate(String value);

  /**
   * Returns the value of the '<em><b>Applied Property Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applied Property Values</em>' attribute.
   * @see #setAppliedPropertyValues(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_AppliedPropertyValues()
   * @model
   * @generated
   */
  String getAppliedPropertyValues();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getAppliedPropertyValues <em>Applied Property Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applied Property Values</em>' attribute.
   * @see #getAppliedPropertyValues()
   * @generated
   */
  void setAppliedPropertyValues(String value);

  /**
   * Returns the value of the '<em><b>Applied Property Value Groups</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applied Property Value Groups</em>' attribute.
   * @see #setAppliedPropertyValueGroups(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_AppliedPropertyValueGroups()
   * @model
   * @generated
   */
  String getAppliedPropertyValueGroups();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applied Property Value Groups</em>' attribute.
   * @see #getAppliedPropertyValueGroups()
   * @generated
   */
  void setAppliedPropertyValueGroups(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' attribute.
   * @see #setFeatures(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Features()
   * @model
   * @generated
   */
  String getFeatures();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getFeatures <em>Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' attribute.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(String value);

  /**
   * Returns the value of the '<em><b>Realized Flow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realized Flow</em>' attribute.
   * @see #setRealizedFlow(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_RealizedFlow()
   * @model
   * @generated
   */
  String getRealizedFlow();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getRealizedFlow <em>Realized Flow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realized Flow</em>' attribute.
   * @see #getRealizedFlow()
   * @generated
   */
  void setRealizedFlow(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Interrupts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interrupts</em>' attribute.
   * @see #setInterrupts(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Interrupts()
   * @model
   * @generated
   */
  String getInterrupts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getInterrupts <em>Interrupts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interrupts</em>' attribute.
   * @see #getInterrupts()
   * @generated
   */
  void setInterrupts(String value);

  /**
   * Returns the value of the '<em><b>Transformation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' attribute.
   * @see #setTransformation(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Transformation()
   * @model
   * @generated
   */
  String getTransformation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getTransformation <em>Transformation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation</em>' attribute.
   * @see #getTransformation()
   * @generated
   */
  void setTransformation(String value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' attribute.
   * @see #setSelection(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Selection()
   * @model
   * @generated
   */
  String getSelection();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getSelection <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' attribute.
   * @see #getSelection()
   * @generated
   */
  void setSelection(String value);

  /**
   * Returns the value of the '<em><b>Exchange Specifications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exchange Specifications</em>' attribute.
   * @see #setExchangeSpecifications(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_ExchangeSpecifications()
   * @model
   * @generated
   */
  String getExchangeSpecifications();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getExchangeSpecifications <em>Exchange Specifications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exchange Specifications</em>' attribute.
   * @see #getExchangeSpecifications()
   * @generated
   */
  void setExchangeSpecifications(String value);

  /**
   * Returns the value of the '<em><b>Exchanged Items</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exchanged Items</em>' attribute.
   * @see #setExchangedItems(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_ExchangedItems()
   * @model
   * @generated
   */
  String getExchangedItems();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getExchangedItems <em>Exchanged Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exchanged Items</em>' attribute.
   * @see #getExchangedItems()
   * @generated
   */
  void setExchangedItems(String value);

  /**
   * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Multicast</em>' attribute.
   * @see #setIsMulticast(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_IsMulticast()
   * @model
   * @generated
   */
  String getIsMulticast();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getIsMulticast <em>Is Multicast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Multicast</em>' attribute.
   * @see #getIsMulticast()
   * @generated
   */
  void setIsMulticast(String value);

  /**
   * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Multireceive</em>' attribute.
   * @see #setIsMultireceive(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_IsMultireceive()
   * @model
   * @generated
   */
  String getIsMultireceive();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getIsMultireceive <em>Is Multireceive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Multireceive</em>' attribute.
   * @see #getIsMultireceive()
   * @generated
   */
  void setIsMultireceive(String value);

  /**
   * Returns the value of the '<em><b>Owned Property Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.AbstractPropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Property Values</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_OwnedPropertyValues()
   * @model containment="true"
   * @generated
   */
  EList<AbstractPropertyValue> getOwnedPropertyValues();

  /**
   * Returns the value of the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.EnumerationPropertyType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Enumeration Property Types</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_OwnedEnumerationPropertyTypes()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes();

  /**
   * Returns the value of the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.PropertyValueGroup}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Property Value Groups</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_OwnedPropertyValueGroups()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValueGroup> getOwnedPropertyValueGroups();

  /**
   * Returns the value of the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' containment reference.
   * @see #setRate(ValueSpecification)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Rate()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getRate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(ValueSpecification value);

  /**
   * Returns the value of the '<em><b>Probability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' containment reference.
   * @see #setProbability(ValueSpecification)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Probability()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getProbability();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getProbability <em>Probability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' containment reference.
   * @see #getProbability()
   * @generated
   */
  void setProbability(ValueSpecification value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(ValueSpecification)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Guard()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getGuard();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(ValueSpecification value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' containment reference.
   * @see #setWeight(ValueSpecification)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_Weight()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getWeight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.FunctionalExchange#getWeight <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' containment reference.
   * @see #getWeight()
   * @generated
   */
  void setWeight(ValueSpecification value);

  /**
   * Returns the value of the '<em><b>Owned Functional Exchange Realizations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.FunctionalExchangeRealization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Functional Exchange Realizations</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getFunctionalExchange_OwnedFunctionalExchangeRealizations()
   * @model containment="true"
   * @generated
   */
  EList<FunctionalExchangeRealization> getOwnedFunctionalExchangeRealizations();

} // FunctionalExchange
