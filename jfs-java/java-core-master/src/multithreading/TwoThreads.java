package multithreading;

public class TwoThreads {
public static void main(String[] args) {
	System.out.println("Main Thread");
	//Creating the threads
	//New state
	EvenThread1 evenThread1 = new EvenThread1();
	OddThread1 oddThread1 = new OddThread1();
	//Start the threads
	evenThread1.start();
	oddThread1.start();
	//Start method call the run method.
	System.out.println("Main Thread Ending!");
}
}

class EvenThread1 extends Thread{
	public void run() {
		for(int i = 0; i<50; i+=2) {
			System.out.println(i);
		}
	}
}
class OddThread1 extends Thread{
	public void run() {
		for(int i = 1; i<50; i+=2) {
			System.out.println(i);
		}
	}
}
