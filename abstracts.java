abstract class animal {
    abstract void sound();

    
}
class dog extends animal {
    void sound() {
        System.out.println("dog id barking");
        System.out.println("what else is there");
    }
}

public class abstracts {
    public static void main(String[] args) {
        System.out.println("what else is there");
        dog d1 = new dog();
        d1.sound();

        
    }
    
}


// learning abstraction

class calculator{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

}

public class abstracts {
    public static void main(String[] args) {
        calculator c1 = new  calculator();
        c1.add(2,5);
        c1.add(45,12,56);
        System.out.println(c1.add(2,3));
    }
}
