/**
 */
package factory.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.GenericSensor#getPrivateData <em>Private Data</em>}</li>
 * </ul>
 *
 * @see factory.ecore.EcorePackage#getGenericSensor()
 * @model
 * @generated
 */
public interface GenericSensor extends ISystem {
	/**
	 * Returns the value of the '<em><b>Private Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Data</em>' attribute list.
	 * @see factory.ecore.EcorePackage#getGenericSensor_PrivateData()
	 * @model
	 * @generated
	 */
	EList<String> getPrivateData();

} // GenericSensor
