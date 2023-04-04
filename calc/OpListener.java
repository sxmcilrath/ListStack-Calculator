package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpListener implements ActionListener {

	private CalculatorFace face;	//access display
	private String op;				//holds op pressed
	private CalcInternal intern;	//internal instance to perform calculations
	
	/**
	 * constructor 
	 * @param face
	 * @param intern
	 * @param op
	 */
	public OpListener(CalculatorFace face, CalcInternal intern, String op) {
		this.face = face;
		this.intern = intern;
		this.op = op;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		//sometimes the number that's modified is not what we want to print
		//so it's instead stored in a variable to be checked
		String output = intern.operate(op);
		if(output.equals("")) {
		}
		else {
			face.writeToScreen(output);
		}
		
	}

}
