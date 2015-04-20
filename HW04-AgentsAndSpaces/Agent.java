
public class Agent {

	private Space _location;
	private String _name;
	
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
	
	public boolean usePortal(){
	// calls Portal.transport to move the agent to a new location
		if(_location.getPortal() != null){
			_location.getPortal().transport(this);
			return true;
		}else{
			return false;
		}
	}

}
