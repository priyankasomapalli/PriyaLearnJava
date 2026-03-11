package constructors;

public class Constructors {
	public void test() {
		System.out.println("Testing Constructors");
	}

	public Constructors() {
		System.out.println("Printing from parent Constructor");
	}

	public Constructors(int n) {
		System.out.println(n);
	}

	public static void main(String[] args)

	{
		Constructors c = new Constructors();
		c=new Constructors(20);
		System.out.println(c);
	}
}
