package nestorcicardini.D15.sensor;

import java.util.UUID;

public class SmokeSensor extends Sensor {

	public SmokeSensor(UUID sensorId, double latitude, double longitude) {
		super(sensorId, latitude, longitude);
	}

	@Override
	public void getSensorInfo() {
		System.out.println("SmokeSensor [SensorId: " + getSensorId()
				+ ", Latitude: " + getLatitude() + ", Longitude: "
				+ getLongitude() + ", Level: " + getLevel());

	}

	@Override
	public void update(Sensor sensor) {
		System.out.println("ALERT!");
	}

}
