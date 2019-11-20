package collections;

import collections.model.ContractEmployee;
import collections.model.Employee;
import collections.model.PermanentEmployee;

public class XUpcastingDowncasting {
	public static void main(String[] args) {
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		ContractEmployee contractEmployee = new ContractEmployee();
		System.out.println(permanentEmployee.name);
		permanentEmployee.getSalary();
		System.out.println(contractEmployee.name);
		contractEmployee.getSalary();
		
		permanentEmployee.getPF();
		contractEmployee.takeMonthsOfLeave();
		
		Employee employee;
		//upcasting
		employee = contractEmployee;
		employee.getSalary();
   
		//upcasting
		//Object object = employee;
		//object.getSalary();
		//System.out.println(object.toString());
		
		//downcasting
		ContractEmployee contractEmployee2 = null;
		contractEmployee2 = (ContractEmployee)employee;
		contractEmployee2.takeMonthsOfLeave();
	}

}




