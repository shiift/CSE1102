/*
 * Agents 2
 * CSE1102 Project 05, Spring 2013
 * William Dickson
 * 3/2/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program runs a simulation in which a player can move around
 * an environment and view descriptions of the spaces that the player is in.
 * Additionally, the user will see pictures of the places on the left and type
 * commands into an external window. The program was redesigned to use an ini file
 */

import java.io.File;
import jeff.imagewindow.*;
import jeff.textconsole.*;

public class Main {
	public static void main(String[] args) {
	// starts the image window, text console, and config loader and runs the program
		ImageWindow imageWindow = new ImageWindow();
		TextConsole textConsole = TextConsole.create();
		File configFile = new File("data","config.ini");
		ConfigLoader cl = new ConfigLoader(configFile);
		Agent a = cl.buildAll();
		CommandInterpreter.run(a,imageWindow,textConsole);
	}
}