package vetores.exercicios;

public class Pessoa {

	private double altura;
	private char sexo;

	public Pessoa(double altura, char sexo) {
		super();
		this.altura = altura;
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
