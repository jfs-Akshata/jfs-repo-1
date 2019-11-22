//Lab : 
// write the id and name of the employee as primitive types to a flie
// read and print the id and name.
// add details of three employees and print them.
// accept the id of and employee and display his name if found, otherwise Not Found.
// DataInputStream & DataOutputStream

package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Employee;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Open a file
		File file = new File("employee.dat");
		// create a file input stream to read java object from the file
		FileInputStream fileInputStream = new FileInputStream(file);
		// Create object input stream
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		// Create a model
		Employee employee = null;
		// Read the object
		employee = (Employee)objectInputStream.readObject();
		// print employee details
		System.out.println(employee);
		//close the stream
		objectInputStream.close();
	}
}

//Bugs
//Exception in thread "main" java.io.NotSerializableException: model.Employee
