/*
 * Lab 05: Inheritance and other cool stuff
 * CSE1102 Spring 2013
 * William S. Dickson
 * 2/27/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create abstact methods to force the creation of the sayHello() method
 * in all subclasses.
 */

public class Main {

	public static void main(String[] args) {
	// sets and runs the sayHello() method for each language of the robot "roomba"
		Robot roomba = new EnglishRobot("Roomba");
		roomba.sayHello();
		roomba = new FrenchRobot("Androïde");
		roomba.sayHello();
		roomba = new GermanRobot("Heidi");
		roomba.sayHello();
	}

}
