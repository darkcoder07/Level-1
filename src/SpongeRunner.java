public class SpongeRunner {
	public static void main(String[] args) {

		SpongeBobCirclePants Bob = new SpongeBobCirclePants("Bob");
		SpongeBobCirclePants Patrick = new SpongeBobCirclePants("Patrick");
		SpongeBobCirclePants Squidward = new SpongeBobCirclePants("Squidward");
		String name1 = Bob.getName();
		String name2 = Patrick.getName();
		String name3 = Squidward.getName();
		System.out.println(name1);
		Bob.eat();
		Bob.laugh();
		System.out.println(name2);
		Patrick.eat();
		Patrick.laugh();
		System.out.println(name3);
		Squidward.eat();
		Squidward.laugh();

	}
}
