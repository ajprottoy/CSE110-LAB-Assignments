package LAB_2;

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be paid (in taka):");
        int amountTBpaid = scanner.nextInt();
        System.out.println("Enter the amount given by the customer (in taka):");
        int amountGiven = scanner.nextInt();
        int difference = amountGiven - amountTBpaid;

        if (difference > 0) {
            System.out.println("The returned amount is " + difference + " taka.");
            int remainingAmount = difference;
            
            int hundreds = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            int fifties = remainingAmount / 50;
            remainingAmount = remainingAmount % 50;

            int twenties = remainingAmount / 20;
            remainingAmount = remainingAmount % 20;

            int tens = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            int fives = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            int twos = remainingAmount / 2;
            remainingAmount = remainingAmount % 2;

            int ones = remainingAmount;

            System.out.println("100 taka note: " + hundreds);
            System.out.println("50 taka note: " + fifties);
            System.out.println("20 taka note: " + twenties);
            System.out.println("10 taka note: " + tens);
            System.out.println("5 taka coin: " + fives);
            System.out.println("2 taka coin: " + twos);
            System.out.println("1 taka coin: " + ones);
        } 
        else if (difference < 0) {
            System.out.println("The customer needs to pay " + (-difference) + " more taka.");
        } 
        else {
            System.out.println("The returned amount is 0 taka.");
        }
    }
}
