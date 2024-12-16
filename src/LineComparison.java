public class LineComparison {
    public static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");


        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;

        double x3 = 1, y3 = 2, x4 = 4, y4 = 6;

        // Lengths of the lines
        double length1 = calculateLineLength(x1, y1, x2, y2);
        double length2 = calculateLineLength(x3, y3, x4, y4);

        // Check equality
        if (Double.valueOf(length1).equals(length2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }
}