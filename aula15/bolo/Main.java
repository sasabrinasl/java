package bolo;

public class Main {
    public static void main(String[] args) {

        Bolo boloAniversarioJoaninha = new BoloChocolate(30, true);

        boloAniversarioJoaninha.setMensagem("Feliz aniversário Joaninha!");
        boloAniversarioJoaninha.setCorDecoracao("Azul");

        // Exibir detalhes após a implementação da interface
        boloAniversarioJoaninha.exibirDetalhes();

        /*// Polimorfismo 
        Bolo boloMarrom = new BoloChocolate(30, true);

        Bolo boloRosa = new BoloMorango(50, false);

        boloMarrom.exibirDetalhes();
        boloMarrom.tipoConfecao();

        System.out.println();

        boloRosa.exibirDetalhes();
        boloRosa.tipoConfecao();*/
    }
}
