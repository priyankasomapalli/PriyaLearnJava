package loopsinjava;

//Flight Ticket Reservation
public class WhileLoop2 {
	int availableTickets = 20;

	public void bookTickets(int noOfPassengers) {
		while (noOfPassengers <= availableTickets) {
			System.out.println("Tickets Can be Reserved");
			availableTickets =availableTickets-noOfPassengers ;
			System.out.println("Remaining Seats available are: " + availableTickets);
			
			break;

		}
		availableTickets =availableTickets-noOfPassengers ;
		System.out.println("Remaining Seats available are: " + availableTickets);

	}

	public static void main(String[] args) {
		WhileLoop2 wl2 = new WhileLoop2();
		wl2.bookTickets(2);
	}

}
