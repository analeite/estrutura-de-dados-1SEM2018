package aula02;

public class Exercicio2 {
	public static void main(String[] args) {
		No a = new No();
		No b = new No();
		No c = new No();
		No d = new No();
		a.conteudo = 10;
		b.conteudo = 11;
		c.conteudo = 12;
		d.conteudo = 13;
		a.proximo = b;
		b.proximo = c;
		c.proximo = d;
		No w = a;
		while (w != null) {
			System.out.println(w.conteudo);
			w = w.proximo;
		}
	}
}