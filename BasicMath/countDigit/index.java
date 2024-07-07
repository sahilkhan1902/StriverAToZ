
class index {
    public static void main(String[] args) {
        int num = 7789; // initialize the number
        int count =0; // initialize the count variable
        int reverse =0; // initialize the rev varialbe
        while (num>0){
            int last =num%10; // we will get the remainer as last digit
            reverse = (reverse*10)+ last; //here we modify our rev variable
            count++; // increase the count
            num =num/10;
                   System.out.println(last);
        }
        System.out.println(reverse);
        System.out.println(count);
    }
}