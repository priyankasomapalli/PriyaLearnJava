package controlstatements;
//Trying to book tickets based on age

//age>=5 ,price=15$
//age<=4, price=10$
//age>11,price=20$

public class NestedIfElse {

	int age;

	public void bookTickets(int age)
	{
		if(age>5)
		{
			if(age<11)
			{
				System.out.println("Price is 15$");
			}
			else if(age>11)
			{
				System.out.println("Price is 20$");
			}
		}
		else
			System.out.println("Price is 10$");
	}
	public static void main(String[] args)
	{
		NestedIfElse nie= new NestedIfElse();
		nie.bookTickets(55);
	}

}