package kniffel;

import java.util.Scanner;

public class IO {
	public static Scanner in = new Scanner(System.in);

	public static int[] InquireDice() {
		int[] res = new int[2];
		try {

			System.out.println("How many dice?");
			res[0] = in.nextInt();
			System.out.println("How many sides?" );
			res[1] = in.nextInt();

		} catch (Exception ex) {

			System.out.println("What you entered is not a number." + System.lineSeparator() );
		}
		return res;
	}

	public static int InquireInt(String s) {
		int res = 1;
		try {
			System.out.println(s);
			res = in.nextInt();

		} catch (Exception ex) {

			System.out.println("What you entered is not a number." + System.lineSeparator() );
		}
		return res;
	}

	public static void InformTurn(int p, int t) {
		System.out.println("It is player " + p + "'s round in turn " + t + "." + System.lineSeparator() );
	}

	public static void InformRoll(int p, String d, char a) {
		if (a == 'i')
		{
		System.out.println("Player" + p + "rolled a " + d + System.lineSeparator() );
		}else
		if (a == 'r'){		System.out.println("Your dice are now " + d + System.lineSeparator() );
}
		}
		

	public static char InquireReroll() {
		System.out.println(
				"Enter an minor F (f) if you want to fill a field, or enter anything else to reroll your choice of dices.");
		String temp = in.next();
		if (temp.equalsIgnoreCase("f")) {

			return 'f';
		} else {

			return 'r';
		}
	}

	public static int[] InquireDELETIONOFDICE(int[] DA_DICE) {
		String d = "Which of those dices would you want to delete?" + System.lineSeparator() + System.lineSeparator()
				 + "Number to enter| 1 | 2 | 3 | 4 | 5 " + System.lineSeparator() 
				 + "---------------|---|---|---|---|---" + System.lineSeparator() 
				 + "Dice to reroll ";

		for (int i = 0; i < DA_DICE.length; i++) {
			d = d + "| " + DA_DICE[i] + " ";
		}
		d = d + System.lineSeparator()+ System.lineSeparator();
		System.out.print(d);
		return new int[] {1,2,3,4,5};

	}

}
