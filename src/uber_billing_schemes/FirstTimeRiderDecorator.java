package uber_billing_schemes;

public class FirstTimeRiderDecorator extends UberBillingDecorator {

	public FirstTimeRiderDecorator(UberBilling uberBilling) {
		super(uberBilling);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applyMiscellaneous(double basePrice) {
		// TODO Auto-generated method stub
		System.out.println("First Time Rider Discount of 50 ");
		return basePrice - 50;
	}

}
