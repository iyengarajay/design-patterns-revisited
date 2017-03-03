package factory_method_dp_developer_refactored;

public class HireSwedishDevelopmentTeam {

	public static Developer getSwedishDeveloper(DeveloperType developerType) {

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
