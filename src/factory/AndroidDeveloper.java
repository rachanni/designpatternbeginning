package factory;

//child class or sub class
public class AndroidDeveloper implements Employee{

	@Override
	public int getSalary() {
		
		System.out.print("Getting Android Developer Salary: ");
		return 50000;
	}

}
