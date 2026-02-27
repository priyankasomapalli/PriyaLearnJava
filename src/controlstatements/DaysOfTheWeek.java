package controlstatements;

public class DaysOfTheWeek {
	public static void main(String[] args)
	{
	String day="Friday";
	DaysOfTheWeek dw=new DaysOfTheWeek();
	dw.PrintDayOfTheWeek(day);
	}

	public void PrintDayOfTheWeek(String day)
	{
		if(day=="Monday")
		{
			System.out.println("It is Monday");
		}
		if(day=="Tuesday")
		{
			System.out.println("It is Tuesday");
		}
		if(day=="Wednesday")
		{
			System.out.println("It is Wednesday");
		}
		if(day=="Thursday")
		{
			System.out.println("It is Thursday");
		}
		if(day=="Friday")
		{
			System.out.println("It is Friday");
		}
		if(day=="Saturday")
		{
			System.out.println("It is Saturday");
		}
		else
			System.out.println("It is Sunday");
	}

}
