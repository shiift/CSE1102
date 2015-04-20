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

public class Select implements Expression{

	private Object _consequent;
	private Object _alternate;

	public Select(Object cons, Object alt){
		// assigns the consequent and alternate member variables
		_consequent = cons;
		_alternate = alt;
	}

	@Override	
	public void eval(Machine machine) {
		// pops the top object in the object stack, if the condition is a boolean that is true or false, push the consequent or alternate to the expression stack (respectively) or else throw a runtime exception
		Object condition = machine.popObj();
		if(condition.equals(true)){
			machine.pushExpr(_consequent);
		}else if(condition.equals(false)){
			machine.pushExpr(_alternate);
		}else{
			throw new RuntimeException("Select expected a boolean expression, found: " + condition);
		}
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "Select(" + _consequent + "," + _alternate + ")";
	}
}
