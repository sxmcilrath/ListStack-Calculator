package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * action listener for number buttons
 * @author samuelmcilrath
 */
public class NumListener implements ActionListener {

	private CalculatorFace face;	//access display
	private int num;				//holds num pressed
	private CalcInternal intern;	//internal instance to perform calculations
	
	/**
	 * constructorS
	 * @param face
	 * @param num
	 * @param intern
	 */
	public NumListener(CalculatorFace face, int num, CalcInternal intern) {
		this.face = face;	
		this.num = num;		
		this.intern = intern;	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//print the number that is entered
		face.writeToScreen(intern.enterNumber(num));

		
	}

}
