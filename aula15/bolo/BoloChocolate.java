package bolo;

public class BoloChocolate extends Bolo{
    public BoloChocolate(int tamanho, boolean cobertura){
        super("Chocolate", tamanho, cobertura); //utiliza as caracteristicas da superbase
    }

    @Override
    public void tipoConfecao() {
        System.out.println("Este bolo vai ser confecionado no forno.");
    }
}
