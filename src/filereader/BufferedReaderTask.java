package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTask implements Runnable{

    private String result = "";
	
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
	
	public String toString(){
		return String.format("Read %d charactors", result.length());
	}

}
