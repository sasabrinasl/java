package casa;

public class Casa {

    private int quartos; // entre 1 a 5
    private int casasDeBanho; // entre 1 e 4
    private String rua;

    public Casa(int quartos, int casasDeBanho, String rua){
        if(quartos >= 1 && quartos <=5){
            this.quartos = quartos;
        }
        if(casasDeBanho >= 1 && casasDeBanho <=4){
            this.casasDeBanho = casasDeBanho;
        }
        this.rua = rua;
    }
    public int getQuartos(){
        return quartos;
    }
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }

    public int getCasasdeBanho(){
        return casasDeBanho;
    }
    public void setCasasdeBanho(int casasDeBanho){
        this.casasDeBanho = casasDeBanho;
    }

    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }

    public void exibirDetalhes() {
        System.out.println("Quartos: " + quartos);
        System.out.println("Casas de banho: " + casasDeBanho);
        System.out.println("Rua: " + rua);
    }

}
