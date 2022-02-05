package ejercicio5;
import java.util.Stack;
public class ejmplo111 {
	static Stack<String> conpostfija (String expresion) {
		Stack<String> stack = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String arr[] = expresion.split("(?=[-+*/()^])|(?<=[-+*/()^])");
		for(String car:arr) {
			if(val(car)) {
				stack2.push(car);
				continue;
			}
			else if(stack.isEmpty()) {
				stack.push(car);
				continue;
			}
			if(stack.search("(") != -1) {

				 if(stack.peek().equals("(")) {
					stack.push(car);
				}
				 else if(jerarquia2(car)>jerarquia2(stack.peek())) {
					stack.push(car);
				}
				 else {
					 while(!stack.peek().equals("(")) {
						
						 stack2.push(stack.pop());
					 }
					 stack.push(car);
				 }
				if(stack.search(")") != -1) {
					stack.pop();
					while(!stack.peek().equals("(")) {
						
						stack2.push(stack.pop());
					}
					stack.pop();
				}
			}
			
			else if(car.equals("(")) {
				stack.push(car);
			}
			else if(jerarquia2(car)>jerarquia2(stack.peek())) {
				stack.push(car);
			}//Fif
			 else {
				 while(!stack.isEmpty()) {
					 stack2.push(stack.pop());
				 }
				 stack.push(car);
			 }
		}
		while(!stack.isEmpty()) {
			
			stack2.push(stack.pop());
		}
		return stack2;
		
	}
	
	
	static int jerarquia2(String car) {
		switch (car) {
		case"+":
		case"-":
			return 1;
		case"*":
		case"/":
			return 2;
		case"^":
			return 3;
		case")":
			return 4;
		case"(":
			return 5;
		
		
		}
		return-1;
	}
static boolean val(String n) {
		
		try {
			Integer.parseInt(n);
			return true;
		}catch(NumberFormatException error) {
			return false;
		}
	}

static double resultados (Stack<String> operacion111) {
	Stack<String> stack = new Stack<>();
	for(String gal: operacion111) {
		if(val(gal)) {
			stack.push(gal);
		}
		else {
			double op1,op2;
			op2 = Double.parseDouble(stack.pop());
			op1 = Double.parseDouble(stack.pop());
			stack.push(String.valueOf(operacion2(op1,op2,gal)));
			
		}
	}
	return Double.parseDouble(stack.peek());
}

public static double operacion2(double op1, double op2, String op) {
	switch(op) {
	case "+":
		return op1+op2;
	case"-":
		return op1-op2;
	case "*":
		return op1*op2;
	case "/":
		return op1/op2;
	case "^":
		return Math.pow(op1, op2);
	}
	return 0.0;
}

static String concat(Stack<String> charl) {
	Stack<String> stack = charl;
	String epostfijo = "";
	for(String val: stack) {
		epostfijo += val;
	}
	return epostfijo;
}
}
