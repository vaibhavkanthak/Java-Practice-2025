//Write a Java program to print the area and perimeter of a circle.
public class AreaOfCircle {
    private static final double radius = 7.5;
    public static void main(String[] args) {
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
