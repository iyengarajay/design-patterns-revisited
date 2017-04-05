package uber_billing_schemes;

public interface UberBilling {
	
	//Example
	//baseFare+ (durationInMinutes * time rate) + (totalTripDistance * distance rate) 
	public double calculateFare(TripDetails tripDetails);

}
