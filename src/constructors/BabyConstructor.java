package constructors;

public class BabyConstructor extends Constructors {
	int n;
	public void print()
	{
		super.test();//accessing parent method using super
		System.out.println("Printing from baby constructor");
	}
	public  BabyConstructor()
	{
		super(55);
		System.out.println("Baby Constructor");
	}
	public BabyConstructor(int n)
	{//here int n in instance variable and in parameter both different but to avoid confusion we use this keyword
		this.n=n; //this(); used to call constructor,here line 9 is being called.
		System.out.println(n);
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		BabyConstructor bc=new BabyConstructor();
		bc=new BabyConstructor(32);
		bc.print();
		System.out.println(bc);
		

		
	}

}
