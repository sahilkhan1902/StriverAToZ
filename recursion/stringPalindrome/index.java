package recursion.stringPalindrome;

public class index {
    public static boolean checkString(String s, int i){
        if(i>=s.length()-i-1) return true;
        if(s.charAt(i)!= s.charAt(s.length()-i-1)) return false;
        return checkString(s, i+1);
    }
    public static void main(String[] args) {
        String word = "NAMAN";
       boolean str = checkString( word, 0);
       System.out.print(str);
    }
}
