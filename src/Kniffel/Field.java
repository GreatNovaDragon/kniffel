package Kniffel;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	/* Defines a row in the pointfield
	 * name - name of the row
	 * eval_variant - names the evaluation variant 
	 * points - points if there are any in the field
	 */
	private class row
	{
		private String name;
		private String eval_variant;
		private Integer points = null;	
		
		public row(String pName, String pEval_variant, int pI_points){
			setName(pName); setEval_variant(pEval_variant); setPoints(pI_points);
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
	
	public void blubber(){
	List<row> pointField = new ArrayList<row>();
	pointField.add(new row("Test","test",0));
	
	}
	
	
	
	
	

}
