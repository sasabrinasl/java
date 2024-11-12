package bolo;

public class Main {
    public static void main(String[] args) {

        // Polimorfismo 
        Bolo boloMarrom = new BoloChocolate(30, true);

        Bolo boloRosa = new BoloMorango(50, false);

        boloMarrom.exibirDetalhes();
        boloMarrom.tipoConfecao();

        System.out.println();

        boloRosa.exibirDetalhes();
        boloRosa.tipoConfecao();
    }
}
