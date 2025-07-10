
import java.util.Scanner;

public class Version2KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter values
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        scanner.close();

        // Calculate discriminant
        double d = b * b - 4 * a * c;

        // Determine the type of roots
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real and distinct roots: " + root1 + " and " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("One real and equal root: " + root);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("Complex roots: " + real + " + " + imaginary + "i and " + real + " - " + imaginary + "i");
        }
    }
}
