package strategy_new_refactored;

import java.time.LocalTime;

public class TimeChecker {
	
	
	public static boolean isMorning(LocalTime localTime) {
		return localTime.getHour() > 10 && localTime.getHour() < 12; 
	}

	
	public static boolean earlyNoon(LocalTime localTime) {
		return localTime.getHour() > 12 && localTime.getHour() < 14; 
	}
	
	
	public static boolean postLunch(LocalTime localTime) {
		return localTime.getHour() > 14 && localTime.getHour() < 16; 
	}
	
	
	public static boolean earlyEvening(LocalTime localTime) {
		return localTime.getHour() > 16 && localTime.getHour() < 18; 
	}
}
