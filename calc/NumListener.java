package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumListener implements ActionListener {

	private CalculatorFace face;	//access display
	private int num;		//holds num pressed
	private CalcInternal intern;
	
	public NumListener(CalculatorFace face, int num, CalcInternal intern) {
		this.face = face;
		this.num = num;
		this.intern = intern;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		face.writeToScreen(intern.enterNumber(num));

		
	}

}
