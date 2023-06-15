package metodosAbstratos.exercicios.entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if (getAnnualIncome() < 20000.00) {
			basicTax = (getAnnualIncome() * 0.15);
		} else {
			basicTax = (getAnnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);
		}
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
