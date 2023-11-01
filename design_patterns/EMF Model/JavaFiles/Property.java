/**
 */
package factory.ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.Property#getName <em>Name</em>}</li>
 *   <li>{@link factory.ecore.Property#isBoolProp <em>Bool Prop</em>}</li>
 *   <li>{@link factory.ecore.Property#getStringProp <em>String Prop</em>}</li>
 *   <li>{@link factory.ecore.Property#getIntProp <em>Int Prop</em>}</li>
 *   <li>{@link factory.ecore.Property#getDoubleProp <em>Double Prop</em>}</li>
 *   <li>{@link factory.ecore.Property#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see factory.ecore.EcorePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see factory.ecore.EcorePackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link factory.ecore.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bool Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Prop</em>' attribute.
	 * @see #setBoolProp(boolean)
	 * @see factory.ecore.EcorePackage#getProperty_BoolProp()
	 * @model
	 * @generated
	 */
	boolean isBoolProp();

	/**
	 * Sets the value of the '{@link factory.ecore.Property#isBoolProp <em>Bool Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Prop</em>' attribute.
	 * @see #isBoolProp()
	 * @generated
	 */
	void setBoolProp(boolean value);

	/**
	 * Returns the value of the '<em><b>String Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Prop</em>' attribute.
	 * @see #setStringProp(String)
	 * @see factory.ecore.EcorePackage#getProperty_StringProp()
	 * @model
	 * @generated
	 */
	String getStringProp();

	/**
	 * Sets the value of the '{@link factory.ecore.Property#getStringProp <em>String Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Prop</em>' attribute.
	 * @see #getStringProp()
	 * @generated
	 */
	void setStringProp(String value);

	/**
	 * Returns the value of the '<em><b>Int Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Prop</em>' attribute.
	 * @see #setIntProp(int)
	 * @see factory.ecore.EcorePackage#getProperty_IntProp()
	 * @model
	 * @generated
	 */
	int getIntProp();

	/**
	 * Sets the value of the '{@link factory.ecore.Property#getIntProp <em>Int Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Prop</em>' attribute.
	 * @see #getIntProp()
	 * @generated
	 */
	void setIntProp(int value);

	/**
	 * Returns the value of the '<em><b>Double Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Prop</em>' attribute.
	 * @see #setDoubleProp(double)
	 * @see factory.ecore.EcorePackage#getProperty_DoubleProp()
	 * @model
	 * @generated
	 */
	double getDoubleProp();

	/**
	 * Sets the value of the '{@link factory.ecore.Property#getDoubleProp <em>Double Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Prop</em>' attribute.
	 * @see #getDoubleProp()
	 * @generated
	 */
	void setDoubleProp(double value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link factory.ecore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see factory.ecore.EcorePackage#getProperty_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

} // Property
