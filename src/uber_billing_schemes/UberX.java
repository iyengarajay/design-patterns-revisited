package uber_billing_schemes;

public class UberX implements UberBilling{

	@Override
	//baseFare+ (durationInMinutes * time rate) + (totalTripDistance * distance rate)
	public double calculateFare(TripDetails tripDetails) {		
		System.out.println("UberX: ");
		double subTotal = 50 + (tripDetails.getDurationInMinutes() * 1) + (tripDetails.getTotalTripDistance()* 10);
		System.out.println("Sub Total : "+subTotal);		
		
		return subTotal;
	}
	
	

}
