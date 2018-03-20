package aula03;

public class Principal {
	public static void main(String[] args) {
		Lista a = new Lista(), b = new Lista();
		No no;
		no = new No();
		no.conteudo = 9;
		a.add(no);
		no = new No();
		no.conteudo = 5;
		a.add(no);
		no = new No();
		no.conteudo = 2;
		a.add(no);
		no = new No();
		no.conteudo = 4;
		a.add(no);
		no = new No();
		no.conteudo = 5;

		a.add(no);

		no = new No();
		no.conteudo = 20;
		b.add(no);
		no = new No();
		no.conteudo = 10;
		b.add(no);
		no = new No();
		no.conteudo = 15;
		b.add(no);
		// código para unir as duas listas
		
		System.out.println("Temp\n");
		No temp =a.inicio;
		while(temp.proximo != null) {
			temp = temp.proximo;
		}
		temp.proximo = b.inicio;
		while(temp.proximo != null) {
			temp = temp.proximo;
		}
		a.print();
	}
}