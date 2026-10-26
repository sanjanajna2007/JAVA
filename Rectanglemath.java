public class Rectanglemath{
    public static void main(String[] args) {
        // double length=5.5;
        // double width=5.0;

        // double area=length*width;
        // double perimeter=2*(length+width);
        // System.out.println("area: " + area);
        // System.out.println("perimeter:" + perimeter );

        int totalseconds=3675;
        int hours=totalseconds/3600;
        int minutes=(totalseconds % 3600)/60;
        int seconds = totalseconds % 60;

        System.out.println(hours + "h " + minutes+ "m "+ seconds + "s ");

        int a =5;
        int b=a++ + ++a;
        int c=--b + a--;

        System.out.println("a: " + a + "b" + b + "c" + c);

    }
}