import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

public class DownButton extends Button {
	
	private Ellipse _ellipse;
	public DownButton(int x, int y, Ellipse ellipseInstance) {
	// gets the parent variables and re-sets the _ellipse member variable
		super(x, y, ellipseInstance);
		_ellipse = ellipseInstance;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	// moves the ellipse down on press
		int xLoc = _ellipse.getXLocation();
		int yLoc = _ellipse.getYLocation();
		_ellipse.setLocation(xLoc, yLoc+20);
	}

}
