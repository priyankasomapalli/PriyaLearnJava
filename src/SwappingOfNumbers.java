
public class SwappingOfNumbers {
	public void swappingOfNumbers(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The Value of a is: "+a);
		System.out.println("The value of b is: "+b);
		}
	public static void main(String[] args)
	{
		SwappingOfNumbers sw=new SwappingOfNumbers();
		sw.swappingOfNumbers(2,5);
	}

}
