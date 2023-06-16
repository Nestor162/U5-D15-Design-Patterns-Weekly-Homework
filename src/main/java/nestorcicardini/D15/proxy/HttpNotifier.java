package nestorcicardini.D15.proxy;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
class HttpNotifier implements Notifier {
	@Override
	public void notify(UUID sensorId, double latitude, double longitude,
			double smokeLevel) {

		String url = "http://host/alarm?idsonda=" + sensorId + "&lat="
				+ latitude + "&lon=" + longitude + "&smokelevel=" + smokeLevel;

		System.out.println("Sending alarm: " + url);
	}
}