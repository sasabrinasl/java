import java.util.Scanner;

public class atividade29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número decimal: ");
        double num = input.nextDouble();

        System.out.println("Número original: " + num);
        int x = (int) num; // Conversão implícita de double para int
        System.out.println("Número convertido para int: " + x);
        float y = (float) num; // Conversão implícita de double para float
        System.out.println("Número convertido para float: " + y);
        long z = (long) num; //Conversão implícita de double para long
        System.out.println("Número convertido para long: " + z);
        
        input.close();
    }
}