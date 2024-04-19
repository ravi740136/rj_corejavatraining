package corejavatraining.exceptions.thread;

public class InterruptedExceptionExample {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		t.interrupt();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000l);
			System.out.println("Thread finished");
		} catch (InterruptedException ie) {
			System.out.println("printing exception...");
			ie.printStackTrace();
		}
	}
}
