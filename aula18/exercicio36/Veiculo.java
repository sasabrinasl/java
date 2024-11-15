

public abstract class Veiculo {
    private String veiculo, cor, marca, modelo;

    // Criar variáveis para a interface
    private boolean alugado, devolvido;

    public Veiculo(String veiculo, String cor, String marca, String modelo){
        this.veiculo = veiculo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getVeiculo(){
        return veiculo;
    }
    public void setVeiculo(String veiculo){
        this.veiculo = veiculo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getmarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getmodelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public boolean getAlugar() {
        return alugado;
    }

    public void setAlugar(boolean alugado) {
        this.alugado = alugado;
    }

    public boolean getDevolver() {
        return devolvido;
    }

    public void setDevolver(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public void exibirDetalhes(){
        System.out.println("Veiculo: " + veiculo);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public void acelerar(){
        System.out.println("ACELERAAAAAA");
    }

    public void travar(){
        System.out.println("TRAVAAAAAAAAAAAAAAAAAA!!!!!!");
    }

    public abstract void calcularPrecoAluguer(int dias);
    
}
