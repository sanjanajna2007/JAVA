public class Rectanglemath{
    public static void main(String[] args) {
        // double length=5.5;
        // double width=5.0;

        // double area=length*width;
        // double perimeter=2*(length+width);
        // System.out.println("area: " + area);
        // System.out.println("perimeter:" + perimeter );

        // int totalseconds=3675;
        // int hours=totalseconds/3600;
        // int minutes=(totalseconds % 3600)/60;
        // int seconds = totalseconds % 60;

        // System.out.println(hours + "h " + minutes+ "m "+ seconds + "s ");

        // int a =5;
        // int b=a++ + ++a;
        // int c=--b + a--;

        // System.out.println("a: " + a + "b" + b + "c" + c);

        byte y=10;
        y+=5;

        int x=20;
        x*=2+3;

        System.out.println("y : " + y + " , x: " + x);

        int num = 27;
        boolean isEven = (num % 2==0);
        System.out.println("is " + num + " even " + isEven);

        // short circuit operator
        int count=0;
        boolean result = (5<8) && (++count > 0 );
        System.out.println("result: " + result);
        System.out.println("count :"+ count);

        // bitwise operator

        int a=10;
        int b=6;

        System.out.println("a &b:" + (a&b));
        System.out.println("a||b: "+ (a|b));
        System.out.println("a^b: "+(a^b));

    }
}