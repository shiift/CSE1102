import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteFile {
	public static void go(String fileName, String fullText){
		try{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print(fullText);
			pw.close();
		}catch(IOException e){
		    System.out.println("Unable to write to file.");
		};
	}
}
