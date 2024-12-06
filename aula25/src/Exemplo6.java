import java.util.HashMap;
import java.util.LinkedHashMap;

public class Exemplo6 {
    public static void main(String[] args) {
       /* // Criar um objeto Map<Key, Value>
        HashMap<String, Integer> idadeTurma = new HashMap<>();

        // Adicionar valores ao HashMap
        idadeTurma.put("Ana", 26);
        idadeTurma.put("Tobino", 74);
        idadeTurma.put("Casanova", 33);

        // Mostrar valores
        System.out.println("Valores do Map: " + idadeTurma);

        // Substituir idade da Ana(Ana é um valor único, não pode ser repetido)
        idadeTurma.put("Ana", 41);

        // Mostrar valores
        System.out.println("Valores do Map: " + idadeTurma);

        // Mostrar o valor de uma chave
        System.out.println("Valor da chave Casanova: " + idadeTurma.get("Casanova"));

        // Eliminar uma chave
        idadeTurma.remove("Tobino");
        System.out.println("Turma sem o Tobino: " + idadeTurma);

        // Verifica se existe uma chave chamada Clementina
        System.out.println("Contém Clementina? " + idadeTurma.containsKey("Clementina"));*/


        // Criar um LinkedHashMap
        LinkedHashMap<String, Double> precosProdutos = new LinkedHashMap<>();

        // Adicionar produtos ai LinkedHashMap
        precosProdutos.put("Arroz", 1.99);
        precosProdutos.put("Feijão", 0.99);
        precosProdutos.put("Picanha", 109.99);

        // Exibir a lista
        System.out.println("Lista: " + precosProdutos);

        //Iterar a lista
        for(String produto : precosProdutos.keySet()){
            System.out.println(produto + ": " + precosProdutos.get(produto));
        }

    }
}
