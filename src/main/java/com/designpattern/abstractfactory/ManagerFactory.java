package com.designpattern.abstractfactory;

public class ManagerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		
		return new Manager();
	}

	
	
}
