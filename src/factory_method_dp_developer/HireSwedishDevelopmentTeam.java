package factory_method_dp_developer;

public class HireSwedishDevelopmentTeam extends HireDevelopmentTeam {

	@Override
	public Developer createDeveloper(DeveloperType developerType) {

		Developer developer = null;
		if (developerType.equals(DeveloperType.JAVA)) {
			developer = new SwedishJavaDeveloper();
		} else if (developerType.equals(DeveloperType.MICROSOFT)) {
			developer = new SwedishMicrosoftDeveloper();
		} else if (developerType.equals(DeveloperType.MAINFRAME)) {
			developer = new SwedishMainFrameDeveloper();
		}

		return developer;
	}

}
