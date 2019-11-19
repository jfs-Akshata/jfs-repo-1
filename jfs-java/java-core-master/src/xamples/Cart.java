package xamples;

public class Cart {
	Mobile1 mobile = null;
	Laptop1 laptop = null;
	
	public Cart() {
		mobile = new Mobile1();
		mobile.price = 200;
		laptop = new Laptop1();
		laptop.price = 500;
	}
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.printTotalPrice(cart.mobile, cart.laptop);
		
		String messageString = cart.returnTotalPrice(cart.mobile, cart.laptop);
		System.out.println(messageString);
	}

	public void printTotalPrice(Mobile1 mobile, Laptop1 laptop) {
		//add and print
		System.out.println("Cart Value : " + (mobile.price + laptop.price));
	}
	public String returnTotalPrice(Mobile1 mobile, Laptop1 laptop) {
		//add and print
		return "Cart Value : " + (mobile.price + laptop.price);
	}
}

class Mobile1 {
	public int price;
}

class Laptop1 {
	public int price;
}