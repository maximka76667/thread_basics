package d_wait;

public class Waiter implements Runnable {

	private Message msg;

	public Waiter(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is waiting");
		synchronized (msg) {
			try {
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " got notified");
		System.out.println("Message: " + msg.getMsg());
	}

}
