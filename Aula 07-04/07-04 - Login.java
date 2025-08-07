import javax.swing.JOptionPane;
public class Senha {
    public static void main(String[] args) {
        String usuarioCorreto = "123";
        String senhaCorreta = "@cris";
        int tentativas = 3;
        boolean loginValido = false;

        while (tentativas > 0) {
            String usuario = JOptionPane.showInputDialog(null, "Digite o Usuário:");
            String senha = JOptionPane.showInputDialog(null, "Digite a Senha:");

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Pode logar!");
                loginValido = true;
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null, "Senha ou login incorretos! Você ainda tem " + tentativas + " tentativas.");
                } else {
                    JOptionPane.showMessageDialog(null, "Senha ou login incorretos! Você não tem mais tentativas.");
                }
            }
        }

        // Caso as credenciais estejam corretas ou o número de tentativas se esgote
        if (!loginValido) {
            JOptionPane.showMessageDialog(null, "Fim de tentativas. Acesso bloqueado.");
        }
    }
}
