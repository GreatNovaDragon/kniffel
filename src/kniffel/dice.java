package kniffel;

import java.util.Arrays;

public class dice {
	public int[] dice = null;
	public String dType = "";
	public int addedUp = 0;

	// RD Rolls Dice with aDs expression,aka a dice with s sides
	public void RD(int a, int s) {
		dType = a + "d" + s;
		dice = roll(a, s);
		for (int d : dice) {
			addedUp = addedUp + d;
		}

	}

	protected int[] roll(int a, int s) {

		int[] d = new int[a];

		if (a != 0 & s != 0) {

			for (int i = 0; i < d.length; i++) {
				d[i] = (int) (Math.random() * s) + 1;

			}
			Arrays.sort(d);

		}

		return d;

	}

	public void reroll(int[] dicetoreroll, int s) {
		for (int i = 0; i < dicetoreroll.length; i++) {
			int temp = roll(1,s)[0];
			dice[dicetoreroll[i] - 1] = temp;
		}

	}

	@Override
	public String toString() {
		String temp = "";
		if (dType == "" & dice == null) {
			temp = "This dice hasn't been rolled yet, either due to an error in input or you were too fast in asking for the result.";
		} else {
			temp = dType + ":";
			for (int i = 0; i < dice.length; i++) {
				temp = temp + " " + dice[i];
			}

		}
		temp = temp + " (" + addedUp + ")";
		return temp;

	}

}
