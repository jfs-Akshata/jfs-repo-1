package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("crowstory.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String string = "The thirsty crow!";
		byte [] stringInBytes = string.getBytes();
		fileOutputStream.write(stringInBytes);
		fileOutputStream.flush();
		fileOutputStream.close();
		//short hand
		//new FileOutputStream(new File("story.txt")).write("Fox cheated the crow".getBytes());
	}
}
