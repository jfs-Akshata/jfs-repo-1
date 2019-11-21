package multithreading;

public class ThreadPriority {
	public static void main(String[] args) {
		System.out.println("Main Thread");
		// Creating the threads
		// New state
		EvenThread111 evenThread1 = new EvenThread111();
		OddThread111 oddThread1 = new OddThread111();
		// Start the threads
		evenThread1.setPriority(Thread.MIN_PRIORITY);
		oddThread1.setPriority(Thread.MAX_PRIORITY);
		evenThread1.start();
		oddThread1.start();

		System.out.println("Main Thread Ending!");
	}
}

class EvenThread111 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}

class OddThread111 extends Thread {
	public void run() {
		for (int i = 1; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}
