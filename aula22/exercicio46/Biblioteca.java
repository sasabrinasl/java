package exercicio46;

import java.util.ArrayList;
import java.util.List;

//Exemplo de agregação
public class Biblioteca {
    private List<Livros> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livros livro){
        livros.add(livro);
    }

    public void listaDeLivros(){
        for(Livros livro: livros){
            System.out.println("Livro: " + livro.getTitulo());
        }
    }
}
