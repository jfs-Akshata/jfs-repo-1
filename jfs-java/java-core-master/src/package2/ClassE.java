package package2;

import package1.ClassA;

public class ClassE extends ClassA {
	public void testProtected() {
		ClassA classA = new ClassA();
		System.out.println(protectedVar);
		protectedMethod();
//		ClassE classE = new ClassE();
//		System.out.println(classE.protectedVar);
//		classE.protectedMethod();
	}

	public void testPublic() {
		ClassA classA = new ClassA();
		System.out.println(publicVar);
		publicMethod();

//		ClassE classE = new ClassE();
//		System.out.println(classE.publicVar);
//		classE.publicMethod();
	}
}
