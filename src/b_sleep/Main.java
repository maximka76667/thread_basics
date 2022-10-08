package b_sleep;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Current time before sleeping
		long start = System.currentTimeMillis();

		// Sleeping...
		Thread.sleep(2000);

		/*
		 * Time passed by sleeping 
		 * If you will run the above program, you will notice
		 * that the thread sleep time it prints is slightly greater than 2000. This is
		 * caused by how thread sleep works and operating system specific implementation
		 * of thread scheduler.
		 */
		System.out.println("Sleep time: " + (System.currentTimeMillis() - start));
	}

}
