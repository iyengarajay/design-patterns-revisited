package employee_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Streams
public class EmployeeTest5 {
	
	
	private static final List<Employee> employees=  new ArrayList<>();
	
	
	
	public static void main(String args[]){
		initialize();
		
		
		//1. Get me list of all employees in EDC.
		
		
		Predicate<Employee> edcFilter=  employee -> employee.getUnit() == Unit.EDC;
		List<Employee> edcEmployees = getEmployeesFilteredBy(edcFilter);
		
		System.out.println("--------EDC Employees--------");
		System.out.println(edcEmployees);
		
		
		//2.Get all the java developers.
		Predicate<Employee> javaFilter = employee -> employee.getSkills().contains(Skill.JAVA);
		List<Employee> javaDevelopers = getEmployeesFilteredBy( javaFilter);
		
		System.out.println("--------Java Developers--------");
		System.out.println(javaDevelopers);
		
		
		//3. Get all senior professionals
		
		
		int years = 10;
		List<Employee> seniorProfessionals = getEmployeesFilteredBy(seniorProfessionals(years));
		
		System.out.println("--------Senior Professionals-------");
		System.out.println(seniorProfessionals);
		
		
		
		
		//4. Java developer in edc.
		//Predicate<Employee> javaEdc = edcFilter.and(javaFilter);
		//List<Employee> javaEdcEmployees = getEmployeesFilteredBy(javaEdc);
		
		//System.out.println("--------Java Developers in edc--------");
		//System.out.println(javaEdcEmployees);
		
		
		
		
	}
	
	private static Predicate<Employee> seniorProfessionals(int years){
		return employee -> employee.getExperience() > years  ;
		
	}
	
	public static List<Employee> getEmployeesFilteredBy(Predicate<Employee> filter) {
		return employees.stream()
				        .filter(filter)
				        .collect(Collectors.toList());
	}
	
		
	
	private static void initialize() {

		List<Skill> dev1Skills = new ArrayList<>();
		dev1Skills.add(Skill.JAVA);
		dev1Skills.add(Skill.JPA);

		// Amit is a developer with Java,Jpa
		employees.add(new Employee("Amit", 8 , Designation.DEVELOPER,Unit.EDC,dev1Skills));

		// Rahul with .NET as a programmer
		List<Skill> dev2Skills = new ArrayList<>();
		dev2Skills.add(Skill.MICROSOFT);
		employees.add(new Employee("Rahul",5, Designation.DEVELOPER,Unit.EDC,dev2Skills));

		// Peter with python as a programmer in FS
		List<Skill> dev3Skills = new ArrayList<>();
		dev3Skills.add(Skill.PYTHON);
		employees.add(new Employee("Peter", 7 , Designation.DEVELOPER ,Unit.FS,dev3Skills));

		// Stanley with angular/js as a programmer in oil gas
		List<Skill> dev4Skills = new ArrayList<>();
		dev4Skills.add(Skill.ANGULARJS);
		dev4Skills.add(Skill.JAVASCRIPT);
		employees.add(new Employee("Stanley", 3, Designation.DEVELOPER,Unit.OIL_GAS,dev4Skills));

		// Manoj with java and angular as a programmer in FS
		List<Skill> dev5Skills = new ArrayList<>();
		dev5Skills.add(Skill.ANGULARJS);
		dev5Skills.add(Skill.JAVA);
		employees.add(new Employee("Manoj", 3, Designation.DEVELOPER,Unit.FS, dev5Skills));
		
		// Jose as manager
		List<Skill> managerSkills = new ArrayList<>();
		managerSkills.add(Skill.PMP);
		employees.add(new Employee("Jose", 15, Designation.MANAGER,Unit.EDC, managerSkills));
		
		// Pirlo as architect in edc.
		List<Skill> architectSkills = new ArrayList<>();
		managerSkills.add(Skill.DESIGN);
		employees.add(new Employee("Pirlo", 13, Designation.ARCHITECT,Unit.EDC, architectSkills));
		
		

	}


}