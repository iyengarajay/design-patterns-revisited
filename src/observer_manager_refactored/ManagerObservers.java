package observer_manager_refactored;

public class ManagerObservers {

	public static void notifyQualityAnalyst(Event event) {

		System.out.println("Quality Analyst - ");
		if (event == Event.LEAVING_FOR_THE_DAY) {
			System.out.println("Announce that nothing is working!");
		} else if (event == Event.APPRAISAL_MEETING) {
			System.out.println("Document number of bugs fixed,critical issues raised which saved the product !!!!");
		}

	}

	public static void notifyScrumMaster(Event event) {

		System.out.println("Scrum Master - ");

		if (event == Event.LEAVING_FOR_THE_DAY) {
			System.out
					.println("Stop looking at the burndown chart, ask everyone to close stories, pack bag and leave!");
		} else if (event == Event.APPRAISAL_MEETING) {
			System.out.println("Talk about how mentally agile  the team has become and there are no impediments!!!");
		}

	}

	public static void notifyArchitect(Event event) {
		if (event == Event.APPRAISAL_MEETING) {
			System.out.println(
					"Talk about the so called design patterns implemented, how good and flexible the architecture is !");
		}

	}

	public static void notifyDeveloper(Event event) {

		System.out.println("Poor developer - ");

		if (event == Event.LEAVING_FOR_THE_DAY) {
			System.out.println("Go for a long tea break !!!!");
		} else if (event == Event.APPRAISAL_MEETING) {
			System.out.println("Give negative feedback about architect !");
		}

	}

}
