class student {
    private int marks;

    public void setmarks(int marks){
        if (marks>=0 && marks<100){
            this.marks=marks;

        }
            else{
            System.out.println("invalid marks");
        }

    }
    public int getmarks(){
            return marks;

        }
}
public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        // student s2 = new student();
        s1.setmarks(78);
        s1.setmarks(101);

        System.out.println(s1.getmarks());
        System.out.println(s1.getmarks());
        
    }
    
}
