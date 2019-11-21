package exception;
// COMPILATION ERRORS :

//syntax
//generics
//access specifiers
//wrong packages

import exception.model.Test;

//EXCEPTIONS

public class TryWithFinally {
	public static void main(String[] args) {
		System.out.println("Unhandled exception");
		int i = 100;
		int j = 20;
		try {
			System.out.println(i / j);
			Test test = new Test();
			System.out.println(test.messageString);
		} finally {
			System.out.println("Clean up operations, logoff, closing db connections, closing files....");
		}
		System.out.println("Completed the calculation.");
	}
}
