package observer_manager_usual;

public class Architect implements ManagerObserver {

	public Architect(Subject subject) {
		subject.subscribe(this);
	}

	@Override
	public void notifyEvent(Event event) {
		System.out.println("Architect - ");
		if (event == Event.APPRAISAL_MEETING) {
			System.out.println(
					"Talk about the so called design patterns implemented, how good and flexible the architecture is !");
		}

	}

}