package hospital;

public  class Doctor extends HospitalEmployee implements MedicalDuties {

	protected String speciality;

	public Doctor(String empName, String empNumber, String speciality) {
		super(empName, empNumber);
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return speciality;

	}

	@Override
	public double calculatePay() {
		return 50000;
	}
	@Override
	public boolean drawBlood() {
		return true;
	}
	@Override
	public void patientHealth() {
		patientHealth *= 2;

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + speciality;

	}


		
	}
