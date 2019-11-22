package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("crowstory.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		//reading the first byte of data
		int value = fileInputStream.read();
		
		while(value != -1) {
			System.out.print((char)value);
			 value = fileInputStream.read();
		}
		
		fileInputStream.read();
		fileInputStream.close();
		//short hand
		//new FileOutputStream(new File("story.txt")).write("Fox cheated the crow".getBytes());
	}
}
