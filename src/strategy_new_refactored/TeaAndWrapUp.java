package strategy_new_refactored;

import java.time.LocalTime;

public class TeaAndWrapUp implements WorkStrategy{


	
	@Override
	public boolean checkTime(LocalTime localTime) {
		return localTime.getHour() > 16 && localTime.getHour() < 18; 
	}

	@Override
	public String doSomeWork() {
		return "Gather for tea, enjoy tea and snacks, get ready to pack up..";
	}

}
