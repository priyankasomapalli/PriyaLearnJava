package base;
public class CountingTheDigit {
public int counting(int num,int digit)
{   
	int count=0;
	
	if(num==0&&digit==0)
	{
		count=1;
	}
	
	while(num!=0)
	{
		int lastDigit=num%10;
		if(lastDigit==digit)
		{
			count++;
		}
		num=num/10;
	}
	return count;
}

public static void main(String[] args)
{
	CountingTheDigit ctd=new CountingTheDigit();
	int result=ctd.counting(673544551,4);
	System.out.println(result);
}
}
