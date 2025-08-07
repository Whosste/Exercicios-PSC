package simularVoo;

public class Piloto {

    private String nome;
    private int hDeVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.hDeVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaHoras(int horas) {
        this.hDeVoo += horas;
    }

    public void imprime() {
        System.out.println("nome:" + nome);
        System.out.println("Horas de Voo:" + hDeVoo);
        if (hDeVoo <= 200) {
            System.out.println("Co-Piloto");

        } else {
            System.out.println("Comandante");
        }

    }
}
