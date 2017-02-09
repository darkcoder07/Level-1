import java.util.Random;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotsOfDoom extends Casino{
 double ibetMoney;
	void tellTheCustomer() {
	String betMoney = JOptionPane.showInputDialog("Please enter a number, i.e '35' No $ signs or 'dollars' needed. The number you enter is how much you are betting.");
	ibetMoney = Integer.parseInt(betMoney);
	 money -= ibetMoney;
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField b = new JTextField();
	JTextField b2 = new JTextField();
	JTextField b3 = new JTextField();

	void setup() {

		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		frame.setSize(1000, 1000);
		frame.add(panel);
		panel.add(b);
		panel.add(b2);
		panel.add(b3);

	}


	int[] slotNumbers = new int[3];

	int[] getNums() {
		int rand = new Random().nextInt(2);
		int rand2 = new Random().nextInt(2);
		int rand3 = new Random().nextInt(2);
		slotNumbers[0] = rand;
		slotNumbers[1] = rand2;
		slotNumbers[2] = rand3;
		System.out.println(slotNumbers[0]);
		System.out.println(slotNumbers[1]);
		System.out.println(slotNumbers[2]);
		return slotNumbers;

	}

	void results() {
		b.setText(slotNumbers[0] + "");
		b2.setText(slotNumbers[1] + "");
		b3.setText(slotNumbers[2] + "");

	}
	
	void payOut() {
		
		if (b.getText().equals(1)&&b2.getText().equals(1)&&b3.getText().equals(1)) {
			setMoney(getMoney()+ibetMoney*2);
			JOptionPane.showMessageDialog(null,"Nice luck! Your balance is doubled and is now " + money + ".");
			if (getMoney()<0) {
				JOptionPane.showMessageDialog(null, "So sad! Your balance is now zero, and you have lost. Please come again to give us money please.");
			}
		}
		 if (b.getText().equals(2)&&b2.getText().equals(2)&&b3.getText().equals(2)) {
			setMoney(getMoney()+ibetMoney*3);
			JOptionPane.showMessageDialog(null,"Incredible! Your balance is tripled and is now " + money +"!");
			if (getMoney()<0) {
				JOptionPane.showMessageDialog(null, "So sad! Your balance is now zero, and you have lost. Please come again to give us money please.");
			}
			
		}
		else if (b.getText().equals(0)&&b2.getText().equals(0)&&b3.getText().equals(0)) {
			setMoney(getMoney()+ibetMoney*1.2);
			JOptionPane.showMessageDialog(null,"That's pretty good. Your balance is increased by a little and is now " + money + ".");
			if (getMoney()<0) {
				JOptionPane.showMessageDialog(null, "So sad! Your balance is now zero, and you have lost. Please come again to give us money please.");
			}
			
		}
		else {
			setMoney(getMoney()-ibetMoney/3);
			
				
			JOptionPane.showMessageDialog(null,"Oh no! Your balance now got decreased a little more than the amount you betted! Better luck next time? Your balance is now " + money + ".");
			if (getMoney()<0) {
				JOptionPane.showMessageDialog(null, "So sad! Your balance is now zero, and you have lost. Please come again to give us money please.");
			}
		}
	}

}
