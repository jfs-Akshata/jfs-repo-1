package multithreading;

import java.awt.Event;

public class MultithreadedApplication {
	public static void main(String[] args) {
		// creating the threads

		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		evenThread.start();
		oddThread.start();
		for (int i = 1000; i < 1050; i += 2) {
			System.out.println(i);
		}
	}
}

class EvenThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}

class OddThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}