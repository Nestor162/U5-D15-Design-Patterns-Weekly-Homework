package nestorcicardini.D15.alarm;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import nestorcicardini.D15.sensor.Sensor;
import nestorcicardini.D15.sensor.SmokeSensorCreator;

@Component
public class AlarmRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		FireAlarm alarm = new FireAlarm();

		Sensor s1 = new SmokeSensorCreator().createSensor(UUID.randomUUID(),
				12.123, 20.564);

		s1.addSubscriber(alarm);

		s1.setLevel(2.7);

		s1.setLevel(5.3);

	}

}
