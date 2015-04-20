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

public class Identifier implements Expression {

	private String _name;

	public Identifier(String name){
		// constructor that assigns the _name member variable
		_name = name;
	}

	@Override
	public int hashCode() {
		// overrides the hashCode method
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		// overrides the equals method so it must return true if the argument supplied is an instanceof Identifier and the name of that Identifier.equals the name of this Identifier.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Identifier && this.toString() == ((Identifier) obj).toString()){
			return true;	
		}else{
			return false;
		}
	}

	@Override
	public void eval(Machine machine) {
		// pushes a lookup of this Identifier to the object stack if this is not null
		if(machine.lookup(this).equals(null)){
			throw new RuntimeException("unbound identifier: " + this);
		}else{
			machine.pushObj(machine.lookup(this));
		}
	}

	public String toString(){
		// overrides the default toString method with a more useful one
		return _name;
	}
}
