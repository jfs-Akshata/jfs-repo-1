package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Employee;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// Open a file
		File file = new File("employee.dat");
		// create a file output stream to write a java object to the file
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		// Create object output stream
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		// Create a model
		Employee employee = new Employee(1, "Rambo");
		// Serialize the object
		objectOutputStream.writeObject(employee);
		//flush the stream
		objectOutputStream.flush();
		//close the stream
		objectOutputStream.close();
	}
}

//Bugs
//Exception in thread "main" java.io.NotSerializableException: model.Employee
