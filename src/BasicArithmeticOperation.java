import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class BasicArithmeticOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        int a = sc.nextInt();
        System.out.print("Input second number:");
        int b = sc.nextInt();

        System.out.println(a + " + " + b +  " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
