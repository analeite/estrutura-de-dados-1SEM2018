package aula04;

public class Principal3 {

	public static void main(String[] args) {
		No no;
		Lista a = new Lista();
		no = a.remove();
		System.out.println("Remover: " + no);
		a.add(5);
		no = a.remove();
		System.out.println("Remover: " + no.conteudo);
		a.add(2);
		a.add(8);
		a.add(6);
		a.add(7);
		a.print();
		no = a.remove();
		System.out.println("Remover: " + no.conteudo);
		a.print();

	}

}
