package bolo;

public class Bolo {
    //Variáveis de instância
    public String sabor;
    public int tamanho;
    public boolean cobertura;

    //Apresenta os detalhes do bolo
    public void exibirDetalhes() {
        System.out.println("Sabor do bolo: " + sabor);
        System.out.println("Tamanho do bolo: " + tamanho + "cm");
        System.out.println("Cobertura? " + (cobertura ? "Sim": "Não"));
    }

    public void adicionarCobertura() {
        cobertura = true;
    }
}
