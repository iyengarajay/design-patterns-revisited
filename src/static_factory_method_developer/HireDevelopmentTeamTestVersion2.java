package static_factory_method_developer;

public class HireDevelopmentTeamTestVersion2 {
	
	public static void main(String[] args) {
		
		//This version uses the refactored version.
		HireDevelopmentTeamRefactored hireDevelopmentTeam = new HireDevelopmentTeamRefactored();
		
		hireDevelopmentTeam.hireDevelopers(DeveloperType.JAVA);
		
		
		hireDevelopmentTeam.hireDevelopers(DeveloperType.MICROSOFT);
		
	}

}
