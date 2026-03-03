package operatorsinjava;

public class IncrementDecrementOperators {
	public static void main(String[] args)
	{
		int a=15;
		System.out.println(a++);//post increment a=a+1 i.e; a gets 15 first and then incremented by 1 and new value 16 is stored in a
		System.out.println(a);//16
		int b=20;
		System.out.println(++b);//pre-increment b+1=b; b is incremented first and that new value is stored in b==>20+1=b ,b=21
		System.out.println(b);//21
		System.out.println(a--);//Post decrement a=a-1 a is given 16 first and the it is decreased by 1 and 15 is stored in a
		System.out.println(a);//15
		System.out.println(--b);//Pre decrement  b-1=b b is decreased first and then new value is stored in b prints 20
		System.out.println(b);//20
		
		
	}
	

}
