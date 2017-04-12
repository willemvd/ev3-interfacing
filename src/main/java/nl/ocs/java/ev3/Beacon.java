package nl.ocs.java.ev3;

import java.io.Serializable;

public class Beacon implements Serializable {

	private static final long serialVersionUID = 3813843936067251009L;

	private int id;
	private int angle;
	private int distance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
