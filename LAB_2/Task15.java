package LAB_2;

public class Task15 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 200;

        for (int i=1; i<=n; i++) {
            sum += i;
        }

        double average = (double)sum/n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

