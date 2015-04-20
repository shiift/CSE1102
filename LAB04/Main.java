/*
 * Lab 04: Robots and Debugging
 * CSE1102 Spring 2013
 * William S. Dickson
 * 2/20/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create two new robots and display the minutes left on their batteries
 */

public class Main {

	public static void main(String[] args) {
	// 
		Robot robot1 = new Robot();
		Robot robot2 = new Robot("WALL-E", 7, 10);
		System.out.println(robot1.getMinutes());
		System.out.println(robot2.getMinutes());
	}

}