package myfirstprograms;

public class HelloWorld {
	int num = 10;
	static String fullName = "Priyanka";

	public static void jump() {
		System.out.println("Priya");

	}

	public void jump2() {
		System.out.println("Jumping for the second time");
		jump();
		HelloWorld.jump();
	}

	public static void main(String[] args) {
		System.out.println("I am Priyanka");
		jump();
		System.out.println(fullName);
		HelloWorld obj = new HelloWorld();
		obj.jump2();
		HelloWorld.jump();
	}
}
//java is a strongly typed language
//mention the type for every thing we write like variables or methods
