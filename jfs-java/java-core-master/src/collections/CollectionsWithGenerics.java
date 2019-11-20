package collections;

import java.util.List;

import collections.model.ContractEmployee;
import collections.model.Employee;
import collections.model.PermanentEmployee;

import java.util.ArrayList;

public class CollectionsWithGenerics {
	public static void main(String[] args) {
		withoutGenerics();
	}

	private static void withoutGenerics() {
		List list = new ArrayList();
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		ContractEmployee contractEmployee = new ContractEmployee();
		list.add(permanentEmployee);
		list.add(contractEmployee);
		
		//SOME VERBOSE CODE.....
//		int i = 100; //primitive type
//		//Boxing : conversion of primitive to reference type
//		Integer integer = new Integer(i);
//		//Upcasting Integer to Object
//		Object object = integer;
//		list.add(object);
		
		//SHORT AND SIMPLE
		list.add(100);
		System.out.println(list);
	}
	private static void withGenerics() {
		//implement it.
	}
}
