package uber_billing;

public class UberBillingTest {

	public static void main(String[] args) {
		
		UberReceipt uberReceipt = new UberReceipt(new UberX());
		
		TripDetails details = new TripDetails(30,10);

		
		System.out.println(uberReceipt.generateReceipt(details));
	}

}
