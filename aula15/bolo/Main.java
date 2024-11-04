package bolo;

public class Main {
    public static void main(String[] args) {
        //Instânciar o objeto da classe == criar um objeto da classe Bolo
        Bolo boloAniversario = new Bolo("Morango", 30, false);

        Bolo boloJoao = new Bolo("Chocolate", true);

        //Definir os detalhes do bolo
        /*boloAniversario.setSabor("Morango");
        boloAniversario.setTamanho(30);
        boloAniversario.setCobertura(false);*/

        //Mostrar os detalhes do bolo
        boloAniversario.exibirDetalhes();

        boloJoao.exibirDetalhes();

        //Alterar a cobertura
        boloAniversario.adicionarCobertura();

        //Adicionou um espaço
        System.out.println();

        //Mostrar detalhes atualizados
        //boloAniversario.exibirDetalhes();
    }
}
