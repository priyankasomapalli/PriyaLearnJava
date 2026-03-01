package controlstatements;

public class NestedIfElse3
{
	// 4 sides-print square/rectangle
	// 0 sides-circle
	// 5 sides-pentagon
	// 6 sides-print hexagon
	int sides;

	public void printShape(int sides) {
		if (sides > 0) {
			if (sides == 4) {
				System.out.println("It is a square/Rectangle");
			} else if (sides == 5) {
				System.out.println("It is a Pentagon");

			} else if (sides == 6) {
				System.out.println("It is a Heaxagon");
			} else
				System.out.println("Shape is not mentioned");
		} else
			System.out.println("It is a Circle");
	}

	public static void main(String[] args) {
		NestedIfElse3 nif3 = new NestedIfElse3();
		nif3.printShape(0);
	}

}
