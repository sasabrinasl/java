import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade = input.nextInt();

        mensagemDeBoasVindas();

        if (idade >= 18){
            menuBebidasAlcoolicas();;
        }else{
            menu();
        }

        input.close();
    }

    public static void mensagemDeBoasVindas(){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o teu nome: ");
        String nome = input.nextLine();

        System.out.println("\nSEJA BEM VINDO " + nome + "\n");

        input.close();
    }

    public static void menu(){
        System.out.println("==  MENU  ==");
        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
    }

    public static void menuBebidasAlcoolicas(){
        System.out.println("==  MENU  ==");
        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Carta de Vinhos\n6 - Sair");
    }
}