package base;
public class Private {
	private int a=17;
	int b=35;
	private void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	private Private()
	{
		System.out.println("Private constructor");
	}
	 public Private(String str)
	{
		System.out.println("Constructor with string");
	}
	public static void main(String[] args)
	{
		Private p=new Private();
		System.out.println(p.b);
		p.add();
	}
	
}
