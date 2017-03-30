import java.util.Random;

import javax.swing.JButton;

public class CompData {
    int Guess;
	int CorrectGuesses = 0;
	int Events = 0;
	int VWins = 0;
	int VLosses = 0;
	int DWins = 0;
	int DLosses = 0;
	int CWins = 0;
	int CLosses = 0;
	int OWins = 0;
	int OLosses = 0;
	int TWins = 0;
	int TLosses = 0;
	int LWins = 0;
	int LLosses = 0;

     String Calculate(String name1, String name2) {

		int Random = new Random().nextInt(2);

		if (Random == 0) {
			System.out.println("merp");
	        String sname1 = (name1 + "");
	        if (sname1.equals("Lucas")) {
	        	LWins++;
	        }
	        
			return name1;
			
		}
		else  {
			System.out.println("nerp");
			return name2;
		}
	}

	}


