import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        int idade;
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

    if (idade < 25 && idade > 15) {
                System.out.println(nome + " ACEITA");
    }
            else {
            System.out.println(nome + " NÃO ACEITA");
        }
}
}