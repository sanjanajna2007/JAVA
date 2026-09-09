import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum=0;
        int digit;
        while(n!=0){
            digit = n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("sum of digits: " + sum);

        sc.close();

        
    }
    
}
