package abstractfactory;

public class Client {

	
	public static void main(String[] args) {
		
//		getting "AndroidDeveloper" object
		Employee androidDeveloperObject = EmployeeFactory.getEmployeeObject(new AndroidDevFactory());
		androidDeveloperObject.name();
		
		
//		getting "WebDeveloper" object
		Employee webDeveloperObject = EmployeeFactory.getEmployeeObject(new WebDevFactory());
		webDeveloperObject.name();
		
		
//		get "Manager" object at run time
		Employee managerObject = EmployeeFactory.getEmployeeObject(new ManagerFactory());
		managerObject.name();
		
	}
}
