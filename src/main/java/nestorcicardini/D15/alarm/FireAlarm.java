package nestorcicardini.D15.alarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nestorcicardini.D15.ControlCenter;
import nestorcicardini.D15.sensor.Sensor;

// Questa classe si occupa di gestire le sonde 
// e di comunicare al centro di controllo in caso di incendio
@Getter
@Setter
@NoArgsConstructor
@Component
public class FireAlarm implements Subscriber {
	private String alarmMsg;

	@Autowired
	private ControlCenter controlCenter;

	@Override
	public void update(Sensor sensor) {
		if (sensor.getLevel() > 5) {
//			controlCenter.getNotification(sensor);
			System.out
					.println("ALERT! The smoke sensor '" + sensor.getSensorId()
							+ "' has exceeded the allowed smoke level.");
		}
	}

}
