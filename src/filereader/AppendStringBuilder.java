package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * This class use InputStream to read a file 
 * and return it to String by using StringBuilder.
 * @author Tanasorn Tritawisup
 *
 */
public class AppendStringBuilder implements Runnable{

    private StringBuilder builder = new StringBuilder();

    /**Read a text file and make a String from StringBuilder.*/
	@Override
	public void run() {
		InputStream in = null;
		try{
			in = new FileInputStream("src/filereader/Alice-in-Wonderland.txt");
			InputStreamReader reader = new InputStreamReader(in);
			
			int i;
			while((i = reader.read()) >  0) builder.append((char) i);
			if(reader != null) reader.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();	
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} 
	}
	
	@Override
	public String toString(){
		return String.format("Read %d charactors", builder.length());
	}
	
	
	
}
