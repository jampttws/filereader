package filereader;

public class TaskTimer{

	private static Stopwatch watch = new Stopwatch();
	
	public void measure(Runnable task){
		watch.start();
		task.run();
		watch.stop();
		System.out.printf("%.6f sec.\n", watch.getElapsed());		
	}

}
