package LAB_2;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side:");
        float side1 = scanner.nextFloat();
        System.out.println("Enter the length of the second side:");
        float side2 = scanner.nextFloat();
        System.out.println("Enter the length of the third side:");
        float side3 = scanner.nextFloat();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This is a Equilateral triangle.");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is a Isosceles triangle.");
        }
        else {
            System.out.println("This is a Scalene triangle.");
        }
    }
}

