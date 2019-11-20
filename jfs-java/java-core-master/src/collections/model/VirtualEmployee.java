package collections.model;

public class VirtualEmployee extends Employee {
	public VirtualEmployee() {
		name = "VE";
	}

	public void getSalary() {
		System.out.println("Salary with extra benefits, and shares of the company");
	}
	
	public void getPF() {
		System.out.println("Provident Fund and Vacation Funds");
	}

	@Override
	public String toString() {
		return "VirtualEmployee [name=" + name + "]";
	}
}