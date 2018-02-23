package filereader;

public class Main {
	
	public static void main(String[] args){
		TaskTimer time = new TaskTimer();
		
		AppendStringTask task1 = new AppendStringTask();
		AppendStringBuilder task2 = new AppendStringBuilder();
		BufferedReaderTask task3 = new BufferedReaderTask();
		
		time.measure(task1);
		time.measure(task2);
		time.measure(task3);
		
		
		
	}

}
