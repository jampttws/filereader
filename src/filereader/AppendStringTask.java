package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable{

	public String readFileToString(String filename) {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
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
		return data;
	}
	
	@Override
	public void run() {
		String read = readFileToString("src/filereader/Alice-in-Wonderland.txt");
		System.out.print("Read "+ read.length() + " characters ");
	}

}
