package src;

import java.util.Vector;
import java.util.Random;

public class responderexercicio {
    public static void main(String[] args) {
        // Crie um programa com array e vetores que elabore um numero de telefone aleatório. 

        int[] numeros = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Vector<Integer> numTelefone = new Vector<>();

        // Cria um novo objeto random, que irá gerar valores aleatórios
        Random random = new Random(); 
        
        for (int i = 0; i <= 9; i++){
            //Acessa aleatóriamente os elementos da array 'numeros' e adiciona um novo elemento aleatório ao vetor 'numTelefone'
            numTelefone.add(numeros[random.nextInt(10)]);
        }

        System.out.print("Número de telefone: +351 ");
        // Percorre cada elemento do vetor 'numTelefone'
        for(int j : numTelefone){
            // Apresenta o número completo no terminal
            System.out.print(j);
        }

    }
}
