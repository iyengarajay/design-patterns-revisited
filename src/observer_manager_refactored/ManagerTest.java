package observer_manager_refactored;

public class ManagerTest {

	public static void main(String[] args) {

		ProjectManager projectManager = new ProjectManager();

		ManagerObserver developer = ManagerObservers::notifyDeveloper;
		ManagerObserver scrumMaster = ManagerObservers::notifyScrumMaster;

		ManagerObserver qualityAnalyst = ManagerObservers::notifyQualityAnalyst;
		ManagerObserver architect = ManagerObservers::notifyArchitect;

		projectManager.subscribe(developer);
		projectManager.subscribe(scrumMaster);
		projectManager.subscribe(qualityAnalyst);
		projectManager.subscribe(architect);

		projectManager.setEvent(Event.APPRAISAL_MEETING);

	}

}
