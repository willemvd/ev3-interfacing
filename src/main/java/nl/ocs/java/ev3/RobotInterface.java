package nl.ocs.java.ev3;

public interface RobotInterface {

	SeekBeaconResult seek();

	TurnResult turn(Turn turn);

	ResetNeutralResult reset();

	void fire();

}
