import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
public class DrawingPanel extends JPanel implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	public DrawingPanel() {
		// constructor for DrawingPanel, sets the properties of the panel and causes the panel to refresh every 20 seconds
		this.setBackground(Color.WHITE);
		Timer timer = new Timer(20, this);
		timer.start();
		this.addMouseListener(this);
	}
	private ArrayList<Shape> _shapes = new ArrayList<Shape>();
	public void addShape(Shape shape) {
		// adds a shape to the panel when called
		_shapes.add(shape);
	}
	@Override
	public void actionPerformed(ActionEvent aev) {
		// when the timer goes off, refresh the panel
		this.repaint();
	}
	@Override
	public void paint(Graphics g) {
		// paint the graphics onto the panel for every shape
		super.paint(g);
		for(Shape shape: _shapes){
			shape.paint(g);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		// when the mouse is pressed get the pointer location and see if the mouse is within a shape
		Point p = mouseEvent.getPoint();
		for(Shape shape: _shapes){
			if(shape.contains(p)){
				shape.mousePressed(mouseEvent);
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}