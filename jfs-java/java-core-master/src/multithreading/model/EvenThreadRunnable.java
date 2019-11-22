package multithreading.model;

public class EvenThreadRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 50; i += 2) {
			System.out.println(i);
		}
	}
}