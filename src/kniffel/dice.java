package kniffel;


public class dice {
	public int[] dice = null;
	public String dType = "";
	public int addedUp = 0;

	// RD Rolls Dice with aDs expression,aka a dice with s sides
	public void RD(int a, int s) {

		if (a != 0 & s != 0) {
			int[] d = new int[a];
			dType = a + "d" + s;
			for (int i = 0; i < d.length; i++) {
				d[i] = (int) (Math.random() * s) + 1;
				addedUp = addedUp + d[i];
			}
			dice = d;

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
