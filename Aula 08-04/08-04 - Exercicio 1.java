import java.util.Scanner;

package exercicio1;
public class Exercicio1 {
    public static void main(String[] args) {
        int num = 0;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o numero: ");
        num = entrada.nextInt();
        
        if (num<0){
            System.out.println("Numero Negativo.");
        }
        
        if (num>0){
            System.out.println("Numero Positivo");
        }
        
        if (num==0){
            System.out.println("Numero igual a 0.");
        }
    }
    
}
