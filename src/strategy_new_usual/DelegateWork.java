package strategy_new_usual;

import java.time.LocalTime;

public class DelegateWork implements WorkStrategy{


	
	@Override
	public boolean checkTime(LocalTime localTime) {
		return localTime.getHour() > 14 && localTime.getHour() < 16; 
	}

	@Override
	public String doSomeWork() {
		return "Yawn....Act busy,check if there is work, delegate....";
	}

}
