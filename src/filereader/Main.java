package filereader;

/**
 * Main class for test any task.
 * @author Tanasorn Tritawisup
 *
 */
public class Main {
	
	public static void main(String[] args){
		
		TaskTimer.measure(new AppendStringTask());
		TaskTimer.measure(new AppendStringBuilder());
		TaskTimer.measure(new BufferedReaderTask());
		
	}

}
