package constructors;

public class BabyConstructor extends Constructors {
	int n;
	public void print()
	{
		System.out.println("Printing from baby constructor");
	}
	public  BabyConstructor()
	{
		System.out.println("Baby Constructor");
	}
	public BabyConstructor(int a)
	{
		n=a;
		System.out.println(n);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		BabyConstructor bc=new BabyConstructor();
		bc=new BabyConstructor(32);
		

		
	}

}
