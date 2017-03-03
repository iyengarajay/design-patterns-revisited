package factory_method_dp_developer_refactored;

import java.util.function.Function;


//No longer abstract.
public class HireDevelopmentTeam {
	
	public void hireDevelopers(DeveloperType skill, Function<DeveloperType,Developer> function) {

		Developer developer = function.apply(skill);
		developer.screenResume();
		developer.callForInterview();
		developer.conductInterview();
		developer.makeOffer();
	}
	
	//Factory method design.
	
	
	//other methods..

}
