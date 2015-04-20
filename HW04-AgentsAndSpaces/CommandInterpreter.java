import java.util.Scanner;


public class CommandInterpreter {

	public static void run(Agent player){
	// interprets commands and allows the user to move the user around the environment
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		
		System.out.println(player.getName() + " is in the " + player.getLocation().getName());
		do{
			System.out.print("==>");
			String whatDo = sc.next();
			if(whatDo.equals("quit")){
				bool = false;
			}else if(whatDo.equals("go")){
				if(player.getLocation().getPortal() != null){
					System.out.println(player.getName() + " takes the " + player.getLocation().getPortal().getName() + " from the " + player.getLocation().getName() + " to the " + player.getLocation().getPortal().getDestination().getName());
					player.usePortal();
				}else{
					System.out.println("There is no way out of this room.");
				}
			}else if(whatDo.equals("help")){
				System.out.println("commands:");
				System.out.println("\t quit: exits the game.");
				System.out.println("\t go: moves the player through the space's door/portal.");
				System.out.println("\t help: displays this list of commands.");
				System.out.println("\t look: displays the long description of the player's current location.");
				System.out.println("\t where: displays the short description of the player's current location.");
			}else if(whatDo.equals("look")){
				System.out.println(player.getLocation().toStringLong());
			}else if(whatDo.equals("where")){
				System.out.println(player.getLocation().toString());
			}else{
				System.out.println("Sorry, \'" + whatDo + "\' is not a valid command. Type \'help\' for a list of commands.");
			}
		}while(bool);
		sc.close();
		
	}

}
