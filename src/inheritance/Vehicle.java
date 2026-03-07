package inheritance;
//to access parent class members in child class,we have to create object for child class of type parent.(Vehicle v=new Car();)
//to access child class members in child class, we have to create object for child class of type child(Car c=new Car();)

public class Vehicle {
	String color="Black";
	int noOfWheels=4;
	int noOfLights=1;
	public void startEngine()
	{
		System.out.println("This Engine is starting");
	}
	public void honking()
	{
		System.out.println("Honk is working");
	}
	
	public void printParent() {
		System.out.println("I am your parent");
	}
	
}
