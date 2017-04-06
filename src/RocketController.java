
public class RocketController {


	 public int convertFuel(int fuel) {
			int metafuel = fuel*fuel;
			int antimatterfuel = metafuel*metafuel;
			return antimatterfuel;
	  }

public static void main(String[] args) {	
	
RocketController rc = new RocketController();	
	
//Rocket Innovation = new Rocket(100,"Innovation");	
//Rocket Innovation2 = new Rocket(100,"Innovation");	
//Rocket Opik = new Rocket(100,"Innovation");	
Rocket TransSolar = new Rocket(rc.convertFuel(45),"Innovation");	
//Innovation.launch();
//Innovation2.launch();
//Opik.launch();
TransSolar.launch();
}	

	
	
}
