package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilder implements Runnable{

    private StringBuilder builder = new StringBuilder();

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
	
	public String toString(){
		return String.format("Read %d charactors", builder.length());
	}
	
	
	
}
