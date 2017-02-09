
public class Casino {
	double money = 300;

	public static void main(String[] args) {
		SlotsOfDoom sod = new SlotsOfDoom();
		sod.tellTheCustomer();
		sod.setup();
		sod.getNums();
		sod.results();
		sod.payOut();

	}

void setMoney (double money) {
	this.money = money;
}
double getMoney() {
	return money;
}
}