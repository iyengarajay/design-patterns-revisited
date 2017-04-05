package employee_filter;

public class EDCFilter implements EmployeeFilter<Employee> {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getUnit() == Unit.EDC;
	}

}
