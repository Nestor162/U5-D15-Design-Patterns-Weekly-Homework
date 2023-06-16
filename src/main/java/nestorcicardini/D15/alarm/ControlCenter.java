package nestorcicardini.D15.alarm;

import org.springframework.stereotype.Component;

import nestorcicardini.D15.sensor.Sensor;

@Component
public class ControlCenter {

	public void getNotification(Sensor sensor) {
		System.out.println("ALERT! The smoke sensor '" + sensor.getSensorId()
				+ "' has exceeded the allowed smoke level.");
		triggerAlarm(sensor);
	}

	private void triggerAlarm(Sensor sensor) {
		String url = "http://host/alarm?sensorId=" + sensor.getSensorId()
				+ "&lat=" + sensor.getLatitude() + "&lon="
				+ sensor.getLongitude() + "&smokeLevel=" + sensor.getLevel();
		System.out.println("Sending alarm: " + url);
	}

}