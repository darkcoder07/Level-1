
public class SmurfRunner {
	public static void main(String[] args) {

		smallGuys Joe = new smallGuys("Joe");
		smallGuys papaJoe = new smallGuys("papaJoe");
		smallGuys Smurfette = new smallGuys("Smurfette");
		String getName = Joe.getName();
		String getName2 = papaJoe.getName();
		String getName3 = Smurfette.getName();
		String hat = papaJoe.getHatColor();
		String hat2 = Smurfette.getHatColor();
		String boygirl = papaJoe.isGirlOrBoy();
		String boygirl2 = Smurfette.isGirlOrBoy();

		System.out.println(getName);
		System.out.println(hat);
		System.out.println(boygirl);
		System.out.println(getName2);
		System.out.println(hat2);
		System.out.println(boygirl2);
		System.out.println(getName3);

	}
}
