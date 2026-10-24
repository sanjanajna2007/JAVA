public class Final {
    // final void sound(){
    //     System.out.println("animal is making sound");

    // }
    //  public static void main(String[] args) {

    //    try {  
    //         int a = 12;
    //         int b = 0;

    //      System.out.println(a/b); 
    //     } 
    //     catch(ArithmeticException e){
    //         System.out.println("cannot divide by zero");
            
    //     }
    //     finally{
    //         System.out.println("this block should br executed what ever it is");
    //     }

    //      System.out.println("end of program");
    
    // }
    public static void main(String[] args) {
        int age = 19;

        if (age<18){
            throw new ArithmeticException("not eligible");

        }
        System.out.println("program continues");
    }
   
    
    
}
