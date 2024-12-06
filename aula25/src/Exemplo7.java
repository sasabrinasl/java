import java.util.LinkedList;
import java.util.Queue;

public class Exemplo7 {
    public static void main(String[] args) {
        // Criar Lista Queue
        Queue<Integer> numeros = new LinkedList<>();

        // Adicionar números à lista
        numeros.add(23);
        numeros.add(39);
        numeros.add(76);

        System.out.println(numeros);

        // Exibir o primeiro elemento
        System.out.println("Primeiro elemento: " + numeros.peek());

        // Eliminar elementos
        System.out.println("Elemento removido (poll): " + numeros.poll());
        System.out.println("Primeiro elemento: " + numeros.peek());

        // Verificar se a lista está vazia
        System.out.println("A lista está vazia? " + numeros.isEmpty());

    }
}
