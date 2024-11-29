import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Criar uma variável de nomes que será do tipo string
        Collection<String> nomes = new ArrayList<>();

        // Adiciona um valor no arrayList
        nomes.add("Kevin");
        nomes.add("Miriam");
        nomes.add("Josefa");

        System.out.println(nomes);

        // Adicionar um iterator que percorre a ArrayList
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

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
    }
}