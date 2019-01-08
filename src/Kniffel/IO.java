package kniffel;

import java.util.Scanner;

public class IO {
	public static Scanner in = new Scanner(System.in);

	public static int inquireInt(String s) {
		int res = 1;
		try {
			System.out.println(s);
			res = in.nextInt();

		} catch (Exception ex) {

			System.out.println("What you entered is not a number." + System.lineSeparator());
		}
		return res;
	}

	public static void informTurn(int p, int t) {
		System.out.println("It is player " + p + "'s round in turn " + t + "." + System.lineSeparator());
	}

	// DICE instead of string
	public static void informRoll(int p, dice d, char a) {
		if (a == 'i') {
			System.out.println("Player" + p + "rolled a " + d.toString() + System.lineSeparator());
		} else if (a == 'r') {
			System.out.println("Your dice are now " + d.toString() + System.lineSeparator());
		}
	}

	public static char inquireAction() {
		System.out.println(
				"Enter an minor F (f) if you want to fill a field, or enter anything else to reroll your choice of dices.");
		String temp = in.next();
		if (temp.equalsIgnoreCase("f")) {

			return 'f';
		} else {

			return 'r';
		}
	}

	// DICE instead of int array

	public static int[] inquireReroll(dice dice) {
		String d =   "Which of those dices would you want to delete?" + System.lineSeparator() + System.lineSeparator()
				   + "Number to enter| 1 | 2 | 3 | 4 | 5 "  + System.lineSeparator() 
				   + "---------------|---|---|---|---|---"  + System.lineSeparator() 
				   + "Dice to reroll ";

		for (int i = 0; i < dice.GetDice().length; i++) {
			d = d + "| " + dice.GetDice()[i] + " ";
		}
		d = d + System.lineSeparator() + System.lineSeparator();
		System.out.print(d);
		return new int[] { 1, 2, 3, 4, 5 };

	}

}
