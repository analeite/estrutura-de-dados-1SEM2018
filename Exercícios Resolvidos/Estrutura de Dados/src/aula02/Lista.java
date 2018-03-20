package aula02;

public class Lista {
	No inicio;

	Lista() {
		/* a lista está vazia */
		inicio = null;
	}

	void inserir(int nro) {
		/* criar um nó */
		No no = new No();
		no.conteudo = nro;
		no.proximo = null; /* este será o último nó da lista */

		/* checa se a lista está vazia */
		if (inicio == null) {
			inicio = no;
		} else {
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			/* alterar o próximo do último para o endereço do no */
			ultimo.proximo = no;
		}
	}

	void imprimir() {
		/* checa se a lista está vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		}

		else {
			System.out.println(); /* quebra de linha na tela */
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
		}
	}
}