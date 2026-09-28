 class  Student {
    String name;
    int age;
    int marks;

    void study() {
        System.out.println(name   + "is studying");

    }
    void display(){
        System.out.println("name: "+ name);
        System.out.println("age: " + age );
        System.out.println("marks: " + marks);

    }
    
}
public class Ex {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name="sanjana";
        student1.age=18;
        student1.marks=89;

        student1.display();
        student1.study();
    }
}
