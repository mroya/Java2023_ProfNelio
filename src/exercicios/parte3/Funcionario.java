package exercicios.parte3;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;

	public double grossSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", grossSalary());
	}

}
