import java.io.File;
import java.util.Scanner;

public class Version3FileSingleInput {
    public static void main(String[] args) throws Exception {
        // Create a Scanner to read from file
        Scanner sc = new Scanner(new File("input.txt"));

        // Read 3 numbers from the file
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close(); // Always close the scanner

        // Calculate the discriminant
        double d = b * b - 4 * a * c;

        // Find roots based on discriminant
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real roots: " + r1 + ", " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Complex roots: " + real + " ± " + imag + "i");
        }
    }
}

