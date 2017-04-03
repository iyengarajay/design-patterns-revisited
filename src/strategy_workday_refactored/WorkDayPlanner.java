package strategy_workday_refactored;

import java.time.LocalTime;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WorkDayPlanner {

	private Predicate<LocalTime> checkTime;

	private Supplier<String> workText;

	public WorkDayPlanner(Predicate<LocalTime> checkTime, Supplier<String> workText) {
		this.checkTime = checkTime;
		this.workText = workText;
	}

	public void doSomeRealWork(LocalTime time) {
		if (checkTime.test(time)) {
			System.out.println(workText.get());
		}
	}
}
