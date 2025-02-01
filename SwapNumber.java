import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Talking Input form user
        System.out.println("Enter your number (x): ");
        int x = scanner.nextInt();

        System.out.println("Enter your number (y): ");
        int y = scanner.nextInt();

        //Ensure x is always less than or equal to y
        if (x > y) {
            int t = x ;
            x =y;
            y =t;
        }

        //Display the swapped vales
        System.out.println("After swapping (if needed) :  ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        scanner.close();
    }
}