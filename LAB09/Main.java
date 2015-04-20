import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a file name: ");
		String fileName = scan.nextLine();
		String fullText = getText(scan);
		WriteFile.go(fileName, fullText);
		System.out.println(ReadFile.go(fileName));
	}
	
	public static String getText(Scanner scan) {
		System.out.println("Enter text to store in the file, or an empty line when you are finished.");
		String lineText;
		String fullText = "";
		while(true){
			lineText = scan.nextLine();
			if(lineText.isEmpty()){
				break;
			}
			fullText += lineText + "\n";
		}
		return fullText;
	}

}
