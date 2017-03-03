package factory_method_dp_developer;

public abstract class HireDevelopmentTeam {
	
	public void hireDevelopers(DeveloperType skill) {
		
		//Now this method will not change even if we add more skills.

		Developer developer = createDeveloper(skill);
		developer.screenResume();
		developer.callForInterview();
		developer.conductInterview();
		developer.makeOffer();
	}
	
	//Factory method design.
	public abstract Developer createDeveloper(DeveloperType developerType );
	
	//other methods..

}
