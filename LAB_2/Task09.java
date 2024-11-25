package LAB_2;

import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first double number:");
        double num1 = scanner.nextDouble();        
        System.out.println("Enter the second double number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third double number:");
        double num3 = scanner.nextDouble();

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        else if (num3 > max) {
            max = num3;
        }
        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        else if (num3 < min) {
            min = num3;
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}

