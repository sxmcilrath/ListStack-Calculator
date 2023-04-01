package calc;

public class CalcInternal {
	private String temp = "";
	private int first;	//holds first number 
	private int second; //holds second number
	private String op;
	private ListStack<Integer> stack = new ListStack<Integer>();
	
	public void enterNumber(int num) {
		
		temp = temp + num;
		
	}
	
	public void seperate() {
		if(temp.equals("")) {
		}
		else {
			stack.push(Integer.parseInt(temp));
			temp = "";
		}
	}
	
	public String operate(String op) {
		
		if(op.equals("C" )) {
			stack = new ListStack<Integer>();
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
		second = stack.pop();
		
		//checks to see if the second number is null
		if(stack.isEmpty()) {
			stack.push(second);
			return "";
		}
		
		first = stack.pop();
		
		int ret = 0;
		
		
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
			ret = first / second;	
		break;
		
		
		}
		stack.push(ret);
		return ""+ret;
		
	}
	
	
}
