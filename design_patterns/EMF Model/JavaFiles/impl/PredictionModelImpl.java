/**
 */
package factory.ecore.impl;

import factory.ecore.EcorePackage;
import factory.ecore.Factory;
import factory.ecore.ModelType;
import factory.ecore.PredictionModel;
import factory.ecore.Property;

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prediction Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getModelParameters <em>Model Parameters</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#isTrained <em>Trained</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getTrainingData <em>Training Data</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getLastTrainingTime <em>Last Training Time</em>}</li>
 *   <li>{@link factory.ecore.impl.PredictionModelImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictionModelImpl extends MinimalEObjectImpl.Container implements PredictionModel {
	/**
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected static final ModelType MODEL_TYPE_EDEFAULT = ModelType.REGRESSION;

	/**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected ModelType modelType = MODEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected EList<Factory> factory;

	/**
	 * The cached value of the '{@link #getModelParameters() <em>Model Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelParameters()
	 * @generated
	 * @ordered
	 */
	protected Map modelParameters;

	/**
	 * The default value of the '{@link #isTrained() <em>Trained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrained() <em>Trained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrained()
	 * @generated
	 * @ordered
	 */
	protected boolean trained = TRAINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrainingData() <em>Training Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingData()
	 * @generated
	 * @ordered
	 */
	protected EList trainingData;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final double ACCURACY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected double accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTrainingTime() <em>Last Training Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTrainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_TRAINING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTrainingTime() <em>Last Training Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTrainingTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastTrainingTime = LAST_TRAINING_TIME_EDEFAULT;

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
	protected PredictionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.PREDICTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType getModelType() {
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelType(ModelType newModelType) {
		ModelType oldModelType = modelType;
		modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__MODEL_TYPE,
					oldModelType, modelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Factory> getFactory() {
		if (factory == null) {
			factory = new EObjectWithInverseResolvingEList<Factory>(Factory.class, this,
					EcorePackage.PREDICTION_MODEL__FACTORY, EcorePackage.FACTORY__PREDICTIONMODEL);
		}
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getModelParameters() {
		return modelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelParameters(Map newModelParameters) {
		Map oldModelParameters = modelParameters;
		modelParameters = newModelParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__MODEL_PARAMETERS,
					oldModelParameters, modelParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrained() {
		return trained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrained(boolean newTrained) {
		boolean oldTrained = trained;
		trained = newTrained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__TRAINED, oldTrained,
					trained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList getTrainingData() {
		return trainingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingData(EList newTrainingData) {
		EList oldTrainingData = trainingData;
		trainingData = newTrainingData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__TRAINING_DATA,
					oldTrainingData, trainingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccuracy(double newAccuracy) {
		double oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__ACCURACY, oldAccuracy,
					accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastTrainingTime() {
		return lastTrainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTrainingTime(XMLGregorianCalendar newLastTrainingTime) {
		XMLGregorianCalendar oldLastTrainingTime = lastTrainingTime;
		lastTrainingTime = newLastTrainingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.PREDICTION_MODEL__LAST_TRAINING_TIME,
					oldLastTrainingTime, lastTrainingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this,
					EcorePackage.PREDICTION_MODEL__PROPERTY);
		}
		return property;
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
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFactory()).basicAdd(otherEnd, msgs);
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
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			return ((InternalEList<?>) getFactory()).basicRemove(otherEnd, msgs);
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
		case EcorePackage.PREDICTION_MODEL__MODEL_TYPE:
			return getModelType();
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			return getFactory();
		case EcorePackage.PREDICTION_MODEL__MODEL_PARAMETERS:
			return getModelParameters();
		case EcorePackage.PREDICTION_MODEL__TRAINED:
			return isTrained();
		case EcorePackage.PREDICTION_MODEL__TRAINING_DATA:
			return getTrainingData();
		case EcorePackage.PREDICTION_MODEL__ACCURACY:
			return getAccuracy();
		case EcorePackage.PREDICTION_MODEL__LAST_TRAINING_TIME:
			return getLastTrainingTime();
		case EcorePackage.PREDICTION_MODEL__PROPERTY:
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
		case EcorePackage.PREDICTION_MODEL__MODEL_TYPE:
			setModelType((ModelType) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			getFactory().clear();
			getFactory().addAll((Collection<? extends Factory>) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__MODEL_PARAMETERS:
			setModelParameters((Map) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__TRAINED:
			setTrained((Boolean) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__TRAINING_DATA:
			setTrainingData((EList) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__ACCURACY:
			setAccuracy((Double) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__LAST_TRAINING_TIME:
			setLastTrainingTime((XMLGregorianCalendar) newValue);
			return;
		case EcorePackage.PREDICTION_MODEL__PROPERTY:
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
		case EcorePackage.PREDICTION_MODEL__MODEL_TYPE:
			setModelType(MODEL_TYPE_EDEFAULT);
			return;
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			getFactory().clear();
			return;
		case EcorePackage.PREDICTION_MODEL__MODEL_PARAMETERS:
			setModelParameters((Map) null);
			return;
		case EcorePackage.PREDICTION_MODEL__TRAINED:
			setTrained(TRAINED_EDEFAULT);
			return;
		case EcorePackage.PREDICTION_MODEL__TRAINING_DATA:
			setTrainingData((EList) null);
			return;
		case EcorePackage.PREDICTION_MODEL__ACCURACY:
			setAccuracy(ACCURACY_EDEFAULT);
			return;
		case EcorePackage.PREDICTION_MODEL__LAST_TRAINING_TIME:
			setLastTrainingTime(LAST_TRAINING_TIME_EDEFAULT);
			return;
		case EcorePackage.PREDICTION_MODEL__PROPERTY:
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
		case EcorePackage.PREDICTION_MODEL__MODEL_TYPE:
			return modelType != MODEL_TYPE_EDEFAULT;
		case EcorePackage.PREDICTION_MODEL__FACTORY:
			return factory != null && !factory.isEmpty();
		case EcorePackage.PREDICTION_MODEL__MODEL_PARAMETERS:
			return modelParameters != null;
		case EcorePackage.PREDICTION_MODEL__TRAINED:
			return trained != TRAINED_EDEFAULT;
		case EcorePackage.PREDICTION_MODEL__TRAINING_DATA:
			return trainingData != null;
		case EcorePackage.PREDICTION_MODEL__ACCURACY:
			return accuracy != ACCURACY_EDEFAULT;
		case EcorePackage.PREDICTION_MODEL__LAST_TRAINING_TIME:
			return LAST_TRAINING_TIME_EDEFAULT == null ? lastTrainingTime != null
					: !LAST_TRAINING_TIME_EDEFAULT.equals(lastTrainingTime);
		case EcorePackage.PREDICTION_MODEL__PROPERTY:
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
		result.append(" (modelType: ");
		result.append(modelType);
		result.append(", modelParameters: ");
		result.append(modelParameters);
		result.append(", trained: ");
		result.append(trained);
		result.append(", trainingData: ");
		result.append(trainingData);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(", lastTrainingTime: ");
		result.append(lastTrainingTime);
		result.append(')');
		return result.toString();
	}

} //PredictionModelImpl
