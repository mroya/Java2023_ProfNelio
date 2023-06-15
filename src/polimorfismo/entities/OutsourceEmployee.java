package polimorfismo.entities;

public class OutsourceEmployee extends Employee {

	private Double additionalCharges;

	public OutsourceEmployee() {
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharges) {
		super(name, hours, valuePerHours);
		this.additionalCharges = additionalCharges;
	}

	public Double getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(Double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharges * 1.1;
	}
}
