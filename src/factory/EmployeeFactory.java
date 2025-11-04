package factory;

public class EmployeeFactory {

	
//	create and return the employee object
//    We have two sub class "AndroidDeveloper", "WebDeveloper" -> so which employee object will be created?
//	It will be decided based on parameter
	
	public static Employee getEmployeeObject(String employeeType) {
		
		if(employeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			
//			CREATE "AndroidDeveloper" object and return
			return new AndroidDeveloper();
		}else if(employeeType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
//			
//			create "WebDeveloper" object and return
			return new WebDeveloper();
		}else {
			
			return null;
		}
	}
	
}
