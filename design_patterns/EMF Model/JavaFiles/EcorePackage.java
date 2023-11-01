/**
 */
package factory.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see factory.ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = factory.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link factory.ecore.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.impl.FactoryImpl
	 * @see factory.ecore.impl.EcorePackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ID = 1;

	/**
	 * The feature id for the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__PRO = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Alert Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ALERT_LOG = 5;

	/**
	 * The feature id for the '<em><b>Isystem</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ISYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Predictionmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__PREDICTIONMODEL = 7;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.ecore.ISystem <em>ISystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.ISystem
	 * @see factory.ecore.impl.EcorePackageImpl#getISystem()
	 * @generated
	 */
	int ISYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__ID = 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__SERIAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__LOGS = 5;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__ACTIVE = 6;

	/**
	 * The feature id for the '<em><b>Installed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__INSTALLED_DATE = 7;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__LAST_INSPECTION = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__FACTORY = 10;

	/**
	 * The number of structural features of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.ecore.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.impl.PropertyImpl
	 * @see factory.ecore.impl.EcorePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bool Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BOOL_PROP = 1;

	/**
	 * The feature id for the '<em><b>String Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STRING_PROP = 2;

	/**
	 * The feature id for the '<em><b>Int Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INT_PROP = 3;

	/**
	 * The feature id for the '<em><b>Double Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOUBLE_PROP = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.ecore.impl.GenericSensorImpl <em>Generic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.impl.GenericSensorImpl
	 * @see factory.ecore.impl.EcorePackageImpl#getGenericSensor()
	 * @generated
	 */
	int GENERIC_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__NAME = ISYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__ID = ISYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__SERIAL_NUMBER = ISYSTEM__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__DESCRIPTION = ISYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__LOCATION = ISYSTEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__LOGS = ISYSTEM__LOGS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__ACTIVE = ISYSTEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Installed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__INSTALLED_DATE = ISYSTEM__INSTALLED_DATE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__LAST_INSPECTION = ISYSTEM__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__PROPERTY = ISYSTEM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__FACTORY = ISYSTEM__FACTORY;

	/**
	 * The feature id for the '<em><b>Private Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR__PRIVATE_DATA = ISYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR_FEATURE_COUNT = ISYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SENSOR_OPERATION_COUNT = ISYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.ecore.impl.PredictionModelImpl <em>Prediction Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.impl.PredictionModelImpl
	 * @see factory.ecore.impl.EcorePackageImpl#getPredictionModel()
	 * @generated
	 */
	int PREDICTION_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__MODEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Model Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__MODEL_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Trained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__TRAINED = 3;

	/**
	 * The feature id for the '<em><b>Training Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__TRAINING_DATA = 4;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__ACCURACY = 5;

	/**
	 * The feature id for the '<em><b>Last Training Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__LAST_TRAINING_TIME = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL__PROPERTY = 7;

	/**
	 * The number of structural features of the '<em>Prediction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Prediction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.ecore.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.ecore.ModelType
	 * @see factory.ecore.impl.EcorePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link factory.ecore.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see factory.ecore.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Factory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factory.ecore.Factory#getName()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Name();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Factory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see factory.ecore.Factory#getId()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Id();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Factory#isPro <em>Pro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pro</em>'.
	 * @see factory.ecore.Factory#isPro()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Pro();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Factory#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see factory.ecore.Factory#getAddress()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Address();

	/**
	 * Returns the meta object for the attribute list '{@link factory.ecore.Factory#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contact</em>'.
	 * @see factory.ecore.Factory#getContact()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Contact();

	/**
	 * Returns the meta object for the attribute list '{@link factory.ecore.Factory#getAlertLog <em>Alert Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alert Log</em>'.
	 * @see factory.ecore.Factory#getAlertLog()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_AlertLog();

	/**
	 * Returns the meta object for the reference list '{@link factory.ecore.Factory#getIsystem <em>Isystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Isystem</em>'.
	 * @see factory.ecore.Factory#getIsystem()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Isystem();

	/**
	 * Returns the meta object for the reference '{@link factory.ecore.Factory#getPredictionmodel <em>Predictionmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predictionmodel</em>'.
	 * @see factory.ecore.Factory#getPredictionmodel()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Predictionmodel();

	/**
	 * Returns the meta object for class '{@link factory.ecore.ISystem <em>ISystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISystem</em>'.
	 * @see factory.ecore.ISystem
	 * @generated
	 */
	EClass getISystem();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factory.ecore.ISystem#getName()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see factory.ecore.ISystem#getId()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see factory.ecore.ISystem#getSerialNumber()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see factory.ecore.ISystem#getDescription()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Description();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see factory.ecore.ISystem#getLocation()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Location();

	/**
	 * Returns the meta object for the attribute list '{@link factory.ecore.ISystem#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Logs</em>'.
	 * @see factory.ecore.ISystem#getLogs()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Logs();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see factory.ecore.ISystem#isActive()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_Active();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getInstalledDate <em>Installed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installed Date</em>'.
	 * @see factory.ecore.ISystem#getInstalledDate()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_InstalledDate();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.ISystem#getLastInspection <em>Last Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Inspection</em>'.
	 * @see factory.ecore.ISystem#getLastInspection()
	 * @see #getISystem()
	 * @generated
	 */
	EAttribute getISystem_LastInspection();

	/**
	 * Returns the meta object for the reference list '{@link factory.ecore.ISystem#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see factory.ecore.ISystem#getProperty()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_Property();

	/**
	 * Returns the meta object for the reference '{@link factory.ecore.ISystem#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factory</em>'.
	 * @see factory.ecore.ISystem#getFactory()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_Factory();

	/**
	 * Returns the meta object for class '{@link factory.ecore.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see factory.ecore.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factory.ecore.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Property#isBoolProp <em>Bool Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Prop</em>'.
	 * @see factory.ecore.Property#isBoolProp()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_BoolProp();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Property#getStringProp <em>String Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Prop</em>'.
	 * @see factory.ecore.Property#getStringProp()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_StringProp();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Property#getIntProp <em>Int Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Prop</em>'.
	 * @see factory.ecore.Property#getIntProp()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IntProp();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.Property#getDoubleProp <em>Double Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Prop</em>'.
	 * @see factory.ecore.Property#getDoubleProp()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DoubleProp();

	/**
	 * Returns the meta object for the reference list '{@link factory.ecore.Property#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see factory.ecore.Property#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Property();

	/**
	 * Returns the meta object for class '{@link factory.ecore.GenericSensor <em>Generic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Sensor</em>'.
	 * @see factory.ecore.GenericSensor
	 * @generated
	 */
	EClass getGenericSensor();

	/**
	 * Returns the meta object for the attribute list '{@link factory.ecore.GenericSensor#getPrivateData <em>Private Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Private Data</em>'.
	 * @see factory.ecore.GenericSensor#getPrivateData()
	 * @see #getGenericSensor()
	 * @generated
	 */
	EAttribute getGenericSensor_PrivateData();

	/**
	 * Returns the meta object for class '{@link factory.ecore.PredictionModel <em>Prediction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prediction Model</em>'.
	 * @see factory.ecore.PredictionModel
	 * @generated
	 */
	EClass getPredictionModel();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see factory.ecore.PredictionModel#getModelType()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_ModelType();

	/**
	 * Returns the meta object for the reference list '{@link factory.ecore.PredictionModel#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Factory</em>'.
	 * @see factory.ecore.PredictionModel#getFactory()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EReference getPredictionModel_Factory();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#getModelParameters <em>Model Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Parameters</em>'.
	 * @see factory.ecore.PredictionModel#getModelParameters()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_ModelParameters();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#isTrained <em>Trained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trained</em>'.
	 * @see factory.ecore.PredictionModel#isTrained()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_Trained();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#getTrainingData <em>Training Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Data</em>'.
	 * @see factory.ecore.PredictionModel#getTrainingData()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_TrainingData();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see factory.ecore.PredictionModel#getAccuracy()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link factory.ecore.PredictionModel#getLastTrainingTime <em>Last Training Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Training Time</em>'.
	 * @see factory.ecore.PredictionModel#getLastTrainingTime()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EAttribute getPredictionModel_LastTrainingTime();

	/**
	 * Returns the meta object for the reference list '{@link factory.ecore.PredictionModel#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see factory.ecore.PredictionModel#getProperty()
	 * @see #getPredictionModel()
	 * @generated
	 */
	EReference getPredictionModel_Property();

	/**
	 * Returns the meta object for enum '{@link factory.ecore.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see factory.ecore.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link factory.ecore.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.impl.FactoryImpl
		 * @see factory.ecore.impl.EcorePackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__NAME = eINSTANCE.getFactory_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__ID = eINSTANCE.getFactory_Id();

		/**
		 * The meta object literal for the '<em><b>Pro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__PRO = eINSTANCE.getFactory_Pro();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__ADDRESS = eINSTANCE.getFactory_Address();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__CONTACT = eINSTANCE.getFactory_Contact();

		/**
		 * The meta object literal for the '<em><b>Alert Log</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__ALERT_LOG = eINSTANCE.getFactory_AlertLog();

		/**
		 * The meta object literal for the '<em><b>Isystem</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__ISYSTEM = eINSTANCE.getFactory_Isystem();

		/**
		 * The meta object literal for the '<em><b>Predictionmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__PREDICTIONMODEL = eINSTANCE.getFactory_Predictionmodel();

		/**
		 * The meta object literal for the '{@link factory.ecore.ISystem <em>ISystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.ISystem
		 * @see factory.ecore.impl.EcorePackageImpl#getISystem()
		 * @generated
		 */
		EClass ISYSTEM = eINSTANCE.getISystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__NAME = eINSTANCE.getISystem_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__ID = eINSTANCE.getISystem_Id();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__SERIAL_NUMBER = eINSTANCE.getISystem_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__DESCRIPTION = eINSTANCE.getISystem_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__LOCATION = eINSTANCE.getISystem_Location();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__LOGS = eINSTANCE.getISystem_Logs();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__ACTIVE = eINSTANCE.getISystem_Active();

		/**
		 * The meta object literal for the '<em><b>Installed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__INSTALLED_DATE = eINSTANCE.getISystem_InstalledDate();

		/**
		 * The meta object literal for the '<em><b>Last Inspection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYSTEM__LAST_INSPECTION = eINSTANCE.getISystem_LastInspection();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__PROPERTY = eINSTANCE.getISystem_Property();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__FACTORY = eINSTANCE.getISystem_Factory();

		/**
		 * The meta object literal for the '{@link factory.ecore.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.impl.PropertyImpl
		 * @see factory.ecore.impl.EcorePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Bool Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__BOOL_PROP = eINSTANCE.getProperty_BoolProp();

		/**
		 * The meta object literal for the '<em><b>String Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__STRING_PROP = eINSTANCE.getProperty_StringProp();

		/**
		 * The meta object literal for the '<em><b>Int Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__INT_PROP = eINSTANCE.getProperty_IntProp();

		/**
		 * The meta object literal for the '<em><b>Double Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DOUBLE_PROP = eINSTANCE.getProperty_DoubleProp();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY = eINSTANCE.getProperty_Property();

		/**
		 * The meta object literal for the '{@link factory.ecore.impl.GenericSensorImpl <em>Generic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.impl.GenericSensorImpl
		 * @see factory.ecore.impl.EcorePackageImpl#getGenericSensor()
		 * @generated
		 */
		EClass GENERIC_SENSOR = eINSTANCE.getGenericSensor();

		/**
		 * The meta object literal for the '<em><b>Private Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_SENSOR__PRIVATE_DATA = eINSTANCE.getGenericSensor_PrivateData();

		/**
		 * The meta object literal for the '{@link factory.ecore.impl.PredictionModelImpl <em>Prediction Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.impl.PredictionModelImpl
		 * @see factory.ecore.impl.EcorePackageImpl#getPredictionModel()
		 * @generated
		 */
		EClass PREDICTION_MODEL = eINSTANCE.getPredictionModel();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__MODEL_TYPE = eINSTANCE.getPredictionModel_ModelType();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTION_MODEL__FACTORY = eINSTANCE.getPredictionModel_Factory();

		/**
		 * The meta object literal for the '<em><b>Model Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__MODEL_PARAMETERS = eINSTANCE.getPredictionModel_ModelParameters();

		/**
		 * The meta object literal for the '<em><b>Trained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__TRAINED = eINSTANCE.getPredictionModel_Trained();

		/**
		 * The meta object literal for the '<em><b>Training Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__TRAINING_DATA = eINSTANCE.getPredictionModel_TrainingData();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__ACCURACY = eINSTANCE.getPredictionModel_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Last Training Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTION_MODEL__LAST_TRAINING_TIME = eINSTANCE.getPredictionModel_LastTrainingTime();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTION_MODEL__PROPERTY = eINSTANCE.getPredictionModel_Property();

		/**
		 * The meta object literal for the '{@link factory.ecore.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.ecore.ModelType
		 * @see factory.ecore.impl.EcorePackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

	}

} //EcorePackage
