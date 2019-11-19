package collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		Collection foodList = new HashSet();
		// explore on primitive and wrapper types.
		foodList.add("Pizza");
		foodList.add(1);
		foodList.add(true);
		foodList.add("Pizza");
		foodList.add(50);
		foodList.add(true);
		System.out.println(foodList);
	}
}
