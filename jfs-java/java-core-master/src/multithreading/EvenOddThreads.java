package multithreading;

public class EvenOddThreads {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//New State
		EvenThread evenThread = new EvenThread();
		// evenThread.run();
		//Runnable State
		evenThread.start();
		
//		try {
//			evenThread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for (int i = 0; i < 10; i = i + 2) {
			//try {
			//	Thread.sleep(1000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			System.out.println(i);

		}
	}
}

class EvenThread extends Thread {
	//Running state
	public void run() {
		for (int i = 1; i < 500; i = i + 2) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
	//Terminated or Dead state
}
