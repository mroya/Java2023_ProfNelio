package arvoreAVL;

public class Arvore {

	Node node;

	int altura(Node node) {
		if (node == null) {
			return 0;
		}
		return node.altura;
	}

	int balancear(Node node) {
		if (node == null) {
			return 0;
		}
		return altura(node.esq) - altura(node.dir);
	}

	Node giroDireita(Node y) {
		Node x = y.esq;
		Node T2 = x.dir;

		x.dir = y;
		y.esq = T2;

		y.altura = Math.max(altura(y.esq), altura(y.dir)) + 1;
		x.altura = Math.max(altura(x.esq), altura(x.dir)) + 1;

		return x;
	}

	Node giroEsquerda(Node x) {
		Node y = x.dir;
		Node T2 = y.esq;

		y.esq = x;
		x.dir = T2;

		x.altura = Math.max(altura(x.esq), altura(x.dir)) + 1;
		y.altura = Math.max(altura(y.esq), altura(y.dir)) + 1;

		return y;
	}

	Node insere(Node node, int posicao) {
		if (node == null) {
			return new Node(posicao);
		}

		if (posicao < node.chave) {
			node.esq = insere(node.esq, posicao);
		} else if (posicao > node.chave) {
			node.dir = insere(node.dir, posicao);
		} else {
			return node; // chave já existe na árvore
		}

		node.altura = 1 + Math.max(altura(node.esq), altura(node.dir));

		int balancear = balancear(node);

		// Casos de rotação
		if (balancear > 1 && posicao < node.esq.chave) {
			return giroDireita(node);
		}

		if (balancear < -1 && posicao > node.dir.chave) {
			return giroEsquerda(node);
		}

		if (balancear > 1 && posicao > node.esq.chave) {
			node.esq = giroEsquerda(node.esq);
			return giroDireita(node);
		}

		if (balancear < -1 && posicao < node.dir.chave) {
			node.dir = giroDireita(node.dir);
			return giroEsquerda(node);
		}

		return node;
	}

	Node vlrMinNode(Node node) {
		Node atual = node;
		while (atual.esq != null) {
			atual = atual.esq;
		}
		return atual;
	}

	Node deleteNode(Node node, int posicao) {
		if (node == null) {
			return node;
		}

		if (posicao < node.chave) {
			node.esq = deleteNode(node.esq, posicao);
		} else if (posicao > node.chave) {
			node.dir = deleteNode(node.dir, posicao);
		} else {
			if (node.esq == null || node.dir == null) {
				Node temp;
				if (node.esq != null) {
					temp = node.esq;
				} else {
					temp = node.dir;
				}
				if (temp == null) {
					temp = node;
					node = null;
				} else {
					node = temp;
				}
			} else {
				Node temp = vlrMinNode(node.dir);
				node.chave = temp.chave;
				node.dir = deleteNode(node.dir, temp.chave);
			}
		}

		if (node == null) {
			return node;
		}

		node.altura = 1 + Math.max(altura(node.esq), altura(node.dir));

		int balance = balancear(node);

		if (balance > 1 && balancear(node.esq) >= 0) {
			return giroDireita(node);
		}

		if (balance > 1 && balancear(node.esq) < 0) {
			node.esq = giroEsquerda(node.esq);
			return giroDireita(node);
		}

		if (balance < -1 && balancear(node.dir) <= 0) {
			return giroEsquerda(node);
		}

		if (balance < -1 && balancear(node.dir) > 0) {
			node.dir = giroDireita(node.dir);
			return giroEsquerda(node);
		}

		return node;
	}

	Node busca(Node node, int posicao) {
		if (node == null || node.chave == posicao) {
			return node;
		}

		if (posicao < node.chave) {
			return busca(node.esq, posicao);
		}

		return busca(node.dir, posicao);
	}

	void organizar(Node node) {
		if (node != null) {
			organizar(node.esq);
			System.out.print(node.chave + " ");
			organizar(node.dir);
		}
	}
}