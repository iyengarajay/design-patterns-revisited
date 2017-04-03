package strategy_workday_refactored;

import java.time.LocalTime;

public class WorkDayPlannerTest {

	public static void main(String[] args) {

		LocalTime earlyMorning = LocalTime.of(11, 0);
		LocalTime midNoon = LocalTime.of(13, 0);
		LocalTime lateNoon = LocalTime.of(15, 0);
		LocalTime earlyEvening = LocalTime.of(17, 0);

		WorkDayPlanner workDayPlanner = new WorkDayPlanner(TimeChecker::isMorning, Worker::earlyMorning);
		workDayPlanner.doSomeRealWork(earlyMorning);

		WorkDayPlanner workDayPlannerLunch = new WorkDayPlanner(TimeChecker::earlyNoon, Worker::midNoon);
		workDayPlannerLunch.doSomeRealWork(midNoon);

		WorkDayPlanner workDayPlannerPostLunch = new WorkDayPlanner(TimeChecker::postLunch, Worker::tryWorking);
		workDayPlannerPostLunch.doSomeRealWork(lateNoon);

		WorkDayPlanner workDayLateEvening = new WorkDayPlanner(TimeChecker::earlyEvening, Worker::teaAndWrapUp);
		workDayLateEvening.doSomeRealWork(earlyEvening);

	}

}
