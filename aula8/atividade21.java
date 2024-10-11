public class atividade21 {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {{1,2,3},{4,5,6}};

        
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
                transposta[j][i] = matriz[i][j];
            }
            System.out.println(" ");
        }

        System.out.println("Matriz transposta: ");
        for(int i = 0; i < transposta.length; i++){
            for (int j = 0; j < transposta[i].length; j++){
                System.out.print(transposta[i][j] + " ");
            } 
            System.out.println(" ");
        }
    }
}
