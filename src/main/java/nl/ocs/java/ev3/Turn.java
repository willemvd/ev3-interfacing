package nl.ocs.java.ev3;

import java.io.Serializable;

public class Turn implements Serializable {

	private static final long serialVersionUID = -1505409479307443259L;
	// positive to right, negative to left
	private int degree;

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
}
