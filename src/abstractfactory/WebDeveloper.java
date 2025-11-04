package abstractfactory;

public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		
		return 2000;
	}

	@Override
	public String name() {
		
		System.out.println("I am a Web Developer");
		return "WEB DEVELOPER";
	}

}
