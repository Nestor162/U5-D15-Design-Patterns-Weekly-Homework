package nestorcicardini.D15.proxy;

import java.util.UUID;

public interface Notifier {
	// Parametri richiesti per inviare la notifica al personale
	public void notify(UUID sensorId, double latitude, double longitude,
			double smokeLevel);

}
