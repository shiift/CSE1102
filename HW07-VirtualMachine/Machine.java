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

import java.util.HashMap;
import java.util.LinkedList;


public class Machine {

	private LinkedList<Object> _objStack;
	private LinkedList<Object> _exprStack;
	private HashMap<Identifier, Object> _env;

	public Machine(){
		// constructor that assigns the member variables
		_objStack = new LinkedList<Object>();
		_exprStack = new LinkedList<Object>();
		_env = new HashMap<Identifier, Object>();
	}

	public void pushObj(Object newObject){
		// pushes an object to the object stack
		_objStack.push(newObject);
	}
	public Object popObj(){
		// removes the top object from the object stack
		return _objStack.pop();
	}
	public Object peekObj(){
		// peeks at the top object on the object stack, but does not pop it
		return _objStack.peek();
	}

	public void pushExpr(Object newObject){
		// pushes an object to the expression stack
		_exprStack.push(newObject);
	}
	public Object popExpr(){
		// removes the top object from the expression stack
		return _exprStack.pop();
	}

	public boolean step(){
		// completes the expression at the top of the expression stack
		if(!_exprStack.isEmpty()){
			Object expr = popExpr();
			System.out.println("Evaluating " + expr + " | " + this);
			if(expr instanceof Expression){
				((Expression) expr).eval(this);
			}else{
				_objStack.push(expr);
			}
			return true;
		}else{
			return false;
		}
	}
	public void run(){
		// runs the step method until it returns false (when there are no more objects in the expression stack)
		while(step());
	}

	public void bind(Identifier id, Object obj){
		// binds an object to an identifier
		_env.put(id,obj);
	}
	public Object lookup(Identifier id){
		// gets the object given an identifier
		return _env.get(id);
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return "Machine(" + _objStack + "," + _exprStack + ")";
	}
}
