package observer_manager_usual;

public class QualityAnalyst implements ManagerObserver {
	
	public QualityAnalyst(Subject subject){
		subject.subscribe(this);
	}

	@Override
	public void notifyEvent(Event event) {

		System.out.println("Quality Analyst - ");
		if (event == Event.LEAVING_FOR_THE_DAY) {
			System.out.println("Announce that nothing is working!");
		} else if (event == Event.APPRAISAL_MEETING) {
			System.out.println("Document number of bugs fixed,critical issues raised which saved the product !!!!");
		}

	}

}
