package Kniffel;

import java.util.Arrays;

public class Dice {
	private int[] dice = null;
	private String dType = "";
	private int dSum = 0;

	/*
	 * RD Rolls Dice with aDs expression and inserts it into dice
	 *
	 * int a - Amount of dices to be rolled 
	 * int s - Amount of sides 
	 */
	public void initDice(int a, int s) {
		dType = a + "d" + s;
		dice = roll(a, s);
		for (int d : dice) {
			dSum = dSum + d;
		}

	}

	// Rolls an 5d6
	public void fiveDSix() {
		initDice(5, 6);
	}

	private int rollOneDice(int s) {
		return roll(1, s)[0];
	}

	public int[] GetDice() {
		return dice;
	}

	public String GetdType() {
		return dType;
	}

	public int getdSum() {
		return dSum;
	}

	/*
	 * Gives out an Int-Array of rolled dices
	 * 
	 * int a - Amount of dices to be rolled 
	 * int s - Amount of sides 
	 */
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

	/*
	 * Rerolls the entered Dice
	 *  
	 * int[] numDiceReroll - Array of Dices, contains the Index+1 of the dice to reroll 
	 * int s - amount of sides
	 * 
	 */
	public void reroll(int[] numDiceReroll, int s) {
		for (int i = 0; i < numDiceReroll.length; i++) {
			int temp = rollOneDice(s);
			dice[numDiceReroll[i]] = temp;
		}

	}

	@Override
	public String toString() {
		String temp = "";
		if (dType == "" & dice == null) {
			temp = "not_rolled";
		} else {
			temp = dType + ":";
			for (int i = 0; i < dice.length; i++) {
				temp = temp + " " + dice[i];
			}

		}
		temp = temp + " (" + dSum + ")";
		return temp;

	}

}
