package filereader;


public class TaskTimer{

	private static Stopwatch watch = new Stopwatch();
	
	public void measure(Runnable task){
		watch.start();
		task.run();
		watch.stop();
		System.out.printf("%s %.6f sec.\n", task.toString(), watch.getElapsed());		
	}

}
