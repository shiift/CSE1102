import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
	public static String go(String fileName){
		String fullText = null;
		try {
			FileReader fr;
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String lineText;
			while(true){
				lineText = br.readLine();
				if(lineText == null){
					break;
				}
				fullText += lineText + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error reading from file.");
		} catch (IOException e) {
			System.out.println("Error reading from line.");
		}
		return fullText;
	}
}
