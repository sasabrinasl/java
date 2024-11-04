public class tratDeErros {
    public static void main(String[] args) {
        String frase = "olá"; //era null
        String novaFrase = null;

        //novaFrase = frase.toUpperCase();

        // System.out.println(novaFrase); essa linha é impossível, o erro é: java.lang.NullPointerException

        //para resolver a situação anterior utilizamos o tratamento de erros
        try{
            novaFrase = frase.toUpperCase();
            System.out.println(novaFrase);
        }catch (java.lang.NullPointerException e){
            System.out.println("A frase é nula.");
        }
    }
}
