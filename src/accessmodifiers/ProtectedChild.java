package accessmodifiers;

public class ProtectedChild extends Protected {
	public static void main(String[] args)
	{
		ProtectedChild p=new ProtectedChild();
		System.out.println(p.b);
		p.add();

	}

}
