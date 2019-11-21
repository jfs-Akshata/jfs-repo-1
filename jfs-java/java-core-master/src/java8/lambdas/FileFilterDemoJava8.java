package java8.lambdas;

import java.io.File;
import java.io.FileFilter;
// Lambda expressions makes anonymous instance creation way easier.
// Requirement : java 8
// Functional Interface
// Create a lambda expression

public class FileFilterDemoJava8 {
	public static void main(String[] args) {
		// Opening a file directory
		File directory = new File(
				"C:\\Users\\Subbu\\Desktop\\jfs-repo\\jfs-java\\java-core-master\\src\\java8\\lambdas");
		// creating a lambda expression for the file filter interface.
		File files[] = directory.listFiles((File pathname) -> pathname.getName().endsWith(".java"));
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

//IS A FUNCTIONAL INTERFACE
//@FunctionalInterface
//interface CreditCard{
//	public void swipe();
//}

//IS NOT A FUNCTIONAL INTERFACE
//@FunctionalInterface
//interface CreditCard{
//	public void swipe();
//	public void payOnline();
//}
