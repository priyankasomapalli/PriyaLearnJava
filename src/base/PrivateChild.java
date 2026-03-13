package base;
public class PrivateChild
{//we can not use inheritance when parent class has constructor as private.
	PrivateChild(String name)
	{
		System.out.println("Child constructor"+name);
	}
	
	public static void main(String[] args)
	{
		//Private p=new Private();
		//p.Private("Aadhyan");
		//System.out.println(p.b);
	}
}