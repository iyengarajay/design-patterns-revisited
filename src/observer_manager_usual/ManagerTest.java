package observer_manager_usual;

public class ManagerTest {

	public static void main(String[] args) {

		ProjectManager projectManager = new ProjectManager();

		Developer developer = new Developer(projectManager);
		ScrumMaster scrumMaster = new ScrumMaster(projectManager);
		QualityAnalyst qualityAnalyst = new QualityAnalyst(projectManager);
		Architect architect = new Architect(projectManager);

		projectManager.setEvent(Event.LEAVING_FOR_THE_DAY);
		//projectManager.setEvent(Event.APPRAISAL_MEETING);		

	}

}
