package exercicio45;

//Exemplo de associação
public class Escola {
    //Associação simples
    public void darAulas(Professor professor, Aluno aluno){
        System.out.println("O professor " + professor.getNome() +
                " dá aulas ao aluno " + aluno.getNome());
    }
}
