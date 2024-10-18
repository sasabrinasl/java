import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade = input.nextInt();

        mensagemDeBoasVindas(input);

        if (idade >= 18){
            double num;
            num = idade;
            menu(input, num);
        }else{
            menu(input, idade);
        }

        input.close();
    }

    public static void mensagemDeBoasVindas(Scanner input){
        System.out.print("Insira o teu nome: ");
        String nome = input.next();

        System.out.println("\nSEJA BEM VINDO " + nome + "\n");
    }

    public static void menu(Scanner input, int idade){
        System.out.println("==  MENU  ==");
        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
            System.out.println("1 - Bolinha de Queijo \n2 - Sopa de Tomate");
            break;
            case 2:
            System.out.println("1 - Picanha\n2 - Massa à Bolonhesa");
            break;
            case 3:
            System.out.println("1 - Salmão\n2 - Fettucine com Camarão");
            break;
            case 4:
            System.out.println("1 -Petit Gatêau\n2 - Mousse de Oreo");
            break;
            case 5:
            System.out.println("Saindo...");
            break;
        }
    }

    public static void menu(Scanner input, double idade){
        System.out.println("==  MENU  ==");
        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Carta de Vinhos\n6 - Sair");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
            System.out.println("1 - Bolinha de Queijo \n2 - Sopa de Tomate");
            break;
            case 2:
            System.out.println("1 - Picanha\n2 - Massa à Bolonhesa");
            break;
            case 3:
            System.out.println("1 - Salmão\n2 - Massa com Camarão");
            break;
            case 4:
            System.out.println("1 -Petit Gatêau\n2 - Mousse de Oreo");
            break;
            case 5:
            System.out.println("1 - Sauvignon Blanc\n2 - Sauvignon Rouge");
            break;
            case 6:
            System.out.println("Saindo...");
            break;
        }
    }
}