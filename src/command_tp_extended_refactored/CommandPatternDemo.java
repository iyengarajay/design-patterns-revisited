package command_tp_extended_refactored;

import command_tp_refactored.Broker;
import command_tp_refactored.Stock;

//Client
public class CommandPatternDemo {
	public static void main(String[] args) {
		
		Stock abcStock = new Stock();

		Broker broker = new Broker();
		
		broker.takeOrder(() -> abcStock.buy());
		broker.takeOrder(() -> abcStock.sell());

		Bond bond = new Bond();
		broker.takeOrder(() -> bond.buyBonds());
		broker.takeOrder(() -> bond.sellBonds());

		
		broker.placeOrders();
	}
}
