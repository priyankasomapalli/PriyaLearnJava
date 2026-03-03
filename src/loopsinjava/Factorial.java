package loopsinjava;

//Printing Factorial of a number
public class Factorial {
	int factorial = 1;

	public void printFactorial(int num) {
		if (num != 0) {
			for (int i = 2; i <= num; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial is: " + factorial);
		}

	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.printFactorial(6);
	}
}
