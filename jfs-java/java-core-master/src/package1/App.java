package package1;

public class App {
public static void main(String[] args) {
	
	//Test private access specifier
//	ClassA classA = new ClassA();
//	The field ClassA.privateVariable is not visible
//	classA.privateVariable;
//	The method privateMethod() from the type ClassA is not visible
//	classA.privateMethod();
	
	//Test private access specifier
//	ClassA classA = new ClassA();
//	System.out.println(classA.defaultVar);
//	classA.defaultMethod();
	
	//Test protected access specifier
	ClassA classA = new ClassA();
	System.out.println(classA.protectedVar);
	classA.protectedMethod();
}
}
