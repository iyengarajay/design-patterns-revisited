package employee_filter;

public class JavaFilter implements EmployeeFilter<Employee> {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getSkills().contains(Skill.JAVA);
	}

}
