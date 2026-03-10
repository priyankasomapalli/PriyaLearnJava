package inheritance;


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
