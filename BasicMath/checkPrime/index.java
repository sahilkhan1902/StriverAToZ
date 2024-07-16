package BasicMath.checkPrime;

public class index {
    public static void checkPrime(int n){
        int count =0;
        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0){
                count ++;
                if(((n/i)!= i)){
                    count++;
                }
            }
        }
        if(count ==2 ){
            System.out.println("Its a prime no = "+ n);
        }else{
            System.out.println("Not a prime no = "+ n);
        }

    }
    public static void main(String[] args) {
     checkPrime(19);
    }
}
