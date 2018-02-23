package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable{
	
	private String data = "";
	
	@Override
	public void run() {
		InputStream in = null;
		try {
			in = new FileInputStream("src/filereader/Alice-in-Wonderland.txt");
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			while(true){
				c = reader.read();
				if(c < 0) break;
				data = data + (char)c;
			}
			if (reader != null) reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
	
	public String toString(){
		return String.format("Read %d charactors", data.length());
	}

}
