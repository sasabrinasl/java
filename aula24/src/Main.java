import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Criar uma linkedlist de amigos
        LinkedList<String> linkedlist = new LinkedList<>();

        //Adicionar uma lista de amigos
        linkedlist.add("Kevin");
        linkedlist.add("Maria");
        linkedlist.add("Hugo");
        linkedlist.add("Carlos");

        //Mostrar a fila
        System.out.println("Lista final: " + linkedlist);

        //Adicionar um novo amigo no início
        linkedlist.addFirst("Ana");
        System.out.println("Lista final: " + linkedlist);

        //Remover amigo no primeiro e último lugar
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("Lista final: " + linkedlist);

        //Percorrer a lista com um iterator
        var iterator = linkedlist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}