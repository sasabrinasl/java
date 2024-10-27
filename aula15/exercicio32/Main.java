package exercicio32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        do{
            System.out.print("\nEscolha uma das opções:\n[1] Definir o saldo da conta\n[2] Retornar valor do saldo\n[3] Depósito\n[4] Levantamento\n[5] Sair\nOpção: ");

            int opcao = input.nextInt();

            switch(opcao){
                case 1:
                    conta.definirSaldo();
                    continue;
                case 2:
                    conta.obterSaldo();
                    continue;
                case 3:
                    conta.depositar();
                    continue;
                case 4:
                    conta.levantar();
                    continue;
                case 5:
                    System.out.println("Obrigado. Volte sempre!");
                    break;
            }

        }while(conta.saldo >= 0);


        if(conta.saldo < 0){
            System.out.println("O saldo da conta é negativo.");
        }

        input.close();
    }
}
