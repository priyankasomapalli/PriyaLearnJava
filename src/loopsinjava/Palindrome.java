package loopsinjava;

public class Palindrome {
	int reversed = 0;

	public boolean checkingPalindrome(int a) {
		int newnum1 = a;
		int newnum;
		while (newnum1 != 0) {
			newnum = newnum1 % 10;
			reversed = (reversed * 10) + newnum;
			newnum1 = newnum1 / 10;
		}
		boolean b=(reversed==a)?true:false;
		return b;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean x=p.checkingPalindrome(424);
		System.out.println(x);
		
	}
}
