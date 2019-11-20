package collections.model;
public class ContractEmployee extends Employee {
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

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + "]";
	}
}
	
