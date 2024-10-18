

import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu ano de nascimento: ");
        int anoNasc = input.nextInt();
        System.out.print("O ano atual: ");
        int anoAtual = input.nextInt();

        int idade = idade(anoAtual, anoNasc);

        System.out.println("Tens " + idade + " anos.");

        input.close();
    }

    public static int idade(int anoAtual, int anoNasc) {
        int idade = anoAtual - anoNasc;

        return idade;
    }

}