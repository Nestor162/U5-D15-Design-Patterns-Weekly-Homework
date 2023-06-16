package nestorcicardini.D15.sensor;

import java.util.UUID;

public abstract class SensorCreator {

	public abstract Sensor createSensor(UUID sensorId, double latitude,
			double longitude);

}