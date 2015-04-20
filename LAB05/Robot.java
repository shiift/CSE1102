
public abstract class Robot {

	private String _name;
	
	public Robot(String robName){
	// constructor for Robot to set the name of the robot
		_name = robName;
	}
	
	public String getName() {
	// getter for _name member variable
		return _name;
	}

	public void sayName() {
	// says the name of the bot in English
		System.out.println("My name is " + getName() + ".");
	}
	
	public abstract void sayHello();
	// sets the abstract method

}
