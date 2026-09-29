class Student {

    String name;
    int age;
    int marks;

    void study() {
        System.out.println(name + " is studying");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    void oops(){
        System.out.println("name" + name);
    }
}
public class stud {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new student();

        student1.name = "Sanjana";
        student1.age = 19;
        student1.marks = 90;

        student2.age=56;

        student1.display();
        student1.study();
        student1.oops();
    }
    
}
