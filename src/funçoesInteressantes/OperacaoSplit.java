package funçoesInteressantes;

// Operação split ( serve para recortar uma string separados por espaço em branco)

public class OperacaoSplit {

	public static void main(String[] args) {

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
