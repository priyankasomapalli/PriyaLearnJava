package loopsinjava;

public class FibinocciSeries {
	int num1=0;
	int num2=1;
	int sum;
public void fibinocci(int n)
{
	for(int i=0;i<=n;++i)
	{
		System.out.println(num1);
		sum=num1+num2;
		num1=num2;
		num2=sum;
	}
}
public static void main(String[] args)
{
	FibinocciSeries fs=new FibinocciSeries();
	fs.fibinocci(8);
}
}
