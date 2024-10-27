package exercicio32;

import java.util.Scanner;

public class ContaBancaria {
    Scanner input = new Scanner(System.in);
    public double saldo = 0;
    public double deposito = 0;
    public double levantamento = 0;

    // Definir o saldo da conta
    public void definirSaldo(){
        System.out.print("Defina o saldo da conta: ");
        saldo = input.nextDouble();
    }

    //Retorna o valor do saldo
    public void obterSaldo(){
        System.out.print("\nSaldo atual: " + saldo);
    }

    //Acrescentar valor ao saldo
    public void depositar(){
        System.out.print("\nValor a ser depositado: ");
        deposito = input.nextDouble();
        saldo += deposito;
    }

    //Retirar valor do saldo
    public void levantar(){
        System.out.print("\nValor a ser levantado: ");
        levantamento = input.nextDouble();
        saldo -= levantamento;
    }
}
