public class Main {
    public static void main(String[] args) {
        Veiculo honda = new Carro("cinza", "Honda", "Civic");

        honda.setAlugar(true);
        honda.setDevolver(false);

        honda.exibirDetalhes();

        /*Veiculo carro = new Carro("preto", "Fiat", "Panda");

        Veiculo mota = new Mota("vermelha", "Honda", "125");

        carro.exibirDetalhes();
        carro.calcularPrecoAluguer(3);

        System.out.println();

        mota.exibirDetalhes();
        mota.calcularPrecoAluguer(2);*/
    }
}
