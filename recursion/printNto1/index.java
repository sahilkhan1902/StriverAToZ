package recursion.printNto1;

public class index {
    public static void printNto1(int i, int n){
        if(i<n){
            return;
        }
        System.out.println(i);
        printNto1(i-1, n);
    };
    public static void main(String[] args) {
        int n=1;
        printNto1(5,  n);
    }
    
}
