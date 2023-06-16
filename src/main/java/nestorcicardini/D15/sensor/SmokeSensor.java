package nestorcicardini.D15.sensor;

import java.util.UUID;

class SmokeSensor extends Sensor {

	public SmokeSensor(UUID sensorId, double latitude, double longitude,
			double smokeLevel) {
		super(sensorId, latitude, longitude, smokeLevel);
	}

	@Override
	public void getSensorInfo() {
		System.out.println("SmokeSensor [SensorId: " + getSensorId()
				+ ", Latitude: " + getLatitude() + ", Longitude: "
				+ getLongitude() + ", Level: " + getLevel());

	}

}
