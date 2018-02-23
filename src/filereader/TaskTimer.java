package filereader;


public class TaskTimer{

	private static Stopwatch watch = new Stopwatch();
	
	public static void measure(Runnable task){
		watch.start();
		task.run();
		watch.stop();
		System.out.printf("%s in %.6f sec.\n", task.toString(), watch.getElapsed());		
	}

}
