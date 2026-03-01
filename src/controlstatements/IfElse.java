package controlstatements;

public class IfElse {
	boolean itRains = true;

	public void myAction(boolean itRains) 
	{
		if (itRains) 
		{
			System.out.println("It will rain");
		} else
			System.out.println("It will not rain");
	}

	public static void main(String[] args) {
		boolean isRaining = false;
		IfElse ifobj = new IfElse();
		ifobj.myAction(isRaining);
	}
}
