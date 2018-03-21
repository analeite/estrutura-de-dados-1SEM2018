package aula04;

public class Principal4 {

	public static void main(String[] args) {
		Lista a = new Lista();
		a.interrupt(5);
		a.add(5);
		a.interrupt(5);
		a.add(9);
		a.add(11);
		a.add(4);
		a.add(2);
		a.add(3);
		a.add(8);
		a.add(1);
		a.print();
		a.interrupt(4);
		a.print();

	}

}
