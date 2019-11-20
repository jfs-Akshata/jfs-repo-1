package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsMasterList {
	public static void main(String[] args) {
		start();
		 retainAllExample();
		// subListEx();
		// listToSet();
		// sortList();
	}

	public static void start() {
		int i = 1;
		// Integer i1 = new Integer(i);
		Integer i2 = i; // Boxing (primitive to reference)
		Object i3 = i2; // Upcasting
		List listA = new ArrayList();
		listA.add(i3);

		listA.add(null);
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 1");
		listA.add(null);

		listA.add(1, "element test");
		System.out.println(listA);
		System.out.println(listA.size());
		System.out.println(listA);
		// listA.clear();
		System.out.println(listA);
		listA.remove(0);
		System.out.println(
				listA.remove("element 3"));
		System.out.println(listA);
		System.out.println(listA.contains(null));
		System.out.println(
				listA.contains("element 12"));
		System.out.println(
				listA.indexOf("element 1"));
		System.out.println(
				listA.lastIndexOf("element 1"));
//		System.out.println(listA.lastIndexOf("element 124"));
		String element0 = (String) listA.get(0);
//		String element1 = (String) listA.get(1);
//		String element3 = (String) listA.get(2);
		System.out.println(element0);
		listA.add(0, 1);
		System.out.println(listA.get(0));
//
//		System.out.println(listA);

		List listSource = new ArrayList();

		listSource.add("123");
		listSource.add("456");
//
		List listDest = new ArrayList();
		listDest.add("Dest");
		listDest.addAll(listSource);
		listDest.add("Dest1");
		System.out.println(listDest);
	}

	public static void retainAllExample() {
		List list = new ArrayList();
		List otherList = new ArrayList();

		String element1 = "element 1";
		String element2 = "element 2";
		String element3 = "element 3";
		String element4 = "element 4";

		list.add(element1);
		list.add(element2);
		list.add(element3);

		otherList.add(element1);
		otherList.add(element3);
		otherList.add(element4);

		List tempList = new ArrayList(otherList);
		list.retainAll(otherList);
		System.out.println(list);
		System.out.println(otherList);
		System.out.println(tempList);
	}

	public static void subListEx() {
		List list = new ArrayList();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");

		List sublist = list.subList(1, 3);
		System.out.println(sublist);
	}

	public static void listToSet() {
		List list = new ArrayList();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");

		Set set = new HashSet();
		set.addAll(list);
		System.out.println(set);

	}

	public static void listToArray() {
		/*
		 * List list = new ArrayList();
		 * 
		 * list.add("element 1"); list.add("element 2"); list.add("element 3");
		 * list.add("element 3");
		 * 
		 * Object[] objects = list.toArray();
		 */

		/*
		 * List<String> list = new ArrayList<>();
		 * 
		 * list.add("element 1"); list.add("element 2"); list.add("element 3");
		 * list.add("element 3");
		 * 
		 * String[] objects1 = list.toArray(new String[0]);
		 */

		String[] values = new String[] { "one",
				"two", "three" };

		List list = Arrays.asList(values);
	}

	public static void sortList() {
		List<String> list = new ArrayList<String>();

		list.add("c");
		list.add("B");
		list.add("a");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
