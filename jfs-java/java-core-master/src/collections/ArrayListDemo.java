package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Collection foodList = new ArrayList();
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

//Challenge : 
//Create a class named Employee with the following fields (EmployeeId, FirstName,LastName,Salary)
//Add 5 employees to a collection.
//Print the details of employees in the collection.
//Apply the collection of your choice
//Going the extra mile : apply different collections to the solve the same problem
//Try out different methods of the Collections API.

