
public class TypesOfVariables {
	int x=10;
	static int y=20;
	void display()
	{
		int z=30;
		System.out.println(x +""+y +"" + z+ "");
}
	public static void main(String[] args)
	{
		TypesOfVariables tv1=new TypesOfVariables();
		TypesOfVariables tv2=new TypesOfVariables();
		tv1.x=100;
		TypesOfVariables.y=200;
		tv1.display();
		tv2.display();
	}

}
