import java.util.Scanner;
public class Tabuada2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Digite um numero para mostrar sua Tabuada: ");
        int num = scanner.nextInt();
        
        System.out.println("==================");
        System.out.println("      Tabuada     ");
        System.out.println("==================");
            
        for (int i = 1; i <= 10; i++){
            System.out.println("      "+ num + "x" + i + "=" + (num*i) + "       ");
            
        }
        
        System.out.println("==================");
    }
    
}

