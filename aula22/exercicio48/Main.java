package exercicio48;

public class Main {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa("Maria", "21", 'F');
        Livro livro1 = new Livro("Pai Rico Pai Pobre", "Robert Kiyosaki", 381);

        // Associar um leitor ao livro
        livro1.setLeitor(maria);

        // Abrir e interagir com o livro
        livro1.abrir();
        livro1.folhear();
        livro1.avancarPag();
        livro1.voltarPag();
        livro1.fechar();

        // Mostrar detalhes
        livro1.detalhes();
    }
}
