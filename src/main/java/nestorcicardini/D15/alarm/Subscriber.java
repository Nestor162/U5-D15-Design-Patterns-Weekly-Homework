package nestorcicardini.D15.alarm;

import nestorcicardini.D15.sensor.Sensor;

public interface Subscriber {
	public void update(Sensor sensor);
}