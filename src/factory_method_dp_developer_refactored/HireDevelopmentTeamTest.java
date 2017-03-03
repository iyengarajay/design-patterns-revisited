package factory_method_dp_developer_refactored;

public class HireDevelopmentTeamTest {

	public static void main(String[] args) {

		HireDevelopmentTeam hireDevelopmentTeam = new HireDevelopmentTeam();
		
		hireDevelopmentTeam.hireDevelopers(DeveloperType.JAVA,HireSwedishDevelopmentTeam::getSwedishDeveloper);

		hireDevelopmentTeam.hireDevelopers(DeveloperType.MICROSOFT,HireSwedishDevelopmentTeam::getSwedishDeveloper);

	}

}
