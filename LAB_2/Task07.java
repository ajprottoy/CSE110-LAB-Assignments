package LAB_2;

import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the student ID:");
        int studentID = scanner.nextInt();
        int year = studentID / 1000000;
        int sessionCode = (studentID / 100000) % 10;

        String session;
        if (sessionCode == 1) {
            session = "Spring";
        } 
        else if (sessionCode == 3) {
            session = "Summer";
        }
        else if (sessionCode == 2) {
            session = "Fall";
        } 
        else {
            session = "Unknown";
        }
        if (!session.equals("Unknown")) {
            System.out.println("Student Joined BRAC in " + session +" "+ (year));
        } else {
            System.out.println("Invalid student ID.");
        }
    }
}
