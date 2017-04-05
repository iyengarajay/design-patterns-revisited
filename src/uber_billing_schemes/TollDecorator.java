package uber_billing_schemes;

public class TollDecorator extends UberBillingDecorator {

	public TollDecorator(UberBilling uberBilling) {
		super(uberBilling);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applyMiscellaneous(double basePrice) {
		System.out.println("Toll : " + 30);
		// TODO Auto-generated method stub
		return basePrice + 30;
	}

}
