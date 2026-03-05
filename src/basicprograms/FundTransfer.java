package basicprograms;

public class FundTransfer {
	int limit = 100;

	public boolean approveLimit(int a) {
		if (a <= limit) {
			System.out.println("Can be approved");
			limit = limit - a;
			return true;
		} else {
			System.out.println("Cannot be approved");
			return false;

		}
	}

	public static void main(String[] args) {
		FundTransfer ft = new FundTransfer();
		ft.approveLimit(99);
		System.out.println("Remaining approval limit for the day is : "+ft.limit);
		ft.approveLimit(2);

	}

}
