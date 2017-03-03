package static_factory_method_developer;

public class HireDevelopmentTeam {
	
	
	public void hireDevelopers(DeveloperType skill) {
		
		//Quite fragile, might change a lot depending on type of skill set.

		Developer developer = null;

		if (skill.equals(DeveloperType.JAVA)) {
			developer = new JavaDeveloper();
		} else if (skill.equals(DeveloperType.MICROSOFT)) {
			developer = new MicrosoftDeveloper();
		} else if (skill.equals(DeveloperType.MAINFRAME)) {
			developer = new MainFrameDeveloper();
		}

		developer.callForInterview();
		developer.conductInterview();
		developer.makeOffer();
	}
	
	//other methods..

}
