package abstractfactory;

public class Manager implements Employee {

	@Override
	public int getSalary() {
		
		return 550;
	}

	@Override
	public String name() {
		
		
		System.out.println("I am a Manager.");
		return "MANAGER";
	}

	
	
}
