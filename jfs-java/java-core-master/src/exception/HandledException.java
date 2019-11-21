package exception;
// COMPILATION ERRORS :
//syntax
//generics
//access specifiers
//wrong packages

import exception.model.Test;

//EXCEPTIONS

public class HandledException {
	public static void main(String[] args) {
		System.out.println("Unhandled exception");
		int i = 100;
		int j = 0;
		try {
		System.out.println(i / j);
		}
		catch (Exception e) {
//			System.out.println(e);
//			System.out.println("*************");
			System.out.println(e);
			System.out.println("Do not divide by zero");
		}
		Test test = null;
		try {
			System.out.println(test.messageString);
		}
		catch (Exception e) {
			System.out.println(e);
		System.out.println("Ensure that you have initialized the Test class.");
		}
		System.out.println("Completed the calculation.");
	}
}
