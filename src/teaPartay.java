
public class teaPartay {
String answer;	
public String welcome(String lastName, boolean isWoman, boolean isKnighted)
    {
      if (isWoman==true) {
    	 answer = "Hello " + "Ms. " + lastName;
      }
      else if (isKnighted==true) {
    	 answer = "Hello "  + "Sir " + lastName;
      }
      else {
    	  answer = "Hello " + "Mr. " + lastName;
       }
      return answer;
      }}
     



