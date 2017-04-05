package employee_filter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest1 {

	private static final List<Employee> employees = new ArrayList<>();

	public static void main(String args[]) {
		
		initialize();

		// 1. Get list of all employees in EDC.
		System.out.println("----All in EDC----");

		
		List<Employee> edcEmployees = getAllEmployeesIn(Unit.EDC);
		
		System.out.println(edcEmployees);
		
	
		
		
		

		
		
		
		// 2. Get a list of everyone with java skills.
		System.out.println("----All Java----");

		List<Employee> java = getAllEmployeesWithSkill(Skill.JAVA);
		System.out.println(java);
		
		
		
		
		
				
		
		System.out.println("----All Senior----");

		List<Employee> senior = getAllSeniorEmployees();
		System.out.println(senior);		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Employee> getAllEmployeesIn(Unit unit){
		
		List<Employee> edcEmployees = new ArrayList<>();
		for(Employee employee : employees){
		 
			if(employee.getUnit() == unit ){
				edcEmployees.add(employee);
			}
		}
		return edcEmployees;
	}
	
	
	public static List<Employee> getAllEmployeesWithSkill(Skill skill){
		
		List<Employee> javaEmployees = new ArrayList<>();
		for(Employee employee : employees){
			if(employee.getSkills().contains(skill)){
				javaEmployees.add(employee);
			}
		}
		return javaEmployees;
	}
	
	
	public static List<Employee> getAllSeniorEmployees(){
		
		List<Employee> javaEmployees = new ArrayList<>();
		for(Employee employee : employees){
			if(employee.getExperience() > 10){
				javaEmployees.add(employee);
			}
		}
		return javaEmployees;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	private static void initialize() {

		List<Skill> dev1Skills = new ArrayList<>();
		dev1Skills.add(Skill.JAVA);
		dev1Skills.add(Skill.JPA);

		// Amit is a developer with Java,Jpa
		employees.add(new Employee("Amit", 8, Designation.DEVELOPER, Unit.EDC, dev1Skills));

		// Rahul with .NET as a programmer
		List<Skill> dev2Skills = new ArrayList<>();
		dev2Skills.add(Skill.MICROSOFT);
		employees.add(new Employee("Rahul", 5, Designation.DEVELOPER, Unit.EDC, dev2Skills));

		// Peter with python as a programmer in FS
		List<Skill> dev3Skills = new ArrayList<>();
		dev3Skills.add(Skill.PYTHON);
		employees.add(new Employee("Peter", 7, Designation.DEVELOPER, Unit.FS, dev3Skills));

		// Stanley with angular/js as a programmer in oil gas
		List<Skill> dev4Skills = new ArrayList<>();
		dev4Skills.add(Skill.ANGULARJS);
		dev4Skills.add(Skill.JAVASCRIPT);
		employees.add(new Employee("Stanley", 3, Designation.DEVELOPER, Unit.OIL_GAS, dev4Skills));

		// Manoj with java and angular as a programmer in FS
		List<Skill> dev5Skills = new ArrayList<>();
		dev5Skills.add(Skill.ANGULARJS);
		dev5Skills.add(Skill.JAVA);
		employees.add(new Employee("Manoj", 3, Designation.DEVELOPER, Unit.FS, dev5Skills));

		// Jose as manager
		List<Skill> managerSkills = new ArrayList<>();
		managerSkills.add(Skill.PMP);
		employees.add(new Employee("Jose", 15, Designation.MANAGER, Unit.EDC, managerSkills));

		// Pirlo as architect in edc.
		List<Skill> architectSkills = new ArrayList<>();
		managerSkills.add(Skill.DESIGN);
		employees.add(new Employee("Pirlo", 13, Designation.ARCHITECT, Unit.EDC, architectSkills));

	}

}