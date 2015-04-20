import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
public class Square implements Shape {
	private ArrayList<Color> _colors = new ArrayList<Color>();
	private int _count = 0;
	private Color _color = Color.BLACK;
	private int _x, _y, _size;
	public Square(int x, int y, int size) {
		// constructor for Square, sets the member variables and adds colors to the color array
		_x = x;
		_y = y;
		_size = size;
		_colors.add(Color.BLACK);
		_colors.add(Color.GREEN);
		_colors.add(Color.RED);
		_colors.add(Color.BLUE);
	}
	@Override
	public void paint(Graphics g) {
		// overrides the Shape abstract method and sets a color and rectangle based on member variables
		g.setColor(_color);
		g.drawRect(_x, _y, _size, _size);
	}
	@Override
	public void mousePressed(MouseEvent mev) {
		// overrides the Shape abstract method and executes the following color (and position) changes
		// based upon mouse clicks
		if(mev != null){
			if(SwingUtilities.isLeftMouseButton(mev)){
				if(_count < 3){
					_count += 1;
					_color = _colors.get(_count);
				}else{
					_count = 0;
					_color = _colors.get(_count);
				}
			}else{
				if(_count > 0){
					_count -= 1;
					_color = _colors.get(_count);
				}else{
					_count = 3;
					_color = _colors.get(_count);
				}
			}

			_x = mev.getX() - _size/2;
			_y = mev.getY() - _size/2;
		}else{
			if(_count < 3){
				_count += 1;
				_color = _colors.get(_count);
			}else{
				_count = 0;
				_color = _colors.get(_count);
			}
		}
	}
	@Override
	public boolean contains(Point p) {
		// checks to see if the click mouse is within the rectangle
		return p.x >= _x && p.x < _x+_size && p.y >= _y && p.y < _y+_size;
	}
}