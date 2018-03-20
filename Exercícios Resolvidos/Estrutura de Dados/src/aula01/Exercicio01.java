package aula01;

import javax.swing.JOptionPane;

public class Exercicio01 {
//	Exerc�cio 1 � Programar um m�todo recursivo para calcular 
//	o MDC (M�ximo Divisor Comum) de dois n�meros. Ao lado 
//	tem-se a f�rmula.

    public static int mdc(int dividendo, int divisor) {
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

            int resposta = mdc(n1, n2);
            JOptionPane.showMessageDialog(null,
                    "O resultado do MDC �: " + resposta);
        }
    }
}