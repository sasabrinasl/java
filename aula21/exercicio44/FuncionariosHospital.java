package exercicio44;

public class FuncionariosHospital {
    private String nome, funcao, horaEntrada, horaSaida;

    public FuncionariosHospital(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void exibirDetalhes(){
        System.out.println("O nome do(a) funcionário(a) é: " + nome);
        System.out.println("Sua função é: " + funcao);
    }

    public abstract void horasDeTrabalho();
    public abstract void horarioDeTrabalho();
    
}

