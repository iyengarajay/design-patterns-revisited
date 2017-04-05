package employee_filter;

public class SeniorProfessionalsFilter implements EmployeeFilter<Employee> {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getExperience() > 10;
	}

}
