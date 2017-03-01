package observer_manager_usual;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Subject {
	
	private Event event;
	
	private List<ManagerObserver> managerObservers = new ArrayList<>();
	
	@Override
	public void subscribe(ManagerObserver managerObserver) {
		managerObservers.add(managerObserver);
		
	}

	@Override
	public void unsubsribe(ManagerObserver managerObserver) {
		managerObservers.remove(managerObserver);
		
	}

	@Override
	public void announceEvent() {
		for(ManagerObserver managerObserver : managerObservers){
			managerObserver.notifyEvent(event);
		}
	}
	
	public void setEvent(Event event){
		this.event=event;
		announceEvent();
	}
	


}
