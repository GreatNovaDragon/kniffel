package kniffel;

public class game {
	public static void start() {
		int players = IO.InquireInt("How many players do want to play? It defaults to one");
		int turns = IO.InquireInt("How many turns do you want to play? It defaults to one");
		int rolled = 0;
		dice bd = new dice();
		for (int t = 1; t <= turns; t++) {
			for (int p = 1; p <= players; p++)

			{
				IO.InformTurn(p, t);
				do {
									
					if (rolled==0){bd.RD(5,6);
					IO.InformRoll(p, bd.toString(), 'i');
}
					rolled++;
					char rr = IO.InquireReroll();
					if (rr == 'f') {
						System.out.println("Filling code not yet here");
						rolled = 3;
					} else if (rr == 'r') {
						int[] dicetodel = IO.InquireDELETIONOFDICE(bd.dice);
						bd.reroll(dicetodel, 6);
						IO.InformRoll(p, bd.toString(), 'r');

						
					}

				} while (rolled < 3);
				rolled = 0;
			}
		}

	};
}
