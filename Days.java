import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number (0 to exit): ");
            int day = sc.nextInt();

            if (day == 0) {
                System.out.println("Program ended");
                break;
            }

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

// ~~~~~switch statements~~~~~~~~


