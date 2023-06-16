package nestorcicardini.D15.alarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nestorcicardini.D15.proxy.ProxyNotifier;
import nestorcicardini.D15.sensor.Sensor;

@Component
public class ControlCenter {

	@Autowired
	ProxyNotifier proxyNotifier;

	public void getNotification(Sensor sensor) {
		System.out.println("ALERT! The smoke sensor '" + sensor.getSensorId()
				+ "' has exceeded the allowed smoke level.");
		triggerAlarm(sensor);
	}

	private void triggerAlarm(Sensor sensor) {

		proxyNotifier.notify(sensor.getSensorId(), sensor.getLatitude(),
				sensor.getLongitude(), sensor.getLevel());
//		System.out.println("Sending alarm: " + url);
	}

}