package nl.ocs.java.ev3;

import java.io.Serializable;

public class TurnResult implements Serializable {

	private static final long serialVersionUID = 2334405753747842391L;
	// number of degrees turned
	private int degree;

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
}
