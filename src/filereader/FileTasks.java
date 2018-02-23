package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class FileTasks {
	
	public static String readFileToString(String filename) {
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
	
	public static String readFileToStringBuilder(String filename){
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
	
	public static void main(String[] args){
		Stopwatch sw = new Stopwatch();
		sw.start();
		String alice = readFileToString("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", alice.length(), sw.getElapsed());
		
		sw.start();
		String alice2 = readFileToStringBuilder("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", alice2.length(), sw.getElapsed());
		
		sw.start();
		String alice3 = readFile("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", alice3.length(), sw.getElapsed());
	}
	
	

}
