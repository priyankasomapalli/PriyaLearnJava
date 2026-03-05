package loopsinjava;

public class ReverseOfNumwhile {
	int reversed=0;
	public void reversingNum(int a)
	{
		int b=a;
		int newnum;
		while(b!=0)
		{
			newnum=b%10;
			reversed=(reversed*10)+newnum;
			b=b/10;
		}
		System.out.println("Reveresed number is: "+reversed);
		
	}
	public static void main(String[] args)
	{
		ReverseOfNumwhile rnw=new ReverseOfNumwhile();
		rnw.reversingNum(426);
	}
}
