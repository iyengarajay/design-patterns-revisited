package uber_billing_schemes;

public class UberBillingTest {

	public static void main(String[] args) {
		
		TripDetails tripDetails = new TripDetails(30, 10);
		UberReceipt uberReceipt = new UberReceipt(new UberX());
		System.out.println("Total: "+uberReceipt.generateReceipt(tripDetails));
		System.out.println("----------------");
		
		UberReceipt uberReceiptWithSurge = new UberReceipt(new SurgeMultiplierDecorator(new UberX()));
		System.out.println("Total: " + uberReceiptWithSurge.generateReceipt(tripDetails));
		System.out.println("----------------");
		
		UberReceipt uberReceiptWithSurgeToll = new UberReceipt(new TollDecorator(new SurgeMultiplierDecorator(new UberX())));
		System.out.println("Total: " + uberReceiptWithSurgeToll.generateReceipt(tripDetails));
		System.out.println("----------------");
		
		UberReceipt uberReceiptWithSurgeTollNew = new UberReceipt(new FirstTimeRiderDecorator(new TollDecorator(new SurgeMultiplierDecorator(new UberX()))));
		System.out.println("Total: "+ uberReceiptWithSurgeTollNew.generateReceipt(tripDetails));
		System.out.println("----------------");
		
		UberReceipt uberReceiptWeekend = new UberReceipt(new WeekendDiscountDecorator(new UberX()));
		System.out.println("Total: "+uberReceiptWeekend.generateReceipt(tripDetails));
		System.out.println("----------------");
		
	}

}
