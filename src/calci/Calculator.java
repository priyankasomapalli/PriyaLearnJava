package calci;

public class Calculator {
	public void add(int num1, int num2) {
		System.out.println("Addition is" + (num1 + num2));
	}

	public void substract(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void multiply(int num1, int num2, String msg) {
		System.out.println(msg + ( num1 * num2));
	}

	public void divide(int num1, int num2,String msg) {
		System.out.println(msg + (num1 / num2));
	}

}
