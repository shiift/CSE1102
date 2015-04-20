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

public class Print implements Expression{

	private Object _expr;

	public Print(Object expr){
		// constructor that assigns the expression member variable
		_expr = expr;
	}

	@Override
	public void eval(Machine machine) {
		// pushes a display and the expression to the expression stack
		machine.pushExpr(new Display());
		machine.pushExpr(_expr);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "print " + _expr;
	}
}
