package bolo;

public class Main {
    public static void main(String[] args) {

        BoloChocolate boloMarrom = new BoloChocolate(30, true);

        BoloMorango boloRosa = new BoloMorango(50, false);

        boloMarrom.exibirDetalhes();
        boloMarrom.tipoConfecao();

        System.out.println();

        boloRosa.exibirDetalhes();
        boloRosa.tipoConfecao();
    }
}
