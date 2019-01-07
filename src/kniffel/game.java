package kniffel;

public class game {
	public static void start() {
		int players = IO.InquireInt("How many players do want to play? It defaults to one");
		int turns = IO.InquireInt("How many turns do you want to play? It defaults to one");
		int rolled = 0;
		for (int t = 1; t <= turns; t++) {
			for (int p = 1; p <= players; p++)

			{
				IO.InformTurn(p, t);
				do {
					dice dice = new dice();
					dice.RD(5, 6);
					IO.InformRoll(p, dice.toString());
					rolled++;
					
					if (IO.InquireReroll()=="f")
						then{do stuff;};
						
				} while (rolled < 3);
				rolled=0;
			}
		}

	};
}
