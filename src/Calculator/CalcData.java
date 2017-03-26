package Calculator;

public class CalcData {


	String firstNumber;
	String secondNumber;
	int answer;
	String operator;
	boolean operatorPressed;
	
public CalcData() {
	firstNumber = "";
    secondNumber= "";
    int answer = 0;
    String operator = "";
    
}

public int getAnswer() {
	return answer;
}
public String getFirstNumber() {
	return firstNumber;
}
public String getOperator() {
	return operator;
}
public String getSecondNumber() {
	return secondNumber;
}
void clear() {
	firstNumber = "";
	secondNumber = "";
	operator = "";
    answer = 0;
    operatorPressed=false;
	
	
}
void calculate() {
	if (operator.equals("Add")) {
		int ifn = Integer.parseInt(firstNumber);
		int ifs = Integer.parseInt(secondNumber);
		answer = ifn + ifs;
	}
	if (operator.equals("Subtract")) {
		int ifn = Integer.parseInt(firstNumber);
		int ifs = Integer.parseInt(secondNumber);
		answer = ifn - ifs;
	}
	if (operator.equals("Divide")) {
		int ifn = Integer.parseInt(firstNumber);
		int ifs = Integer.parseInt(secondNumber);
		answer = ifn / ifs;
	}
	if (operator.equals("Multiply")) {
		int ifn = Integer.parseInt(firstNumber);
		int ifs = Integer.parseInt(secondNumber);
		answer = ifn * ifs;
	}
}


	
	
	void AddADigit (String number) {
		if (number.equals("Equals")) {
			calculate();
		}
		else if (number.equals("Clear")) {
			clear();
		}
		else if (number.equals("Multiply")||number.equals("Subtract")||number.equals("Divide")||number.equals("Add")) {
			operator = number;
			System.out.println(operator);
			operatorPressed=true;
		}
		else if (operatorPressed==false) {
			firstNumber = firstNumber + number;
			}
		else if (operatorPressed==true) {
			secondNumber = secondNumber + number;
		}
	}
	
}
