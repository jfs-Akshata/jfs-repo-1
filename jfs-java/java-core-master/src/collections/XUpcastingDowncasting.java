package collections;

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

abstract class Employee {
	public String name;

	public void getSalary() {
		System.out.println("Get Salary");
	}

}

class PermanentEmployee extends Employee {
	public PermanentEmployee() {
		name = "PE";
	}

	public void getSalary() {
		System.out.println("Salary with extra benefits");
	}
	
	public void getPF() {
		System.out.println("Provident Fund");
	}
}

class ContractEmployee extends Employee {
	@Override
	public String toString() {
		return "ContractEmployee []";
	}

	public ContractEmployee() {
		name = "CE";
	}
// COPY OF METHOD FROM BASE CLASS	
//	public void getSalary() {
//		System.out.println("Get Salary");
//	}
	
//	public void getSalary() {
//		System.out.println("Fixed Salary");
//	}
	public void takeMonthsOfLeave() {
		System.out.println("Months of Leave!");
	}
}