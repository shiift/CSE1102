import javax.swing.JFrame;
public class GraphicsWindow extends JFrame {
	private DrawingPanel _drawPanel = new DrawingPanel();
	private static final long serialVersionUID = 1L;
	public GraphicsWindow() {
		// sets the size and properties of the graphics window
		this.setSize(600, 400);
		this.setVisible(true);
		this.setContentPane(_drawPanel);
	}
	public void addShape(Shape newShape) {
		// adds a shape to the window when called
		_drawPanel.addShape(newShape);
	}
}