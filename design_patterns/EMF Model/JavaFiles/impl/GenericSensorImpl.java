/**
 */
package factory.ecore.impl;

import factory.ecore.EcorePackage;
import factory.ecore.Factory;
import factory.ecore.GenericSensor;
import factory.ecore.Property;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getId <em>Id</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#isActive <em>Active</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getInstalledDate <em>Installed Date</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getLastInspection <em>Last Inspection</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link factory.ecore.impl.GenericSensorImpl#getPrivateData <em>Private Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericSensorImpl extends MinimalEObjectImpl.Container implements GenericSensor {
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
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogs() <em>Logs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<Map> logs;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstalledDate() <em>Installed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INSTALLED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstalledDate() <em>Installed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar installedDate = INSTALLED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastInspection() <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInspection()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_INSPECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastInspection() <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInspection()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastInspection = LAST_INSPECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected Factory factory;

	/**
	 * The cached value of the '{@link #getPrivateData() <em>Private Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateData()
	 * @generated
	 * @ordered
	 */
	protected EList<String> privateData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.GENERIC_SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__SERIAL_NUMBER,
					oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map> getLogs() {
		if (logs == null) {
			logs = new EDataTypeUniqueEList<Map>(Map.class, this, EcorePackage.GENERIC_SENSOR__LOGS);
		}
		return logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__ACTIVE, oldActive,
					active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getInstalledDate() {
		return installedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstalledDate(XMLGregorianCalendar newInstalledDate) {
		XMLGregorianCalendar oldInstalledDate = installedDate;
		installedDate = newInstalledDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__INSTALLED_DATE,
					oldInstalledDate, installedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastInspection() {
		return lastInspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInspection(XMLGregorianCalendar newLastInspection) {
		XMLGregorianCalendar oldLastInspection = lastInspection;
		lastInspection = newLastInspection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__LAST_INSPECTION,
					oldLastInspection, lastInspection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, EcorePackage.GENERIC_SENSOR__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Factory getFactory() {
		if (factory != null && factory.eIsProxy()) {
			InternalEObject oldFactory = (InternalEObject) factory;
			factory = (Factory) eResolveProxy(oldFactory);
			if (factory != oldFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.GENERIC_SENSOR__FACTORY,
							oldFactory, factory));
			}
		}
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory basicGetFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactory(Factory newFactory, NotificationChain msgs) {
		Factory oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcorePackage.GENERIC_SENSOR__FACTORY, oldFactory, newFactory);
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
	public void setFactory(Factory newFactory) {
		if (newFactory != factory) {
			NotificationChain msgs = null;
			if (factory != null)
				msgs = ((InternalEObject) factory).eInverseRemove(this, EcorePackage.FACTORY__ISYSTEM, Factory.class,
						msgs);
			if (newFactory != null)
				msgs = ((InternalEObject) newFactory).eInverseAdd(this, EcorePackage.FACTORY__ISYSTEM, Factory.class,
						msgs);
			msgs = basicSetFactory(newFactory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.GENERIC_SENSOR__FACTORY, newFactory,
					newFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPrivateData() {
		if (privateData == null) {
			privateData = new EDataTypeUniqueEList<String>(String.class, this,
					EcorePackage.GENERIC_SENSOR__PRIVATE_DATA);
		}
		return privateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			if (factory != null)
				msgs = ((InternalEObject) factory).eInverseRemove(this, EcorePackage.FACTORY__ISYSTEM, Factory.class,
						msgs);
			return basicSetFactory((Factory) otherEnd, msgs);
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
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			return basicSetFactory(null, msgs);
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
		case EcorePackage.GENERIC_SENSOR__NAME:
			return getName();
		case EcorePackage.GENERIC_SENSOR__ID:
			return getId();
		case EcorePackage.GENERIC_SENSOR__SERIAL_NUMBER:
			return getSerialNumber();
		case EcorePackage.GENERIC_SENSOR__DESCRIPTION:
			return getDescription();
		case EcorePackage.GENERIC_SENSOR__LOCATION:
			return getLocation();
		case EcorePackage.GENERIC_SENSOR__LOGS:
			return getLogs();
		case EcorePackage.GENERIC_SENSOR__ACTIVE:
			return isActive();
		case EcorePackage.GENERIC_SENSOR__INSTALLED_DATE:
			return getInstalledDate();
		case EcorePackage.GENERIC_SENSOR__LAST_INSPECTION:
			return getLastInspection();
		case EcorePackage.GENERIC_SENSOR__PROPERTY:
			return getProperty();
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			if (resolve)
				return getFactory();
			return basicGetFactory();
		case EcorePackage.GENERIC_SENSOR__PRIVATE_DATA:
			return getPrivateData();
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
		case EcorePackage.GENERIC_SENSOR__NAME:
			setName((String) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__ID:
			setId((BigInteger) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__SERIAL_NUMBER:
			setSerialNumber((String) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__LOCATION:
			setLocation((String) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__LOGS:
			getLogs().clear();
			getLogs().addAll((Collection<? extends Map>) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__INSTALLED_DATE:
			setInstalledDate((XMLGregorianCalendar) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__LAST_INSPECTION:
			setLastInspection((XMLGregorianCalendar) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			setFactory((Factory) newValue);
			return;
		case EcorePackage.GENERIC_SENSOR__PRIVATE_DATA:
			getPrivateData().clear();
			getPrivateData().addAll((Collection<? extends String>) newValue);
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
		case EcorePackage.GENERIC_SENSOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__ID:
			setId(ID_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__SERIAL_NUMBER:
			setSerialNumber(SERIAL_NUMBER_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__LOGS:
			getLogs().clear();
			return;
		case EcorePackage.GENERIC_SENSOR__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__INSTALLED_DATE:
			setInstalledDate(INSTALLED_DATE_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__LAST_INSPECTION:
			setLastInspection(LAST_INSPECTION_EDEFAULT);
			return;
		case EcorePackage.GENERIC_SENSOR__PROPERTY:
			getProperty().clear();
			return;
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			setFactory((Factory) null);
			return;
		case EcorePackage.GENERIC_SENSOR__PRIVATE_DATA:
			getPrivateData().clear();
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
		case EcorePackage.GENERIC_SENSOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcorePackage.GENERIC_SENSOR__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EcorePackage.GENERIC_SENSOR__SERIAL_NUMBER:
			return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
		case EcorePackage.GENERIC_SENSOR__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EcorePackage.GENERIC_SENSOR__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case EcorePackage.GENERIC_SENSOR__LOGS:
			return logs != null && !logs.isEmpty();
		case EcorePackage.GENERIC_SENSOR__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case EcorePackage.GENERIC_SENSOR__INSTALLED_DATE:
			return INSTALLED_DATE_EDEFAULT == null ? installedDate != null
					: !INSTALLED_DATE_EDEFAULT.equals(installedDate);
		case EcorePackage.GENERIC_SENSOR__LAST_INSPECTION:
			return LAST_INSPECTION_EDEFAULT == null ? lastInspection != null
					: !LAST_INSPECTION_EDEFAULT.equals(lastInspection);
		case EcorePackage.GENERIC_SENSOR__PROPERTY:
			return property != null && !property.isEmpty();
		case EcorePackage.GENERIC_SENSOR__FACTORY:
			return factory != null;
		case EcorePackage.GENERIC_SENSOR__PRIVATE_DATA:
			return privateData != null && !privateData.isEmpty();
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
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", description: ");
		result.append(description);
		result.append(", location: ");
		result.append(location);
		result.append(", logs: ");
		result.append(logs);
		result.append(", active: ");
		result.append(active);
		result.append(", installedDate: ");
		result.append(installedDate);
		result.append(", lastInspection: ");
		result.append(lastInspection);
		result.append(", privateData: ");
		result.append(privateData);
		result.append(')');
		return result.toString();
	}

} //GenericSensorImpl
