public class exerciciodebug {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
                count++;
                total += i;
            }
        }

        System.out.println("Soma = " + total + "\nQuantidade de números = " + count);
    }
}
