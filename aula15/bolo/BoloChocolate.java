package bolo;

public class BoloChocolate extends Bolo implements Personalizavel{
    //Construtor
    public BoloChocolate(int tamanho, boolean cobertura){
        super("Chocolate", tamanho, cobertura); //utiliza as caracteristicas da superbase
    }

    //Método
    @Override
    public void tipoConfecao() {
        System.out.println("Este bolo vai ser confecionado no forno.");
    }

    @Override
    public void definirMensagem(String mensagem){
        setMensagem(mensagem);
    }

    @Override
    public void corDecoracao(String corDecoracao){
        setCorDecoracao(corDecoracao);
    }

    public void exibirDetalhes() {
        // Herança do Bolo
        super.exibirDetalhes();
    
        //Condição lógica
        if(getMensagem() != null){
            System.out.println("Mensagem a apresentar: " + getMensagem());
        }
        if(getCorDecoracao() != null){
            System.out.println("A cor do bolo será: " + getCorDecoracao());
        }
    }
}
