//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int num = sc.nextInt();

        for(int b = 1; b < 11; b++){
             int multiply = num * b;
             System.out.println(num + " * " + b + " = " + multiply);
        }

    }


}
