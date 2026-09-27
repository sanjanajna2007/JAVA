import java.util.Scanner;
public class concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name of studwnt");
        String name = sc.nextLine();
        System.out.println("enter a marks of student");
        int[] marks= new int[5];
        int total=0;
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
            total=total+marks[i];


        }

            double percentage=(total/500.0)*100;
            System.out.println("name: " + name);
            System.out.println("total: " + total);
            System.out.println("percentage: " + percentage);

            if(percentage>=90) {
                System.out.println("grade: A");
            }
            else if(percentage >=80){
                System.out.println("grade : B");
            }
            else if (percentage >=70){
                System.out.println("grade: C" );

            }
            else if(percentage >60){
                System.out.println("grade: D");
            }
            else{
                System.out.println("grade: E");
            }
            sc.close();

    }
    
}
