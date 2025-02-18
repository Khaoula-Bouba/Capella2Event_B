/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.eventBDSL.eventBDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.eventBDSL.eventBDSL.EventBDSLPackage;
import org.xtext.example.eventBDSL.eventBDSL.Invariant1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.eventBDSL.eventBDSL.impl.Invariant1Impl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.eventBDSL.eventBDSL.impl.Invariant1Impl#getTypagePredicates <em>Typage Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Invariant1Impl extends MinimalEObjectImpl.Container implements Invariant1
{
  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypagePredicates() <em>Typage Predicates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypagePredicates()
   * @generated
   * @ordered
   */
  protected EList<EObject> typagePredicates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Invariant1Impl()
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
    return EventBDSLPackage.Literals.INVARIANT1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventBDSLPackage.INVARIANT1__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getTypagePredicates()
  {
    if (typagePredicates == null)
    {
      typagePredicates = new EObjectContainmentEList<EObject>(EObject.class, this, EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES);
    }
    return typagePredicates;
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
      case EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES:
        return ((InternalEList<?>)getTypagePredicates()).basicRemove(otherEnd, msgs);
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
      case EventBDSLPackage.INVARIANT1__COMMENT:
        return getComment();
      case EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES:
        return getTypagePredicates();
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
      case EventBDSLPackage.INVARIANT1__COMMENT:
        setComment((String)newValue);
        return;
      case EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES:
        getTypagePredicates().clear();
        getTypagePredicates().addAll((Collection<? extends EObject>)newValue);
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
      case EventBDSLPackage.INVARIANT1__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES:
        getTypagePredicates().clear();
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
      case EventBDSLPackage.INVARIANT1__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case EventBDSLPackage.INVARIANT1__TYPAGE_PREDICATES:
        return typagePredicates != null && !typagePredicates.isEmpty();
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //Invariant1Impl
