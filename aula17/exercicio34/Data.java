public class Data {
    private int dia = 1;
    private int mes = 1;
    private int ano = 1;

    //  Construtor
    public Data(int dia, int mes, int ano){
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }
        if(mes >= 1 && mes <= 31){
            this.mes = mes;
        }
        if(ano > 0){
            this.ano = ano;
        }
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void exibirDetalhes(){
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
