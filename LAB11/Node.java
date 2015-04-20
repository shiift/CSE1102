
public class Node {

	public Object _key;
	public Object _value;
	public Node _nextNode;
	
	public Node(Object key, Object value, Node nextNode){
	// constructor that sets the values of the member variables
		_key = key;
		_value = value;
		_nextNode = nextNode;
	}

	public String toString(){
	// more useful toString method that displays the values of the nodes
		String s = _key.toString() + "=" + _value.toString();
		if(_nextNode != null)
			s += ", " + _nextNode.toString();
		return s;
	}
}
