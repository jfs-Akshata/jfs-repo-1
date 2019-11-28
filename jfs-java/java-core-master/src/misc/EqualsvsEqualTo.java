package misc;

public class EqualsvsEqualTo {
	public static void main(String[] args) {
		String callee = "Rambo";
		String employee = "Rambo";

		//equal
		System.out.println(callee.equals(employee));
		//identical
		System.out.println(callee == employee);
		
		String callee1 = new String("Rambo");
		String employee1 = new String("Rambo");
		//String employee1 = new String("Rambo").intern();
		String employee2 = employee1;

		//equal
		System.out.println(callee1.equals(employee1));
		//identical
		System.out.println(callee1 == employee1);
		System.out.println(callee1 == "Rambo");
		System.out.println("Rambo" == "Rambo");
		System.out.println(employee1 == employee2);
		System.out.println(employee1 == "Rambo");
	}
}
