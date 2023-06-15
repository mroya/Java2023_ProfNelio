package metodosAbstratos.exercicios.entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}
}
