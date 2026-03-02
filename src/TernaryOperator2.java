
public class TernaryOperator2
{

	public void printShape(int priya) {
		String val = priya > 0 ? "Shape is not Circle" : "It is a 2D shape";
		System.out.println(val);

	}

	public static void main(String[] args) {
		TernaryOperator2 to = new TernaryOperator2();
		to.printShape(3);
		
	}

}
