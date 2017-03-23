import javax.swing.JOptionPane;

public class MethodMaker {
	void go() {
		// 2. Call the method created in step 1
	 MethodMaker mm = new MethodMaker();
	 mm.youRock("Merp");
		// 4. Call the method you created in step 3 with an int parameter that tells 
		//    how old you will be by the end of this year
	 mm.birthCalculator(300, 2017);
		
		// 6. Call the method created in step 5 with a String and an int parameter
	 mm.numNumNum(7, "Stuff");
		
		// 8. Call the method created in step 7 with 2 integers, multiply these numbers and display the result.
	 mm.sickMath(3, 923);
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	//    Hint: void yourMethodName() {   
	//          }
	void youRock(String name) {
		JOptionPane.showMessageDialog(null,"You are very rocky, "+ name + "!");
	}

	
	// 3. Create a method that has an int parameter for how old you will be by the end of this year, 
	//    and creates a pop-up that tells you what year you were born.
	//    Hint: void yourMethodName(int age) {    
	//          }
	  void birthCalculator(int age, int year) {
		  int answer = year-age;
		  JOptionPane.showMessageDialog(null,"You were born in " + answer + "." );
	  }

	
	// 5. Create a method with a String parameter and an int parameter "numTimes" which
	//    prints the String parameter "numTimes".
	//    No more hints for creating methods! 
	//         Copy what you did in steps 1 & 3, but with different parameter types.
      void numNumNum(int numTimes, String word) {
    	  for (int i = 0; i<numTimes; i++) {
    	  System.out.println(word);
    	  }
      }
	
	// 7. Create a method that multiplies 2 numbers that are passed in as parameters
	//    and displays the results in a pop-up.
      void sickMath(int operand, int operand2) {
    	  int answer = operand*operand2; 
    	  JOptionPane.showMessageDialog(null, answer);
      }


	public static void main(String[] args) {
		new MethodMaker().go();
	}
}