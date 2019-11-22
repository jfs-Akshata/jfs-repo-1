package java8.lambdas;

public class RunnableLambda {
	public static void main(String[] args) {
		/*
		 * Runnable runnable = () -> { for (int i = 0; i < 50; i += 2) {
		 * System.out.println(i); } }; new Thread(runnable).start();
		 */

//		new Thread(() -> {
//			for (int i = 0; i < 50; i += 2) {
//				System.out.println(i);
//			}
//		}).start();
		
		new Thread(()->System.out.println("Lambda is great!")).start();
	}
}