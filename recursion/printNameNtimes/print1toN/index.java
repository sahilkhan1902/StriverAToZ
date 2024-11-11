package print1toN;

public class index {
   public static void printNo(int i, int n){
    if(i>n){
        return;
    }
    System.out.println(i);
    printNo(i+1,n);
   } 
   public static void main(String[] args) {
    int n = 4;
    printNo(1,n);
}
}
