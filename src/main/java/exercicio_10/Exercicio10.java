package exercicio_10;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int numeroA, numeroB, soma;
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        soma = numeroA + numeroB;
if (soma > 10) {
    System.out.println("Seu número é " + soma);
}
    }
}
