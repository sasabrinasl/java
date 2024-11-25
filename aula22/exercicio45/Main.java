package exercicio45;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto das classes criadas
        Professor professor = new Professor("Luis");
        Aluno aluno = new Aluno("Vicente");
        Escola escola = new Escola();

        //Chamar o método
        escola.darAulas(professor, aluno);
    }
}
