package arvoreAVL;

public class Node {

	int chave;
	int altura;
	Node esq;
	Node dir;

	Node(int chave) {
		this.chave = chave;
		this.altura = 1;
	}

}
