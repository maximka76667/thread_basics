package c_join;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyRunnable(), "Thread-1");
		Thread t2 = new Thread(new MyRunnable(), "Thread-2");
		Thread t3 = new Thread(new MyRunnable(), "Thread-3");

		System.out.println("START");

		t1.start(); // Run t1

		t1.join(2000); // Code below this line will start only when t1 is dead or after 2 seconds
						// (in this case t1 lasts 5 seconds so it will start in 2 seconds)

		t2.start(); // t2 runs in 2 seconds

		t1.join(); // Code below this line will start only when t1 is dead (t1 dies in 5 seconds)

		t3.start(); // t3 runs in 5 seconds after the beginning of the program

		t1.join(); // Code below will run only
		t2.join(); // when all
		t3.join(); // 3 thread are dead

		System.out.println("ALL THREADS ARE DEAD, PROGRAM IS FINISHED");

	}

}
