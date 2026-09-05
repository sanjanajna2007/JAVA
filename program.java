public class program {
    public static void main (String [] args){
        // int a=10, b=20, c=30;
        // if (a>b && a>c){
        //     System.out.println("a ia greater");
        // }
        // else if(b>a && b>c){
        //     System.out.println("b is greater");
        // }

        // else{
        //     System.out.println("c is greater");
        // }
        // int n=1254;
        // int count = 0;
        // while(n!=0){
        //     n = n/10;
        //     count++;

        // }
        // System.out.println("number of digits: "+ count);

        // palindrome

        int n = 121;
        int original = n;
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;

        }

        if(original==reverse){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
