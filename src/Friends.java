public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate Vish = new Classmate();
   	 Classmate Chloe = new Classmate();
   	 Classmate Lucas = new Classmate();
   	 Classmate Harris = new Classmate();
   	 Classmate David = new Classmate();
   	 
    	//4. set descriptions for each Classmate
   	 Vish.setDes("Best EVR.");
   	 Chloe.setDes("Learning fast.");
   	 Lucas.setDes("Has a name almost like my friend.");
   	 Harris.setDes("Looks great.");
   	 David.setDes("Hiding from classes because he is scared of being bad.");
   	 
   	 
   	 //5. Use your getter to print out each description
   	 System.out.println(Vish.getDes());
   	System.out.println(Chloe.getDes());
   	System.out.println(Lucas.getDes());
   	System.out.println(Harris.getDes());
   	System.out.println(David.getDes());
   	 
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
void setDes(String description) {
	this.description = description;
}
	//2. create a getter that gets a description of this person
String getDes() {
	return description;
}

}


