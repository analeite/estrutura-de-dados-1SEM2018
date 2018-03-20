package aula01;

import javax.swing.JOptionPane;

public class Exercicio03 {
	
//    Exercício 3 – Programar um método recursivo para calcular o somatório dos elementos de um array 
//	  de inteiros recebido como parâmetro. 
	
	public static int soma(int[] vetor, int contador) {
		if(contador < vetor.length) {
			return vetor[contador] + soma(vetor, contador + 1);
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		while(true) {
		
		int qtd_vetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor ou -1 para sair: "));
		int[] numeros = new int[qtd_vetor];
		
		if(qtd_vetor == -1) break;
		
		for (int i = 0; i < numeros.length; i++) {
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número:"));
			numeros[i] = quantidade;
		}
		
		int resultado = soma(numeros, 0);

		JOptionPane.showMessageDialog(null, "O resultado da soma é: "+resultado);
		}
	}
}