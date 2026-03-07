package inheritance;

public class Bike extends Vehicle {
	int noOfWheels=2;
	String color="Red";
	public void testingBrakes()
	{
		System.out.println("Brakes are working");
	}
	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.testingBrakes();
		b.startEngine();
		System.out.println(b.color);
		System.out.println(b.noOfWheels);
		System.out.println(b.noOfLights);	
		
	}
	
	

}
