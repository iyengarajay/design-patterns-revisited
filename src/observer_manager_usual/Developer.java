package observer_manager_usual;

public class Developer implements ManagerObserver{
	
	
	public Developer(Subject subject){
		subject.subscribe(this);
	}

	@Override
	public void notifyEvent(Event event) {
		
		System.out.println("Poor developer - ");
		
		if(event == Event.LEAVING_FOR_THE_DAY){
			System.out.println("Go for a long tea break !!!!");
		} else 
		if(event == Event.APPRAISAL_MEETING){
			System.out.println("Give negative feedback about architect !");
		}
		
	}

}
