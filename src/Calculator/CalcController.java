package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalcController implements ActionListener{
CalcMenu cm;
CalcData cd;
int counter = 0;
	public CalcController(CalcData cd, CalcMenu cm) {
		this.cm = cm;
	      this.cd = cd;
	      cm.addListener(this);
	}
	void transfer() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	    JButton b = (JButton) e.getSource();
	    
	   cd.AddADigit(b.getText());
	   System.out.println(cd.getFirstNumber());
	   cm.setD1Text(cd.getFirstNumber());
	   cm.setD2Text(cd.getOperator());
	   cm.setD3Text(cd.getSecondNumber());
	   cm.setD4Text(cd.getAnswer() + "");
	   
	}
	  /*  When you don't know how to compress code:
		if (b.getText().equals(cm.num0.getText())) {
			
			cm.d1.setText("0");
			if (counter==0||counter==1) {
				
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num1.getText())) {
			cm.d1.setText("1");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num2.getText())) {
			cm.d1.setText("2");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num3.getText())) {
			cm.d1.setText("3");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num4.getText())) {
			cm.d1.setText("4");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num5.getText())) {
			cm.d1.setText("5");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num6.getText())) {
			cm.d1.setText("6");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num7.getText())) {
			cm.d1.setText("7");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num8.getText())) {
			cm.d1.setText("8");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}
		else if (b.getText().equals(cm.num9.getText())) {
			cm.d1.setText("9");
			if (counter==0||counter==1) {
			counter=1;
			}
			else if (counter==2) {
				counter=2; 
			}
			
		}

		if (b.getText().equals(cm.multiply.getText())) {
			 if (counter==1) {
				cm.d2.setText("x");
				counter++;
			 }
		
		}
		if (b.getText().equals(cm.divide.getText())) {
			 if (counter==1) {
				cm.d2.setText("/");
				counter++;
			 }
		
		}
		if (b.getText().equals(cm.add.getText())) {
			 if (counter==1) {
				cm.d2.setText("+");
				counter++;
			 }
		
		}
		if (b.getText().equals(cm.subtract.getText())) {
			 if (counter==1) {
				cm.d2.setText("-");
				counter++;
			 }
		
		}
		
		System.out.println(counter);
	}
	*/

	}
