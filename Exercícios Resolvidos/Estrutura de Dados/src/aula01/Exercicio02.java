package aula01;

import javax.swing.JOptionPane;

public class Exercicio02 {
	
//  Exerc�cio 2 � Para cada chamada de um m�todo (fun��o), recursivo ou n�o, os par�metros e as vari�veis 
//	locais s�o empilhados na pilha de execu��o. Qual � a quantidade de chamadas recursivas (empilhamentos)
//	que ir� ocorrer para calcular o MDC de 14 e 18 no Exerc�cio 1. 

    private static int contador = 0;

    public static int mdc(int dividendo, int divisor) {
        contador++;
        if (dividendo % divisor == 0) {
            return divisor;
        }
        return mdc(divisor, dividendo % divisor);
    }

    public static void main(String[] args) {
        while (true) {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o primeiro n�mero ou -1 para sair do programa."));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o segundo n�mero ou -1 para sair do programa."));
            if (n1 == -1 || n2 == -1) break;

            contador = 0;
            int resposta = mdc(n1, n2);
            JOptionPane.showMessageDialog(null,
                    "O resultado do MDC �: " + resposta +
                    "\n Ocorreram " + contador + " recurs�es.");
        }
    }
}