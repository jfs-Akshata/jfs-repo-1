package exception;
class Test1
{
	int value = 10;
} 
public class NestedTryBlock {
public static void main(String[] args) {
	Test1 test = null;
	//test = new Test1();
	try {
		System.out.println("outer try begin");
		System.out.println(test.value);
		try {
			int i = 200;
			int result = i/0;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic problem");
		}
		System.out.println("outer try end");
	} catch (NullPointerException e) {
		System.out.println("Test instance not created");
	}
	
}

}
