import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class FlashingSquare extends Square implements ActionListener {
	public FlashingSquare(int x, int y, int size) {
		// inherits the properties of Square and starts a timer
		super(x, y, size);
		Timer timer = new Timer(500, this);
		timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// performs these actions when the timer goes off
		this.mousePressed(null);
	}

}
