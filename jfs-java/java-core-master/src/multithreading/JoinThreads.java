package multithreading;

public class JoinThreads {
	public static void main(String[] args) {
		System.out.println("Main Thread");
		// Creating the threads
		// New state
		EvenThread11 evenThread1 = new EvenThread11();
		OddThread11 oddThread1 = new OddThread11();
		// Start the threads
		evenThread1.start();
		oddThread1.start();
		// Start method call the run method.
		try {
			evenThread1.join();
			oddThread1.join();
			InterruptedException exception = new InterruptedException();
			throw exception;
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Main Thread Ending!");
	}
}

class EvenThread11 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}

class OddThread11 extends Thread {
	public void run() {
		for (int i = 1; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}
