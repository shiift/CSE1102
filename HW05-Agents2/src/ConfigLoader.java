import jeff.ini.*;
import java.util.HashMap;
import java.io.File;

public class ConfigLoader {
	private Ini _ini;
	private HashMap<String, Space> _spaces = new HashMap<String, Space>();
	private HashMap<String, Portal> _portals = new HashMap<String, Portal>();
	private HashMap<String, Agent> _agents = new HashMap<String, Agent>();
	
	public ConfigLoader(File iniFile) {
	// creates a new instance of the ini interpreter
		_ini = new Ini(iniFile);
	}
	
	public Agent buildAll() {
	// builds all of the instances of the spaces, portals, and agents
		_buildSpaces();
		_buildPortals();
		_buildExits();
		_buildDestinations();
		_buildAgents();
		return _selectStartAgent();
	}
	private void _buildSpaces(){
	// builds the spaces
		for(String spaceName : _ini.keys("spaces")){
			String spaceDescription = _ini.get("spaces", spaceName);
			String spaceImage = _ini.get("images", spaceName);
			String spaceNameChanged = spaceName.replaceAll("_", " ");
			Space spaceInstance = new Space(spaceNameChanged, spaceDescription, spaceImage, null);
			_spaces.put(spaceName,spaceInstance);
		}
	}
	private void _buildPortals(){
	// builds the portals
		for(String portalName  : _ini.keys("portals")){
			String portalDescription = _ini.get("portals", portalName);
			String portalNameChanged = portalName.replaceAll("_", " ");
			Portal portalInstance = new Portal(portalNameChanged, portalDescription, null);
			_portals.put(portalName, portalInstance);
		}
	}
	private void _buildExits(){
	// attaches exits to the spaces
		for(String spaceName : _ini.keys("exits")){
			String portalName = _ini.get("exits", spaceName);
			Space spaceInstance = _spaces.get(spaceName);
			Portal portalInstance = _portals.get(portalName);
			spaceInstance.setPortal(portalInstance);
		}
	}
	private void _buildDestinations(){
	// attaches spaces to the portals as destinations
		for(String portalName : _ini.keys("destinations")){
			String destinationName = _ini.get("destinations", portalName);
			Portal portalInstance = _portals.get(portalName);
			Space destinationInstance = _spaces.get(destinationName);
			portalInstance.setDestination(destinationInstance);
			if(destinationInstance == null){
				System.out.println("The exit does not exist");
				System.exit(1);
			}
		}
	}
	private void _buildAgents(){
	// creates agents
		for(String agentName : _ini.keys("agents")){
			String spaceName = _ini.get("agents", agentName);
			Space spaceInstance = _spaces.get(spaceName);
			if(spaceInstance == null){
				System.out.println("The agent is not in a defined space");
				System.exit(1);
			}
			Agent agentInstance = new Agent(agentName,spaceInstance);
			_agents.put(agentName, agentInstance);
		}
	}
	private Agent _selectStartAgent(){
	// sets an agent as the start agent
		String startAgentName = _ini.get("start","agent");
		Agent agentInstance = _agents.get(startAgentName);
		if(agentInstance == null){
			System.out.println("No starting agent was defined and/or found");
			System.exit(1);
		}
		return agentInstance;
	}
}