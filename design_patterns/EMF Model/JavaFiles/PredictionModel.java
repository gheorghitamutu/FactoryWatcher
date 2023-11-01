/**
 */
package factory.ecore;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prediction Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.PredictionModel#getModelType <em>Model Type</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getFactory <em>Factory</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getModelParameters <em>Model Parameters</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#isTrained <em>Trained</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getTrainingData <em>Training Data</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getLastTrainingTime <em>Last Training Time</em>}</li>
 *   <li>{@link factory.ecore.PredictionModel#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see factory.ecore.EcorePackage#getPredictionModel()
 * @model
 * @generated
 */
public interface PredictionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link factory.ecore.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see factory.ecore.ModelType
	 * @see #setModelType(ModelType)
	 * @see factory.ecore.EcorePackage#getPredictionModel_ModelType()
	 * @model
	 * @generated
	 */
	ModelType getModelType();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see factory.ecore.ModelType
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' reference list.
	 * The list contents are of type {@link factory.ecore.Factory}.
	 * It is bidirectional and its opposite is '{@link factory.ecore.Factory#getPredictionmodel <em>Predictionmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' reference list.
	 * @see factory.ecore.EcorePackage#getPredictionModel_Factory()
	 * @see factory.ecore.Factory#getPredictionmodel
	 * @model opposite="predictionmodel" required="true"
	 * @generated
	 */
	EList<Factory> getFactory();

	/**
	 * Returns the value of the '<em><b>Model Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameters</em>' attribute.
	 * @see #setModelParameters(Map)
	 * @see factory.ecore.EcorePackage#getPredictionModel_ModelParameters()
	 * @model transient="true"
	 * @generated
	 */
	Map getModelParameters();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#getModelParameters <em>Model Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Parameters</em>' attribute.
	 * @see #getModelParameters()
	 * @generated
	 */
	void setModelParameters(Map value);

	/**
	 * Returns the value of the '<em><b>Trained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trained</em>' attribute.
	 * @see #setTrained(boolean)
	 * @see factory.ecore.EcorePackage#getPredictionModel_Trained()
	 * @model
	 * @generated
	 */
	boolean isTrained();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#isTrained <em>Trained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trained</em>' attribute.
	 * @see #isTrained()
	 * @generated
	 */
	void setTrained(boolean value);

	/**
	 * Returns the value of the '<em><b>Training Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Data</em>' attribute.
	 * @see #setTrainingData(EList)
	 * @see factory.ecore.EcorePackage#getPredictionModel_TrainingData()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList getTrainingData();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#getTrainingData <em>Training Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Data</em>' attribute.
	 * @see #getTrainingData()
	 * @generated
	 */
	void setTrainingData(EList value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(double)
	 * @see factory.ecore.EcorePackage#getPredictionModel_Accuracy()
	 * @model
	 * @generated
	 */
	double getAccuracy();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(double value);

	/**
	 * Returns the value of the '<em><b>Last Training Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Training Time</em>' attribute.
	 * @see #setLastTrainingTime(XMLGregorianCalendar)
	 * @see factory.ecore.EcorePackage#getPredictionModel_LastTrainingTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getLastTrainingTime();

	/**
	 * Sets the value of the '{@link factory.ecore.PredictionModel#getLastTrainingTime <em>Last Training Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Training Time</em>' attribute.
	 * @see #getLastTrainingTime()
	 * @generated
	 */
	void setLastTrainingTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link factory.ecore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see factory.ecore.EcorePackage#getPredictionModel_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

} // PredictionModel
