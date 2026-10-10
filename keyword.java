class student{
    String name;
    int age;
    int marks;

    student(String name, int age, int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;

    }
}
public class keyword {
    public static void main(String[] args){
         student s1 = new student("sanju", 19, 95);
    
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.marks);

    }
    
}
