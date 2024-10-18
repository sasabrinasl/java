public class atividade28 {
    public static void main(String[] args) {
        int idade = 30;
        double tempo = 30.5;
        float farenheit = (float) 305.9;

        String strIdade = Integer.toString(idade);
        String strTempo = Double.toString(tempo);
        String strFarenheit = Float.toString(farenheit);

        System.out.println("Int para String: " + strIdade + "\nDouble para String: " + strTempo + "\nFloat para String: " + strFarenheit);
    }
}
