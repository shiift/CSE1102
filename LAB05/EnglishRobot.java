
public class EnglishRobot extends Robot {

	public EnglishRobot(String robName) {
	// we will learn this later
		super(robName);

	}

	@Override
	public void sayHello() {
	// says hello and the name of the robot in English
		System.out.print("Hello there. ");
		this.sayName();
		
	}

}
