package multithreading;

import multithreading.model.EvenThreadRunnable;

public class RunnableThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//New State
		EvenThreadRunnable evenThreadRunnable = new EvenThreadRunnable();
		Thread evenThread = new Thread(evenThreadRunnable);
		evenThread.start();
		}
	}


