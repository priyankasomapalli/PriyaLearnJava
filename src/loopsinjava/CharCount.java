package loopsinjava;

public class CharCount {
	String name = "devaanshaadhyan";

	int count = 0;

	char target = 'a';

	public void printCount() {

		for (int i = name.length() - 1; i >= 0; --i) {
			if (name.charAt(i) == target) {
				count = count + 1;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		CharCount c = new CharCount();
		c.printCount();
	}
}
