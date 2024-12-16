// Class representing a Point in 2D space
class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Class representing a Line defined by two Points
class Line implements Comparable<Line> {
    private Point startPoint;
    private Point endPoint;

    // Constructor
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

    // Overriding equals method for equality check
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line otherLine = (Line) obj;
        return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
    }

    // Implementing compareTo method for line comparison
    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}

// Main Class
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // Create points for the first line
        Point line1Start = new Point(1, 2);
        Point line1End = new Point(4, 6);

        // Create points for the second line
        Point line2Start = new Point(1, 2);
        Point line2End = new Point(4, 6);

        // Create line objects
        Line line1 = new Line(line1Start, line1End);
        Line line2 = new Line(line2Start, line2End);

        // Calculate lengths of the lines
        System.out.printf("Length of Line 1: %.2f\n", line1.calculateLength());
        System.out.printf("Length of Line 2: %.2f\n", line2.calculateLength());

        // Compare the lines
        if (line1.equals(line2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        // Using compareTo method to check the relationship between the lines
        int comparison = line1.compareTo(line2);
        if (comparison == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}
