package kniffel;

import java.util.Scanner;

public class IO {
	public static Scanner in = new Scanner(System.in);

	public static int[] InquireDice() {
		int[] res = new int[2];
		try {

			System.out.println("How many dice?");
			res[0] = in.nextInt();
			System.out.println("How many sides?");
			res[1] = in.nextInt();

		} catch (Exception ex) {

			System.out.println("What you entered is not a number.");
		}
		return res;
	}

	public static int InquireInt(String s) {
		int res = 1;
		try {
			System.out.println(s);
			res = in.nextInt();

		} catch (Exception ex) {

			System.out.println("What you entered is not a number.");
		}
		return res;
	}

	public static void InformTurn(int p, int t) {
		System.out.println("It is player " + p + "'s round in turn " + t + ".");
	}

	public static void InformRoll(int p, String d) {
		System.out.println("Player" + p + "rolled a " + d);
	}

	public static String InquireReroll() {
		System.out.println("Do you want to fill a field or throw away dice and reroll?");
		if (in.hasNext("f")) {
			return "f";
		} else {
			return "r";
		}
	}

}
