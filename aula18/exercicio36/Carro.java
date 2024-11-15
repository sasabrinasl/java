public class Carro extends Veiculo implements Alugavel{
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

    @Override
    public void alugar(boolean alugado){
        setAlugar(alugado);
    }

    @Override
    public void devolver(boolean devolvido){
        setDevolver(devolvido);
    }

    @Override
    public void exibirDetalhes(){
        // Herança carro
        super.exibirDetalhes();

        // Condição lógica
        if(getAlugar() != false){
            System.out.println("O carro está ocupado.");
        }
        if(getDevolver() != false){
            System.out.println("O carro está disponível.");
        }
    }


}
