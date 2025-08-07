import java.util.Scanner;
package orientaçãoobjetos.pkg14.pkg04;

public class pessoa {

    Scanner entrada = new Scanner(System.in);
    String nome;
    int idade;
    double peso;
    boolean estaAcordado;
    
    void dizerBomDia(){
        System.out.println("BOM DIA GALERINHA DO MEU CANAL!!!!!");
    }
    void andar(){
        System.out.println("ir ate uma pizzaria italiana e encher o bucho!!!!");
    }
    void dormir(){
        System.out.println("Ir preparar a cama para hibernar!");
    }
    void exibirDadosPessoa(){
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("peso: "+peso);
    }
    void verificarSeEstaAcordado(){
        System.out.println(nome + " esta acordado?");
        estaAcordado = scanner.nextInt();
        if (true == estaAcordado){
            System.out.println(nome+" esta acordado.");
        }
        else {
            System.out.println(nome+" esta dormindo.");
        }
    }
    }

