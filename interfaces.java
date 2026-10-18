// interface animal {
//     void sound();

// }

// class dog implements animal {
//     public  void  sound(){
//         System.out.println("dog barks");
//     }
// }

// class cat {
//     void sounds(){
//         System.out.println("cat mwows");
//     }
// }

// public class interfaces {
//     public static void main(String[] args) {
//         dog d = new dog();
//         cat c = new cat();
//         d.sound();
//         c.sounds();
//     }
    
// }

class animal {
    void sound(){
        System.out.println("aanimal make sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }

    void display(){
        super.sound();
        this.sound();

    }


}
public class interfaces {

    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.display();
    }
}
