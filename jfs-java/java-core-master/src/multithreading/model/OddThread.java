package multithreading.model;
public class OddThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 50; i += 2) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			System.out.println(e);
			}
			System.out.println(i);
		}
	}
}