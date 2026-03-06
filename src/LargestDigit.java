
public class LargestDigit {
	int largest = 0;

	public int printLargest(int num) {
		while (num > 0) {
			int num1=num%10;
			if (num1 > largest) {
				largest = num1;
			}
			num=num/10;
		}
		return largest;
	}

	public static void main(String[] args) {
		LargestDigit ld = new LargestDigit();
		int largestNumber = ld.printLargest(896);
		System.out.println(largestNumber);
	}
}