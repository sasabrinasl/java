package Teste.atividade3.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Insira uma nota entre 0 e 10: ");
      Double nota = input.nextDouble();
      if (nota < 0.0 || nota > 10.0) {
         System.out.println("Valor inv\u00e1lido");
      }

      boolean loop = true;

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

      System.out.println("Insira as seguintes informa\u00e7\u00f5es");
      System.out.println("Nome: ");
      nome = input.next();
      if (nome.length() < 3) {
         System.out.println("Nome inv\u00e1lido");
      }

      System.out.println("Idade: ");
      int idade = input.nextInt();
      if (idade < 0 || idade > 150) {
         System.out.println("Idade inv\u00e1lida");
      }

      System.out.println("Sal\u00e1rio: ");
      Double salario = input.nextDouble();
      if (salario < 0.0) {
         System.out.println("Sal\u00e1rio inv\u00e1lido");
      }

      System.out.println("Sexo: ");
      char sexo = input.next().charAt(0);
      if (sexo != 'f' && sexo != 'm') {
         System.out.println("Sexo inv\u00e1lido");
      }

      System.out.println("Estado Civil: ");
      char estadoCivil = input.next().charAt(0);
      if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
         System.out.println("Estado civil inv\u00e1lido");
      }

      input.close();
    }
}
