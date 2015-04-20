/*
 * Virtual Machine
 * CSE1102 Project 07, Spring 2013
 * William Dickson
 * 4/14/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program creates a simple virtual machine
 */

public class Main {

	public static void main(String[] args) {
		// the main method runs the program by defining a machine and constants
		Machine m1 = new Machine();
		m1.pushExpr(new Sequence());
		System.out.println(m1);
		m1.run();
		System.out.println(m1);
	}
}
