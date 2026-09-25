 
public class withdraw {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a amount");
        // int balance=sc.nextInt();
        // System.out.println("enter a withdrawl amount");
        // int withdrawl=sc.nextInt();
        // if(withdrawl>0 && withdrawl<= balance){
        //     System.out.println("withdrawl successfully");
        // }
        // else{
        //     System.out.println("oop balance is not there....");
        // }
        //  sc.close();

        int[] arr = {10,20,30};
        int largest = arr[0];
        int secondlargest=arr[0];
        for(int i=1;i<arr.length;i++){

        

        if(arr[i] > largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if (arr[i] > secondlargest && arr[i] != largest) {
            secondlargest=arr[i];

        }

    }
        System.out.println("largest" + largest);
        System.out.println("second largest: " + largest);




    }

    

    
}
