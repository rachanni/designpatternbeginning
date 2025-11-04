package abstractfactory;

public class EmployeeFactory {

//	get Employee onject
	public static Employee getEmployeeObject(EmployeeAbstractFactory employeeAbstractFactory) {
		
		return employeeAbstractFactory.createEmployee();
	}
}
