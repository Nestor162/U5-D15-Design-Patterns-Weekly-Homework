package nestorcicardini.D15.sensor;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SensorRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Sensor createdSensor = null;

		// Questo è un esempio per rendere utile l'utilizzo di questo pattern.
		// Immaginare che 'sensorType' ha un valore dinamico ottenuto a runetime
		String sensorType = "Smoke";

		if (sensorType.equals("Smoke")) {
			createdSensor = new SmokeSensorCreator()
					.createSensor(UUID.randomUUID(), 12.123, 20.564, 5.2);

			// In questo caso non ho creato piu factory perche non veniva
			// richiesto nella traccia
		} else if (sensorType.equals("temperature")) {

//			createdSensor =	new TemperatureSensorCreator().createSenor(UUID.randomUUID(), 32.345,
//					32.345, 4);

		} else if (sensorType.equals("humidity")) {
//			createdSensor = new HumiditySensorCreator().createSenor(UUID.randomUUID(), 45.820,
//			34.432, 1.2);
		}

		createdSensor.getSensorInfo();
	}

}
