import java.util.Scanner; 
public class withdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a amount");
        int balance=sc.nextInt();
        System.out.println("enter a withdrawl amount");
        int withdrawl=sc.nextInt();
        if(withdrawl>0 && withdrawl<= balance){
            System.out.println("withdrawl successfully");
        }
        else{
            System.out.println("oop balance is not there....");
        }
         sc.close();

    }

    

    
}
