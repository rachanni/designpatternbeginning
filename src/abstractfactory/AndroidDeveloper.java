package abstractfactory;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		
		
		
		return 500;
	}

	@Override
	public String name() {
		
		System.out.println("I am Android Developer.");
		return "ANDROID DEVELOPER";
	}

}
