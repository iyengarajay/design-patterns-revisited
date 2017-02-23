package strategy_new_usual;

import java.time.LocalTime;

public class WorkDayPlannerTest {
	
	
	public static void main(String[] args) {
		
		LocalTime earlyMorning = LocalTime.of(11, 0);
		LocalTime midNoon = LocalTime.of(13, 0);
		LocalTime lateNoon = LocalTime.of(15, 0);
		LocalTime earlyEvening = LocalTime.of(17, 0);
		
		WorkDayPlanner workDayPlanner = new WorkDayPlanner(new SocialMediaStrategy());
		workDayPlanner.doSomeRealWork(earlyMorning);
		
		WorkDayPlanner workDayPlannerLunch = new WorkDayPlanner(new GettingReadyForLunch());
		workDayPlannerLunch.doSomeRealWork(midNoon);
		
		
		WorkDayPlanner workDayPlannerPostLunch = new WorkDayPlanner(new DelegateWork());
		workDayPlannerPostLunch.doSomeRealWork(lateNoon);
		

		WorkDayPlanner workDayLateEvening = new WorkDayPlanner(new TeaAndWrapUp());
		workDayLateEvening.doSomeRealWork(earlyEvening);		
		
		
		
		
		
	}
	
	
	

}
