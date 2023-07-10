package interfaces.comparable.entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// Ordena por salario
		// return salary.compareTo(other.getSalary());

		// Ordenar por ordem decrescente por salario(colocar o sinal "-")
		return -salary.compareTo(other.getSalary());

		// Ordena por nome
		// return name.compareTo(other.getName());

	}

}
