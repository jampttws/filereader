package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class use BufferedReader to read a file 
 * and return it to String.
 * @author Tanasorn Tritawisup
 *
 */
public class BufferedReaderTask implements Runnable{

    private String result = "";
	
    /** Read a text file by using BufferedReader and get it into String. */
	@Override
	public void run() {
		FileReader reader;
		BufferedReader br;
        String line;
		
		try{
			reader = new FileReader("src/filereader/Alice-in-Wonderland.txt");
			br = new BufferedReader(reader);
			while((line = br.readLine()) != null){
				result = result + line + '\n';
			}  
		    if(br != null) br.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();	
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return String.format("Read %d charactors", result.length());
	}

}
