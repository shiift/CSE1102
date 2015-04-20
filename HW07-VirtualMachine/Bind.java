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

public class Bind implements Expression{

	private Identifier _id;

	public Bind(Identifier id){
		// constructor for the Bind class (assigns id to member variable)
		_id = id;
	}

	@Override
	public void eval(Machine machine) {
		// binds an object to an instance
		Object obj = machine.peekObj();
		machine.bind(_id, obj);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "Bind(" + _id + ")";
	}
}
