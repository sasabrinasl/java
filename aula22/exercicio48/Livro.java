package exercicio48;

import java.util.Scanner;

public class Livro implements Publicacao{
    Scanner input = new Scanner(System.in);
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        aberto = true;
        pagAtual = 1;
        System.out.println("Livro aberto.");
        System.out.println("Pág. " + pagAtual);
    }

    @Override
    public void fechar() {
        System.out.println("Livro fechado.");
        pagAtual = 0;
        aberto = false;
    }

    @Override
    public void folhear() {
        System.out.println("Desejas folhear o livro até qual página? ");
        int resposta = input.nextInt();
        input.nextLine(); // Limpar o buffer

        if (resposta > 0 && resposta <= totPaginas) {
            pagAtual = resposta;
            aberto = true;
            System.out.println("Pág. " + pagAtual);
        }else {
        System.out.println("Número de página inválido!");
        }
    }

    @Override
    public void avancarPag() {
        if (aberto && pagAtual < totPaginas) {
            pagAtual++;
            System.out.println("Pág. " + pagAtual);
        } else {
            System.out.println("Não é possível avançar.");
        }
    }    

    @Override
    public void voltarPag() {
        if (aberto && pagAtual > 1) {
            pagAtual = pagAtual - 1;
            System.out.println("Pág. " + pagAtual);
        } else {
            System.out.println("Não é possível voltar.");
        }

    }

    public void detalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totPaginas);
        System.out.println("Página atual: " + pagAtual);
        System.out.println("Aberto? " + aberto);
        System.out.println("Leitor: " + leitor.getNome());
    }
}