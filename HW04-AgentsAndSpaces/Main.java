
/*
 * AgentsAndSpaces
 * CSE1102 Project 4, Spring 2013
 * William Dickson
 * 2/16/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program runs a simulation in which a player can move around
 * an environment and view descriptions of the spaces that the player is in.
 */

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	// Creates instances and runs the program
		// Jeff's Test Code
		/*
		Space classroom = new Space();
		classroom.setName("classroom");
		classroom.setDescription("a large lecture hall");
		Space sidewalk = new Space();
		sidewalk.setName("sidewalk");
		sidewalk.setDescription("a plain concrete sidewalk with weeds growing through the cracks");
		Portal door = new Portal();
		door.setName("door");
		door.setDirection("outside");
		door.setDestination(sidewalk);
		classroom.setPortal(door);
		Agent student = new Agent();
		student.setName("Harry Potter");
		student.setLocation(classroom);
		
		CommandInterpreter.run(student);
		*/
		
		Space frontHall = new Space();
		frontHall.setName("front hall");
		frontHall.setDescription("a large front hall that has a high ceiling, a fancy chandelier, and a broken staircase");
		Space yard = new Space();
		yard.setName("yard");
		yard.setDescription("a long green front yard");
		Space secondFloor = new Space();
		secondFloor.setName("second floor loft");
		secondFloor.setDescription("a second floor loft above the front hall beside a newly broken window");
		Portal frontDoor = new Portal();
		frontDoor.setName("front door");
		frontDoor.setDirection("outside");
		frontDoor.setDestination(yard);
		Portal cannon = new Portal();
		cannon.setName("medieval cannon");
		cannon.setDirection("into the air");
		cannon.setDestination(secondFloor);
		Portal brokenStairs = new Portal();
		brokenStairs.setName("broken staircase");
		brokenStairs.setDirection("downstairs");
		brokenStairs.setDestination(frontHall);
		frontHall.setPortal(frontDoor);
		yard.setPortal(cannon);
		secondFloor.setPortal(brokenStairs);
		
		Agent player = new Agent();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name: ");
		player.setName(scan.nextLine());
		player.setLocation(frontHall);
		
		CommandInterpreter.run(player);
		scan.close();
	}

}
