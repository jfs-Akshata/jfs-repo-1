package package2;

import package1.ClassA;

public class ClassD {
//implement the testPublic method().
	public void testPublic() {
		ClassA classA = new ClassA();
		System.out.println(classA.publicVar);
		classA.publicMethod();

	}
}
