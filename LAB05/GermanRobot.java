
public class GermanRobot extends Robot {

	public GermanRobot(String robName) {
	// we will learn this later
		super(robName);
	}

	@Override
	public void sayHello() {
	// says hello and the name of the robot in German
		System.out.print("Guten Tag. ");
		this.sayName();
	}
	
	public void sayName(){
	// overrides the sayName() of Robot.
		System.out.println("Ich heiﬂe " + this.getName() + ".");
	}

}
