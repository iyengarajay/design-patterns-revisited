package static_factory_method_developer;

public class HireDevelopmentTeamRefactored {
	
	public void hireDevelopers(DeveloperType skill) {
		
		//Now this method will not change even if we add more skills.

		Developer developer = DevelopmentTeamFactory.createDeveloper(skill);
		developer.callForInterview();
		developer.conductInterview();
		developer.makeOffer();
	}
	
	//other methods..

}
