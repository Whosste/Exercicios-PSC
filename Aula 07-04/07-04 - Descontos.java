import javax.swing.JOptionPane;
public class Descontos {
    public static void main(String[] args) {
        String precoStr = JOptionPane.showInputDialog("Digite o preço do artigo:");
        double preco = Double.parseDouble(precoStr);
        double desconto = 0;
        double valorFinal = 0;
        
        if (preco > 10000) {
            desconto = 0.40;
        } 
        else if (preco > 5000) {
            desconto = 0.20;
        } 
        else if (preco > 2500) {
            desconto = 0.10;
        } 
        else {
            desconto = 0.05;
        }
        
        valorFinal = preco - (preco * desconto);
        JOptionPane.showMessageDialog(null, "Preço original: R$ " + preco + "\nDesconto: " + (desconto * 100) + "%\nValor final: R$ " + valorFinal);
    }
}