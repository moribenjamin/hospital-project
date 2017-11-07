package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Doctor phil  = new Doctor("Phil", "111", "Brain");
		Surgeon harrison = new Surgeon("Harry", "222", "Plastic", true);
		Nurse jackie = new Nurse ("Jackie", "333", 6);
		Receptionist janine = new Receptionist("anine", "444", true);
		Janitor rosie = new Janitor("Rosie", "555", true);
		
		hospital.hireEmployees(phil);
		hospital.hireEmployees(harrison);
		hospital.hireEmployees(jackie);
		hospital.hireEmployees(janine);
		hospital.hireEmployees(rosie);
		
		System.out.println("Here are the employees at High St. Hospital.");
		for (HospitalEmployee currentEmp : hospital.allEmployees()) {
 			System.out.println(currentEmp);
		}
//	
		System.out.println("Here are the pay rates at High St. Hospital.");
		for (HospitalEmployee currentEmp : hospital.allEmployees()) {
			System.out.println(currentEmp.getEmpName() + " gets paid a" + " salary of "
					+ currentEmp.calculatePay());
		}

		System.out.println("\nSome employees can draw blood.");
		for (HospitalEmployee currentEmp : hospital.allEmployees()) {
			if (currentEmp instanceof MedicalDuties) {
				if (((MedicalDuties) currentEmp).drawBlood()) {
					System.out.println(currentEmp.getEmpName() + " is capable of drawing blood.");
				}
			}
		}

		System.out.println("\nSome employees can administer patient care.");
		for (HospitalEmployee currentEmp : hospital.allEmployees()) {
			if (currentEmp instanceof MedicalDuties) {
				((MedicalDuties) currentEmp).patientHealth();
				System.out.println(currentEmp.getEmpName() + " has increased " + " patient health to "
						+ currentEmp.getPatientHealth());
			}
		}

	}
}