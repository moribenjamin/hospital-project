package hospital;

import java.util.*;

public class Hospital {
	
	
	//Make Map to House Employees
	private Map<String, HospitalEmployee> hospEmployees = new HashMap<String, HospitalEmployee>();
	
	//Create a Collection to Show Values
	public Collection<HospitalEmployee> allEmployees() {
		return hospEmployees.values();
	}
	
//	Be able to add an employee
	public void hireEmployees(HospitalEmployee newEmployee) {
		hospEmployees.put(newEmployee.getEmpNumber(), newEmployee);
	}
	
	//Be able to fire employees
	public void fireEmployee(String empNumber) {
		 hospEmployees.remove(empNumber);
	}
	
}
