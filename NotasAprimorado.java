import javax.swing.JOptionPane;

public class NotasAprimorado {
    public static void main(String[] args) {
        // Solicitar ao professor o número de alunos
        int totalAlunos = obterNumeroDeAlunos();

        // Loop para solicitar as notas de cada aluno
        for (int i = 1; i <= totalAlunos; i++) {
            // Solicitar notas
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota do aluno " + i + ": "));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota do aluno " + i + ": "));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota do aluno " + i + ": "));

            // Calcular a média
            double media = (nota1 + nota2 + nota3) / 3;

            // Exibir resultado
            JOptionPane.showMessageDialog(null, "A média do aluno " + i + " é: " + media);

            // Verificar se o aluno foi aprovado
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "Aluno " + i + " aprovado!");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno " + i + " reprovado.");
            }
        }
    }
    
    private static int obterNumeroDeAlunos(){
        String input = JOptionPane.showInputDialog("Quantos alunos você deseja calcular a média?");
        return Integer.parseInt(input);
    }
}

