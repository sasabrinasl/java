import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Cria um objeto scanner chamado input que recebe inputs do teclado
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");

        // Recebe o input do teclado
        String nome = input.nextLine();

        // Imprime o nome do utilizador 
        System.out.println("Olá " + nome);

        // é obrigatório fechar o objeto
        input.close();
        
        System.out.print("Insira um número: ");

        double num1 = input.nextDouble();

        System.out.print("Insira um segundo número: ");

        double num2 = input.nextDouble();

        System.out.println("A soma dos dois valores inseridos é " + (num1+num2));
        System.out.println("O produto da múltiplicação dos dois números é " + (num1*num2));
        System.out.println("O quociente da divisão dos dois número é " + (num1/num2));

    }
}
