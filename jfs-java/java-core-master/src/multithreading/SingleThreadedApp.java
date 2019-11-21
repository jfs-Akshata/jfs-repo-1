package multithreading;

public class SingleThreadedApp {
public static void main(String[] args) {
	System.out.println("Main thread starting");
	System.out.println(Thread.currentThread().getName());
	System.out.println("Main thread ending");
}
}
