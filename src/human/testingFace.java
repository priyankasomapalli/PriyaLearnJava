package human;

public class testingFace {

	static int age = 5;// class variable

	public static void main(String[] args) {
		Face fc = new Face();
		Face fc1 = new Face();
		fc.smile();
		Face.smell();
		System.out.println(fc.noOfEyes);
		System.out.println(fc.eyes);
		System.out.println(fc.name);
		fc.name = "Priya";
		System.out.println(fc.name);
		fc1.name = "Devaansh";
		System.out.println(fc1.name);
		System.out.println(age);
		fc.noOfLips = 4;
		System.out.println(fc.noOfLips);
		System.out.println(Face.noOfLips);
		System.out.println("Priyanka" + " Somapalli");

	}

}
