/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.newoamydsl.myDslnew.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.newoamydsl.myDslnew.AbstractPropertyValue;
import org.xtext.example.newoamydsl.myDslnew.Concept;
import org.xtext.example.newoamydsl.myDslnew.ConceptPkg;
import org.xtext.example.newoamydsl.myDslnew.EnumerationPropertyType;
import org.xtext.example.newoamydsl.myDslnew.MyDslnewPackage;
import org.xtext.example.newoamydsl.myDslnew.PropertyValueGroup;
import org.xtext.example.newoamydsl.myDslnew.PropertyValuePkg;
import org.xtext.example.newoamydsl.myDslnew.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedConceptPkgs <em>Owned Concept Pkgs</em>}</li>
 *   <li>{@link org.xtext.example.newoamydsl.myDslnew.impl.ConceptPkgImpl#getOwnedConcepts <em>Owned Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptPkgImpl extends MinimalEObjectImpl.Container implements ConceptPkg
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
  protected static final String SID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
  protected String sid = SID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibleInDoc() <em>Visible In Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibleInDoc()
   * @generated
   * @ordered
   */
  protected static final String VISIBLE_IN_DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisibleInDoc() <em>Visible In Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibleInDoc()
   * @generated
   * @ordered
   */
  protected String visibleInDoc = VISIBLE_IN_DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibleInLM() <em>Visible In LM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibleInLM()
   * @generated
   * @ordered
   */
  protected static final String VISIBLE_IN_LM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisibleInLM() <em>Visible In LM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibleInLM()
   * @generated
   * @ordered
   */
  protected String visibleInLM = VISIBLE_IN_LM_EDEFAULT;

  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReview()
   * @generated
   * @ordered
   */
  protected static final String REVIEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReview()
   * @generated
   * @ordered
   */
  protected String review = REVIEW_EDEFAULT;

  /**
   * The default value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedPropertyValues()
   * @generated
   * @ordered
   */
  protected static final String APPLIED_PROPERTY_VALUES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedPropertyValues()
   * @generated
   * @ordered
   */
  protected String appliedPropertyValues = APPLIED_PROPERTY_VALUES_EDEFAULT;

  /**
   * The default value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedPropertyValueGroups()
   * @generated
   * @ordered
   */
  protected static final String APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedPropertyValueGroups()
   * @generated
   * @ordered
   */
  protected String appliedPropertyValueGroups = APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatures() <em>Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected static final String FEATURES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected String features = FEATURES_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPropertyValues()
   * @generated
   * @ordered
   */
  protected EList<AbstractPropertyValue> ownedPropertyValues;

  /**
   * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEnumerationPropertyTypes()
   * @generated
   * @ordered
   */
  protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

  /**
   * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPropertyValueGroups()
   * @generated
   * @ordered
   */
  protected EList<PropertyValueGroup> ownedPropertyValueGroups;

  /**
   * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTraces()
   * @generated
   * @ordered
   */
  protected EList<Trace> ownedTraces;

  /**
   * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPropertyValuePkgs()
   * @generated
   * @ordered
   */
  protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

  /**
   * The cached value of the '{@link #getOwnedConceptPkgs() <em>Owned Concept Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedConceptPkgs()
   * @generated
   * @ordered
   */
  protected EList<ConceptPkg> ownedConceptPkgs;

  /**
   * The cached value of the '{@link #getOwnedConcepts() <em>Owned Concepts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedConcepts()
   * @generated
   * @ordered
   */
  protected EList<Concept> ownedConcepts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConceptPkgImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslnewPackage.eINSTANCE.getConceptPkg();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSid()
  {
    return sid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSid(String newSid)
  {
    String oldSid = sid;
    sid = newSid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__SID, oldSid, sid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVisibleInDoc()
  {
    return visibleInDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibleInDoc(String newVisibleInDoc)
  {
    String oldVisibleInDoc = visibleInDoc;
    visibleInDoc = newVisibleInDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVisibleInLM()
  {
    return visibleInLM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibleInLM(String newVisibleInLM)
  {
    String oldVisibleInLM = visibleInLM;
    visibleInLM = newVisibleInLM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReview()
  {
    return review;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReview(String newReview)
  {
    String oldReview = review;
    review = newReview;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__REVIEW, oldReview, review));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAppliedPropertyValues()
  {
    return appliedPropertyValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppliedPropertyValues(String newAppliedPropertyValues)
  {
    String oldAppliedPropertyValues = appliedPropertyValues;
    appliedPropertyValues = newAppliedPropertyValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUES, oldAppliedPropertyValues, appliedPropertyValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAppliedPropertyValueGroups()
  {
    return appliedPropertyValueGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppliedPropertyValueGroups(String newAppliedPropertyValueGroups)
  {
    String oldAppliedPropertyValueGroups = appliedPropertyValueGroups;
    appliedPropertyValueGroups = newAppliedPropertyValueGroups;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUE_GROUPS, oldAppliedPropertyValueGroups, appliedPropertyValueGroups));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFeatures()
  {
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFeatures(String newFeatures)
  {
    String oldFeatures = features;
    features = newFeatures;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslnewPackage.CONCEPT_PKG__FEATURES, oldFeatures, features));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractPropertyValue> getOwnedPropertyValues()
  {
    if (ownedPropertyValues == null)
    {
      ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES);
    }
    return ownedPropertyValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes()
  {
    if (ownedEnumerationPropertyTypes == null)
    {
      ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES);
    }
    return ownedEnumerationPropertyTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyValueGroup> getOwnedPropertyValueGroups()
  {
    if (ownedPropertyValueGroups == null)
    {
      ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS);
    }
    return ownedPropertyValueGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Trace> getOwnedTraces()
  {
    if (ownedTraces == null)
    {
      ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES);
    }
    return ownedTraces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyValuePkg> getOwnedPropertyValuePkgs()
  {
    if (ownedPropertyValuePkgs == null)
    {
      ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS);
    }
    return ownedPropertyValuePkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConceptPkg> getOwnedConceptPkgs()
  {
    if (ownedConceptPkgs == null)
    {
      ownedConceptPkgs = new EObjectContainmentEList<ConceptPkg>(ConceptPkg.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS);
    }
    return ownedConceptPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Concept> getOwnedConcepts()
  {
    if (ownedConcepts == null)
    {
      ownedConcepts = new EObjectContainmentEList<Concept>(Concept.class, this, MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS);
    }
    return ownedConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES:
        return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
        return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS:
        return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES:
        return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
        return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
        return ((InternalEList<?>)getOwnedConceptPkgs()).basicRemove(otherEnd, msgs);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS:
        return ((InternalEList<?>)getOwnedConcepts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslnewPackage.CONCEPT_PKG__TYPE:
        return getType();
      case MyDslnewPackage.CONCEPT_PKG__ID:
        return getId();
      case MyDslnewPackage.CONCEPT_PKG__SID:
        return getSid();
      case MyDslnewPackage.CONCEPT_PKG__NAME:
        return getName();
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_DOC:
        return getVisibleInDoc();
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_LM:
        return getVisibleInLM();
      case MyDslnewPackage.CONCEPT_PKG__SUMMARY:
        return getSummary();
      case MyDslnewPackage.CONCEPT_PKG__DESCRIPTION:
        return getDescription();
      case MyDslnewPackage.CONCEPT_PKG__REVIEW:
        return getReview();
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUES:
        return getAppliedPropertyValues();
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
        return getAppliedPropertyValueGroups();
      case MyDslnewPackage.CONCEPT_PKG__STATUS:
        return getStatus();
      case MyDslnewPackage.CONCEPT_PKG__FEATURES:
        return getFeatures();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES:
        return getOwnedPropertyValues();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
        return getOwnedEnumerationPropertyTypes();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS:
        return getOwnedPropertyValueGroups();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES:
        return getOwnedTraces();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
        return getOwnedPropertyValuePkgs();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
        return getOwnedConceptPkgs();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS:
        return getOwnedConcepts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslnewPackage.CONCEPT_PKG__TYPE:
        setType((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__ID:
        setId((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__SID:
        setSid((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__NAME:
        setName((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_DOC:
        setVisibleInDoc((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_LM:
        setVisibleInLM((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__SUMMARY:
        setSummary((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__REVIEW:
        setReview((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUES:
        setAppliedPropertyValues((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
        setAppliedPropertyValueGroups((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__STATUS:
        setStatus((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__FEATURES:
        setFeatures((String)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES:
        getOwnedPropertyValues().clear();
        getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
        getOwnedEnumerationPropertyTypes().clear();
        getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS:
        getOwnedPropertyValueGroups().clear();
        getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES:
        getOwnedTraces().clear();
        getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
        getOwnedPropertyValuePkgs().clear();
        getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
        getOwnedConceptPkgs().clear();
        getOwnedConceptPkgs().addAll((Collection<? extends ConceptPkg>)newValue);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS:
        getOwnedConcepts().clear();
        getOwnedConcepts().addAll((Collection<? extends Concept>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslnewPackage.CONCEPT_PKG__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__ID:
        setId(ID_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__SID:
        setSid(SID_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_DOC:
        setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_LM:
        setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__REVIEW:
        setReview(REVIEW_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUES:
        setAppliedPropertyValues(APPLIED_PROPERTY_VALUES_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
        setAppliedPropertyValueGroups(APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__FEATURES:
        setFeatures(FEATURES_EDEFAULT);
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES:
        getOwnedPropertyValues().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
        getOwnedEnumerationPropertyTypes().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS:
        getOwnedPropertyValueGroups().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES:
        getOwnedTraces().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
        getOwnedPropertyValuePkgs().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
        getOwnedConceptPkgs().clear();
        return;
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS:
        getOwnedConcepts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslnewPackage.CONCEPT_PKG__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MyDslnewPackage.CONCEPT_PKG__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyDslnewPackage.CONCEPT_PKG__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case MyDslnewPackage.CONCEPT_PKG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_DOC:
        return VISIBLE_IN_DOC_EDEFAULT == null ? visibleInDoc != null : !VISIBLE_IN_DOC_EDEFAULT.equals(visibleInDoc);
      case MyDslnewPackage.CONCEPT_PKG__VISIBLE_IN_LM:
        return VISIBLE_IN_LM_EDEFAULT == null ? visibleInLM != null : !VISIBLE_IN_LM_EDEFAULT.equals(visibleInLM);
      case MyDslnewPackage.CONCEPT_PKG__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case MyDslnewPackage.CONCEPT_PKG__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyDslnewPackage.CONCEPT_PKG__REVIEW:
        return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUES:
        return APPLIED_PROPERTY_VALUES_EDEFAULT == null ? appliedPropertyValues != null : !APPLIED_PROPERTY_VALUES_EDEFAULT.equals(appliedPropertyValues);
      case MyDslnewPackage.CONCEPT_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
        return APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT == null ? appliedPropertyValueGroups != null : !APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT.equals(appliedPropertyValueGroups);
      case MyDslnewPackage.CONCEPT_PKG__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case MyDslnewPackage.CONCEPT_PKG__FEATURES:
        return FEATURES_EDEFAULT == null ? features != null : !FEATURES_EDEFAULT.equals(features);
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUES:
        return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
        return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_GROUPS:
        return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_TRACES:
        return ownedTraces != null && !ownedTraces.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
        return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
        return ownedConceptPkgs != null && !ownedConceptPkgs.isEmpty();
      case MyDslnewPackage.CONCEPT_PKG__OWNED_CONCEPTS:
        return ownedConcepts != null && !ownedConcepts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", id: ");
    result.append(id);
    result.append(", sid: ");
    result.append(sid);
    result.append(", name: ");
    result.append(name);
    result.append(", visibleInDoc: ");
    result.append(visibleInDoc);
    result.append(", visibleInLM: ");
    result.append(visibleInLM);
    result.append(", summary: ");
    result.append(summary);
    result.append(", description: ");
    result.append(description);
    result.append(", review: ");
    result.append(review);
    result.append(", appliedPropertyValues: ");
    result.append(appliedPropertyValues);
    result.append(", appliedPropertyValueGroups: ");
    result.append(appliedPropertyValueGroups);
    result.append(", status: ");
    result.append(status);
    result.append(", features: ");
    result.append(features);
    result.append(')');
    return result.toString();
  }

} //ConceptPkgImpl
