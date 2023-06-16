package nestorcicardini.D15.proxy;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class ProxyNotifier implements Notifier {

	private Notifier notifier;

	public ProxyNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public void notify(UUID sensorId, double latitude, double longitude,
			double smokeLevel) {
		notifier.notify(sensorId, latitude, longitude, smokeLevel);

	}
}