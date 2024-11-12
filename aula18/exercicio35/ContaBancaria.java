package exercicio35;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void levantar(double valor){
        saldo -= valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
