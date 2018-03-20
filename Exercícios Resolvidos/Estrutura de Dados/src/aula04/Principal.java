package aula04;

public class Principal {
	public static void main(String[] args) {
		Lista a = new Lista();
		a.add(5);
		a.add(2);
		a.add(8);
		a.add(6);
		a.add(7);
		a.print();
		Lista b = new Lista();
		b.add(4);
		b.add(3);
		b.add(11);
		b.add(9);
		b.print();
		a.sum(b);
		a.print();
		Lista c = new Lista();
		a.sum(c);
		a.print();
		c.add(10);
		a.sum(c);
		a.print();

//		No no;
//		Lista a = new Lista();
//		no = a.remove();
//		System.out.println("Remover: " + no);
//		a.add(5);
//		no = a.remove();
//		System.out.print("Remover: " + no.conteudo);
//		a.add(2);
//		a.add(8);
//		a.add(6);
	}
}