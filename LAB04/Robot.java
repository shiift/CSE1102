// controls robot values

public class Robot {

	private String _name;
	private int _serialNum;
	private Battery _powerSrc;
//	private Gripper _gripper;
	
	public Robot() {
	// set the default robot values
		_name = "";
		_serialNum = -1;
		_powerSrc = new Battery();
//		_gripper = new Gripper();
		_powerSrc.recharge();
	}
	
	public Robot(String name, int serialNum, int batteryMin) {
	// set the robot name, serial number and battery charge equal to the parameter values
		_name = name;
		_serialNum = serialNum;
		_powerSrc = new Battery(batteryMin);
	}
	
	public int getMinutes() {
	// return the value of getMinutes() from the instance of the Battery
		return _powerSrc.getMinutes();
	}
}
