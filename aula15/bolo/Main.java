package bolo;

public class Main {
    public static void main(String[] args) {
        //Instânciar o objeto da classe == criar um objeto da classe Bolo
        Bolo boloAniversario = new Bolo();

        //Definir os detalhes do bolo
        boloAniversario.sabor = "Morango";
        boloAniversario.tamanho = 30;
        boloAniversario.cobertura = false; 

        //Mostrar os detalhes do bolo
        boloAniversario.exibirDetalhes();

        //Alterar a cobertura
        boloAniversario.adicionarCobertura();

        //Adicionou um espaço
        System.out.println();

        //Mostrar detalhes atualizados
        boloAniversario.exibirDetalhes();
    }
}
