package xamples;

public class DefaultConstructor {
public static void main(String[] args) {
	Mobile mobile = new Mobile();
	System.out.println(mobile);
}
}
class Mobile {
	String name;
	float price;
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + "]";
	}
	public Mobile(String pname, float pprice) {
		name = pname;
		price = pprice;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
}