package BasicMath.GCD;

public class index {
    public static void Gcd(int n, int m) {
        while (n > 0 && m > 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }
        if(n == 0){
            System.out.println("the gcd of "+ n +", "+ m + "= "+ m );
        } 
        else {
            System.out.println("the gcd of "+ n +", "+ m + "= "+ n );
        }
    }
    public static void main(String[] args) {
        Gcd(12, 36);
    }
}
