package src;

import java.util.Scanner;
import java.util.Vector;

public class criarexercicio {

    //Crie uma array que armazene a quantidade de alunos, inserida pelo utilizador, em cada sala de uma escola. Em um vetor armazene os 
    // valores pares encontrados. Por fim, crie uma variável que armazene a quantidade total de alunos nesta escola.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] qtdAlunos = new int[10];
        Vector<Integer> pares = new Vector<>();
        int alunos, totalAlunos = 0;

        for (int i = 0; i < qtdAlunos.length; i++){
            System.out.println("Insira a quantidade de alunos da turma: ");
            alunos = input.nextInt();

            if (alunos % 2 == 0){
                pares.add(alunos);
            }

            totalAlunos += alunos;
        }

        System.out.println(pares);
        System.out.println("A escola tem " + totalAlunos + " alunos no total");

        input.close();
        }   
}