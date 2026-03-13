package base;
public class DoWhileinjava {
public void printingNumbers(int a)
{
	a=1;
	do
	{
		
		System.out.println(a);
		a++;
		
		
	}while(a<15);
}
public static void main(String[] args)
{
	DoWhileinjava dwj=new DoWhileinjava();
	dwj.printingNumbers(15);
	
}
}
