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
	
	
	void AddADigit (String number) {
		if (number.equals("x")||number.equals("-")||number.equals("/")||number.equals("+")) {
			operator = number;
			operatorPressed=true;
		}
		else {
			firstNumber = firstNumber + number;
			}
	}
	
}
