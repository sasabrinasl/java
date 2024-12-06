import java.util.HashSet;
import java.util.TreeSet;

public class Exemplo5 {
    public static void main(String[] args) {
        // Criar um HashSet
        /* HashSet<String> amigos = new HashSet<>();

        // Criar uma lista de amigos
        amigos.add("Afonso");
        amigos.add("Diogo");
        amigos.add("Henrique");
        amigos.add("Diogo");

        //Mostrar a fila (Não vai ter repetição)
        System.out.println("Fila inicial: " + amigos);

        // Verificar se um elemento existe
        System.out.println("Contém David? " + (amigos.contains("David")));

        //Verificar o tamanho do HashSet
        System.out.println("Tamanho da lista de amigos: " + amigos.size());

        //Verificar o maior e menor elemento*/


        // Criar um objeto TreeSet
        TreeSet<Integer> numeros = new TreeSet<>();

        //Adicionar números
        numeros.add(30);
        numeros.add(-25);
        numeros.add(20);
        numeros.add(20);
        numeros.add(40);

        // Apresentar os valores ordenados
        System.out.println("Números no TreeSet(Ordenados): " + numeros);

        //Verificar qual é o menor e o maior números
        System.out.println("Menor número: " + numeros.first());
        System.out.println("Maior número: " + numeros.last());

        // Remover os números 20
        numeros.remove(20);
        System.out.println("Remove os números 20: " + numeros);
    }
}