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

public class Display implements Expression {

	@Override
	public void eval(Machine machine) {
		// displays the top object in the object stack
		System.out.print(machine.peekObj());
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "Display()";
	}

}
