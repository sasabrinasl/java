import java.util.Scanner;

public class atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean invalidNumber = false; 
        double div = 0;

        do{
            System.out.print("Insira o dividendo: ");
            String a = input.nextLine();
            System.out.print("Insira o divisor: ");
            String b = input.nextLine();
           
            try{
                if(a.isEmpty() || b.isEmpty()){
                System.out.println("Número inválido. Não é permitido inserir um espaço em branco. ");
                invalidNumber = true;
                continue;}
               
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                div = num1/num2;
                break;

            }catch(java.lang.ArithmeticException e){
                System.out.println("Não é possível dividir por zero.");
            }finally{
                System.out.println("O resultado da divisão é: " + div);
            }
        }while(invalidNumber);
        
        input.close();

    }
}
