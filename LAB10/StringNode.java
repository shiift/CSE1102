public class StringNode {
	public String _data;
	public StringNode _next;
	public StringNode(String data, StringNode next) {
		_data = data;
		_next = next;
	}
	@Override
	public String toString() {
		if(_next == null)
			return _data;
		String s = _data + " " + _next.toString();
		return s;
	}
}