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

public class Repeat implements Expression{

	private Identifier _id;
	private int _count;
	private Object _expr;

	public Repeat(Identifier id, int count, Object expr){
		// constructor that assigns the identifier, count, and expression to member variables
		_id = id;
		_count = count;
		_expr = expr;
	}

	@Override
	public void eval(Machine machine) {
		// pushes a loop with the given member variables to the expression stack
		machine.pushExpr(new Loop(_count, _id, _expr));
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "repeat " + _id + " " + _count + " " +  _expr;
	}
}
