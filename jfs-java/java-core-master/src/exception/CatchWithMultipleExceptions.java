package exception;
// COMPILATION ERRORS :
//syntax
//generics
//access specifiers
//wrong packages

import exception.model.Test;

//EXCEPTIONS

public class CatchWithMultipleExceptions {
	public static void main(String[] args) {
		System.out.println("Unhandled exception");
		int i = 100;
		int j = 0;
		try {
		System.out.println(i / j);
		Test test = null;
		System.out.println(test.messageString);
		}
		catch (ArithmeticException | NullPointerException e) {
			System.out.println(e);

		}
		System.out.println("Completed the calculation.");
	}
}
