
public class Rocket {

	
	int fuel;
	
public Rocket(int fuel, String name) {	
	this.fuel=fuel;
	System.out.println("Constructing Rocket... Super speed tech :D");
}

  void launch() {
	  for (int i = fuel; fuel>0; fuel--) {
		  System.out.println("There is " + fuel + " fuel remaining.");
	  }
	  
  }
 
}
