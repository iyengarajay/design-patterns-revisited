package uber_billing_schemes;

public class UberSelect implements UberBilling{

	@Override
	//baseFare+ (durationInMinutes * time rate) + (totalTripDistance * distance rate)
	public double calculateFare(TripDetails tripDetails) {		
		return 100 + (tripDetails.getDurationInMinutes() * 1) + (tripDetails.getTotalTripDistance()* 10);
	}
	
	

}
