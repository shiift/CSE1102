/*
 * Lab 07: Swing graphics
 * CSE1102 Spring 2013
 * William S. Dickson
 * 3/13/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create a graphics window and add rectangles that change colors when clicked
 */

import javax.swing.SwingUtilities;
public class Main {
	public static void main(String[] args) {
		// Swing graphics should be done in a concurrently-running
		// thread. This creates just such a thread.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// The new thread starts running in this method.
				// All this method does is call the _setup method. 
				_setup();
			}
		});
	}
	private static void _setup() {
		// creates the window and the squares
		GraphicsWindow graphicsWindow = new GraphicsWindow();
		Square sq = new Square(108, 120, 100);
		Square sq2 = new Square(246, 57, 125);
		Square sq3 = new Square(406, 112, 150);
		FlashingSquare flashingSq = new FlashingSquare(35, 244, 75);
		graphicsWindow.addShape(sq);
		graphicsWindow.addShape(sq2);
		graphicsWindow.addShape(sq3);
		graphicsWindow.addShape(flashingSq);
		}
}