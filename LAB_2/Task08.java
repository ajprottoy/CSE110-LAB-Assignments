package LAB_2;

import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        int payment = 90000;
        int age = 22;
        double tax = 0;

        if (age < 18) {
            tax = 0;
        }
        else {
            if (payment < 10000) {
                tax = 0;
            }
            else if (payment <= 20000) {
                tax = payment * 0.05;
            } 
            else {
                tax = payment * 0.10;
            }
        }
        System.out.println("Your tax amount is " + tax + " Tk");
    }
}

