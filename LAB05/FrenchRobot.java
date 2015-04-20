
public class FrenchRobot extends Robot {

	public FrenchRobot(String robName) {
	// we will learn this later
		super(robName);
	}

	@Override
	public void sayHello() {
	// says hello and the name of the robot in French
		System.out.print("Bon jour. ");
		this.sayName();
	}
	
	public void sayName(){
	// overrides the sayName() of Robot.
		System.out.println("Je m'appelle " + this.getName() + ".");
	}

}
