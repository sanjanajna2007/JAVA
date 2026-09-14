import java.util.Scanner;
public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number pf digits");
        int n = sc.nextInt();

       int [] digits =new int[n];

       for(int i=0; i<n; i++) {
        System.out.println("enter a digit" + (i+1) + ":");
        digits[i]=sc.nextInt();
       }
    while(true){
        System.out.println("enter a digit to serach: ");
        int search = sc.nextInt();

        if (search==-1){
            break;

        }

        int count=0;

        for(int i=0; i<n; i++){
            if (digits[i]==search){
                count++;

            }
        }
    
       
        System.out.println(search + "appears" + count + "times");
        sc.close();

        }
    
    }
}
