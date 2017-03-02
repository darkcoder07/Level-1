package Graphics;

public class MenuData {

	String mi1 = "Pizza";
	String mi2 = "Fries";
	String mi3 = "Cheeseburger";
	String mi4 = "Caesar Salad";
	String mi5 = "Breadsticks";

	String getItem1() {
		return mi1;
	}

	String getItem2() {
		return mi2;
	}

	String getItem3() {
		return mi3;
	}

	String getItem4() {
		return mi4;
	}

	String getItem5() {
		return mi5;
	}

	void menuCheck(String input) {
		if (input.equalsIgnoreCase(mi1)) {

		}
		else if (input.equalsIgnoreCase(mi1)) {
			System.out.println("Order taken!");
		} 
		else if (input.equalsIgnoreCase(mi2)) {
			System.out.println("Order taken!");
		} 
		else if (input.equalsIgnoreCase(mi3)) {
			System.out.println("Order taken!");
		} 
		else if (input.equalsIgnoreCase(mi4)) {
			System.out.println("Order taken!");
		} 
		else if (input.equalsIgnoreCase(mi5)) {
			System.out.println("Order taken!");
		}
		else {
			System.out.println("Order not valid. Please type in a valid order unless you want to eat " + input + "with raw bark.");
		}

	}

}
