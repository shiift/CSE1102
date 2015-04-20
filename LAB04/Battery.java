// controls battery operations

public class Battery {

	private int _minutesLeft;
	
	public Battery() {
	// run the recharge method
		recharge();
	}
	public Battery(int batteryMin){
	// set the _minutesLeft variable equal to the parameter
		_minutesLeft = batteryMin;
	}
	public void recharge() {
	// set the _minutesLeft variable equal to 30
		_minutesLeft = 30;
	}
	public int getMinutes() {
	// return the value of the _minutesLeft variable
		return _minutesLeft;
	}

}
