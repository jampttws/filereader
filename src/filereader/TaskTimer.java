package filereader;

/**
 * This class can compute and print the elapsed time for any task.
 * @author Tanasorn Tritawisup
 *
 */
public class TaskTimer{

	private static Stopwatch watch = new Stopwatch();
	
	/**Measure the time that use to read a file*/
	public static void measure(Runnable task){
		watch.start();
		task.run();
		watch.stop();
		System.out.printf("%s in %.6f sec.\n", task.toString(), watch.getElapsed());		
	}

}
