package static_factory_method_developer;

public class HireDevelopmentTeamTestVersion1 {
	
	public static void main(String[] args) {
		
		HireDevelopmentTeam hireDevelopmentTeam = new HireDevelopmentTeam();
		
		hireDevelopmentTeam.hireDevelopers(DeveloperType.JAVA);
		
		
		hireDevelopmentTeam.hireDevelopers(DeveloperType.MICROSOFT);
		
	}

}
