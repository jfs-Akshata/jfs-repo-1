package collections;

import java.util.ArrayList;
import java.util.Vector;

public class A2Vector {
	public static void main(String[] args) {
		Vector players = new Vector();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);	
		System.out.println(players);
	}
	private static void addPlayerObjects() {
		Vector players = new Vector();
		Player player= new Player();
		player.id = 1;
		player.name = "Bill";
		players.add(player);
		
		Player player1= new Player();
		player1.id = 2;
		player1.name = "Gates";
		players.add(player1);
		
		players.add("Dhoni");
		players.add(2);
		System.out.println(players);
	}
}
