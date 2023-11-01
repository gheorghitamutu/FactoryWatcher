/**
 */
package factory.ecore;

import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.ISystem#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getId <em>Id</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getLocation <em>Location</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getLogs <em>Logs</em>}</li>
 *   <li>{@link factory.ecore.ISystem#isActive <em>Active</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getInstalledDate <em>Installed Date</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getLastInspection <em>Last Inspection</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getProperty <em>Property</em>}</li>
 *   <li>{@link factory.ecore.ISystem#getFactory <em>Factory</em>}</li>
 * </ul>
 *
 * @see factory.ecore.EcorePackage#getISystem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see factory.ecore.EcorePackage#getISystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see factory.ecore.EcorePackage#getISystem_Id()
	 * @model
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see factory.ecore.EcorePackage#getISystem_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see factory.ecore.EcorePackage#getISystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see factory.ecore.EcorePackage#getISystem_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Map}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' attribute list.
	 * @see factory.ecore.EcorePackage#getISystem_Logs()
	 * @model transient="true"
	 * @generated
	 */
	EList<Map> getLogs();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see factory.ecore.EcorePackage#getISystem_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Installed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Date</em>' attribute.
	 * @see #setInstalledDate(XMLGregorianCalendar)
	 * @see factory.ecore.EcorePackage#getISystem_InstalledDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getInstalledDate();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getInstalledDate <em>Installed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed Date</em>' attribute.
	 * @see #getInstalledDate()
	 * @generated
	 */
	void setInstalledDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Inspection</em>' attribute.
	 * @see #setLastInspection(XMLGregorianCalendar)
	 * @see factory.ecore.EcorePackage#getISystem_LastInspection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getLastInspection();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getLastInspection <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Inspection</em>' attribute.
	 * @see #getLastInspection()
	 * @generated
	 */
	void setLastInspection(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link factory.ecore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see factory.ecore.EcorePackage#getISystem_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link factory.ecore.Factory#getIsystem <em>Isystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' reference.
	 * @see #setFactory(Factory)
	 * @see factory.ecore.EcorePackage#getISystem_Factory()
	 * @see factory.ecore.Factory#getIsystem
	 * @model opposite="isystem"
	 * @generated
	 */
	Factory getFactory();

	/**
	 * Sets the value of the '{@link factory.ecore.ISystem#getFactory <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' reference.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(Factory value);

} // ISystem
