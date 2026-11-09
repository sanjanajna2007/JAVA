// interface Animal{
//     void display();

// }
// class dog implements Animal{
//     public void display(){
//         System.out.println("the dog is barkingg");

//     }
// }
interface father{
    void property();

}
interface mother {
    void made();

}
class child implements father,mother{

    public void property(){
        System.out.println("father property");
    }
    public void made(){
        System.out.println("mother made");
    }
}
public class prac {
    public static void main(String args[]){
        child c= new child();
        c.property();
        

    }

    
}
