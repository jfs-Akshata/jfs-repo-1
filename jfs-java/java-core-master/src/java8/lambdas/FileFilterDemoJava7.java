package java8.lambdas;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemoJava7 {
	public static void main(String[] args) {
		// Opening a file directory
		File directory = new File(
				"C:\\Users\\Subbu\\Desktop\\jfs-repo\\jfs-java\\java-core-master\\src\\java8\\lambdas");
		// Instantiating the custom file filter
		MyFileFilter filter = new MyFileFilter();
		// Getting the files which are filtered
		File files[] = directory.listFiles(filter);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

class MyFileFilter implements FileFilter {
	@Override
	public boolean accept(File pathname) {
		return pathname.getName().endsWith(".java");
	}

}