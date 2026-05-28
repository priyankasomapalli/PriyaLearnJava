package loopsinjava;

public class StringReverse {
	public void printReverse()
	{
		String str="Priya";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		
	}
public static void main(String[]args)
{
	StringReverse strrev=new StringReverse();
	strrev.printReverse();
}
}
