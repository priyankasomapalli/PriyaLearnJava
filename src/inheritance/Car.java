package inheritance;

public class Car extends Vehicle{
	 static String type="Car";
	 public void checkingSeats()
	 {
		 System.out.println("Car has seats");
	 }
	 public void checkingSeats(int i) {
		 System.out.println("Method Overloading");
	 }
	public void honking()
	{
		System.out.println("Car honks");
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		
		System.out.println(type);
		System.out.println(c.color);
		System.out.println(c.noOfWheels);
		c.startEngine();
		c.honking();
		c.checkingSeats();
		c.printParent();
		c.checkingSeats(2);
		
		
	}


}