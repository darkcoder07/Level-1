
public class Coffee {

int temp;
String brewType;
boolean isDeCaf;

public Coffee(int temp, String brewType, boolean isDeCaf) {
	this.temp=temp;
	this.brewType=brewType;
	this.isDeCaf=isDeCaf;
}

void serve(String name) {
	
	System.out.println("Aaaannnd " + name +"'s " + brewType + " coffee is ready! It is at a temperature of " + temp + " degrees. (It also has a state of " + isDeCaf + "decaffeination. ");

}
	
	
	
	
}
