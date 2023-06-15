package exercicios.parte3;

public class Aluno {

	public String nome;
	public double n1, n2, n3;

	public double media() {
		return n1 + n2 + n3;
	}

	public double missingPoints() {
		if (media() < 60) {
			return 60.0 - media();
		} else {
			return 0.0;
		}
	}

}
