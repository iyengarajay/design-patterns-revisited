package uber_billing;

public interface UberBilling {
	
	//Example
	//baseFare+ (durationInMinutes * time rate) + (totalTripDistance * distance rate) 
	public double calculateFare(TripDetails tripDetails);

}
