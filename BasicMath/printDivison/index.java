package BasicMath.printDivison;

public class index {
    public static void printDivison(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
   public static void main(String[] args) {
    printDivison(12);
   } 
}
