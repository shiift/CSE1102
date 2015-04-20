
public class Space {

	private String _name;
	private String _description;
	private String _image;
	private Portal _portal;
	
	public Space(String newName, String newDescription, String newImage, Portal newPortal){
	// constructor for the space class
		_name = newName;
		_description = newDescription;
		_image = newImage;
		_portal = newPortal;
	}
	
	public void setName(String newName){
	// mutator for _name	
		_name = newName;
	}
	public void setDescription(String newDescription){
	// mutator for _description
		_description = newDescription;
	}
	public void setPortal(Portal newPortal){
	// mutator for _portal
		_portal = newPortal;
	}
	
	public String getName(){
	// accessor for _name
		return _name;
	}
	public String getDescription(){
	// accessor for _description
		return _description;
	}
	public String getImage(){
	// accessor for _image
		return _image;
	}
	public Portal getPortal(){
	// accessor for _portal
		return _portal;
	}
	
	public String toString(){
	// returns the name of the space
		return _name;
	}
	
	public String toStringLong(){
	// returns the name and description of the space
		if(_portal != null){
			return _name + ": " + _description + " with a " + _portal.toStringLong();
		}else{
			return _name + ": " + _description;
		}
	}

}
