package factory;

//child class or sub class
public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.print("Getting Web Developer Salary: ");
		return 40000;
	}

	

}
