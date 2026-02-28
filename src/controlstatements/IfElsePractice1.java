package controlstatements;

public class IfElsePractice1 {
	public void checkEvenOdd(int a)
	{
		if(a%2==0)
		{
			System.out.println("a is even");
		}
		else
			System.out.println("a is odd");
	}
	public void checkDivideBy2(int a)
	{
		if(a/2==0)
		{
			System.out.println(a +" is divisor of 2");
		}
		else
			System.out.println(a +" is not divided by 2");
	}
	public void checkPositiveOrNegative(int a)
	{
		if(a>=0)
		{
			System.out.println(a +"is Positive number");
		}
		else 
			System.out.println(a +"is negative number");
	}
	public void checkVoteAge(int a)
	{
		if(a<=18)
		{
			System.out.println("Not Eligible for voting");
		}
		else
			System.out.println("Eligible for voting");
		
	}
	public void issueDriverLiscence(String str)
	{
		if(str=="Approve")
		{
			System.out.println("Issue Drivers liscence");
		}
		else
		{
			System.out.println("Do not issue Drivers Liscence");
		}
	}
	public static void main(String[] args)
	{
		IfElsePractice1 ifp =new IfElsePractice1();
		ifp.checkVoteAge(15);
		ifp.issueDriverLiscence("Approve");
		ifp.checkDivideBy2(87);
		
	}

}
