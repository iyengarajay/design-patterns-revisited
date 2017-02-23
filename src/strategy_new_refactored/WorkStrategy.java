package strategy_new_refactored;

import java.time.LocalTime;

public interface WorkStrategy {
	
	public boolean checkTime(LocalTime localTime);
	
	public String doSomeWork();

}
