package strategy_new_usual;

import java.time.LocalTime;

public class SocialMediaStrategy implements WorkStrategy{


	
	@Override
	public boolean checkTime(LocalTime localTime) {
		return localTime.getHour() > 10 && localTime.getHour() < 12; 
	}

	@Override
	public String doSomeWork() {
		return "Logging into facebook,gmail,twitter,instagram ";
	}

}
