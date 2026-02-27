package human;

public class Face {
	// Class is a blueprint to create an Object
	String eyes = "black";
	String nose = "sharp";
	int noOfEyes = 2;
	static int noOfLips = 2;
	String name = "Priyanka";

	static int var = testingFace.age;

	public void smile() {
		System.out.println("Please Smile");
		System.out.println(eyes);
	}

	public static void smell() {
		System.out.println("Smell the Scent");
		Face.blink();
		System.out.println(var);
	}

	public static void blink() {
		System.out.println("Eyes blink");
		Face fc = new Face();
		System.out.println(fc.eyes);
	}

}
