public class Mota extends Veiculo{
    public Mota(String cor, String marca, String modelo){
        super("Mota", cor, marca, modelo);
    }

    @Override
    public void calcularPrecoAluguer(int dias){
        double precoAluguer = 11.5 * dias;
        double valorIVA = precoAluguer * 0.23;
        double precoAluguerFinal = precoAluguer + valorIVA;
        System.out.println("Valor do aluguer do carro durante " + dias + " dia(s): " + precoAluguerFinal); 
    }
}
