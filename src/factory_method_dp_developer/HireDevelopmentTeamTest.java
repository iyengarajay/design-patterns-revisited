package factory_method_dp_developer;

public class HireDevelopmentTeamTest {

	public static void main(String[] args) {

		HireDevelopmentTeam hireDevelopmentTeam = new HireSwedishDevelopmentTeam();

		hireDevelopmentTeam.hireDevelopers(DeveloperType.JAVA);

		hireDevelopmentTeam.hireDevelopers(DeveloperType.MICROSOFT);

	}

}
