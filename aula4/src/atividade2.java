public class App {
    public static void main(String[] args) throws Exception {

        int[] v = new int[]{2, 0, 3, 9};
        v[v[2]] = v[v[1]];
        int[] var5 = v;
        int var4 = v.length;
  
        for(int var3 = 0; var3 < var4; ++var3) {
           int i = var5[var3];
           System.out.println(i);
        } 
        
    }
}
