package calc;

public class CalcInternal {
	private String temp = "";
	private int first;	//holds first number 
	private int second; //holds second number
	private String op;
	private ListStack<Integer> stack = new ListStack<Integer>();
	
	public String enterNumber(int num) {
		
		if(temp.contains("-")) {
			seperate();
		}
		temp = temp + num;
		return temp;
		
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
		
		if(op.equals("PM")) {
			if(temp.equals("")) {
				if(!stack.isEmpty()){
					int pop = 0 - stack.pop();
					stack.push(pop);
					return "" + pop;
				}
			}
			else if(temp.contains("-")) {
				
			}
			else {
				temp = "-" + temp;
			}
			return temp;
		}
		if(op.equals("C" )) {
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
