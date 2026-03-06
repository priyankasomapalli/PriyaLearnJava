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
		Vehicle b=new Bike();
		Bike b1=new Bike();
		b1.testingBrakes();
		b.startEngine();
		System.out.println(b.color);
		System.out.println(b.noOfWheels);
		
		
		
	}
	
	

}
