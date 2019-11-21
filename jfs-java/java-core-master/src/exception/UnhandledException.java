package exception;
// COMPILATION ERRORS :
//syntax
//generics
//access specifiers
//wrong packages

import exception.model.Test;

//EXCEPTIONS

public class UnhandledException {
	public static void main(String[] args) {
		System.out.println("Unhandled exception");
		int i = 100;
		int j = 0;
		System.out.println(i / j);
		Test test = null;
		System.out.println(test.messageString);
		System.out.println("Completed the calculation.");
	}
}

