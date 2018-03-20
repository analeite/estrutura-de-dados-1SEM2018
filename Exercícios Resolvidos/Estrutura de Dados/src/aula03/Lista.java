package aula03;

public class Lista {
	No inicio;

	No getInicio() {
		return inicio;
	}

	void add(No no) {
		if (!exists(no.conteudo)) {
			if (inicio == null) {
				inicio = no;
			} else {
				No aux = inicio;
				while (aux.proximo != null) {
					aux = aux.proximo;
				}
				aux.proximo = no;
			}
		}
	}

	boolean exists(int nro) {
		No no = inicio;
		while (no != null) {
			if (no.conteudo == nro) {
				return true;
			}
			no = no.proximo;
		}
		return false;
	}

	void print() {
		No no = inicio;
		int cont = 0;
		while (no != null) {
			System.out.println(++cont + " - " + no.conteudo);
			no = no.proximo;
		}
	}

	void interrupt(int nro) {
		// programar aqui o corpo do método
		No no = inicio;
		int cont = 0;
		while (no != null) {
			System.out.println(++cont + " - " + no.conteudo);
			no = no.proximo;
			if (no.conteudo == nro) {
				System.out.println(++cont + " - " + no.conteudo);
				break;
			}

		}
	}
}
