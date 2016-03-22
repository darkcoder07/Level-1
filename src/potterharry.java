
public class potterharry {

	private boolean cloakOn;

	potterharry() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		potterharry Harry = new potterharry();
		// 2. become invisible
		Harry.makeInvisible(true);
		// 3. spy on professor snape
		Harry.spyOnSnape();

		// 4. become visible again
		Harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		Harry.castSpell("stupefy");
		System.out.println("Snape falls to the ground :D.");
	}

}
