 package hospital;

public class Surgeon extends Doctor {

	protected boolean isOperating;

	public Surgeon(String empName, String empNumber, String speciality, boolean isOperating) {
		super(empName, empNumber, speciality);
		this.isOperating = isOperating;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	@Override
	public double calculatePay() {
		return 120000;

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + isOperating;
	}

}
