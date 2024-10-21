public class atividade30 {
    public static void main(String[] args) {
        double[] notas = {19, 20, 13, 14, 12};
        double sum = 0; 

        for(int i = 0; i < notas.length; i++){
            sum += notas[i];
        }

        double mediaDouble = sum / notas.length;
        int mediaInt = (int) mediaDouble;

        System.out.println("Número total de alunos: " + notas.length);
        System.out.println("Média das notas (original): " + mediaDouble);
        System.out.println("Média das notas (convertida para int): " + mediaInt);
    }
}
