package exercicio46;

public class Main {
    public static void main(String[] args) {
        //Instânciar a classe
        Livros livro1 = new Livros("A Guerra Santa do Fred na wc");
        Livros livro2 = new Livros("Pobre de quem for depois do Fred");
        Livros livro3 = new Livros("O problema de quem passa muito tempo na sanita by Fred");
        Biblioteca biblioteca = new Biblioteca();

        //Adicionar os livros na biblioteca
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);

        //Mostrar a lista de livros
        biblioteca.listaDeLivros();
    }
}
