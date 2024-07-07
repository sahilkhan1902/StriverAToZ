
class index {
    public static void main(String[] args) {
        int num = 7789; // initialize the number
        int reverse =0; // initialize the rev varialbe
        while (num>0){
            int last =num%10; // we will get the remainer as last digit
            reverse = (reverse*10)+ last; //here we modify our rev variable
            num =num/10;
                   System.out.println(last);
        }
        if(num == reverse){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        System.out.println(reverse);
    }

}