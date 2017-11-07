package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{
	

	protected int numPatients;
	
	
	public Nurse(String empName, String empNumber, int numPatients) {
		super(empName, empNumber);
		this.numPatients=numPatients;
	
	}

	public Nurse(String empName, String empNumber) {
		super(empName, empNumber);
			numPatients = 0;
	
	}
	public int getNumPatients() {
		return numPatients;
	}
	
	@Override
	double calculatePay() {
		return 500000;
		
	}
	@Override
	public boolean drawBlood() {
		return true;		
	}
	@Override
	public void patientHealth() {
		patientHealth += 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + numPatients;
	
	}

}
