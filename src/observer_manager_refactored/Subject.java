package observer_manager_refactored;

public interface Subject {
	
	public void subscribe(ManagerObserver managerObserver);
	
	public void unsubsribe(ManagerObserver managerObserver);
	
	public void announceEvent();

}
