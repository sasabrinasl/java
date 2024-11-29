import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        // Array normal fixo
        int[] numero = new int[3];

        // Inserir valores nos índices no array fixo;
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;

        System.out.println("Valores no array fixo");
        for(int i = 0; i <= 2; i++){
            System.out.println(numero[i]);
        }

        // ArrayList Dinâmico
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("\nValores no ArrayList: ");
        for(int valor : lista){
            System.out.println(valor);
        }

    }
}
