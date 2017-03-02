package Calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CalcMenu implements ActionListener {

JFrame frame = new JFrame();	
JPanel panel = new JPanel();

JButton num1 = new JButton();
JButton num2 = new JButton();
JButton num3 = new JButton();
JButton num4 = new JButton();
JButton num5 = new JButton();
JButton num6 = new JButton();
JButton num7 = new JButton();
JButton num8 = new JButton();
JButton num9 = new JButton();
JButton num0 = new JButton();
JButton multiply = new JButton();
JButton add = new JButton();
JButton divide = new JButton();
JButton subtract = new JButton();
JButton clear = new JButton();
JButton equals = new JButton();
JLabel d1 = new JLabel();
JLabel d2 = new JLabel();
JLabel d3 = new JLabel();
JLabel d4 = new JLabel();

public CalcMenu() {
	
	frame.setVisible(true);
	frame.setSize(800, 800);
	frame.add(panel);
	panel.setLayout(new GridLayout(5,4));
	panel.add(d1);
	panel.add(d2);
	panel.add(d3);
	panel.add(d4);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(subtract);
	panel.add(divide);
	panel.add(num1);
	panel.add(num2);
	panel.add(num3);
	panel.add(num4);
	panel.add(num5);
	panel.add(num6);
	panel.add(num7);
	panel.add(num8);
	panel.add(num9);
	panel.add(num0);
	panel.add(clear);
	panel.add(equals);
	
	add.setText("Add");
	subtract.setText("Subtract");
	multiply.setText("Multiply");
    divide.setText("Divide");
	equals.setText("Equals");
	clear.setText("Clear");
	num1.setText("1");
	num2.setText("2");
	num3.setText("3");
	num4.setText("4");
	num5.setText("5");
	num6.setText("6");
	num7.setText("7");
	num8.setText("8");
	num9.setText("9");
	num0.setText("0");
	d1.setText("merp");
	d2.setText("merp");
	d3.setText("merp");
	d4.setText("merp");
		
}

void addListener() {
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	clear.addActionListener(this);
	equals.addActionListener(this);
	num1.addActionListener(this);
	num2.addActionListener(this);
	num3.addActionListener(this);
	num4.addActionListener(this);
	num5.addActionListener(this);
	num6.addActionListener(this);
	num7.addActionListener(this);
	num8.addActionListener(this);
	num9.addActionListener(this);
	num0.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null,"Merp");
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
