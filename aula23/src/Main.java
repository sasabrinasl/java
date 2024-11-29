import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Criar uma variável de nomes que será do tipo string
        //Collection<String> nomes = new ArrayList<>();

        // Cria uma list de Strings
        List<String> nomes = new ArrayList<>();

        // Adiciona um valor no arrayList
        nomes.add("Kevin");
        nomes.add("Miriam");
        nomes.add("Josefa");
        nomes.add("Cremilde");

        System.out.println(nomes);

        List<String> sublista = nomes.subList(1, 3);

        System.out.println("Sublista: " + sublista);

        /*
        // Verificar o tamanho com size()
        System.out.println("Verificar o tamanho do array: " + nomes.size());

        // verifica se contêm um nome
        System.out.println("Contém um Kevin? " + nomes.contains("Kevin"));
        System.out.println("Contém um Kevin? " + nomes.contains("Carlos"));

        // Remover um nome
        nomes.remove("Miriam");
        System.out.println(nomes);

        //Verificar se a tabela está vazia
        System.out.println("Está vazia? " + nomes.isEmpty());

        // Apagar todos os dados
        nomes.clear();
        System.out.println("Está vazia? " + nomes.isEmpty());

        // Aceder a elementos pelo índice
        System.out.println("Elemento na posição 1: " + nomes.get(1));

        // Substituir um elemento - interface Collection
        nomes.set(2, "Cristiano");

        System.out.println(nomes);

        // Remover um elemento - Interface Collection
        nomes.remove(2);

        System.out.println(nomes);

        // Adicionar um iterator que percorre a ArrayList
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Ordenar uma lista por ordem crescente: Usar a Classe Collection
        Collections.sort(nomes);
        System.out.println("Depois de ordenar: " + nomes);

        // Ordenar uma lista por ordem decrescente
        Collections.sort(nomes, Collections.reverseOrder());
        System.out.println("Depois de ordenar de forma decrescente: " + nomes);
*/
    }
}