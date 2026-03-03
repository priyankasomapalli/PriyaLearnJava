package loopsinjava;
//Checking for the fund transfer for the limit 100$ per day

public class WhileLoop {
	public void approveFund(int amount) {
		int limit1 = 100;
		int limit2 = 20;
		while (amount <= limit1) {
			System.out.println("Fund transfer approved");
			limit1 = limit1 - amount;
			//int limit2=amount<=limit2?"Fund Transfer is approved":"Cannot approve Fund transfer";
			if (amount <= limit2) {
				System.out.println("Fund transfer approved");
				limit2 = limit2 - amount;
			} else {
				System.out.println("Cannot approve the fund transfer");
			}
			System.out.println(limit1 + " Limit Reamaining");
			System.out.println(limit2 + " Limit Remaining fo Approver2");
		}
	}

	public static void main(String[] args) {
		WhileLoop wl = new WhileLoop();
		wl.approveFund(35);
	}

}
