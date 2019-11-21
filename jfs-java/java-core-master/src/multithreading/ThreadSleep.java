package multithreading;


import multithreading.model.EvenThread;
import multithreading.model.OddThread;

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		// creating the threads
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		evenThread.start();
		//Thread.sleep(5000);
		oddThread.start();
		//oddThread.sleep(5000);
		for (int i = 100; i < 150; i += 2) {
			System.out.println(i);
		}
	}
}




