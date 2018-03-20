package aula01;

import javax.swing.JOptionPane;

public class Exercicio04 {

//	Exercício 4 – Programar um método recursivo para retornar o maior valor contido num array de inteiros 
//	recebido como parâmetro.

	static int aux = 0;

	private static int maior(int[] numeros, int i) {
		if (i == numeros.length) {
			return numeros[aux];
		} else {
			if (numeros[i] > numeros[aux]) {
				aux = i;
				return maior(numeros, i + 1);
			} else {
				return maior(numeros, i + 1);
			}
		}
	}

	public static void main(String[] args) {

		while (true) {

			int qtd_vetor = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor ou -1 para sair: "));
			int[] numeros = new int[qtd_vetor];

			if (qtd_vetor == -1)
				break;

			for (int i = 0; i < numeros.length; i++) {
				int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número:"));
				numeros[i] = quantidade;
			}

			int resultado = maior(numeros, 0);

			JOptionPane.showMessageDialog(null, "O maior número é: " + resultado);
		}
	}
}
