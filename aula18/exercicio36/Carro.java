public class Carro extends Veiculo {
    public Carro(String cor, String marca, String modelo){
        super("Carro", cor, marca, modelo);
    }

    @Override
    public void calcularPrecoAluguer(int dias){
        double precoAluguer = 32.8 * dias;
        double valorIVA = precoAluguer * 0.23;
        double precoAluguerFinal = precoAluguer + valorIVA;
        System.out.println("Valor do aluguer do carro durante " + dias + " dia(s): " + precoAluguerFinal);
    }
}
