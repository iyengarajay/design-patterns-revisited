package observer_manager_usual;

public class ScrumMaster implements ManagerObserver {

	public ScrumMaster(Subject subject){
		subject.subscribe(this);
	}
	
	@Override
	public void notifyEvent(Event event) {

		System.out.println("Scrum Master - ");
		
		if (event == Event.LEAVING_FOR_THE_DAY) {
			System.out.println("Stop looking at the burndown chart, ask everyone to close stories, pack bag and leave!");
		} else if (event == Event.APPRAISAL_MEETING) {
			System.out.println("Talk about how mentally agile  the team has become and there are no impediments!!!");
		}

	}

}
