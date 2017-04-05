package uber_billing_schemes;

public class WeekendDiscountDecorator extends UberBillingDecorator {

	public WeekendDiscountDecorator(UberBilling uberBilling) {
		super(uberBilling);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applyMiscellaneous(double basePrice) {
		System.out.println("Weekend Discount at 50 %: ");
		// TODO Auto-generated method stub
		return basePrice * 0.5;
	}

}
