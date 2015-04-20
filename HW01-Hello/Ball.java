
public class Ball {

	public String _color;
	public double _size;
	
	public Ball(String color, double size){
		_color = color;
		_size = size;
	}
	
	public double bounce(double height){
		return _size + height;
	}

}
