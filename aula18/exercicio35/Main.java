package exercicio35;

public class Main {
    public static void main(String[] args) {  
        ContaBancaria contaJose = new ContaBancaria();

        contaJose.depositar(100);
        System.out.println("Saldo atual da conta: " + contaJose);

        contaJose.levantar(45.5);
        System.out.println("Saldo atual da conta: " + contaJose);
    }
}
