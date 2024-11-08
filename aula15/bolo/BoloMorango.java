package bolo;

public class BoloMorango extends Bolo{
    public BoloMorango(int tamanho, boolean cobertura){
        super("Morango", tamanho, cobertura);
    }

    @Override
    public void tipoConfecao(){
        System.out.println("Este bolo será confecionado na lareira.");
    }
}
