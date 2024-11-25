package exercicio47;

//Exemplo de composição
public class Computador {
    private CPU cpu;

    public Computador(String modeloCPU) {
        //A CPU vai ser gerida pela classe Computador
        this.cpu = new CPU(modeloCPU);
    }

    public void mostrarCPU(){
        System.out.println("Computador com CPU: " + cpu.getModelo());
    }
}
