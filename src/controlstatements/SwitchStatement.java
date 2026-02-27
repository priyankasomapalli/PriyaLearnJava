package controlstatements;

public class SwitchStatement {
	public static void main(String[] args) {
		String day = "Friday";
		SwitchStatement sw = new SwitchStatement();
		sw.PrintingDayOfTheWeek(day);
	}

	public void PrintingDayOfTheWeek(String day) {
		switch (day) {
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tueday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("You reached end of code");
			break;
		}
	}

}
