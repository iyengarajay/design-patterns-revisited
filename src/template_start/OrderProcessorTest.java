package template_start;

public class OrderProcessorTest {

	public static void main(String args[]) {
		OrderProcessor orderProcessor = new NormalOrderProcessor();
		orderProcessor.shipOrder(1L, 2L);
		
		
		OrderProcessor primeOrderProcessor = new PrimeOrderProcessor();
		primeOrderProcessor.shipOrder(1L, 2L);
		
	}

}
