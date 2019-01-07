package kniffel;

public class game {
	public static void start() {
		int players = IO.InquireInt("How many players do want to play? It defaults to one");
		int turns = IO.InquireInt("How many turns do you want to play? It defaults to one");
		int rolled = 0;
		int a_dice = 5;
		for (int t = 1; t <= turns; t++) {
			for (int p = 1; p <= players; p++)

			{
				IO.InformTurn(p, t);
				do {
					dice bd = new dice();
					bd.dice = new int[5];
					dice dice = new dice();
					dice.RD(a_dice, 6);
					int a = 0;
					for (int i = 0; i < bd.dice.length; i++) {
						if (bd.dice[i] == 0) {
							bd.dice[i] = dice.dice[a++];
						}

					}
					IO.InformRoll(p, dice.toString());
					rolled++;
					char rr = IO.InquireReroll();
					if (rr == 'f') {
						System.out.println("Filling code not yet here");
						rolled = 3;
					} else if (rr == 'r') {
						System.out.println("Redice code not yet here");
					}

				} while (rolled < 3);
				rolled = 0;
			}
		}

	};
}
