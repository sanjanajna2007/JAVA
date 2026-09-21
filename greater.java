import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a,b,c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater" + a);

        }
        else if(b>c && b>a){
            System.out.println("b is greater" + b);
        }

        else{
            System.out.println("c is greater "+ c);
        }
        sc.close();


        // TO REVERSE THE GIVEN NUMBER

        System.out.println("ente a number");
        int n=sc.nextInt();
        int digit=0;
        int reverse = 0;
        while(n>0){
            digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
        System.out.println("reverse= " + reverse);

        sc.close();


    }
    
}
