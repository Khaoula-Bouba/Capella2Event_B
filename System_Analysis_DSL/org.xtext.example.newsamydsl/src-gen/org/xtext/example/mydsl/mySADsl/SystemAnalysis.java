/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.mydsl.mySADsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getArchitectureId <em>Architecture Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getSid <em>Sid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getReview <em>Review</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedFunctionPkg <em>Owned Function Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedFunctionalLinks <em>Owned Functional Links</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedFunctionalAllocations <em>Owned Functional Allocations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedSystemComponentPkg <em>Owned System Component Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedMissionPkg <em>Owned Mission Pkg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedOperationalAnalysisRealizations <em>Owned Operational Analysis Realizations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis()
 * @model
 * @generated
 */
public interface SystemAnalysis extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Architecture Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture Id</em>' attribute.
   * @see #setArchitectureId(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_ArchitectureId()
   * @model
   * @generated
   */
  String getArchitectureId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getArchitectureId <em>Architecture Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture Id</em>' attribute.
   * @see #getArchitectureId()
   * @generated
   */
  void setArchitectureId(String value);

  /**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Sid()
   * @model
   * @generated
   */
  String getSid();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getSid <em>Sid</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_VisibleInDoc()
   * @model
   * @generated
   */
  String getVisibleInDoc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getVisibleInDoc <em>Visible In Doc</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_VisibleInLM()
   * @model
   * @generated
   */
  String getVisibleInLM();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getVisibleInLM <em>Visible In LM</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Summary()
   * @model
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getSummary <em>Summary</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getDescription <em>Description</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Review()
   * @model
   * @generated
   */
  String getReview();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getReview <em>Review</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Review</em>' attribute.
   * @see #getReview()
   * @generated
   */
  void setReview(String value);

  /**
   * Returns the value of the '<em><b>Applied Property Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applied Property Values</em>' attribute.
   * @see #setAppliedPropertyValues(String)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_AppliedPropertyValues()
   * @model
   * @generated
   */
  String getAppliedPropertyValues();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getAppliedPropertyValues <em>Applied Property Values</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_AppliedPropertyValueGroups()
   * @model
   * @generated
   */
  String getAppliedPropertyValueGroups();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getStatus <em>Status</em>}' attribute.
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_Features()
   * @model
   * @generated
   */
  String getFeatures();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getFeatures <em>Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' attribute.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(String value);

  /**
   * Returns the value of the '<em><b>Owned Property Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.AbstractPropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Property Values</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedPropertyValues()
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedEnumerationPropertyTypes()
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
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedPropertyValueGroups()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValueGroup> getOwnedPropertyValueGroups();

  /**
   * Returns the value of the '<em><b>Owned Traces</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.Trace}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Traces</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedTraces()
   * @model containment="true"
   * @generated
   */
  EList<Trace> getOwnedTraces();

  /**
   * Returns the value of the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.PropertyValuePkg}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Property Value Pkgs</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedPropertyValuePkgs()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValuePkg> getOwnedPropertyValuePkgs();

  /**
   * Returns the value of the '<em><b>Owned Function Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Function Pkg</em>' containment reference.
   * @see #setOwnedFunctionPkg(SystemFunctionPkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedFunctionPkg()
   * @model containment="true"
   * @generated
   */
  SystemFunctionPkg getOwnedFunctionPkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedFunctionPkg <em>Owned Function Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Function Pkg</em>' containment reference.
   * @see #getOwnedFunctionPkg()
   * @generated
   */
  void setOwnedFunctionPkg(SystemFunctionPkg value);

  /**
   * Returns the value of the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.ComponentExchange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Component Exchanges</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedComponentExchanges()
   * @model containment="true"
   * @generated
   */
  EList<ComponentExchange> getOwnedComponentExchanges();

  /**
   * Returns the value of the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.ComponentExchangeCategory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Component Exchange Categories</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedComponentExchangeCategories()
   * @model containment="true"
   * @generated
   */
  EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories();

  /**
   * Returns the value of the '<em><b>Owned Functional Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.ExchangeLink}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Functional Links</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedFunctionalLinks()
   * @model containment="true"
   * @generated
   */
  EList<ExchangeLink> getOwnedFunctionalLinks();

  /**
   * Returns the value of the '<em><b>Owned Functional Allocations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.ComponentFunctionalAllocation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Functional Allocations</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedFunctionalAllocations()
   * @model containment="true"
   * @generated
   */
  EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocations();

  /**
   * Returns the value of the '<em><b>Owned Component Exchange Realizations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.ComponentExchangeRealization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Component Exchange Realizations</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedComponentExchangeRealizations()
   * @model containment="true"
   * @generated
   */
  EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations();

  /**
   * Returns the value of the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.RequirementsPkg}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Requirement Pkgs</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedRequirementPkgs()
   * @model containment="true"
   * @generated
   */
  EList<RequirementsPkg> getOwnedRequirementPkgs();

  /**
   * Returns the value of the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
   * @see #setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedAbstractCapabilityPkg()
   * @model containment="true"
   * @generated
   */
  AbstractCapabilityPkg getOwnedAbstractCapabilityPkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
   * @see #getOwnedAbstractCapabilityPkg()
   * @generated
   */
  void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg value);

  /**
   * Returns the value of the '<em><b>Owned Interface Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Interface Pkg</em>' containment reference.
   * @see #setOwnedInterfacePkg(InterfacePkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedInterfacePkg()
   * @model containment="true"
   * @generated
   */
  InterfacePkg getOwnedInterfacePkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Interface Pkg</em>' containment reference.
   * @see #getOwnedInterfacePkg()
   * @generated
   */
  void setOwnedInterfacePkg(InterfacePkg value);

  /**
   * Returns the value of the '<em><b>Owned Data Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Data Pkg</em>' containment reference.
   * @see #setOwnedDataPkg(DataPkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedDataPkg()
   * @model containment="true"
   * @generated
   */
  DataPkg getOwnedDataPkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedDataPkg <em>Owned Data Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Data Pkg</em>' containment reference.
   * @see #getOwnedDataPkg()
   * @generated
   */
  void setOwnedDataPkg(DataPkg value);

  /**
   * Returns the value of the '<em><b>Owned System Component Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned System Component Pkg</em>' containment reference.
   * @see #setOwnedSystemComponentPkg(SystemComponentPkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedSystemComponentPkg()
   * @model containment="true"
   * @generated
   */
  SystemComponentPkg getOwnedSystemComponentPkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedSystemComponentPkg <em>Owned System Component Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned System Component Pkg</em>' containment reference.
   * @see #getOwnedSystemComponentPkg()
   * @generated
   */
  void setOwnedSystemComponentPkg(SystemComponentPkg value);

  /**
   * Returns the value of the '<em><b>Owned Mission Pkg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Mission Pkg</em>' containment reference.
   * @see #setOwnedMissionPkg(MissionPkg)
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedMissionPkg()
   * @model containment="true"
   * @generated
   */
  MissionPkg getOwnedMissionPkg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mySADsl.SystemAnalysis#getOwnedMissionPkg <em>Owned Mission Pkg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Mission Pkg</em>' containment reference.
   * @see #getOwnedMissionPkg()
   * @generated
   */
  void setOwnedMissionPkg(MissionPkg value);

  /**
   * Returns the value of the '<em><b>Owned Operational Analysis Realizations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mySADsl.OperationalAnalysisRealization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Operational Analysis Realizations</em>' containment reference list.
   * @see org.xtext.example.mydsl.mySADsl.MySADslPackage#getSystemAnalysis_OwnedOperationalAnalysisRealizations()
   * @model containment="true"
   * @generated
   */
  EList<OperationalAnalysisRealization> getOwnedOperationalAnalysisRealizations();

} // SystemAnalysis
