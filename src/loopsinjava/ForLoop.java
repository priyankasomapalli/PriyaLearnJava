package loopsinjava;

//Printing Even numbers till 25
public class ForLoop {
	public void printingEven(int num) {
		for (int i = 0; i <= num; i++) {
			String result = i % 2 == 0 ? "Even number is":"Odd number is";
			System.out.println(result);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		fl.printingEven(25);
	}

}
