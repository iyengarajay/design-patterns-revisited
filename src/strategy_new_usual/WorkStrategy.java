package strategy_new_usual;

import java.time.LocalTime;

public interface WorkStrategy {
	
	public boolean checkTime(LocalTime localTime);
	
	public String doSomeWork();

}
