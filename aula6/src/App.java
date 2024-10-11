package src;

import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        // Criar objeto scanner
        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        // Cria um vetor
        Vector<Integer> numeros = new Vector<>();
            
        // Criar o loop de pedido de números ao utilizador
        do{

            System.out.print("Insira um número (0 para cancelar): ");
            num = input.nextInt();

            if (num != 0){
                
                // Adicionar os números ao vetor
                numeros.add(num);
            
                // Soma os valores que o utilizador insere
                sum += num;
    
            }

        }while(num != 0); // Para o loop quando o 0 for inserido


        int resto = sum % 2;
        System.out.println(numeros);
        System.out.println("Resto de todos os números somados: " + resto);

        input.close();
    }
}
