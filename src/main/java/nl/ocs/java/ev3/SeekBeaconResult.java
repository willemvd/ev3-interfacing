package nl.ocs.java.ev3;

import java.io.Serializable;

public class SeekBeaconResult implements Serializable {

	private static final long serialVersionUID = -3003351746797560712L;

	private Beacon[] beacons;

	public Beacon[] getBeacons() {
		return beacons;
	}

	public void setBeacons(Beacon[] beacons) {
		this.beacons = beacons;
	}
}
