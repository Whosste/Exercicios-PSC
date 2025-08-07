
package heranca;

public class Gerente extends Funcionarios {
    String departamento, login, senha;
    
    void exibirDadosGerente(){
        System.out.println("Gerencia");
        System.out.println("Departamento =" + departamento);
        System.out.println("Login =" + login);
        System.out.println("Senha =" + senha);
    }
}
