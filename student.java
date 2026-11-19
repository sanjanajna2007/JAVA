import java.util.ArrayList;

class students{
    int studentid;
    String studentname;
    String attendencestatus;

    students(int studentid, String studentname, String attendencestatus){
        this.studentid=studentid;
        this.studentname=studentname;
        this.attendencestatus=attendencestatus;
    }
    void display()
    {
        System.out.println("studentid: " + studentid);
        System.out.println("studentname" + studentname);
        System.out.println("attendencestatus" + attendencestatus) ;


    }   
}
public class student {
    public static void main(String[] args) {
        ArrayList<students> studentlist=new ArrayList<>();

        students s1 = new students(101,"sanjuu","present") ;
        students s2 = new students(102,"priya","absent");
        students s3 = new students(103,"arun","present");

        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println("~~~~~~~~STUDENT DETAILS~~~~~~~~~");
        for(students s : studentlist){
            s.display();
        }

        
    }
    
}
