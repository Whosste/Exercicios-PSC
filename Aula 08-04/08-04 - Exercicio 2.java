import java.util.Scanner;
package esecicio2;
public class Esecicio2 {

    public static void main(String[] args) {
        double preco =0;
        double desconto =0;
        double valorFinal =0;
        
         Scanner entrada = new Scanner (System.in);
         System.out.println("Qual é o preco total gasto? R$");
         preco = entrada.nextInt();
         
         if (preco>=200 && preco<=300){
             desconto = 0.10;
         }
         else {
             desconto = 0;
         }
         
         valorFinal = preco - (preco*desconto);
         System.out.println("Preco Original: " + preco + "\nValor Final: " + valorFinal);
    }
    
}
