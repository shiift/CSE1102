import jeff.textconsole.*;

public class Agent {

	private Space _location;
	private String _name;
	
	public Agent(String newName, Space newLocation){
	// constructor for the agent class
		_location = newLocation;
		_name = newName;
	}
	
	public void setLocation(Space newLocation){
	// mutator for _location
		_location = newLocation;
	}
	public void setName(String newName){
	// mutator for _name
		_name = newName;
	}
	
	public Space getLocation(){
	// accessor for _location
		return _location;
	}
	public String getName(){
	// accessor for _name
		return _name;
	}
	
	public String toString(){
	// returns the name of the agent
		return _name;
	}
	public String toStringLong(){
	// returns the name of the agent and the location
		return _name + " is in " + _location;
	}
	
	public boolean usePortal(TextConsole textConsole){
	// calls Portal.transport to move the agent to a new location
		if(_location.getPortal() != null){
			textConsole.println(this.getName() + " takes the " + this.getLocation().getPortal().getName() + " from " + this.getLocation().getName() + " to " + this.getLocation().getPortal().getDestination().getName());
			_location.getPortal().transport(this);
			return true;
		}else{
			textConsole.println("There is no way out of this space");
			return false;
		}
	}

}
