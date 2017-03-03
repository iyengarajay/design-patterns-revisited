package static_factory_method_developer;

public class DevelopmentTeamFactory {

	
	//static factory.this is not factory method design pattern.
	public static Developer createDeveloper(DeveloperType skill) {

		Developer developer = null;
		if (skill.equals(DeveloperType.JAVA)) {
			developer = new JavaDeveloper();
		} else if (skill.equals(DeveloperType.MICROSOFT)) {
			developer = new MicrosoftDeveloper();
		} else if (skill.equals(DeveloperType.MAINFRAME)) {
			developer = new MainFrameDeveloper();
		}

		return developer;
	}

}
