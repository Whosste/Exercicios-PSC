package simularVoo;

public class Aviao {

    int QuantHorasAtividade;

    public Aviao() {
        this.QuantHorasAtividade = 0;
    }

    public void FazVoo(int horas, Piloto piloto) {

        if (QuantHorasAtividade + horas > 200) {
            System.out.println("voo nao autorizado, necessita revisao");
        } else {
            QuantHorasAtividade = horas;
            piloto.adicionaHoras(horas);
            System.out.println("voo de " + horas + "horas realizadas com sucesso, por " + piloto.getNome());
        }

    }

    public void fazRevisao() {
        this.QuantHorasAtividade = 0;
        System.out.println("revisao feita");

    }

    public void imprime() {
        System.out.println("Quantidade de horas acumuladas:" + QuantHorasAtividade);
        if (QuantHorasAtividade >= 200) {
            System.out.println("necessita revisão");
        } else {
            System.out.println("condicoes de voo");
        }
    }

}
