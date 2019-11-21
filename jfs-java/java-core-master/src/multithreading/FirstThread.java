package multithreading;

//The main thread run main method.
public class FirstThread{
	public static void main(String[] args) {
		// Get the current thread (main thread)
		Thread thread = Thread.currentThread();
		// Printing the thread name.
		System.out.println(thread.getName());
        thread.stop();
		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("I had enough sleep. Thank you!");
	}
}
