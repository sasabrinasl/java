import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int[] dias = new int[12];

        dias[0] = 31;
        dias[1] = 28;
        dias[2] = 31;
        dias[3] = 30;
        dias[4] = 31;
        dias[5] = 30;
        dias[6] = 31;
        dias[7] = 31;
        dias[8] = 30;
        dias[9] = 31;
        dias[10] = 30;
        dias[11] = 31;

        System.out.print("Insira o ano: ");
        int ano = input.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            dias[1] = 29;
        }

        for(int i = 0; i < 12; i++){
            System.out.println("O mês de " + meses[i] + " tem " + dias[i] + " dias.");
        }

        input.close();
    }
}
