import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        // Criar Scanner
        Scanner input = new Scanner(System.in);

        // Criar fila
        Queue<String> clientes = new LinkedList<>();

        int opcao = 0;

        do {
            System.out.println("1. Adicionar Cliente \n2. Ver próximo cliente \n3. Atender Cliente \n4.Exibir fila \n5. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String cliente = input.next();
                    clientes.add(cliente);
                    System.out.println("\nClientes na fila: " + clientes +  "\n");
                    break;

                case 2:
                    System.out.println("Próximo cliente: " + clientes.peek());
                    System.out.println("\nClientes na fila: " + clientes +  "\n");
                    break;

                case 3:
                    clientes.poll();
                    System.out.println("Cliente atendido!");
                    System.out.println("\nClientes na fila: " + clientes +  "\n");
                    break;

                case 4:
                    System.out.println("Clientes na fila: " + clientes + "\n");
                    break;
            }
        }while (opcao != 5);
    }
}
