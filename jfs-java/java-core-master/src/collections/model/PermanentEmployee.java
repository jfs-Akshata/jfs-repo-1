package collections.model;

public class PermanentEmployee extends Employee {
	public PermanentEmployee() {
		name = "PE";
	}

	public void getSalary() {
		System.out.println("Salary with extra benefits");
	}
	
	public void getPF() {
		System.out.println("Provident Fund");
	}

	@Override
	public String toString() {
		return "PermanentEmployee [name=" + name + "]";
	}


	
}