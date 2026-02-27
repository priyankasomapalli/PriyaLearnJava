package calci;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(20, 22);
		calculator.substract(12, 6);
		calculator.multiply(12,12,"Multiplication is  ");
		calculator.divide(40, 4,"Division value is  ");
	}
}
