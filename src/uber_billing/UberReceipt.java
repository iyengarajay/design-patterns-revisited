package uber_billing;

public class UberReceipt {
	
	UberBilling uberBilling;
	
	public UberReceipt(UberBilling uberBilling){
		this.uberBilling = uberBilling;
	}
	
	public double generateReceipt(TripDetails tripDetails){
		return uberBilling.calculateFare(tripDetails);
	}
	

}
