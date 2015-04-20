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

public class Sequence implements Expression {

	private Object[] _exprs;

	public Sequence(){
		// constructor that sets the expression member variable
		_exprs = null;
	}
	
	public Sequence(Object ... exprs){
		// constructor that sets the expression member variable
		_exprs = exprs;
	}

	@Override
	public void eval(Machine machine) {
		// store each expression in the sequence in the expression stack in reverse order
		if(_exprs == null){
			machine.pushExpr(false);
		}else{
			int i = _exprs.length;
			while(i > 1){
				i--;
				machine.pushExpr(_exprs[i]);
				machine.pushExpr(new Drop());
			}
			machine.pushExpr(_exprs[0]);
		}
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		String stringTemp = "";
		if(_exprs != null){
			for(int i = 0; i < _exprs.length ; i++){
				stringTemp += _exprs[i] + " ";
			}
		}
		return "seq " + stringTemp + "end";
	}

}
