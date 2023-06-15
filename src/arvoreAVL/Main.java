package arvoreAVL;

public class Main {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();

		arvore.node = arvore.insere(arvore.node, 50);
		arvore.node = arvore.insere(arvore.node, 20);
		arvore.node = arvore.insere(arvore.node, 70);
		arvore.node = arvore.insere(arvore.node, 20);
		arvore.node = arvore.insere(arvore.node, 40);
		arvore.node = arvore.insere(arvore.node, 45);
		arvore.node = arvore.insere(arvore.node, 46);

		System.out.println("Arvore AVL:");
		arvore.organizar(arvore.node);

		int apagarChave = 50;
		arvore.node = arvore.deleteNode(arvore.node, apagarChave);

		System.out.println("\n\nArvore AVL apos a exclusao do no com chave " + apagarChave + ":");
		arvore.organizar(arvore.node);

		int procurarChave = 80;
		Node resultado = arvore.busca(arvore.node, procurarChave);

		System.out.println("\n\nResultado da busca pelo node com chave " + procurarChave + ":");
		if (resultado != null) {
			System.out.println("Node encontrado!");
		} else {
			System.out.println("Node nao encontrado!");
		}
	}

}
