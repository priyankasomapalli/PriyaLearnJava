package base;
public class CountDigits {
	int count=0;
	public int countingDigits(int num)
	{
	while(num>0) {
		num=num/10;
		count++;
	}
	return count;
		
	}
	public static void main(String[] args)
	{
		CountDigits cd=new CountDigits();
		int total=cd.countingDigits(488769);
		System.out.println(total);
		
	}

}
