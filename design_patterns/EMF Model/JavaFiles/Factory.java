/**
 */
package factory.ecore;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.Factory#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.Factory#getId <em>Id</em>}</li>
 *   <li>{@link factory.ecore.Factory#isPro <em>Pro</em>}</li>
 *   <li>{@link factory.ecore.Factory#getAddress <em>Address</em>}</li>
 *   <li>{@link factory.ecore.Factory#getContact <em>Contact</em>}</li>
 *   <li>{@link factory.ecore.Factory#getAlertLog <em>Alert Log</em>}</li>
 *   <li>{@link factory.ecore.Factory#getIsystem <em>Isystem</em>}</li>
 *   <li>{@link factory.ecore.Factory#getPredictionmodel <em>Predictionmodel</em>}</li>
 * </ul>
 *
 * @see factory.ecore.EcorePackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see factory.ecore.EcorePackage#getFactory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link factory.ecore.Factory#getName <em>Name</em>}' attribute.
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
	 * @see factory.ecore.EcorePackage#getFactory_Id()
	 * @model
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link factory.ecore.Factory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro</em>' attribute.
	 * @see #setPro(boolean)
	 * @see factory.ecore.EcorePackage#getFactory_Pro()
	 * @model
	 * @generated
	 */
	boolean isPro();

	/**
	 * Sets the value of the '{@link factory.ecore.Factory#isPro <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro</em>' attribute.
	 * @see #isPro()
	 * @generated
	 */
	void setPro(boolean value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see factory.ecore.EcorePackage#getFactory_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link factory.ecore.Factory#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute list.
	 * @see factory.ecore.EcorePackage#getFactory_Contact()
	 * @model
	 * @generated
	 */
	EList<String> getContact();

	/**
	 * Returns the value of the '<em><b>Alert Log</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alert Log</em>' attribute list.
	 * @see factory.ecore.EcorePackage#getFactory_AlertLog()
	 * @model
	 * @generated
	 */
	EList<String> getAlertLog();

	/**
	 * Returns the value of the '<em><b>Isystem</b></em>' reference list.
	 * The list contents are of type {@link factory.ecore.ISystem}.
	 * It is bidirectional and its opposite is '{@link factory.ecore.ISystem#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isystem</em>' reference list.
	 * @see factory.ecore.EcorePackage#getFactory_Isystem()
	 * @see factory.ecore.ISystem#getFactory
	 * @model opposite="factory"
	 * @generated
	 */
	EList<ISystem> getIsystem();

	/**
	 * Returns the value of the '<em><b>Predictionmodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link factory.ecore.PredictionModel#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictionmodel</em>' reference.
	 * @see #setPredictionmodel(PredictionModel)
	 * @see factory.ecore.EcorePackage#getFactory_Predictionmodel()
	 * @see factory.ecore.PredictionModel#getFactory
	 * @model opposite="factory"
	 * @generated
	 */
	PredictionModel getPredictionmodel();

	/**
	 * Sets the value of the '{@link factory.ecore.Factory#getPredictionmodel <em>Predictionmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictionmodel</em>' reference.
	 * @see #getPredictionmodel()
	 * @generated
	 */
	void setPredictionmodel(PredictionModel value);

} // Factory
