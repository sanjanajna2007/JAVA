class Box {
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
}

public class BoxDemo {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();

        box1.name = "Square";
        box1.age = 15;
        box1.marks = 45;

        box2.name = "Rectangle";
        box2.age = 12;
        box2.marks = 67;

        box1.display();
        box1.study();

        box2.display();
        box2.study();
    }
}