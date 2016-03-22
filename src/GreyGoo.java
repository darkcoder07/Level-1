import javax.swing.JOptionPane;

public class GreyGoo {

	int Hunger;
	String name;
	String favfood;

	GreyGoo(int Hunger, String name, String favfood) {
		this.Hunger = Hunger;
		this.name = name;
		this.favfood = favfood;

	}

	void eat() {

		JOptionPane.showMessageDialog(null, "Wait, where did the Empire State Building just go...?");
		Hunger--;
		JOptionPane.showMessageDialog(null, "*" + name + "'s hunger is minused by 1*");
	}

	void talk() {
		JOptionPane.showMessageDialog(null, name + " says; Tasty!");
	}

	void interview() {
		String question = JOptionPane.showInputDialog(name + ": FaV F00D I3 HUMan3! U liK3 HUMan3?");
		if (question.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, name + ": D:");
		}
	}
}