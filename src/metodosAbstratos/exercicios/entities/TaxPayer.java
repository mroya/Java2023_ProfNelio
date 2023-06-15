package metodosAbstratos.exercicios.entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return anualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.anualIncome = annualIncome;
	}

	public abstract double tax();

}
