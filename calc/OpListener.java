package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpListener implements ActionListener {

	private CalculatorFace face;	//access display
	private String op;				//holds op pressed
	private CalcInternal intern;
	
	public OpListener(CalculatorFace face, CalcInternal intern, String op) {
		this.face = face;
		this.intern = intern;
		this.op = op;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String output = intern.operate(op);
		System.out.print(output);
		if(output.equals("")) {
			
		}
		else {
			face.writeToScreen(output);
		}
		
	}

}
