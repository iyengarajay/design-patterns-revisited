package strategy_workday;

import java.time.LocalTime;

public interface WorkStrategy {
	
	public boolean checkTime(LocalTime localTime);
	
	public String doSomeWork();

}
