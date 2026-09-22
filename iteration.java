import java.util.Scanner;
public class iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("eligible to vote");
            System.out.println("thank you for voting");
        }
        else{
            System.out.println("not eligible to vote");
            System.out.println("come back next time");
        }
       
        
        sc.close();


        
    }
    
}
