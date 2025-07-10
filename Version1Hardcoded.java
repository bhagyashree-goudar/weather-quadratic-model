public class Version1Hardcoded {
    public static void main(String[] args) {
        // Hardcoded coefficients of the quadratic equation ax^2 + bx + c = 0
        double a = 1;
        double b = -3;
        double c = 2;

        // Calculate the discriminant
        double d = b * b - 4 * a * c;

        // Check the nature of roots
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

