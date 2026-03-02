package loopsinjava;
//Printing sum of numbers till given number

public class ForLoop2 {
	public void printSum(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		ForLoop2 fl2=new ForLoop2();
		fl2.printSum(32);
		
	}
	

}
