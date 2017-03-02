package Calculator;

public class UltimateCalculator {

	public static void main(String[] args) {
		CalcMenu cm = new CalcMenu();
		CalcData cd = new CalcData();
		CalcController cc = new CalcController(cd,cm);
		
		
	}
}
