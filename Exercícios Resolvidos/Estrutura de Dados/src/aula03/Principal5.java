package aula03;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista a = new Lista();
		No no;
		no = new No();
		no.conteudo = 5;
		a.add(no);
		no = new No();
		no.conteudo = 9;
		a.add(no);
		no = new No();
		no.conteudo = 11;
		a.add(no);
		no = new No();
		no.conteudo = 4;
		a.add(no);
		no = new No();
		no.conteudo = 2;
		a.add(no);
		no = new No();
		no.conteudo = 3;
		a.add(no);
		no = new No();
		no.conteudo = 8;
		a.add(no);
		no = new No();
		no.conteudo = 1;
		
		a.interrupt(4);

	}

}
