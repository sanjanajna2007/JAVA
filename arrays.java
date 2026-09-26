import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5]; 
        System.out.println("enter a 5 elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter a number you want to search");
        int number=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                count++;
                
            }
        }
        
        System.out.println("count= " + count);
        sc.close();
        
    }
    
}
