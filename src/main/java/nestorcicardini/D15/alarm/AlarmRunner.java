package nestorcicardini.D15.alarm;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import nestorcicardini.D15.sensor.Sensor;
import nestorcicardini.D15.sensor.SmokeSensorCreator;

@Component
public class AlarmRunner implements CommandLineRunner {

	@Autowired
	private FireAlarm fireAlarm;

	@Override
	public void run(String... args) throws Exception {

		Sensor s1 = new SmokeSensorCreator().createSensor(UUID.randomUUID(),
				12.123, 20.564);

		Sensor s2 = new SmokeSensorCreator().createSensor(UUID.randomUUID(),
				19.230, 68.458);

		s1.addSubscriber(fireAlarm);
		s2.addSubscriber(fireAlarm);

		s1.setLevel(2.7);

		s2.setLevel(5.1);

		s1.setLevel(5.3);

	}

}
