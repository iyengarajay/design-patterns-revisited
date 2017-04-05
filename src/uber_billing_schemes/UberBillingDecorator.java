package uber_billing_schemes;

public abstract class UberBillingDecorator implements UberBilling {

	protected UberBilling uberBilling;

	public UberBillingDecorator(UberBilling uberBilling) {
		this.uberBilling = uberBilling;
	}

	public double calculateFare(TripDetails tripDetails) {
		double basePrice = uberBilling.calculateFare(tripDetails);
		return applyMiscellaneous(basePrice);
	}

	public abstract double applyMiscellaneous(double basePrice);

}
