package collections;

import java.util.List;
import java.util.ArrayList;

public class CollectionsWithGenerics {
public static void main(String[] args) {
	List list = new ArrayList();
	
	TestClass1 testClass1 = new TestClass1();
	Object object = testClass1;
}
}
class TestClass1{
	public String message = "Welcome!";
}
