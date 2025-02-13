/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.mydsl.myLADsl.impl;

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

import org.xtext.example.mydsl.myLADsl.AbstractPropertyValue;
import org.xtext.example.mydsl.myLADsl.CommunicationLink;
import org.xtext.example.mydsl.myLADsl.EnumerationPropertyType;
import org.xtext.example.mydsl.myLADsl.MyLADslPackage;
import org.xtext.example.mydsl.myLADsl.PropertyValueGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getExchangeItem <em>Exchange Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLADsl.impl.CommunicationLinkImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkImpl extends MinimalEObjectImpl.Container implements CommunicationLink
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
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final String KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected String kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final String PROTOCOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected String protocol = PROTOCOL_EDEFAULT;

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
   * The default value of the '{@link #getExchangeItem() <em>Exchange Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExchangeItem()
   * @generated
   * @ordered
   */
  protected static final String EXCHANGE_ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExchangeItem() <em>Exchange Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExchangeItem()
   * @generated
   * @ordered
   */
  protected String exchangeItem = EXCHANGE_ITEM_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommunicationLinkImpl()
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
    return MyLADslPackage.eINSTANCE.getCommunicationLink();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__SID, oldSid, sid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__SUMMARY, oldSummary, summary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__REVIEW, oldReview, review));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKind(String newKind)
  {
    String oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProtocol(String newProtocol)
  {
    String oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__PROTOCOL, oldProtocol, protocol));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES, oldAppliedPropertyValues, appliedPropertyValues));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS, oldAppliedPropertyValueGroups, appliedPropertyValueGroups));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__STATUS, oldStatus, status));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__FEATURES, oldFeatures, features));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExchangeItem()
  {
    return exchangeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExchangeItem(String newExchangeItem)
  {
    String oldExchangeItem = exchangeItem;
    exchangeItem = newExchangeItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLADslPackage.COMMUNICATION_LINK__EXCHANGE_ITEM, oldExchangeItem, exchangeItem));
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
      ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES);
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
      ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES);
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
      ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS);
    }
    return ownedPropertyValueGroups;
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
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
        return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
        return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
        return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
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
      case MyLADslPackage.COMMUNICATION_LINK__TYPE:
        return getType();
      case MyLADslPackage.COMMUNICATION_LINK__ID:
        return getId();
      case MyLADslPackage.COMMUNICATION_LINK__SID:
        return getSid();
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
        return getVisibleInDoc();
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
        return getVisibleInLM();
      case MyLADslPackage.COMMUNICATION_LINK__SUMMARY:
        return getSummary();
      case MyLADslPackage.COMMUNICATION_LINK__DESCRIPTION:
        return getDescription();
      case MyLADslPackage.COMMUNICATION_LINK__REVIEW:
        return getReview();
      case MyLADslPackage.COMMUNICATION_LINK__KIND:
        return getKind();
      case MyLADslPackage.COMMUNICATION_LINK__PROTOCOL:
        return getProtocol();
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
        return getAppliedPropertyValues();
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
        return getAppliedPropertyValueGroups();
      case MyLADslPackage.COMMUNICATION_LINK__STATUS:
        return getStatus();
      case MyLADslPackage.COMMUNICATION_LINK__FEATURES:
        return getFeatures();
      case MyLADslPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
        return getExchangeItem();
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
        return getOwnedPropertyValues();
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
        return getOwnedEnumerationPropertyTypes();
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
        return getOwnedPropertyValueGroups();
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
      case MyLADslPackage.COMMUNICATION_LINK__TYPE:
        setType((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__ID:
        setId((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__SID:
        setSid((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
        setVisibleInDoc((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
        setVisibleInLM((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__SUMMARY:
        setSummary((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__REVIEW:
        setReview((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__KIND:
        setKind((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__PROTOCOL:
        setProtocol((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
        setAppliedPropertyValues((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
        setAppliedPropertyValueGroups((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__STATUS:
        setStatus((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__FEATURES:
        setFeatures((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
        setExchangeItem((String)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
        getOwnedPropertyValues().clear();
        getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
        getOwnedEnumerationPropertyTypes().clear();
        getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
        getOwnedPropertyValueGroups().clear();
        getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
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
      case MyLADslPackage.COMMUNICATION_LINK__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__ID:
        setId(ID_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__SID:
        setSid(SID_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
        setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
        setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__REVIEW:
        setReview(REVIEW_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
        setAppliedPropertyValues(APPLIED_PROPERTY_VALUES_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
        setAppliedPropertyValueGroups(APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__FEATURES:
        setFeatures(FEATURES_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
        setExchangeItem(EXCHANGE_ITEM_EDEFAULT);
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
        getOwnedPropertyValues().clear();
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
        getOwnedEnumerationPropertyTypes().clear();
        return;
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
        getOwnedPropertyValueGroups().clear();
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
      case MyLADslPackage.COMMUNICATION_LINK__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MyLADslPackage.COMMUNICATION_LINK__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyLADslPackage.COMMUNICATION_LINK__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
        return VISIBLE_IN_DOC_EDEFAULT == null ? visibleInDoc != null : !VISIBLE_IN_DOC_EDEFAULT.equals(visibleInDoc);
      case MyLADslPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
        return VISIBLE_IN_LM_EDEFAULT == null ? visibleInLM != null : !VISIBLE_IN_LM_EDEFAULT.equals(visibleInLM);
      case MyLADslPackage.COMMUNICATION_LINK__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case MyLADslPackage.COMMUNICATION_LINK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyLADslPackage.COMMUNICATION_LINK__REVIEW:
        return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
      case MyLADslPackage.COMMUNICATION_LINK__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
      case MyLADslPackage.COMMUNICATION_LINK__PROTOCOL:
        return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
        return APPLIED_PROPERTY_VALUES_EDEFAULT == null ? appliedPropertyValues != null : !APPLIED_PROPERTY_VALUES_EDEFAULT.equals(appliedPropertyValues);
      case MyLADslPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
        return APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT == null ? appliedPropertyValueGroups != null : !APPLIED_PROPERTY_VALUE_GROUPS_EDEFAULT.equals(appliedPropertyValueGroups);
      case MyLADslPackage.COMMUNICATION_LINK__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case MyLADslPackage.COMMUNICATION_LINK__FEATURES:
        return FEATURES_EDEFAULT == null ? features != null : !FEATURES_EDEFAULT.equals(features);
      case MyLADslPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
        return EXCHANGE_ITEM_EDEFAULT == null ? exchangeItem != null : !EXCHANGE_ITEM_EDEFAULT.equals(exchangeItem);
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
        return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
        return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
      case MyLADslPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
        return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
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
    result.append(", kind: ");
    result.append(kind);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(", appliedPropertyValues: ");
    result.append(appliedPropertyValues);
    result.append(", appliedPropertyValueGroups: ");
    result.append(appliedPropertyValueGroups);
    result.append(", status: ");
    result.append(status);
    result.append(", features: ");
    result.append(features);
    result.append(", exchangeItem: ");
    result.append(exchangeItem);
    result.append(')');
    return result.toString();
  }

} //CommunicationLinkImpl
