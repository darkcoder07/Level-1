package Calculator;

public class CalcController {
CalcMenu cm;
CalcData cd;
	public CalcController(CalcData cd, CalcMenu cm) {
		this.cm = cm;
	      this.cd = cd;
	      cm.addListener();
	}

}
