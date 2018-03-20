package aula04;

public class Lista {
	No inicio;

	void add(int nro) {
		No no = new No();
		no.conteudo = nro;
		if (inicio == null) {
			no.proximo = no;
			inicio = no;
		} else {
			No current = inicio;
			do {
				if (((current.conteudo <=nro)&& (current.proximo.conteudo >= nro)) || current.proximo == inicio) {
					no.proximo = current.proximo;
					current.proximo = no;
					if (nro < inicio.conteudo) {
						inicio = no;
					}
					return;
				}
				current = current.proximo;
			} while (current != inicio);
		}
			
	}
	
	public void sum(Lista lista) {
		if(lista.inicio != null) {
			No ultimo = lista.inicio;
			do {
				this.add(ultimo.conteudo);
				ultimo = ultimo.proximo;
			}while(ultimo != lista.inicio);
		}
	}
	
//	No currNode = inicio;
//	No prevNode = null;
//	
//	public void remove() {
//		if(inicio != null) {
//			if (currNode.proximo == inicio) {
//				inicio = null;
//			}
//		}else {
//			prevNode = currNode;
//			currNode = currNode.proximo;
//		}
//	}
	

	void print() {
		if (inicio == null) {
			System.out.println("\nLista vazia");
		} else {
			System.out.println();
			No ultimo = inicio;
			do {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			} while (ultimo != inicio);
		}
	}
}
