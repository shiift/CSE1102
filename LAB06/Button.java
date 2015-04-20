import java.awt.event.MouseEvent;
import wheels.users.*;

public abstract class Button extends Rectangle {

	private Ellipse _ellipse;

	public Button(int x, int y, Ellipse ellipseInstance){
	// constructor for the button
		_ellipse = ellipseInstance;
		this.setSize(35, 20);
		this.setLocation(x, y);
		this.setColor(_ellipse.getColor());

	}

	@Override
	public void mousePressed(MouseEvent e){
	// darkens the color of the button on mouse press
		setColor(getColor().darker());
	}
	@Override
	public void mouseReleased(MouseEvent e){
	// lightens the color of the button on mouse release
		setColor(getColor().brighter());
	}

	@Override
	public abstract void mouseClicked(MouseEvent e);
	// abstract method for a mouse click defined to be used in inherited classes

}
