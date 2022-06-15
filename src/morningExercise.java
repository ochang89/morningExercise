import java.util.Scanner;

public class morningExercise {
    public static void main(String[] args) {
        // Instantiate scanner object
        Scanner input = new Scanner(System.in);

        // Ask for x,y,z input
        System.out.println("Enter x: ");
        double x = input.nextDouble();
        System.out.println("Enter y: ");
        double y = input.nextDouble();
        System.out.println("Enter z: ");
        double z = input.nextDouble();

        // Increasing
        if(x < y && y < z) {
            // print increasing
            System.out.println("INCREASING");
        }
        // Decreasing
        else if(x > y && y > z) {
            // print decreasing
            System.out.println("DECREASING");
        }
        // Neither
        else {
            System.out.println("NEITHER");
        }
    }
}
