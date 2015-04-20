import java.io.File;
import jeff.imagewindow.*;
import jeff.textconsole.*;

public class CommandInterpreter {

	public static void run(Agent player, ImageWindow imageWin, TextConsole textConsole){
	// interprets commands and allows the user to move the user around the environment
		boolean bool = true;
		
		textConsole.println(player.getName() + " is in " + player.getLocation().getName());
		_showImage(player,imageWin);
		do{
			textConsole.print("==>");
			String whatDo = textConsole.readLine();
			if(whatDo.equals("quit")){
				bool = false;
			}else if(whatDo.equals("go")){
				player.usePortal(textConsole);
				_showImage(player,imageWin);
			}else if(whatDo.equals("help")){
				textConsole.println("commands:");
				textConsole.println("\t quit: exits the game.");
				textConsole.println("\t go: moves the player through the space's door/portal.");
				textConsole.println("\t help: displays this list of commands.");
				textConsole.println("\t look: displays the long description of the player's current location.");
				textConsole.println("\t where: displays the short description of the player's current location.");
			}else if(whatDo.equals("look")){
				textConsole.println(player.getLocation().toStringLong());
			}else if(whatDo.equals("where")){
				textConsole.println(player.getLocation().toString());
			}else if(whatDo.equals("destroy ring") && player.getLocation().getName().equals("Mount Doom")){
				textConsole.println("Congratulations, you've destroyed the Ring and defeated Sauron. Type \"quit\" to exit.");
			}else{
				textConsole.println("Sorry, \'" + whatDo + "\' is not a valid command. Type \'help\' for a list of commands.");
			}
		}while(bool);
		System.exit(0);
	}
	private static void _showImage(Agent player, ImageWindow imageWindow){
	// creates the image window for each space
		File imageDir = new File("data","images");
		File imageFile = new File(imageDir,player.getLocation().getImage());
		imageWindow.loadImage(imageFile);
	}

}
