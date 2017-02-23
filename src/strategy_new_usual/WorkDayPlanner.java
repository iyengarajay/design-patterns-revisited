package strategy_new_usual;

import java.time.LocalTime;

public class WorkDayPlanner {

	private WorkStrategy workStrategy;

	public WorkDayPlanner(WorkStrategy workStrategy) {
		this.workStrategy = workStrategy;
	}

	public void doSomeRealWork(LocalTime time) {
		if (workStrategy.checkTime(time)) {
			System.out.println(workStrategy.doSomeWork());
		}
	}

}
