package accessmodifiers;

public class Protected {
	int a=12;
	protected int b=26;
	protected void add()
	{
		System.out.println(a+b);
	}
	protected Protected()
	{
		System.out.println("Protected Constructor");
	}
	

}
