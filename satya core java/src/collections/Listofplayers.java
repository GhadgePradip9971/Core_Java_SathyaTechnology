package collections;

import java.util.ArrayList;

public class Listofplayers {

	public static void main(String[] args) {
		ArrayList<Playerlist> pl = new ArrayList();
		// Listofplayers e1 = new Listofplayers(111,"Mayank","kkr",21,200000.00);
		pl.add(new Playerlist(111, "Mayank", "kkr", 21, 200000.00));
		pl.add(new Playerlist(112, "rahul", "lsg", 21, 200000.00));
		pl.add(new Playerlist(113, "sachin", "mi", 25, 100000.00));
		pl.add(new Playerlist(114, "virat", "rcb", 22, 100000.00));
		pl.add(new Playerlist(115, "msd", "csk", 23, 300000.00));

		for (Playerlist player : pl) {
			if (player.getTeam().equals("kkr")) {
				System.out.println(player);
			}
		}

	}

}
