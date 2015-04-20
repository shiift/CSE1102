
public class Node<E> {
	public E _data;
	public Node<E> _next;
	public Node(E data, Node<E>next) {
	// constructor that sets the member variables
		_data = data;
		_next = next;
	}
	@Override
	public String toString() {
	// custom toString that adds the following list elements to the string
		if(_next == null){
			return (String) _data;
		}
		String s = _data + " " + _next.toString();
		return s;
	}
	
	public int length() {
	// returns the length of the linked list
		if(_next == null) {
			return 1;
		}
		return 1 + _next.length();
	}
	public void append(E item) {
	// adds an element to the end of the linked list
		if(_next == null) {
			_next = new Node<E>(item,null);
			return;
		}
		_next.append(item);
	}
	public boolean contains(E item) {
	// checks to see if the list contains an item
		if(_data == item || _next == item){
			return true;
		}else if(_next == null) {
			return false;
		}
		return _next.contains(item);
	}
	public E get(int n){
	// checks to see the item at a position number n
		if(n == 0){
			return _data;
		}
		if(_next == null){
			throw new RuntimeException("index out of bounds");
		}
		return _next.get(n-1);
	}

}