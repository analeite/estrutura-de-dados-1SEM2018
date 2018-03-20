package aula02;

public class Exercicio4 {

	public static void main(String[] args) {
		int nro;
		No inicio = null, no = null;
		for (int i = 0; i < 5; i++) {
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
			System.out.println("Conteúdo: " + no.conteudo);
		}
		// completar aqui
		while (inicio != null) {
			System.out.println(inicio.conteudo);
			inicio = inicio.proximo;
		}
	}
}
