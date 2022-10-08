package thread_basics;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new WorkRunnable());
		Thread t2 = new Thread(new WorkRunnable());

		System.out.println("Runnable threads are starting");

		t1.start();
		t2.start();
		System.out.println("Runnable threads have been started");

		Thread t3 = new WorkThread("Thread-3");
		Thread t4 = new WorkThread("Thread-4");

		System.out.println("Work threads are starting");
		t3.start();
		t4.start();
		System.out.println("Work threads have been started");
	}

}
