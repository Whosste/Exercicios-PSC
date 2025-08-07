import java.util.Scanner;

package orientaçãoobjetos.pkg14.pkg04;


public class testePessoa {
    
    public static void main(String[] args) {
        
        pessoa p1 = new pessoa();
        
          
        p1.nome = "Jurandir";
        p1.idade = 35;
        p1.peso = 80;
  
        
        p1.andar();
        p1.dizerBomDia();
        p1.dormir();
        p1.exibirDadosPessoa();
        p1.estaAcordado();
          
        
        
    }
    
}
