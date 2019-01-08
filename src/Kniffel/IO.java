package Kniffel;

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
	public static void informRoll(int p, Dice d, char a) {
		if (a == 'i') {
			System.out.println("Player" + p + "rolled a " + d.toString() + System.lineSeparator());
		} else if (a == 'r') {
			System.out.println("Your dice are now " + d.toString() + System.lineSeparator());
		}
	}

	public static char inquireAction() {
		System.out
				.println("Enter F if you want to fill a field, enter any other letter to reroll your choice of dices.");
		String temp = in.next();
		if (temp.equalsIgnoreCase("f")) {

			return 'f';
		} else {

			return 'r';
		}
	}

	// DICE instead of int array

	public static int[] inquireReroll(Dice dice) {
		String d = "Which of those dices would you want to delete?" + System.lineSeparator() + System.lineSeparator()
				+ "Number to enter| 1 | 2 | 3 | 4 | 5 " + System.lineSeparator() + "---------------|---|---|---|---|---"
				+ System.lineSeparator() + "Dice to reroll ";

		for (int i = 0; i < dice.GetDice().length; i++) {
			d = d + "| " + dice.GetDice()[i] + " ";
		}
		d = d + System.lineSeparator() + System.lineSeparator();
		System.out.print(d);

		String temp = String.valueOf(in.nextInt());
		char[] temp2 = temp.toCharArray();
		int[] res = new int[temp2.length];
		for (int i = 0; i < temp2.length; i++) {
			res[i] = Character.getNumericValue(temp2[i]);
		}

		return res;

	}

	public static void listField(Field field) {

		for (int i = 0; i < field.getpointfield().size(); i++) {
			String temp = field.getpointfield().get(i).getName() + ":";
			if (field.getpointfield().get(i).getPoints() == null) {
				temp = temp + " ";
			} else if (field.getpointfield().get(i).getPoints() == 0) {
				temp = temp + "/";
			} else {

				temp = temp + field.getpointfield().get(i).getPoints();
			}
			System.out.println(temp);
		}

	}

}
