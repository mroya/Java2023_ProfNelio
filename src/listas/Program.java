package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// inserir elemento na posição 2 da lista, antes de Bob
		list.add(2, "Marco");

		// Imprimir o tamanho da lista
		System.out.println(list.size());

		// Remover um dado na lista a partir do valor no caso o nome ou pela posição
		list.remove("Anna");

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		// ou apenas colocando o índice
		// list.remove(1);
		// ou utilizando um predicado(exemplo: pega um valor X que é do tipo String e me
		// retorna se esse X ponto charAt(0) é igual a 'M'
		// e essa resposta vai dar verdadeiro ou falso
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		// Para fazer uma busca na lista com um nome em especifico no caso o "Bob"
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // se não encontrar o resultado aparece negativo

		System.out.println("-------------------------");
		// Para deixar na lista com uma letra em especifico exempo 'M'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		// Buscar o primeiro elemento que inicia com qualquer palavra neste exemplo o
		// 'A' se não existir letra solicitada ele retorna null
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
