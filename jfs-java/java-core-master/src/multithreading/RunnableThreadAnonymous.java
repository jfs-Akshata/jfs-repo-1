package multithreading;

import multithreading.model.EvenThreadRunnable;

public class RunnableThreadAnonymous {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Runnable evenThreadRunnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i += 2) {
					System.out.println(i);
				}
			}
		};
		new Thread(evenThreadRunnable).start();
	}
}
