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

public class Loop implements Expression{
	private int _limit;
	private int _count = 1;
	private boolean _firstIter = true;
	private Identifier _id;
	private Object _expr;

	public Loop(int limit, Identifier id, Object expr){
		// constructor that sets the limit, identifier, and expression
		_limit = limit;
		_id = id;
		_expr = expr;
	}

	@Override
	public void eval(Machine machine) {
		// binds the count to an identifier, pops the object on the object stack (if it is not the first iteration) and then pushes this and the next object to the expression stack
		if(_count > _limit){
			return;
		}
		machine.bind(_id,_count);
		_count++;
		if(_firstIter){
			_firstIter = false;
		}else{
			machine.popObj();
		}
		machine.pushExpr(this);
		machine.pushExpr(_expr);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "Loop(" + _count + "," + _limit + "," + _id + "," + _expr + ")";
	}
}
