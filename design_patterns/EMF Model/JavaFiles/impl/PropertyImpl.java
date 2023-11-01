/**
 */
package factory.ecore.impl;

import factory.ecore.EcorePackage;
import factory.ecore.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.impl.PropertyImpl#isBoolProp <em>Bool Prop</em>}</li>
 *   <li>{@link factory.ecore.impl.PropertyImpl#getStringProp <em>String Prop</em>}</li>
 *   <li>{@link factory.ecore.impl.PropertyImpl#getIntProp <em>Int Prop</em>}</li>
 *   <li>{@link factory.ecore.impl.PropertyImpl#getDoubleProp <em>Double Prop</em>}</li>
 *   <li>{@link factory.ecore.impl.PropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
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
	 * The default value of the '{@link #isBoolProp() <em>Bool Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolProp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_PROP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolProp() <em>Bool Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolProp()
	 * @generated
	 * @ordered
	 */
	protected boolean boolProp = BOOL_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringProp() <em>String Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProp()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringProp() <em>String Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProp()
	 * @generated
	 * @ordered
	 */
	protected String stringProp = STRING_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntProp() <em>Int Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntProp()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_PROP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntProp() <em>Int Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntProp()
	 * @generated
	 * @ordered
	 */
	protected int intProp = INT_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleProp() <em>Double Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleProp()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_PROP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubleProp() <em>Double Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleProp()
	 * @generated
	 * @ordered
	 */
	protected double doubleProp = DOUBLE_PROP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolProp() {
		return boolProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolProp(boolean newBoolProp) {
		boolean oldBoolProp = boolProp;
		boolProp = newBoolProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PROPERTY__BOOL_PROP, oldBoolProp,
					boolProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringProp() {
		return stringProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringProp(String newStringProp) {
		String oldStringProp = stringProp;
		stringProp = newStringProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PROPERTY__STRING_PROP, oldStringProp,
					stringProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntProp() {
		return intProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntProp(int newIntProp) {
		int oldIntProp = intProp;
		intProp = newIntProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PROPERTY__INT_PROP, oldIntProp,
					intProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDoubleProp() {
		return doubleProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoubleProp(double newDoubleProp) {
		double oldDoubleProp = doubleProp;
		doubleProp = newDoubleProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PROPERTY__DOUBLE_PROP, oldDoubleProp,
					doubleProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, EcorePackage.PROPERTY__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.PROPERTY__NAME:
			return getName();
		case EcorePackage.PROPERTY__BOOL_PROP:
			return isBoolProp();
		case EcorePackage.PROPERTY__STRING_PROP:
			return getStringProp();
		case EcorePackage.PROPERTY__INT_PROP:
			return getIntProp();
		case EcorePackage.PROPERTY__DOUBLE_PROP:
			return getDoubleProp();
		case EcorePackage.PROPERTY__PROPERTY:
			return getProperty();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcorePackage.PROPERTY__NAME:
			setName((String) newValue);
			return;
		case EcorePackage.PROPERTY__BOOL_PROP:
			setBoolProp((Boolean) newValue);
			return;
		case EcorePackage.PROPERTY__STRING_PROP:
			setStringProp((String) newValue);
			return;
		case EcorePackage.PROPERTY__INT_PROP:
			setIntProp((Integer) newValue);
			return;
		case EcorePackage.PROPERTY__DOUBLE_PROP:
			setDoubleProp((Double) newValue);
			return;
		case EcorePackage.PROPERTY__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcorePackage.PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcorePackage.PROPERTY__BOOL_PROP:
			setBoolProp(BOOL_PROP_EDEFAULT);
			return;
		case EcorePackage.PROPERTY__STRING_PROP:
			setStringProp(STRING_PROP_EDEFAULT);
			return;
		case EcorePackage.PROPERTY__INT_PROP:
			setIntProp(INT_PROP_EDEFAULT);
			return;
		case EcorePackage.PROPERTY__DOUBLE_PROP:
			setDoubleProp(DOUBLE_PROP_EDEFAULT);
			return;
		case EcorePackage.PROPERTY__PROPERTY:
			getProperty().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcorePackage.PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcorePackage.PROPERTY__BOOL_PROP:
			return boolProp != BOOL_PROP_EDEFAULT;
		case EcorePackage.PROPERTY__STRING_PROP:
			return STRING_PROP_EDEFAULT == null ? stringProp != null : !STRING_PROP_EDEFAULT.equals(stringProp);
		case EcorePackage.PROPERTY__INT_PROP:
			return intProp != INT_PROP_EDEFAULT;
		case EcorePackage.PROPERTY__DOUBLE_PROP:
			return doubleProp != DOUBLE_PROP_EDEFAULT;
		case EcorePackage.PROPERTY__PROPERTY:
			return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", boolProp: ");
		result.append(boolProp);
		result.append(", stringProp: ");
		result.append(stringProp);
		result.append(", intProp: ");
		result.append(intProp);
		result.append(", doubleProp: ");
		result.append(doubleProp);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
