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

public class If implements Expression{

	private Object _condition;
	private Object _consequent;
	private Object _alternate;

	public If(Object cond, Object cons, Object alt){
		// constructor that sets the condition, consequent and alternate
		_condition = cond;
		_consequent = cons;
		_alternate = alt;
	}

	@Override
	public void eval(Machine machine) {
		// pushes the Select expression and the condition to the expression stack
		machine.pushExpr(new Select(_consequent,_alternate));
		machine.pushExpr(_condition);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "if " + _condition + " then " + _consequent + " else " + _alternate;
	}
}
