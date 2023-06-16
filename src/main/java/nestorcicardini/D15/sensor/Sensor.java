package nestorcicardini.D15.sensor;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
abstract class Sensor {
	private UUID sensorId;
	private double latitude;
	private double longitude;
	private double level = 0;

	public abstract void getSensorInfo();
}
