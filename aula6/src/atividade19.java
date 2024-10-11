package src;

import java.util.Scanner;
import java.util.Vector;

public class atividade19 {
    public static void main(String[] args) {
        Vector<Integer> vetor = new Vector<>();
        Scanner input = new Scanner(System.in);
        int num, sum = 0; 

        do {
            System.out.print("Insira um número: ");
            num = input.nextInt();

            if (num != -1){
                vetor.add(num);
                sum += num;
            }

        }while(num != -1);

        System.out.println("A soma de todos os números inseridos: " + sum);

        input.close();

    }
}
