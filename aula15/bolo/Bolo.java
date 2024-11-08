package bolo;

public abstract class Bolo {
    //Variáveis de instância
    private String sabor;
    private int tamanho;
    private boolean cobertura;

    //Construtor da classe com dois parâmetros
    public Bolo(String sabor, boolean cobertura){
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

    // Construtor da classe com três parâmetros
    public Bolo(String sabor, int tamanho, boolean cobertura){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.cobertura = cobertura;
    }

    //Obter o valor das variáveis
    public String getSabor(){
        return sabor;
    }

    //Definir o sabor a partir do valor inserido pelo utilizador;
    public void setSabor(String sabor){
        this.sabor = sabor; 
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public boolean getCobertura(){
        return cobertura;
    }

    public void setCobertura(boolean cobertura){
        this.cobertura = cobertura;
    }


    //Apresenta os detalhes do bolo
    public void exibirDetalhes() {
        System.out.println("Sabor do bolo: " + sabor);
        System.out.println("Tamanho do bolo: " + tamanho + "cm");
        System.out.println("Cobertura? " + (cobertura ? "Sim": "Não"));
    }

    public void adicionarCobertura() {
        cobertura = true;
    }

    //Forma de criação de um método abstrato
    public abstract void tipoConfecao();
}
