package filereader;

import javax.management.timer.Timer;

/**
 * Stopwatch class that computes elapsed time
 * between a start and stop time.
 * @author Tanasorn Tritawisup
 *
 */
public class Stopwatch {

	private long startTime;
	private long stopTime;
	private boolean running;
	private double NANOSECOND = 1.0E-9;
	
	public Stopwatch(){
		running = false;
	}
	
	/**start if if Stopwatch is not running.*/
	public void start(){
		if(running) return;
		startTime = System.nanoTime();
		running = true;
	}
	
	/**stop the Stopwatch if it was running.*/
	public void stop(){
		if(!running) return;
		stopTime = System.nanoTime();
		running = false;
	}
	
	/**
	 * @return true if the stopwatch is running.
	 *         false if stopwatch is stopped.
	 */
	public boolean isRunning(){
		return running;
	}
	
	/**
	 * Get the elapsed time in seconds.
	 * (a) If the stopwatch is running, then return the time since start() until the current time. 
	 * (b) If stopwatch is stopped, then return the time between the start and stop times.
	 * @return return the elapsed time in seconds.
	 */
	public double getElapsed(){
		if(running) return (System.nanoTime() - startTime)*NANOSECOND;
		return (stopTime - startTime)*NANOSECOND;
	}
	

}
