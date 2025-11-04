package factory;

//Scenario - We have one super class "Employee" -> It can be interface or abstract class
//           And also we have multiple sub class "AndroidDeveloper", "WebDeveloper" implementing "Employee"
//             Client "DeveloperClient" want to create object of Employee.
//               Obviously client can create object using new keyword -> but it leads to tight coupling
//             Also we want to remove object creation responsibility from client
//            Solution - Use Factory Design Pattern
public class DeveloperClient {

	
	public static void main(String[] args) {
		
//		tight coupling -> not recommended
//		Employee employee = new AndroidDeveloper();
		
//		use factory method to get object of "AndroidDeveloper"
		Employee employeeAndroidDeveloper= EmployeeFactory.getEmployeeObject("ANDRoid developer");
		System.out.println("AndroidDeveloper object created: "+ (employeeAndroidDeveloper)); // factory.AndroidDeveloper@37a71e93 -> object of "AndroidDeveloper" is created!
		int salaryOfAndroidDeveloper= employeeAndroidDeveloper.getSalary();
		System.out.println(salaryOfAndroidDeveloper);
		
		
//		use factory method to get object of "WebDeveloper"
		Employee employeeWebDeveloper = EmployeeFactory.getEmployeeObject("WEB DEVELOPER");
		System.out.println("WebDeveloper object created: "+ (employeeWebDeveloper));  // WebDeveloper object created: factory.WebDeveloper@76fb509a -> object of "WebDeveloper" is created!
		int salaryOfWebDeveloper= employeeWebDeveloper.getSalary();
		System.out.println(salaryOfWebDeveloper);
		
		System.out.println("Possible error scenario: if you pass wrong class name as parameter");
//		cORRECT NAME -> "WEB DEVELOPER"
//		INCORRECT NAME -> "WE DEVELOPER"
//		wrongClassNamePassedAsParameter -> this object is not created -> it means wrongClassNamePassedAsParameter is null
//		so if you try to use it then you will get -> java.lang.NullPointerException
		Employee wrongClassNamePassedAsParameter = EmployeeFactory.getEmployeeObject("WE DEVELOPER");
//		wrongClassNamePassedAsParameter.getSalary();
		
	}
}
