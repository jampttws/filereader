package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTask implements Runnable{

	public static String readFile(String filename){
		FileReader reader;
		BufferedReader br;
        String result = "";
        String line;
		
		try{
			reader = new FileReader(filename);
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
		return result;	
	}
	
	@Override
	public void run() {
		String read = readFile("src/filereader/Alice-in-Wonderland.txt");
		System.out.print("Read "+ read.length() + " characters ");
	}

}
