package uber_billing;

public class UberXL implements UberBilling{

	@Override
	//baseFare+ (durationInMinutes * time rate) + (totalTripDistance * distance rate)
	public double calculateFare(TripDetails tripDetails) {		
		return 75 + (tripDetails.getDurationInMinutes() * 1) + (tripDetails.getDurationInMinutes() * 10);
	}
	
	

}
