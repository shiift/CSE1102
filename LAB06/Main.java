/*
 * Lab 06: Moving shapes
 * CSE1102 Spring 2013
 * William S. Dickson
 * 3/6/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create ellipses with buttons to move the ellipse up and down
 */

import java.awt.Color;
import wheels.users.*;

public class Main {

	public static void main(String[] args){
	// creates the ellipses and the corresponding button instances
		new Frame();
		Ellipse ellipse1 = new Ellipse();
		new UpButton(10, 10, ellipse1);
		new DownButton(10, 40, ellipse1);
		
		Ellipse ellipse2 = new Ellipse(Color.BLUE);
		new UpButton(655, 10, ellipse2);
		new DownButton(655, 40, ellipse2);
	}
	
}
