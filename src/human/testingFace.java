package human;

public class testingFace {
	public static void main(String[] args)
	{
		Face fc=new Face();
		Face fc1=new Face();
		fc.smile();
		fc.smell();
		System.out.println(fc.noOfEyes);
		System.out.println(fc.eyes);
		System.out.println(fc.name);
		fc.name="Priya";
		System.out.println(fc.name);
		fc1.name="Devaansh";
		System.out.println(fc1.name);
		
		
	}

}
