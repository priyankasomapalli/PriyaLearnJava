package loopsinjava;

public class ReverseOfNumwhile {
	public void reversingNum(int a)
	{
		int reversed=0;
		int newnum;
		while(a!=0)
		{
			newnum=a%10;
			reversed=(reversed*10)+newnum;
			a=a/10;
		}
		System.out.println("Reveresed number is: "+reversed);
	}
	public static void main(String[] args)
	{
		ReverseOfNumwhile rnw=new ReverseOfNumwhile();
		rnw.reversingNum(45678);
	}

}
