package inheritance;

public class Car extends Vehicle{
	 static String type="Car";
	 public void checkingSeats()
	 {
		 System.out.println("Car has seats");
	 }
	public void honking()
	{
		System.out.println("Car honks");
	}
	public static void main(String[] args)
	{
		Vehicle c=new Car();
		Car c1=new Car();
		System.out.println(type);
		System.out.println(c.color);
		System.out.println(c.noOfWheels);
		c.startEngine();
		c.honking();
		c1.checkingSeats();
		
		
		
	}


}