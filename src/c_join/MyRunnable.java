package c_join;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " starts");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " finishes");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
