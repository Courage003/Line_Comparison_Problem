public class LineComparison {
    public static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");


        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;

        // Length of the line
        double length = calculateLineLength(x1, y1, x2, y2);
        System.out.printf("The length of the line is: %.2f\n", length);
    }
}