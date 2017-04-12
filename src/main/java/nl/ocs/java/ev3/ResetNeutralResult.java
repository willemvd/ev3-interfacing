package nl.ocs.java.ev3;

import java.io.Serializable;

public class ResetNeutralResult implements Serializable {

	private static final long serialVersionUID = 1049909574088647027L;

	private boolean done;

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
