package calc;

/**
 * SetUp
 * 
 * Class to set up and start the calculator, plus
 * facilities for test-driving the calculator.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College
 * June 27, 2014
*/
public class SetUp {

	/**
	 * Method for initializing the calculator internals and
	 * connecting them to the calculator face.
	 * @param face The component representing the user interface of 
	 * the calculator. 
	 */
	public static void setUpCalculator(CalculatorFace face) {
		CalcInternal intern = new CalcInternal();	//create instance of internals to perform operations

		
		//connect operation buttons to listeners
		face.addActionListener('+', new OpListener(face, intern, "+"));
		face.addActionListener('-', new OpListener(face, intern, "-"));
		face.addActionListener('*', new OpListener(face, intern, "*"));
		face.addActionListener('/', new OpListener(face, intern, "/" ));
		face.addActionListener('C', new OpListener(face, intern, "C"));
		face.addActionListener('.', new OpListener(face, intern, "."));
		face.addActionListener('=', new OpListener(face,intern,"="));
		face.addPlusMinusActionListener(new OpListener(face, intern, "PM"));
		
		//connect #'s to action listeners 
		face.addNumberActionListener(0, new NumListener(face, 0, intern));
		face.addNumberActionListener(1, new NumListener(face, 1, intern));
		face.addNumberActionListener(2, new NumListener(face, 2, intern));
		face.addNumberActionListener(3, new NumListener(face, 3, intern));
		face.addNumberActionListener(4, new NumListener(face, 4, intern));
		face.addNumberActionListener(5, new NumListener(face, 5, intern));
		face.addNumberActionListener(6, new NumListener(face, 6, intern));
		face.addNumberActionListener(7, new NumListener(face, 7, intern));
		face.addNumberActionListener(8, new NumListener(face, 8, intern));
		face.addNumberActionListener(9, new NumListener(face, 9, intern));
		

		
		
	}
	
	
	/**
	 * This main method is for your testing of your calculator.
	 * It will *not* be used during grading. Any changes you make
	 * to this method will be ignored at grading.
	 */
	public static void main(String[] args) {
		setUpCalculator(new PlainCalculatorFace());
	}

}
