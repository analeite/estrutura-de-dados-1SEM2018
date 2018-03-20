package aula02;

public class Exercicio5 {

	public static void main(String[] args) {
		No lista1 = criaLista(6), lista2 = criaLista(4);
		System.out.println("1a lista");
		imprimir(lista1);
		System.out.println("2a lista");
		imprimir(lista2);
	}

	public static No criaLista(int nroElementos) {
		int nro;
		No inicio = null, no = null;
		for (int i = 0; i < nroElementos; i++) {
			nro = (int) (Math.random() * 10 + 1);
			if (inicio == null) {
				no = new No();
				no.conteudo = nro;
				inicio = no;
			} else {
				no.proximo = new No();
				no = no.proximo;
				no.conteudo = nro;
			}
		}
		return inicio;
	}

	public static void imprimir(No no) {
		// completar aqui
		if (no != null) {
			imprimir(no.proximo);
			System.out.println("Conteúdo: " + no.conteudo);
		}
	}
}
