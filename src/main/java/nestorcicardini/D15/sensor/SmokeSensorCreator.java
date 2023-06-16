package nestorcicardini.D15.sensor;

import java.util.UUID;

public class SmokeSensorCreator extends SensorCreator {

	@Override
	public Sensor createSensor(UUID sensorId, double latitude, double longitude,
			double smokeLevel) {
		System.out.println("New SmokeSensor created successfully");
		return new SmokeSensor(sensorId, latitude, longitude, smokeLevel);
	}

}
