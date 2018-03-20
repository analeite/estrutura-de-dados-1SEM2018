package aula02;

public class Exercicio3 {
	public static void main(String[] args) {
		// número aleatório no intervalo [5,14]
		int quant = (int) (Math.random() * 10 + 5);
		No inicio = new No();
		No apontador = inicio;
		inicio.conteudo = quant;
		while (quant-- > 1) {
			apontador.proximo = new No();
			apontador = apontador.proximo;
			apontador.conteudo = quant;
			System.out.println("quant:" + quant);
		}
		// completar aqui
		No w = inicio.proximo;
		while (w != null) {
			System.out.println("Conteúdo: " + w.conteudo);
			w = w.proximo;
		}
	}
}
