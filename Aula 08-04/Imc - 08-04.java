package imc0804;
import java.util.Scanner;

public class Imc0804 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double kg =0;
        double m =0;
        
        System.out.print("Digite o peso em kilogramas: ");
        kg = entrada.nextDouble();
        System.out.print("Digite a altura em metros: ");
        m = entrada.nextDouble();
        
        double imc = kg/(m*m);
        
        if (imc<18.5){
            System.out.println("Classificacao: Abaixo do peso.");  
        }else if (imc>=18.5 && imc<=24.9){
            System.out.println("Classificao: Peso normal.");
        }else if (imc>=25 && imc<=29.9){
            System.out.println("Clacificacao: Sobrepeso.");
        }else{
            System.out.println("Classificacao: Obesidade.");
        }
    }
}
