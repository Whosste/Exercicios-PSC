
package heranca;

public class testeFuncional {
     public static void main(String[] args) {
                                                       , 
         Funcionarios f1 = new Funcionarios();
         Gerente g1 = new gerente();
         Secretaria s1 = new secretaria();
         Estagiaria e1 = new estagiaria();
         
         f1.nome = " CEO Ste";
         f1.endereco = " Rua dos Amores, 001";
         f1.salario = 10000.00;
         
         
         g1.nome = " Isaorah";
         g1.endereco = " Rua Brisadorah, 002";
         g1.horarioTrabalho = " 8h00 as 16h00";
         g1.departamento = " Pericia";
         g1.salario = 2000.00;
         g1.login = " brisadorah2711";
         g1.senha = " sapopemba";
         
         
         s1.nome = " Malur";
         s1.endereco = " Rua dos Violinos, 003";
         s1.horarioTrabalho = " 7h00 as 18h00";
         s1.numeracao = " 123456789";
         s1.salario = 1000.00;
         
         
         e1.nome = " Ray";
         e1.endereco = " Rua dos Nomorados, 004";
         e1.horarioTrabalho = " 00h00 as 23h00";
         e1.programaEstagio = " TrampoJovem";
         e1.localCurso = " Onde Judas perdeu as botas";
         e1.salario = 500.00;
         
         
         f1.exibirDados();
         g1.exibirDados();
         g1.exibirDadosGerente();
         s1.exibirDadosSecretaria();
         e1.exibirDadosEstagiaria();
     }
}
