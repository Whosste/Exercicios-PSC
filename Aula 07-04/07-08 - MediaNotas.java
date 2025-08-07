import javax.swing.JOptionPane;
public class MediaNotas {
    public static void main(String[] args) {
        int numAlunos = 15;
        for (int i = 1; i <= numAlunos; i++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno " + i + ":");

            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota de " + nome + ":"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota de " + nome + ":"));

            double media = (nota1 + nota2) / 2;

            String resultado = "Aluno: " + nome + "\n"
                               + "Nota 1: " + nota1 + "\n"
                               + "Nota 2: " + nota2 + "\n"
                               + "Média: " + media;

            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
