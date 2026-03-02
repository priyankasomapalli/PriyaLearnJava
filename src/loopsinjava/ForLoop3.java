package loopsinjava;

//Printing sum of even numbers  and sum of odd till given number
public class ForLoop3 {
	int sum = 0;
	int result = 0;

	public void printSum(int num) {
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("Even number : " + i);
				System.out.println("Sum of even numbers is: " + sum);

			} else {
				result = i + result;
				System.out.println("Odd num: " + i);
				System.out.println("Sum of odd: " + result);
			}

		}

	}

	public static void main(String[] args) {
		ForLoop3 fl3 = new ForLoop3();
		fl3.printSum(11);
	}

}
