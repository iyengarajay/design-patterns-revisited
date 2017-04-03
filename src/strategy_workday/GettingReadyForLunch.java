package strategy_workday;

import java.time.LocalTime;

public class GettingReadyForLunch implements WorkStrategy{


	
	@Override
	public boolean checkTime(LocalTime localTime) {
		return localTime.getHour() > 12 && localTime.getHour() < 14; 
	}

	@Override
	public String doSomeWork() {
		return "Check Lunch menu, gather colleagues, have lunch, go for walk...";
	}

}
