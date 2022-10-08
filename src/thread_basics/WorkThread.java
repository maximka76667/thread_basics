package thread_basics;

public class WorkThread extends Thread {
	public WorkThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Work started " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			process();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Work finished " + Thread.currentThread().getName());
	}

	public void process() throws InterruptedException {
		Thread.sleep(5000);
	}
}
