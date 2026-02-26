package myfirstprograms;

public class Cat {
	public static void main(String[] args) {
		Dog dg = new Dog();
		Dog.play();
		System.out.println(dg.age);
		System.out.println(dg.type);
		Animal.eat();

	}
}
