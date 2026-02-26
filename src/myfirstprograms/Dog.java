package myfirstprograms;

public class Dog {
	String type = "Lab";
	int age = 8;

	public void bark() {
		System.out.println("Dog barks");
		Animal.eat();
	}

	public static void play() {
		System.out.println("Dog plays");
		Dog dg=new Dog();
		dg.bark();
	}
	public void drink()
	{
		System.out.println("Dog drinks");
		bark();
		Animal ani=new Animal();
		ani.sleep();
	}

	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.bark();
		play();
		Animal.eat();
		Animal ani = new Animal();
		System.out.println(ani.noOfEyes);
		System.out.println(dg.age);
		System.out.println(dg.type);
		ani.sleep();
		System.out.println(ani.color);

	}
}
