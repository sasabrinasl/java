package src;

public class atividade18 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++){

            if (i % 3 == 0 && i % 5 == 0){
                    sum += i;
                    count ++;
                    System.out.print(i + " ");
            }

            if (count == 5){
                break;
            }
            
        }
        System.out.println("\nThe sum of the values is equals to " + sum);
        
    }
}
