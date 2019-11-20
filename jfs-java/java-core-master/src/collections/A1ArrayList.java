package collections;

import java.util.ArrayList;

public class A1ArrayList {
	public static void main(String[] args) {
		//start();
		addPlayerObjects();
	}

	private static void start() {
		ArrayList players = new ArrayList();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);
		System.out.println(players);
	}
	private static void addPlayerObjects() {
		ArrayList players = new ArrayList();
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

