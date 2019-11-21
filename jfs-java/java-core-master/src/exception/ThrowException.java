package exception;

import java.io.IOException;

import javax.imageio.IIOException;

public class ThrowException {
	public static void main(String[] args)  {
//		try {
//			throwUncheckedException();
//		} catch ( NullPointerException e) {
//			System.out.println("NPE caught in the calling function!");
//		}
		throwUncheckedException();
		try {
			throwCheckedException();
		} catch (IOException e) {
		System.out.println(e);
		}
	}

	private static void throwUncheckedException() throws NullPointerException {
		System.out.println("Start");
		// explicitly throwing an exception
		boolean test = true;
		if (test == true)
			// throws the exception and returns the control back.
			throw new NullPointerException();
		System.out.println("End");
	}

	private static void throwCheckedException() throws IOException {
		System.out.println("Start");
		// explicitly throwing an exception
		boolean test = true;
		if (test == true)

//handle it or declare throws
//			try {
//				throw new IOException();
//			} catch (Exception e) {
//				System.out.println("Checked Exception Handled!");
//			}
			throw new IOException();
		System.out.println("End");
	}
}
