package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilder implements Runnable{

	public String readFileToStringBuilder(String filename){
		StringBuilder builder = new StringBuilder();
		InputStream in = null;
		try{
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int i;
			while((i = reader.read()) >  0) builder.append((char) i);
			if(reader != null) reader.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();	
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} 
		return builder.toString();
	}

	@Override
	public void run() {
		String read = readFileToStringBuilder("src/filereader/Alice-in-Wonderland.txt");
		System.out.print("Read "+ read.length() + " characters ");
	}
	
	
	
}
