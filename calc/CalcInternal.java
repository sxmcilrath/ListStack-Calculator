package calc;
/**
 * represents the internal calculations of the calculator
 * @author samuelmcilrath
 */
public class CalcInternal {
	private String temp = "";	//holds a temporary number that the user interacts with
	private ListStack<Integer> stack = new ListStack<Integer>();	//the stack that contains operands
	
	/**
	 * Adds the appropriate number either to the stack or the 
	 * temporary string
	 * 
	 * @param num	input
	 * @return		number to print to screen
	 */
	public String enterNumber(int num) {
		
		//case to catch weird formatting with 0's
		if(temp.equals("0") && num == 0) {
			return temp;
		}
		else if(temp.equals("0")){
			temp = "";
		}
		
		//if the number in temp is already negative then it is added
		//to the stack
		if(temp.contains("-")) {
			seperate();
		}
		
		temp = temp + num;
		return temp;
		
	}
	
	/**
	 * if there's a temporary number then it pushes to the stack
	 */
	public void seperate() {
		if(temp.equals("")) {
		}
		else {
			stack.push(Integer.parseInt(temp));
			temp = "";
		}
	}
	
	/**
	 * decides how to alter current numbers based on input operation
	 * 
	 * @param op	input operation
	 * @return		number to print to screen
	 */
	public String operate(String op) {
		int first;			//holds first number 
		int second; 		//holds second number	
		
		//PM case
		if(op.equals("PM")) {
			
			//if there is no temp number, check the stack for a number
			//to make negative
			if(temp.equals("")) {
				
				if(!stack.isEmpty()){
					int pop = 0 - stack.pop();
					stack.push(pop);
					return "" + pop;
				}
			}
			//add a negative to the current number
			else {
				temp = "-" + temp;
			}
			return temp;
		}
		
		//Clear case
		if(op.equals("C" )) {
			//reset the stack and the temp number
			stack = new ListStack<Integer>();
			temp = "";	
			return "0";
		}
		
		//if the user presses . if applicable, it pushes the number into the stack
		if(op.equals(".")) {
			seperate();
			return"";
		}
		
		//checks if the first number is null
		if(stack.isEmpty()) {
			return"";
		}
		
		
		seperate();
		second = stack.pop();	//grabs second operand
		
		//checks to see if the second number is null
		if(stack.isEmpty()) {
			stack.push(second);
			return "";
		}
		
		first = stack.pop();	//grabs first operand
		
		int ret = 0;	//declare and intialize return variable
		
		//returns number based on the operation
		switch(op) {
		case "+":
			ret = first + second;
			break;
			
		case "-":
			ret = first - second;
			break;
			
		case "*":
			ret = first * second;
			break;
	
		case "/":
			//catch div by 0
			if(second == 0) {
				return "endef";
			}
			ret = first / second;	
		break;
		
		
		}
		
		//add the calculation to the stack
		stack.push(ret);
		return ""+ret;
		
	}
	
	
}
