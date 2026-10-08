// about constructor

class car{
    String brand;
    int price;

    car(String b,int p){
        brand=b;
        price=p;


    }
}
public class constructor {
    public static void main(String[] args) {
        car c1 = new car("BMW", 150000);
        car c2 = new car("maruti",12352);

        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println(c2.brand);
    }
    
}



