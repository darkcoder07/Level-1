
public class Competition {

public static void main(String[] args) {
	
	
CompData cd = new CompData();
CompView cv = new CompView();
CompController cc = new CompController(cd, cv);


cv.actionListeners(cc);
cd.Calculate(cv.NArray[1].getText(),cv.NArray[0].getText());
}	
	
	
}
