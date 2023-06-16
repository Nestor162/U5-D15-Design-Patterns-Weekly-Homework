package nestorcicardini.D15.sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import nestorcicardini.D15.alarm.Subscriber;

@Getter
@Setter
@AllArgsConstructor
@Component
public abstract class Sensor implements Subscriber {
	private UUID sensorId;
	private double latitude;
	private double longitude;
	private double level = 0;

	private List<Subscriber> subscribers = new ArrayList<>();

	public void notifySubscribers() {
		for (Subscriber sub : subscribers) {
			sub.update(this);
		}
	}

	public void setLevel(double level) {
		this.level = level;
		System.out.println("Smoke level has changed...");
		this.notifySubscribers();
	}

	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public abstract void getSensorInfo();

	public Sensor(UUID sensorId, double latitude, double longitude) {
		super();
		this.sensorId = sensorId;
		this.latitude = latitude;
		this.longitude = longitude;
	}

}
