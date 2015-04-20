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

public class Define implements Expression{

	private Identifier _id;
	private Object _expr;

	public Define(Identifier id, Object expr){
		// constructor that assigns member variables
		_id = id;
		_expr = expr;
	}

	@Override
	public void eval(Machine machine) {
		// pushes a bind and expression into the expression stack
		machine.pushExpr(new Bind(_id));
		machine.pushExpr(_expr);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "define " + _id + " = " + _expr;
	}
}
