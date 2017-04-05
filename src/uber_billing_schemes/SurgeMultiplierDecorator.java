package uber_billing_schemes;

public class SurgeMultiplierDecorator extends UberBillingDecorator {

	public SurgeMultiplierDecorator(UberBilling uberBilling) {
		super(uberBilling);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applyMiscellaneous(double basePrice) {
		System.out.println("Surge Multiplier: " +1.5);
		// TODO Auto-generated method stub
		return basePrice * 1.5;
	}

}
