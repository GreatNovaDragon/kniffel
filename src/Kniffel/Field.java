package Kniffel;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	/* Defines a row in the pointfield
	 * name - name of the row
	 * eval_variant - names the evaluation variant 
	 * points - points if there are any in the field
	 */
	private class ScoreRow
	{
		private String name;
		private String eval_variant;
		private Integer points = null;	
		
		public ScoreRow(String pName, String pEval_variant){
			setName(pName); setEval_variant(pEval_variant);
		}

		public String getName() {
			return name;
		}

		public void setName(String pName) {
			name = pName;
		}

		public String getEval_variant() {
			return eval_variant;
		}

		public void setEval_variant(String pEval_variant) {
			eval_variant = pEval_variant;
		}

		public int getPoints() {
			return points;
		}

		public void setPoints(int pPoints) {
			points = pPoints;
		}
	}
	
	public Field(){
	List<ScoreRow> pointField = new ArrayList<ScoreRow>();
	
	pointField.add(new ScoreRow("Ones","one"));
	pointField.add(new ScoreRow("Twos","two"));
	pointField.add(new ScoreRow("Threes","one"));
	pointField.add(new ScoreRow("Fours","one"));
	pointField.add(new ScoreRow("Fives","one"));
	pointField.add(new ScoreRow("Sixes","one"));
	pointField.add(new ScoreRow("Three Sames","tSames"));
	pointField.add(new ScoreRow("Four Hours","vSames"));
	pointField.add(new ScoreRow("Full House","FH"));
	pointField.add(new ScoreRow("Small Street","smStr"));
	pointField.add(new ScoreRow("Big Street","bigStr"));
	pointField.add(new ScoreRow("Yahtzee","all"));
	pointField.add(new ScoreRow("Chance","sum"));

	
	

	}
	
public void evaluate (Dice d, ScoreRow r){
		
		
	}
	
	
	

}
