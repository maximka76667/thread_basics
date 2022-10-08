package d_wait;

public class Notifier implements Runnable {

	private Message msg;

	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (msg) {
				msg.setMsg("Show this message! P.S. " + name);
				msg.notify();
//				msg.notifyAll(); // If uncomment this line and comment previous all waiter will get notified at
				// the same moment
			}
		}
	}

}
