/**
 */
package factory.ecore.impl;

import factory.ecore.EcorePackage;
import factory.ecore.Factory;
import factory.ecore.ISystem;
import factory.ecore.PredictionModel;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#isPro <em>Pro</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getAlertLog <em>Alert Log</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getIsystem <em>Isystem</em>}</li>
 *   <li>{@link factory.ecore.impl.FactoryImpl#getPredictionmodel <em>Predictionmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends MinimalEObjectImpl.Container implements Factory {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPro()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPro()
	 * @generated
	 * @ordered
	 */
	protected boolean pro = PRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contact;

	/**
	 * The cached value of the '{@link #getAlertLog() <em>Alert Log</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertLog()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alertLog;

	/**
	 * The cached value of the '{@link #getIsystem() <em>Isystem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ISystem> isystem;

	/**
	 * The cached value of the '{@link #getPredictionmodel() <em>Predictionmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictionmodel()
	 * @generated
	 * @ordered
	 */
	protected PredictionModel predictionmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.FACTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.FACTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.FACTORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPro() {
		return pro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPro(boolean newPro) {
		boolean oldPro = pro;
		pro = newPro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.FACTORY__PRO, oldPro, pro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.FACTORY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContact() {
		if (contact == null) {
			contact = new EDataTypeUniqueEList<String>(String.class, this, EcorePackage.FACTORY__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAlertLog() {
		if (alertLog == null) {
			alertLog = new EDataTypeUniqueEList<String>(String.class, this, EcorePackage.FACTORY__ALERT_LOG);
		}
		return alertLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISystem> getIsystem() {
		if (isystem == null) {
			isystem = new EObjectWithInverseResolvingEList<ISystem>(ISystem.class, this, EcorePackage.FACTORY__ISYSTEM,
					EcorePackage.ISYSTEM__FACTORY);
		}
		return isystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredictionModel getPredictionmodel() {
		if (predictionmodel != null && predictionmodel.eIsProxy()) {
			InternalEObject oldPredictionmodel = (InternalEObject) predictionmodel;
			predictionmodel = (PredictionModel) eResolveProxy(oldPredictionmodel);
			if (predictionmodel != oldPredictionmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.FACTORY__PREDICTIONMODEL,
							oldPredictionmodel, predictionmodel));
			}
		}
		return predictionmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictionModel basicGetPredictionmodel() {
		return predictionmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredictionmodel(PredictionModel newPredictionmodel, NotificationChain msgs) {
		PredictionModel oldPredictionmodel = predictionmodel;
		predictionmodel = newPredictionmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcorePackage.FACTORY__PREDICTIONMODEL, oldPredictionmodel, newPredictionmodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredictionmodel(PredictionModel newPredictionmodel) {
		if (newPredictionmodel != predictionmodel) {
			NotificationChain msgs = null;
			if (predictionmodel != null)
				msgs = ((InternalEObject) predictionmodel).eInverseRemove(this, EcorePackage.PREDICTION_MODEL__FACTORY,
						PredictionModel.class, msgs);
			if (newPredictionmodel != null)
				msgs = ((InternalEObject) newPredictionmodel).eInverseAdd(this, EcorePackage.PREDICTION_MODEL__FACTORY,
						PredictionModel.class, msgs);
			msgs = basicSetPredictionmodel(newPredictionmodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.FACTORY__PREDICTIONMODEL,
					newPredictionmodel, newPredictionmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.FACTORY__ISYSTEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsystem()).basicAdd(otherEnd, msgs);
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			if (predictionmodel != null)
				msgs = ((InternalEObject) predictionmodel).eInverseRemove(this, EcorePackage.PREDICTION_MODEL__FACTORY,
						PredictionModel.class, msgs);
			return basicSetPredictionmodel((PredictionModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.FACTORY__ISYSTEM:
			return ((InternalEList<?>) getIsystem()).basicRemove(otherEnd, msgs);
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			return basicSetPredictionmodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.FACTORY__NAME:
			return getName();
		case EcorePackage.FACTORY__ID:
			return getId();
		case EcorePackage.FACTORY__PRO:
			return isPro();
		case EcorePackage.FACTORY__ADDRESS:
			return getAddress();
		case EcorePackage.FACTORY__CONTACT:
			return getContact();
		case EcorePackage.FACTORY__ALERT_LOG:
			return getAlertLog();
		case EcorePackage.FACTORY__ISYSTEM:
			return getIsystem();
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			if (resolve)
				return getPredictionmodel();
			return basicGetPredictionmodel();
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
		case EcorePackage.FACTORY__NAME:
			setName((String) newValue);
			return;
		case EcorePackage.FACTORY__ID:
			setId((BigInteger) newValue);
			return;
		case EcorePackage.FACTORY__PRO:
			setPro((Boolean) newValue);
			return;
		case EcorePackage.FACTORY__ADDRESS:
			setAddress((String) newValue);
			return;
		case EcorePackage.FACTORY__CONTACT:
			getContact().clear();
			getContact().addAll((Collection<? extends String>) newValue);
			return;
		case EcorePackage.FACTORY__ALERT_LOG:
			getAlertLog().clear();
			getAlertLog().addAll((Collection<? extends String>) newValue);
			return;
		case EcorePackage.FACTORY__ISYSTEM:
			getIsystem().clear();
			getIsystem().addAll((Collection<? extends ISystem>) newValue);
			return;
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			setPredictionmodel((PredictionModel) newValue);
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
		case EcorePackage.FACTORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcorePackage.FACTORY__ID:
			setId(ID_EDEFAULT);
			return;
		case EcorePackage.FACTORY__PRO:
			setPro(PRO_EDEFAULT);
			return;
		case EcorePackage.FACTORY__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case EcorePackage.FACTORY__CONTACT:
			getContact().clear();
			return;
		case EcorePackage.FACTORY__ALERT_LOG:
			getAlertLog().clear();
			return;
		case EcorePackage.FACTORY__ISYSTEM:
			getIsystem().clear();
			return;
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			setPredictionmodel((PredictionModel) null);
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
		case EcorePackage.FACTORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcorePackage.FACTORY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EcorePackage.FACTORY__PRO:
			return pro != PRO_EDEFAULT;
		case EcorePackage.FACTORY__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case EcorePackage.FACTORY__CONTACT:
			return contact != null && !contact.isEmpty();
		case EcorePackage.FACTORY__ALERT_LOG:
			return alertLog != null && !alertLog.isEmpty();
		case EcorePackage.FACTORY__ISYSTEM:
			return isystem != null && !isystem.isEmpty();
		case EcorePackage.FACTORY__PREDICTIONMODEL:
			return predictionmodel != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", pro: ");
		result.append(pro);
		result.append(", address: ");
		result.append(address);
		result.append(", contact: ");
		result.append(contact);
		result.append(", alertLog: ");
		result.append(alertLog);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
