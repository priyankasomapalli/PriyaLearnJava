package controlstatements;

public class Switch1 {
	// Loan Approval
	// Based on credit score
	public void checkingCreditScore(int score) {
		switch (score) {
		case 200:
			System.out.println("Cant approve loan");
			break;
		case 400:
			System.out.println("Loan can be approved");
			break;
		case 600:
			System.out.println("Loan can be approved");
			break;
		default:
			System.out.println("Insufficient credit score");
		}

	}

	public static void main(String[] args) {
		Switch1 sw = new Switch1();
		sw.checkingCreditScore(200);
	}
}
