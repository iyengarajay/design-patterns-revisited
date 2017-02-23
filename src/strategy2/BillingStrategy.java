package strategy2;

public class BillingStrategy {
	
	public static Double getNormalStrategy(Double d){
		return d;
	}
	
	public static Double getHappyHourStrategy(Double d){
		return d * 0.5;
	} 
}
