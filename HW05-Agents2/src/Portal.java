
public class Portal {

	private String _name;
	private String _direction;
	private Space _destination;
	
	public Portal(String newName, String newDirection, Space newDestination){
	// constructor for the portal class
		_name = newName;
		_direction = newDirection;
		_destination = newDestination;
	}
	
	public void setName(String newName){
	// mutator for _name
		_name = newName;
	}
	public void setDirection(String newDirection){
	// mutator for _direction
		_direction = newDirection;
	}
	public void setDestination(Space newDestination){
	// mutator for _destination
		_destination = newDestination;
	}
	
	public String getName(){
	// accessor for _name
		return _name;
	}
	public String getDirection(){
	// accessor for _direction
		return _direction;
	}
	public Space getDestination(){
	// accessor for _destination
		return _destination;
	}
	
	public String toString(){
	// returns the name and direction of the portal
		return _name + " that goes " + _direction;
	}
	
	public String toStringLong(){
	// returns the name, direction and destination of the portal
		return _name + " that goes " + _direction + " to " + _destination.getName();
	}
	
	public void transport(Agent transportedAgent){
	// changes the location of the agent to the destination
		transportedAgent.setLocation(_destination);
	}

}
