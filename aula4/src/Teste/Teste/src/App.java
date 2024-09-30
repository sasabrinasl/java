import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Exercício 1.
      System.out.print("Insira uma nota entre 0 e 10: ");
      Double nota = input.nextDouble();
      if (nota < 0.0 || nota > 10.0) {
         System.out.println("Valor inválido");
      }

      boolean loop = true;


      // Exercício 2.
      String nome;
      while(loop) {
         System.out.print("Insira um nome de utilizador: ");
         nome = input.next();
         System.out.print("Insira uma palavra-passe: ");
         String password = input.next();
         if (!password.equals(nome)) {
            break;
         }

         System.out.println("ERRO: senha igual ao nome de utilizador. Tente novamente.");
      }


      // Exercício 3.
      System.out.println("Insira as seguintes informações");
      System.out.println("Nome: ");
      nome = input.next();
      if (nome.length() < 3) {
         System.out.println("Nome inválido");
      }

      System.out.println("Idade: ");
      int idade = input.nextInt();
      if (idade < 0 || idade > 150) {
         System.out.println("Idade inválida");
      }

      System.out.println("Sal\u00e1rio: ");
      Double salario = input.nextDouble();
      if (salario < 0.0) {
         System.out.println("Salário inválido");
      }

      System.out.println("Sexo: ");
      char sexo = input.next().charAt(0);
      if (sexo != 'f' && sexo != 'm') {
         System.out.println("Sexo inválido");
      }

      System.out.println("Estado Civil: ");
      char estadoCivil = input.next().charAt(0);
      if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
         System.out.println("Estado civil inválido");
      }
      

      // Exercício 6
      int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

      for (int i = 1; i<= numeros.length; i++){
         System.out.println(i);  
      }

      for (int i = 1; i<= numeros.length; i++){
         System.out.print(i + " ");  
      }
      

      // Exercício 7
      int[] num = new int[5];
      int maior = num[0];

      for (int i = 0; i < num.length; i++){
         System.out.println("Insira um número:");
         num[i] = input.nextInt();
      }

      for (int i = 1; i < num.length; i++){
         if (num[i] > maior){
            maior = num[i];
         }
      }

      System.out.println(maior + " foi o maior número inserido.");


      //Exercício 8.
      int[] numbers = new int[5];
      double soma = 0;

      for (int i = 0; i < numbers.length; i++){
         System.out.println("Insira um número: ");
         numbers[i] = input.nextInt();
         soma += numbers[i]; 
      }

      double media = soma /numbers.length;
      System.out.println("A média dos valores inseridos é igual a " + media);


      //Exercício 9.
      for (int i = 0; i < 50; i++){

         if (i % 2 != 0){
            System.out.print(i + " ");
         }

      }


      //Exercício 10.
      System.out.println("Insira um valor: ");
      int num1 = input.nextInt();

      System.out.println("Insira um segundo valor: ");
      int num2 = input.nextInt();

      int sum = 0;

      for(int i = num1+1 ; i < num2; i++ ){
         System.out.print(i + " ");
         sum += i;
      }

      System.out.println("\nA soma de todos os valores é igual a: " + sum);

      input.close();
    }
}
