package d_wait;

public class Main {

	public static void main(String[] args) {
		Message msg = new Message("Don't show this message");

		Thread tWaiter1 = new Thread(new Waiter(msg), "Waiter 1");
		Thread tWaiter2 = new Thread(new Waiter(msg), "Waiter 2");

		Thread tNotifier = new Thread(new Notifier(msg), "Notifier");

		tWaiter1.start();
		tWaiter2.start();

		tNotifier.start();
	}

}
